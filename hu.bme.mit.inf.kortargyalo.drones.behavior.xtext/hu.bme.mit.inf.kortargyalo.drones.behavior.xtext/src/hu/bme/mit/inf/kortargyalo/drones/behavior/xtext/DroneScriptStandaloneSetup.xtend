/*
 * generated by Xtext 2.9.1
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DroneScriptStandaloneSetup extends DroneScriptStandaloneSetupGenerated {

	def static void doSetup() {
		new DroneScriptStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
