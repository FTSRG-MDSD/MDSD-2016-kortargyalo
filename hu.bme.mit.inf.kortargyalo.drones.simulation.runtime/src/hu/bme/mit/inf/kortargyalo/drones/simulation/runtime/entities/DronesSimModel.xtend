package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities

import desmoj.core.simulator.Model
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulation
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DronesSimulationFactory
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario
import java.util.HashMap
import org.eclipse.emf.ecore.util.EcoreUtil

class DronesSimModel extends Model {
	
	val Scenario scenario
	val DroneLoader droneLoader 
	DronesSimulation simulationModel
	
	val droneProcessesMap = new HashMap<String, DroneSimProcess>
	
	new(Model owner, Scenario scenario, DroneLoader droneLoader, boolean showInReport, boolean showInTrace) {
		super(owner, scenario.name, showInReport, showInTrace)
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
		// TODO Add Task and Role instances.
	}
	
}