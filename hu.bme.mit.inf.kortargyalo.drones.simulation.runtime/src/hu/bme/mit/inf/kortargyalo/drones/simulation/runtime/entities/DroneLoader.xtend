package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance

interface DroneLoader {

	def DroneSimProcess getSimProcess(DronesSimModel model, DroneInstance droneInstance, boolean showInTrace)

}
