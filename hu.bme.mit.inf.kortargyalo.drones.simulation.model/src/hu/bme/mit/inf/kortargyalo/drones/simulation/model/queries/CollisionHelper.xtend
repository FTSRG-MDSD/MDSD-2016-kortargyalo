package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries

class CollisionHelper {
	
	def static boolean collide(double p1positionx, double p1positiony, double p1positionz, double p1dimensionx, double p1dimensiony, double p1dimensionz, double p2positionx, double p2positiony, double p2positionz, double p2dimensionx, double p2dimensiony, double p2dimensionz ){
		val double a_minX = p1positionx - p1dimensionx/2;// - p1dimension.depth/2;
		val double a_minY = p1positiony - p1dimensiony/2;
		val double a_minZ = p1positionz - p1dimensionz/2;
		val double b_minX = p2positionx - p2dimensionx/2;
		val double b_minY = p2positiony - p2dimensiony/2; 
		val double b_minZ = p2positionz - p2dimensionz/2;
		val double a_maxX = p1positionx + p1dimensionx/2;
		val double a_maxY = p1positiony + p1dimensiony/2;
		val double a_maxZ = p1positionz + p1dimensionz/2; 
		val double b_maxX = p2positionx + p2dimensionx/2;
		val double b_maxY = p2positiony + p2dimensiony/2;
		val double b_maxZ = p2positionz + p2dimensionz/2;
		return ((a_minX <= b_maxX && a_maxX >= b_minX) && (a_minY <= b_maxY && a_maxY >= b_minY) && (a_minZ <= b_maxZ && a_maxZ >= b_minZ)); // Check for https://developer.mozilla.org/en-US/docs/Games/Techniques/3D_collision_detection
	}
}