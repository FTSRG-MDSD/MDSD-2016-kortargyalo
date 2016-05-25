package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.InterruptCode
import desmoj.core.simulator.SimProcess
import desmoj.core.simulator.TimeSpan
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneState
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationFactory
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneInChargerMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.SimulationUtils
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events.MovementEvent
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events.WaitTimeoutEvent
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.exceptions.DroneFailedException
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructureFactory
import java.util.concurrent.TimeUnit
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Accessors

abstract class DroneSimProcess extends SimProcess {

	private static long observationId = 0

	val DronesSimModel dronesOwner
	val WaitTimeoutEvent timeoutEvent
	val MovementEvent movementEvent

	@Accessors(PUBLIC_GETTER) val DroneInstance droneInstance

	new(DronesSimModel owner, DroneInstance droneInstance, boolean showInTrace) {
		super(owner, droneInstance.drone.name, showInTrace)
		dronesOwner = owner
		this.droneInstance = droneInstance

		// A new event must be created for every drone,
		// because a single scheduled instance of an event (for a given drone)
		// cannot be cancelled, only all scheduled instances.
		timeoutEvent = new WaitTimeoutEvent(this, false)

		movementEvent = new MovementEvent(this, false)
	}

	override lifeCycle() throws SuspendExecution {
		droneInstance.state = DroneState.HOVERING
		try {
			runScript()
			droneInstance.state = DroneState.DONE
		} catch (DroneFailedException e) {
			error("Drone failed", e.reason, e.prevention)
			dronesOwner.stop
		}
	}

	protected def abstract void runScript() throws SuspendExecution;

	def getPosition() {
		droneInstance.position
	}

	def getCurrentBattery() {
		droneInstance.currentBattery
	}

	def getBatteryPercentage() {
		droneInstance.currentBattery / droneInstance.drone.dronetype.maxBatteryCapacity
	}

	def getObservations() {
		droneInstance.observations
	}

	protected final def void _moveTo(double x, double y, double z) {
		log('''Starting to move to «x», «y», «z»''')
		val target = DronesStructureFactory.eINSTANCE.createPosition => [
			it.x = x
			it.y = y
			it.z = z
		]

		clearInterruptCode
		droneInstance.state = DroneState.MOVING
		movementEvent.moveTo(target)
		waitForInterrupt(dronesOwner.moveCompletedInterrupt)
		droneInstance.state = DroneState.HOVERING
		log('''Moved to «x», «y», «z»''')
	}

	protected final def void _charge() {
		if (DroneInChargerMatcher.on(dronesOwner.incQueryEngine).countMatches(droneInstance, null) >= 1) {
			droneInstance.currentBattery = droneInstance.drone.dronetype.maxBatteryCapacity
			log("Charged")
		} else {
			error("Drone cannot charge",
				"The drone is trying to charge when it is not in any of the charger areas",
				"Move the drone to a charger area before charging")
		}
	}

	protected final def void _scan() {
		if (droneInstance.drone.dronetype.scanningCapability == null) {
			error("Drone has no scanning capability",
				"The drone is trying to scan when it does not have capability to do so",
				"Add a scanning capability or don't scan with this drone")
				return
		}

		val droneScanningRange = droneInstance.drone.dronetype.scanningCapability.maximalValue
		val currTime = dronesOwner.experiment.simClock.time.getTimeTruncated(TimeUnit.SECONDS)
		val count = newIntArrayOfSize(2)

		dronesOwner.simulationModel.droneInstances.filter [
			SimulationUtils.distance(droneInstance.position, it.position) < droneScanningRange
		].forEach [ obsDrone |
			val obs = DronesSimulationFactory.eINSTANCE.createDroneObservation => [
				position = EcoreUtil.copy(obsDrone.position)
				drone = obsDrone.drone
				time = currTime
				id = observationId++
			]
			droneInstance.observations.add(obs)
			count.set(0, count.get(0) + 1)
		]

		dronesOwner.simulationModel.scenario.obstacles.filter [
			SimulationUtils.distance(droneInstance.position, it.position) < droneScanningRange
		].forEach [ obsObstacle |
			val obs = DronesSimulationFactory.eINSTANCE.createObstacleObservation => [
				obstacle = obsObstacle
				time = currTime
				id = observationId++
			]
			droneInstance.observations.add(obs)
			count.set(1, count.get(1) + 1)
		]

		log('''Scanned «count.get(0)» drones and «count.get(1)» obstacles''')
	}

