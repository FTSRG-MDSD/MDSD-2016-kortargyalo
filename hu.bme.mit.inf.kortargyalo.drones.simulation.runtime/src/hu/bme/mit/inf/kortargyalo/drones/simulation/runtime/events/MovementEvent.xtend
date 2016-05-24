package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.Event
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.SimulationUtils
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneSimProcess
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.EnvironmentEntity
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructureFactory
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position
import org.eclipse.emf.ecore.util.EcoreUtil

class MovementEvent extends Event<EnvironmentEntity> {
	
	val DroneSimProcess drone
	val DronesSimModel dronesOwner
	
	Position target
	
	new(DroneSimProcess drone, boolean showInTrace) {
		super(drone.model, drone.name + " movement", showInTrace)
		this.drone = drone
		dronesOwner = drone.model as DronesSimModel
	}
	
	override eventRoutine(EnvironmentEntity environment) throws SuspendExecution {
		val distance = SimulationUtils.distance(target, drone.position)
		val speed = drone.droneInstance.drone.dronetype.movementCapability.maximalValue
		if (distance <= speed) {
			drone.droneInstance.position = EcoreUtil.copy(target)
			drone.interrupt(dronesOwner.moveCompletedInterrupt)
			return
		}
		val current = drone.droneInstance.position
		drone.droneInstance.position = DronesStructureFactory.eINSTANCE.createPosition => [
			x = current.x + (target.x - current.x) * speed / distance
			y = current.y + (target.y - current.y) * speed / distance
			z = current.z + (target.z - current.z) * speed / distance
		]
		// println('''«drone.name» at «drone.droneInstance.position.x», «drone.droneInstance.position.y», «drone.droneInstance.position.z»''')
		schedule(environment, DronesSimModel.DELTA_T)
	}
	
	def moveTo(Position target) {
		this.target = target
		schedule(dronesOwner.getEnvironmentEntity, DronesSimModel.DELTA_T)
	}
}