package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities

import desmoj.core.simulator.InterruptCode
import desmoj.core.simulator.Model
import desmoj.core.simulator.TimeSpan
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneState
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationFactory
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllDronesAreInactiveMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllRoleFilledMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CollisionWithObjectMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CrashMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.FirstRoleFilledMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.LeftSceneMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.ReplacedObservationMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events.SimulationFailedEvent
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events.SimulationFinishedEvent
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events.TimeElapsedEvent
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario
import java.util.HashMap
import java.util.concurrent.TimeUnit
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.incquery.runtime.api.IMatchProcessor
import org.eclipse.incquery.runtime.api.IPatternMatch
import org.eclipse.incquery.runtime.api.IQuerySpecification
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.api.IncQueryMatcher
import org.eclipse.incquery.runtime.emf.EMFScope
import org.eclipse.incquery.runtime.evm.api.ExecutionSchema
import org.eclipse.incquery.runtime.evm.specific.ExecutionSchemas
import org.eclipse.incquery.runtime.evm.specific.Jobs
import org.eclipse.incquery.runtime.evm.specific.Lifecycles
import org.eclipse.incquery.runtime.evm.specific.Rules
import org.eclipse.incquery.runtime.evm.specific.Schedulers
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryActivationStateEnum
import org.eclipse.xtend.lib.annotations.Accessors
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneBatteryDepletedMatcher

class DronesSimModel extends Model {

	public static val DELTA_T = new TimeSpan(1, TimeUnit.SECONDS)

	val ResourceSet resourceSet
	Resource resource
	val Scenario originalScenario
	val DroneLoader droneLoader
	@Accessors(PUBLIC_GETTER) DronesSimulation simulationModel
	@Accessors(PUBLIC_GETTER) IncQueryEngine incQueryEngine
	ExecutionSchema executionSchema

	val signalMap = new HashMap<String, InterruptCode>
	@Accessors(PUBLIC_GETTER) val timeoutInterrupt = new InterruptCode("timeout")
	@Accessors(PUBLIC_GETTER) val moveCompletedInterrupt = new InterruptCode("moveCompleted")
	@Accessors(PUBLIC_GETTER) val readyToStartInterrupt = new InterruptCode("readyToStart")
	@Accessors(PUBLIC_GETTER) val taskDoneInterrupt = new InterruptCode("taskDone")

	val droneProcessesMap = new HashMap<String, DroneSimProcess>
	val taskProcessesMap = new HashMap<String, TaskSimProcess>
	
	TimeElapsedEvent timeElapsedEvent
	SimulationFinishedEvent simulationFinishedEvent
	SimulationFailedEvent simulationFailedEvent

	new(Model owner, Scenario scenario, DroneLoader droneLoader, boolean showInReport, boolean showInTrace) {
		super(owner, scenario.name, showInReport, showInTrace)
		this.resourceSet = new ResourceSetImpl
		this.originalScenario = scenario
		this.droneLoader = droneLoader
	}

	override description() {
		'''Simulation for the «originalScenario.name» scenario'''
	}

	override doInitialSchedules() {
		for (droneProcess : droneProcessesMap.values) {
			droneProcess.activate
		}
		timeElapsedEvent.scheduleAfterDeltaT
	}

	override init() {
		val extension factory = DronesSimulationFactory.eINSTANCE
		simulationModel = createDronesSimulation
		initIncQueryListeners()
		
		// Copy the whole structural model into the runtime EResource,
		// because IncQuery will fail to match with multiple resources.
		val copyOfStructure = EcoreUtil.copy(originalScenario.eContainer as DronesStructure)
		resource.contents.add(copyOfStructure)
		simulationModel.scenario = copyOfStructure.scenarios.findFirst[it.name == originalScenario.name]

		simulationFinishedEvent = new SimulationFinishedEvent(this, true)
		simulationFailedEvent = new SimulationFailedEvent(this, true)

		for (drone : simulationModel.scenario.drones) {
			val droneInstance = createDroneInstance => [
				it.drone = drone
				currentBattery = drone.dronetype.maxBatteryCapacity
				position = EcoreUtil.copy(drone.startPosition)
				state = DroneState.CREATED
			]
			simulationModel.droneInstances.add(droneInstance)
			val droneProcess = droneLoader.getSimProcess(this, droneInstance, true)
			droneProcessesMap.put(drone.name, droneProcess)
		}
		
		timeElapsedEvent = new TimeElapsedEvent(this, simulationModel.droneInstances, false)

		for (task : simulationModel.scenario.tasks) {
			val taskInstance = createTaskInstance => [
				it.task = task
				state = TaskState.NOT_STARTED
			]
			for (role : task.actionToPerform.roles) {
				val roleInstance = createRoleInstance => [
					it.role = role
				]
				taskInstance.roleInstances.add(roleInstance)
			}
			simulationModel.taskInstances.add(taskInstance)
			val taskProcess = new TaskSimProcess(this, taskInstance, true)
			taskProcessesMap.put(task.name, taskProcess)
		}
	}

