package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events

import desmoj.core.simulator.Event
import desmoj.core.simulator.TimeSpan
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneSimProcess
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.EnvironmentEntity
import co.paralleluniverse.fibers.SuspendExecution

class WaitTimeoutEvent extends Event<EnvironmentEntity> {
	
	val DroneSimProcess drone
	val DronesSimModel dronesOwner
	
	new(DroneSimProcess drone, boolean showInTrace) {
		super(drone.model, drone.name + " wait timeout", showInTrace)
		this.drone = drone
		dronesOwner = drone.model as DronesSimModel
	}
	
	override eventRoutine(EnvironmentEntity environment) throws SuspendExecution {
		drone.interrupt(dronesOwner.timeoutInterrupt)
	}
	
	def waitFor(TimeSpan timeSpan) {
		schedule(dronesOwner.getEnvironmentEntity, timeSpan)
	}
}