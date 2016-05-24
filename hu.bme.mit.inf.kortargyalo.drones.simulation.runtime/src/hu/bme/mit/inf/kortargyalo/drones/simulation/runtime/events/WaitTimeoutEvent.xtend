package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.Event
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneSimProcess
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel

class WaitTimeoutEvent extends Event<DroneSimProcess> {
	
	val DronesSimModel dronesOwner
	
	new(DronesSimModel owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace)
		dronesOwner = owner
	}
	
	override eventRoutine(DroneSimProcess who) throws SuspendExecution {
		who.interrupt(dronesOwner.timeoutInterrupt)
	}
	
}