package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.Event
import desmoj.core.simulator.TimeSpan
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.SimulationUtils
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneSimProcess
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructureFactory
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position
import java.util.concurrent.TimeUnit
import org.eclipse.emf.ecore.util.EcoreUtil

class MovementEvent extends Event<DroneSimProcess> {
	
	private static val DELTA_T = new TimeSpan(1, TimeUnit.SECONDS)
	
	val DronesSimModel dronesOwner
	
	Position target
	
	new(DronesSimModel owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace)
		dronesOwner = owner
	}
	
	override eventRoutine(DroneSimProcess who) throws SuspendExecution {
		val distance = SimulationUtils.distance(target, who.position)
		val speed = who.droneInstance.drone.dronetype.movementCapability.maximalValue
		if (distance <= speed) {
			who.droneInstance.position = EcoreUtil.copy(target)
			who.interrupt(dronesOwner.moveCompletedInterrupt)
			return
		}
		val current = who.droneInstance.position
		who.droneInstance.position = DronesStructureFactory.eINSTANCE.createPosition => [
			x = current.x + (target.x - current.x) * speed / distance
			y = current.y + (target.y - current.y) * speed / distance
			z = current.z + (target.z - current.z) * speed / distance
		]
		schedule(who, DELTA_T)
	}
	
	def moveTo(DroneSimProcess drone, Position target) {
		this.target = target
		schedule(drone, DELTA_T)
	}
}