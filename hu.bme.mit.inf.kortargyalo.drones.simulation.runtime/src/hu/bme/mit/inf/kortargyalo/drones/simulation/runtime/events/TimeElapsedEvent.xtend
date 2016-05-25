package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.ExternalEvent
import desmoj.core.simulator.Model
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneState
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role
import java.util.List

class TimeElapsedEvent extends ExternalEvent {

	val List<DroneInstance> drones

	new(Model owner, List<DroneInstance> drones, boolean showInTrace) {
		super(owner, "time elapsed", showInTrace)
		this.drones = drones
	}
	
	override eventRoutine() throws SuspendExecution {
		for (drone : drones) {
			val droneType = drone.drone.dronetype
			var double consumption = 0
			consumption += droneType.idleEneryConsumption
			if (drone.state == DroneState.MOVING) {
				val movement = droneType.movementCapability
				consumption += movement.energyConsumptionPerValue * movement.maximalValue
			}
			if (drone.currentRole != null) {
				consumption += getEneryConsumedByRole(droneType, drone.currentRole.role)
			}
			drone.currentBattery = drone.currentBattery - consumption
		}
		scheduleAfterDeltaT
	}
	
	def getEneryConsumedByRole(DroneType droneType, Role role) {
		var double consumption = 0
		for (required : role.requiredCapabilities) {
			val provided = droneType.providedCapabilities.findFirst[capability == required.capability]
			if (provided == null) {
				// This can never happen, because the generator will reject the behavior model.
				new RuntimeException("Drone cannot perform role")
			}
			consumption += required.minimalValue * provided.energyConsumptionPerValue
		}
		consumption
	}
	
	def scheduleAfterDeltaT() {
		schedule(DronesSimModel.DELTA_T)
	}
}