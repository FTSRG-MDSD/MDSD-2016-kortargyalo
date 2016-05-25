package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.ExternalEvent
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel

class SimulationFinishedEvent extends ExternalEvent {
	
	new(DronesSimModel owner, boolean showInTrace) {
		super(owner, "simulation finished", showInTrace)
	}
	
	override eventRoutine() throws SuspendExecution {
		(model as DronesSimModel).stop
	}
	
}