	protected final def void _sendSignal(String signal, String recipent) {
		val recipentProcess = dronesOwner.getDroneProcess(recipent)
		if (dronesOwner.isCommunicationSuccessful(droneInstance, recipentProcess.droneInstance)) {
			recipentProcess.interrupt(dronesOwner.getSignalInterrupt(signal))
			log('''Sent signal «signal» to «recipent»''')
		} else {
			log('''Tried to send signal «signal» to «recipent», but communication failed''')
		}
	}

	protected final def void _sendMap(String drone) {
		val recipentProcess = dronesOwner.getDroneProcess(drone)
		if (dronesOwner.isCommunicationSuccessful(droneInstance, recipentProcess.droneInstance)) {
			val copyOfObservations = EcoreUtil.copyAll(droneInstance.observations)
			recipentProcess.droneInstance.observations.addAll(copyOfObservations)
			log('''Sent map of «copyOfObservations.size» observations to «drone»''')
		} else {
			log('''Tried to send map to «drone», but communication failed''')
		}
	}

	protected final def int _wait(int timeout, String... signals) {
		clearInterruptCode
		if (timeout < 0) {
			throw new IllegalArgumentException("Timeout must be a nonnegative integer (0 = no timeout).")
		} else if (timeout == 0) {
			if (signals.length == 0) {
				throw new IllegalArgumentException("Infinite wait detected.")
			}
			log('''Waiting for «FOR i : signals SEPARATOR ", "»«i»«ENDFOR»''')
		} else if (signals.length == 0) {
			log('''Waiting for «timeout» seconds''')
			timeoutEvent.waitFor(new TimeSpan(timeout, TimeUnit.SECONDS))
		} else { // Wait for signals with timeout.
			log('''Waiting for «FOR i : signals SEPARATOR ", "»«i»«ENDFOR» with «timeout» second timeout''')
			timeoutEvent.waitFor(new TimeSpan(timeout, TimeUnit.SECONDS))
		}

		val interrupts = signals.map[dronesOwner.getSignalInterrupt(it)].toList
		while (true) {
			if (interrupted) {
				val code = interruptCode
				clearInterruptCode
				if (InterruptCode.equals(code, dronesOwner.timeoutInterrupt)) {
					log("Wait timed out")
					return -1
				}
				for (i : 0 ..< interrupts.size) {
					if (InterruptCode.equals(code, interrupts.get(i))) {
						if(timeout > 0) timeoutEvent.cancel
						log('''Received signal «code.name»''')
						return i
					}
				}
				log('''Ignored interrupt «code.name»''')
			}
			passivate
		}
	}

	protected final def void _cooperate(String task, String role) {
		val taskInstance = dronesOwner.getTaskProcess(task).taskInstance
		if (taskInstance.state == TaskState.IN_PROGRESS || taskInstance.state == TaskState.DONE) {
			throw new DroneFailedException(
				'''Drone «droneInstance.drone.name» tried to collaborate on task «task» that was already stated''',
				'''Modify the behavior of «droneInstance.drone.name» to avoid collaboration on started task'''
			)
		}
		val roleInstance = taskInstance.roleInstances.findFirst[it.role.name == role]
		if (roleInstance == null) {
			throw new RuntimeException('''Task «task» has no role named «role»''')
		}
		if (roleInstance.allocatedDrone != null) {
			throw new DroneFailedException(
				'''Drone «droneInstance.drone.name» tried to collaborate on task «task» as «role» that was already allocated to «roleInstance.allocatedDrone.drone.name»''',
				'''Modify the behavior of «droneInstance.drone.name» and «roleInstance.allocatedDrone.drone.name» to avoid collaboration on the same role'''
			)
		}
		
		clearInterruptCode
		log('''Starting to cooperate on «task» as «role»''')
		roleInstance.allocatedDrone = droneInstance
		
		waitForInterrupt(dronesOwner.taskDoneInterrupt)
		log('''Cooperated on «task» as «role»''')
	}

	private def waitForInterrupt(InterruptCode interrupt) {
		while (true) {
			if (interrupted) {
				val code = interruptCode
				clearInterruptCode
				if (InterruptCode.equals(code, interrupt)) {
					return
				} else {
					log('''Ignored interrupt «code.name»''')
				}
			}
			passivate
		}
	}
	
	protected def log(String s) {
		val currTime = model.experiment.simClock.time.getTimeTruncated(TimeUnit.SECONDS)
		println('''«currTime» «name»: «s»''')
		sendTraceNote(s)
	}
	
	protected def error(String description, String reason, String prevention) {
		val currTime = model.experiment.simClock.time.getTimeTruncated(TimeUnit.SECONDS)
		println('''!!! «currTime» «name»: «description»''')
		println("!!! reason: " + reason)
		println("!!! prevention: " + prevention)
		sendWarning(description, "SimProcess : " + name, reason, prevention)
	}
}
