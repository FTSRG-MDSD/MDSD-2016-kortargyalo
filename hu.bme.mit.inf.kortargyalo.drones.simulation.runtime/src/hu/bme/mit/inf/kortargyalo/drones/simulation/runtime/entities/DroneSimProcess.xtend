package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.SimProcess
import desmoj.core.simulator.TimeSpan
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationFactory
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneInChargerMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.SimulationUtils
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events.WaitTimeoutEvent
import java.util.concurrent.TimeUnit
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtend.lib.annotations.Accessors
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events.MovementEvent
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructureFactory

abstract class DroneSimProcess extends SimProcess {

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
		timeoutEvent = new WaitTimeoutEvent(owner, name + " wait timeout", true)
		
		movementEvent = new MovementEvent(owner, name + " movement", false)
	}

	override lifeCycle() throws SuspendExecution {
		runScript()
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
		sendTraceNote('''Starting to move to «x», «y», «z»''')
		val target = DronesStructureFactory.eINSTANCE.createPosition => [
			it.x = x
			it.y = y
			it.z = z
		]
		
		clearInterruptCode
		movementEvent.moveTo(this, target)
		while (true) {
			if (interrupted && interruptCode == dronesOwner.moveCompletedInterrupt) {
				sendTraceNote('''Moved to «x», «y», «z»''')
				return
			}
			passivate
		}
	}

	protected final def void _charge() {
		if(DroneInChargerMatcher.on(dronesOwner.incQueryEngine).allValuesOfdrone.contains(droneInstance)) {
			droneInstance.currentBattery = droneInstance.drone.dronetype.maxBatteryCapacity
			sendTraceNote("Charged")
		} else {
			sendWarning("Drone cannot charge", "SimProcess : " + name, "The drone is trying to charge when it is not in any of the charger areas", "Move the drone to a charger area before charging")
		}
	}

	protected final def void _scan() {
		if(droneInstance.drone.dronetype.scanningCapability == null) {
			sendWarning("Drone has no scanning capability", "SimProcess : " + name, "The drone is trying to scan when it does not have capability to do so", "Add a scanning capability or don't scan with this drone")
			return
		}
		val droneScanningRange = droneInstance.drone.dronetype.scanningCapability.maximalValue
		val currTime = dronesOwner.experiment.simClock.time.getTimeTruncated(TimeUnit.SECONDS)
		val count = #[0, 0]
		dronesOwner.simulationModel.droneInstances.filter[SimulationUtils.distance(droneInstance.position, it.position) < droneScanningRange].forEach [ obsDrone |
			val obs = DronesSimulationFactory.eINSTANCE.createDroneObservation => [
				position = EcoreUtil.copy(obsDrone.position)
				drone = obsDrone.drone
				time = currTime
			]
			droneInstance.observations.add(obs)
			count.set(0, count.get(0) + 1)
		]
		// TODO Implement sphere--AABB collision test.
		dronesOwner.simulationModel.scenario.obstacles.filter[SimulationUtils.distance(droneInstance.position, it.position) < droneScanningRange].forEach [ obsObstacle |
			val obs = DronesSimulationFactory.eINSTANCE.createObstacleObservation => [
				obstacle = obsObstacle
				time = currTime
			]
			droneInstance.observations.add(obs)
			count.set(1, count.get(1) + 1)
		]
		sendTraceNote('''Scanned «count.get(0)» drones and «count.get(1)» obstacles''')
	}

	protected final def void _sendSignal(String signal, String recipent) {
		dronesOwner.getDroneProcess(recipent).interrupt(dronesOwner.getSignalInterrupt(signal))
		sendTraceNote('''Sent signal «signal» to «recipent»''')
	}

	protected final def void _sendMap(String drone) {
		dronesOwner.getDroneProcess(drone).droneInstance.observations.addAll(droneInstance.observations)
		sendTraceNote('''Sent map of «droneInstance.observations.size» observations to «drone»''')
	}

	protected final def int _wait(int timeout, String... signals) {
		clearInterruptCode
		if(timeout < 0) {
			throw new IllegalArgumentException("Timeout must be a nonnegative integer (0 = no timeout).")
		} else if(timeout == 0) {
			if(signals.length == 0) {
				throw new IllegalArgumentException("Infinite wait detected.")
			}
			sendTraceNote('''Waiting for «FOR i : signals SEPARATOR ", "»«i»«ENDFOR»''')
		} else if(signals.length == 0) {
			sendTraceNote('''Waiting for «timeout» seconds''')
			hold(new TimeSpan(timeout, TimeUnit.SECONDS))
			sendTraceNote("Wait completed")
			return -1
		} else { // Wait for signals with timeout.
		sendTraceNote('''Waiting for «FOR i : signals SEPARATOR ", "»«i»«ENDFOR» with «timeout» s timeout''')
			timeoutEvent.schedule(this, new TimeSpan(timeout, TimeUnit.SECONDS))
		}

		val interrupts = signals.map[dronesOwner.getSignalInterrupt(it)].toList
		while(true) {
			if(interrupted) {
				if(interruptCode == dronesOwner.timeoutInterrupt) {
					sendTraceNote("Wait timed out")
					return -1
				}
				val index = interrupts.indexOf(interruptCode)
				if(index >= 0) {
					if (timeout > 0) timeoutEvent.cancel
					sendTraceNote('''Received signal «interruptCode.name»''')
					return index
				}
			}
			passivate
		}
	}

	protected final def int _cooperate(String task, String role) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
}
