package hu.bme.mit.inf.kortargyalo.drones.simulation.application

import desmoj.core.simulator.Experiment
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructure
import org.apache.log4j.Logger
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.equinox.app.IApplication
import org.eclipse.equinox.app.IApplicationContext
import org.osgi.framework.wiring.BundleWiring
import org.osgi.framework.wiring.FrameworkWiring

class SimulatorApplication implements IApplication {

	public static val PLUGIN_ID = "hu.bme.mit.inf.kortargyalo.drones.simulation.application"

	public static val ID = PLUGIN_ID + ".SimulatorApplication"

	val logger = Logger.getLogger(SimulatorApplication)

	override start(IApplicationContext context) throws Exception {
		val args = context.arguments
		val appArgs = args.get("application.args") as String[]
		var iterator = appArgs.iterator
		var String bundleId
		var URI modelURI
		var String scenarioName
		while (iterator.hasNext) {
			val arg = iterator.next
			switch (arg) {
				case "-droneBundle":
					if (iterator.hasNext) {
						bundleId = iterator.next
					}
				case "-droneModel":
					if (iterator.hasNext) {
						try {
							modelURI = URI.createURI(iterator.next)
						} catch (IllegalArgumentException e) {
							logger.error("Specified -droneModel URI is invalid", e)
						}
					}
				case "-droneScenario":
					if (iterator.hasNext) {
						scenarioName = iterator.next
					}
				default:
					logger.warn("Unexpected argument: " + arg)
			}
		}
		if (bundleId == null) {
			logger.error("Bundle ID -droneBundle is required")
		} else if (modelURI == null) {
			logger.error("Model URI -droneModel is required")
		} else if (scenarioName == null) {
			logger.error("Scenario name -droneScenario is required")
		} else {
			try {
				runSimulator(bundleId, modelURI, scenarioName)
			} catch (Exception e) {
				// Exceptions should not bubble up to the platform.
				logger.error(e.message, e)
			}
		}
		return IApplication.EXIT_OK
	}

	override stop() {
		// Nothing to do.
	}

	private def runSimulator(String bundleId, URI modelURI, String scenarioName) {
		val droneClassLoader = getDroneClassLoader(bundleId)
		val scenario = getScenario(modelURI, scenarioName)
		val droneLoader = new ClassLoaderDroneLoader(droneClassLoader)
		val model = new DronesSimModel(null, scenario, droneLoader, true, true)
		val experiment = new Experiment("drones")
		model.connectToExperiment(experiment)
		experiment.start
	}

	private def getDroneClassLoader(String bundleId) {
		var userBundles = Activator.context.bundles.filter[it.symbolicName == bundleId].toList
		if (userBundles.size == 0) {
			throw new RuntimeException("Bundle " + bundleId + " was not found")
		}
		if (userBundles.size > 1) {
			throw new RuntimeException("Multiple instance of bundle " + bundleId + " are not supported")
		}
		// Resolve bundle before trying to get its class loader.
		// Id 0 is the system bundle, which can be adapted to FrameworkWiring.
		Activator.context.getBundle(0).adapt(FrameworkWiring).resolveBundles(userBundles)
		userBundles.get(0).adapt(BundleWiring).classLoader
	}

	private def getScenario(URI modelURI, String scenarioName) {
		val resourceSet = new ResourceSetImpl
		val resource = resourceSet.getResource(modelURI, true)
		if (resource == null) {
			throw new RuntimeException("Structural model " + modelURI + " was not found")
		}
		if (resource.contents.size < 1) {
			throw new RuntimeException("Resource " + modelURI + " does not contain any model")
		}
		val eObject = resource.contents.get(0)
		if (!(eObject instanceof DronesStructure)) {
			throw new RuntimeException("Resource " + modelURI + " is not a drone structural model")
		}
		val model = eObject as DronesStructure
		val scenario = model.scenarios.findFirst[name == scenarioName]
		if (scenario == null) {
			throw new RuntimeException("Structural model " + modelURI + " does not contain scenario " + scenarioName)
		}
		scenario
	}
}
