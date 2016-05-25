package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities

import desmoj.core.simulator.InterruptCode
import desmoj.core.simulator.Model
import desmoj.core.simulator.TimeSpan
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationFactory
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllRoleFilledMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.FirstRoleFilledMatcher
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario
import java.util.HashMap
import java.util.concurrent.TimeUnit
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
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

class DronesSimModel extends Model {

	public static val DELTA_T = new TimeSpan(1, TimeUnit.SECONDS)

	val ResourceSet resourceSet
	val Scenario scenario
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

	new(ResourceSet resourceSet, Model owner, Scenario scenario, DroneLoader droneLoader, boolean showInReport, boolean showInTrace) {
		super(owner, scenario.name, showInReport, showInTrace)
		this.resourceSet = resourceSet
		this.scenario = scenario
		this.droneLoader = droneLoader
	}

	override description() {
		'''Simulation for the «scenario.name» scenario'''
	}

	override doInitialSchedules() {
		for (droneProcess : droneProcessesMap.values) {
			droneProcess.activate
		}
	// TODO Schedule tasks and time ticks
	}

	override init() {
		val extension factory = DronesSimulationFactory.eINSTANCE
		simulationModel = createDronesSimulation
		initIncQueryListeners(scenario.name)
		
		simulationModel.scenario = scenario

		for (drone : scenario.drones) {
			val droneInstance = createDroneInstance => [
				it.drone = drone
				currentBattery = drone.dronetype.maxBatteryCapacity
				position = EcoreUtil.copy(drone.startPosition)
			]
			simulationModel.droneInstances.add(droneInstance)
			val droneProcess = droneLoader.getSimProcess(this, droneInstance, true)
			droneProcessesMap.put(drone.name, droneProcess)
		}

		for (task : scenario.tasks) {
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

	private def initIncQueryEngine(String name) {
		val resource = resourceSet.createResource(URI.createURI(name + ".dronessimultation"))
		resource.getContents().add(simulationModel)
		incQueryEngine = IncQueryEngine.on(new EMFScope(resource))
		val schedulerFactory = Schedulers.getIQEngineSchedulerFactory(incQueryEngine)
		executionSchema = ExecutionSchemas.createIncQueryExecutionSchema(incQueryEngine, schedulerFactory)
	}
	
	private def initIncQueryListeners(String name) {
		initIncQueryEngine(name)
		
		addStatelessJob(FirstRoleFilledMatcher.querySpecification) [
			getTaskProcess(task.task.name).activate
		]
		
		addStatelessJob(AllRoleFilledMatcher.querySpecification) [
			getTaskProcess(task.task.name).readyToStart
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
}
