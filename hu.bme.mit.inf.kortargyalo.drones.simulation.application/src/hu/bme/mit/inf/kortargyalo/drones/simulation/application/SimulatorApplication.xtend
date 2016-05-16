package hu.bme.mit.inf.kortargyalo.drones.simulation.application

import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext

class SimulatorApplication implements IApplication {

	public static val PLUGIN_ID = "hu.bme.mit.inf.kortargyalo.drones.simulation.application"

	public static val ID = PLUGIN_ID + ".SimulatorApplication"

	override start(IApplicationContext context) throws Exception {
		val args = context.arguments
		val appArgs = args.get("application.args") as String[]
		for (arg : appArgs) {
			println(arg)
		}
		return IApplication.EXIT_OK;
	}

	override stop() {
		// Nothing to do.
	}

}
