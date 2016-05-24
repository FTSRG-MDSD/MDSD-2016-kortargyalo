package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.ExternalEvent
import desmoj.core.simulator.TimeSpan
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneSimProcess
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel

class WaitTimeoutEvent extends ExternalEvent {
	
	val DroneSimProcess drone
	val DronesSimModel dronesOwner
	
	new(DroneSimProcess drone, boolean showInTrace) {
		super(drone.model, drone.droneInstance.drone.name + " wait timeout", showInTrace)
		this.drone = drone
		dronesOwner = drone.model as DronesSimModel
	}
	
	override eventRoutine() throws SuspendExecution {
		drone.interrupt(dronesOwner.timeoutInterrupt)
	}
	
	def waitFor(TimeSpan timeSpan) {
		schedule(timeSpan)
	}
}