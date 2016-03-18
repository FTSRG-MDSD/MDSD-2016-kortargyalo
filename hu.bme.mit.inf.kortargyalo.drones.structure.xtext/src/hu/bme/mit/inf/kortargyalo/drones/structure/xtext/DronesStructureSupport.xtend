package hu.bme.mit.inf.kortargyalo.drones.structure.xtext

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport

class DronesStructureSupport extends AbstractGenericResourceSupport {
	
	override protected createGuiceModule() {
		new DronesStructureRuntimeModule
	}
		
}