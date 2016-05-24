package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position

class SimulationUtils {
	
	public static def distance(Position pos1, Position pos2) {
		Math.sqrt(pos1.x - pos2.x) + Math.sqrt(pos1.y - pos2.y) + Math.sqrt(pos1.z - pos2.z)
	}
}
