package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Position

class SimulationUtils {
	
	private static def square(double x) {
		x * x
	}
	
	public static def distance(Position pos1, Position pos2) {
		Math.sqrt(square(pos1.x - pos2.x) + square(pos1.y - pos2.y) + square(pos1.z - pos2.z))
	}
}
