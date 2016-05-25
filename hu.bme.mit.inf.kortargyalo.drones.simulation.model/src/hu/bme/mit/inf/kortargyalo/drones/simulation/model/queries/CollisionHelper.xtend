package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries

class CollisionHelper {

	def static boolean doDronesCollide(double p1positionx, double p1positiony, double p1positionz, double p1dimensionx,
		double p1dimensiony, double p1dimensionz, double p2positionx, double p2positiony, double p2positionz,
		double p2dimensionx, double p2dimensiony, double p2dimensionz) {
		val double a_minX = p1positionx - p1dimensionx / 2;
		val double a_minY = p1positiony - p1dimensiony / 2;
		val double a_minZ = p1positionz - p1dimensionz / 2;
		val double b_minX = p2positionx - p2dimensionx / 2;
		val double b_minY = p2positiony - p2dimensiony / 2;
		val double b_minZ = p2positionz - p2dimensionz / 2;
		val double a_maxX = p1positionx + p1dimensionx / 2;
		val double a_maxY = p1positiony + p1dimensiony / 2;
		val double a_maxZ = p1positionz + p1dimensionz / 2;
		val double b_maxX = p2positionx + p2dimensionx / 2;
		val double b_maxY = p2positiony + p2dimensiony / 2;
		val double b_maxZ = p2positionz + p2dimensionz / 2;
		return ((a_minX <= b_maxX && a_maxX >= b_minX) && (a_minY <= b_maxY && a_maxY >= b_minY) &&
			(a_minZ <= b_maxZ && a_maxZ >= b_minZ)); // Check for https://developer.mozilla.org/en-US/docs/Games/Techniques/3D_collision_detection
	}

	def static boolean didDroneLeftScene(double droneposx, double droneposy, double droneposz, double scenex,
		double sceney, double scenez, double bounddimx, double bounddimy, double bounddimz) {
		return ((scenex < droneposx && droneposx < scenex + bounddimx) &&
			(sceney < droneposy && droneposy < sceney + bounddimy) &&
			(scenez < droneposz && droneposz < scenez + bounddimz))
	}

	def static boolean doCollideWithObstacle(double dronex, double droney, double dronez, double dronedimx,
		double dronedimy, double dronedimz, double objectx, double objecty, double objectz, double objectdimx,
		double objectdimy, double objectdimz) {
		val double a_minX = dronex - dronedimx / 2;
		val double a_minY = droney - dronedimy / 2;
		val double a_minZ = dronez - dronedimz / 2;
		val double b_minX = objectx;
		val double b_minY = objecty;
		val double b_minZ = objectz;
		val double a_maxX = dronex + dronedimx / 2;
		val double a_maxY = droney + dronedimy / 2;
		val double a_maxZ = dronez + dronedimz / 2;
		val double b_maxX = objectx + objectdimx;
		val double b_maxY = objecty + objectdimy;
		val double b_maxZ = objectz + objectdimz;
		return ((a_minX <= b_maxX && a_maxX >= b_minX) && (a_minY <= b_maxY && a_maxY >= b_minY) &&
			(a_minZ <= b_maxZ && a_maxZ >= b_minZ)); // Check for https://developer.mozilla.org/en-US/docs/Games/Techniques/3D_collision_detection
	}
}
		