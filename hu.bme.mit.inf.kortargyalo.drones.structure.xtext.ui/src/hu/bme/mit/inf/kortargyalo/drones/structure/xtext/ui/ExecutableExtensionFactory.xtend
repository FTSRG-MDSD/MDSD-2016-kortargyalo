package hu.bme.mit.inf.kortargyalo.drones.structure.xtext.ui

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory

class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
	
	override protected getBundle() {
		Activator.^default.bundle
	}
	
	override protected getInjector() {
		Activator.^default.injector
	}
	
}