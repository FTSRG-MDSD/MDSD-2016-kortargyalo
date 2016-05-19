package hu.bme.mit.inf.kortargyalo.drones.simulation.application

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneLoader
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneSimProcess

@FinalFieldsConstructor
package class ClassLoaderDroneLoader implements DroneLoader {
	
	val ClassLoader classLoader
	
	override getSimProcess(DronesSimModel model, DroneInstance droneInstance, boolean showInTrace) {
		val drone = droneInstance.drone
		val eContainer = drone.eContainer
		if (!(eContainer instanceof Scenario)) {
			throw new RuntimeException("Drone is contained in a scenario")
		}
		val scenario = eContainer as Scenario
		val className = '''«scenario.name».«drone.name»_SimProcess'''
		val klazz = classLoader.loadClass(className)
		val constructor = klazz.getConstructor(DronesSimModel, DroneInstance, Boolean.TYPE)
		constructor.newInstance(model, droneInstance, showInTrace) as DroneSimProcess 
	}
	
}