	private def initIncQueryEngine() {
		resource = resourceSet.createResource(URI.createURI(originalScenario.name + ".dronessimultation"))
		resource.getContents().add(simulationModel)
		incQueryEngine = IncQueryEngine.on(new EMFScope(resource))
		val schedulerFactory = Schedulers.getIQEngineSchedulerFactory(incQueryEngine)
		executionSchema = ExecutionSchemas.createIncQueryExecutionSchema(incQueryEngine, schedulerFactory)
	}
	
	private def initIncQueryListeners() {
		initIncQueryEngine()
		
		addStatelessJob(AllDronesAreInactiveMatcher.querySpecification) [
			simulationFinishedEvent.schedule
		]
		
		addStatelessJob(ReplacedObservationMatcher.querySpecification) [
			EcoreUtil.remove(old)
		]
		
		addStatelessJob(FirstRoleFilledMatcher.querySpecification) [
			getTaskProcess(task.task.name).activate
		]
		
		addStatelessJob(AllRoleFilledMatcher.querySpecification) [
			getTaskProcess(task.task.name).readyToStart
		]
		
		addStatelessJob(CrashMatcher.querySpecification) [
			simulationFailedEvent.simulationFailed(
				'''Drone «drone1.drone.name» («drone1.position.stringify») and «drone2.drone.name» («drone2.position.stringify») have crashed''',
				'''Modify the behavior of «drone1.drone.name» and «drone2.drone.name» to avoid the crash'''
			)
		]
		
		addStatelessJob(LeftSceneMatcher.querySpecification) [
			simulationFailedEvent.simulationFailed(
				'''Drone «drone.drone.name» («drone.position.stringify») has left the scenario bounds''',
				'''Modify the behavior of «drone.drone.name» to stay within bounds'''
			)
		]
		
		addStatelessJob(CollisionWithObjectMatcher.querySpecification) [
			simulationFailedEvent.simulationFailed(
				'''Drone «drone.drone.name» («drone.position.stringify») has crashed into obstacle «obstacle.name»''',
				'''Modify the behavior of «drone.drone.name» to avoid the crash'''
			)
		]
		
		addStatelessJob(DroneBatteryDepletedMatcher.querySpecification) [
			simulationFailedEvent.simulationFailed(
				'''Drone «drone.drone.name» has depleted its battery''',
				'''Modify the behavior of «drone.drone.name» to charge itself'''
			)
		]
	}

	def <T extends IPatternMatch> addStatelessJob(IQuerySpecification<? extends IncQueryMatcher<T>> querySpecification,
		IMatchProcessor<T> processor) {
		val job = Jobs.newStatelessJob(IncQueryActivationStateEnum.APPEARED, processor)
		val lifecycle = Lifecycles.getDefault(false, false)
		val rule = Rules.newMatcherRuleSpecification(querySpecification, lifecycle, newHashSet(job))
		executionSchema.addRule(rule)
	}

	def getSignalInterrupt(String name) {
		var interrupt = signalMap.get(name)
		if (interrupt == null) {
			interrupt = new InterruptCode(name)
			signalMap.put(name, interrupt)
		}
		interrupt
	}

	def getDroneProcess(String name) {
		val drone = droneProcessesMap.get(name)
		if(drone == null) throw new RuntimeException("There is no drone with name: " + name)
		drone
	}

	def getTaskProcess(String name) {
		val task = taskProcessesMap.get(name)
		if(task == null) throw new RuntimeException("There is no task with name: " + name)
		task
	}
	
	def stop() {
		executionSchema.dispose
		experiment.finish
	}
	
	private def stringify(Position position) {
		'''«position.x», «position.y», «position.z»'''
	}
}
