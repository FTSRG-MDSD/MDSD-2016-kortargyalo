package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities

import desmoj.core.simulator.Model
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation

class DronesSimModel extends Model {
	
	val DronesSimulation simulationModel
	
	new(Model owner, DronesSimulation simulationModel, boolean showInReport, boolean showInTrace) {
		super(owner, simulationModel.scenario.name, showInReport, showInTrace)
		this.simulationModel = simulationModel
	}
	
	override description() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override doInitialSchedules() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override init() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}