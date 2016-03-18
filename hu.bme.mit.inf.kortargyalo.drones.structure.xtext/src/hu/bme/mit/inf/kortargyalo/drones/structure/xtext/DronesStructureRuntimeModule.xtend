package hu.bme.mit.inf.kortargyalo.drones.structure.xtext

import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule

class DronesStructureRuntimeModule extends AbstractGenericResourceRuntimeModule {
	
	override protected getFileExtensions() {
		"dronesstructure"
	}
	
	override protected getLanguageName() {
		"hu.bme.mit.inf.kortargyalo.drones.structure.xtext.DronesStructure"
	}
	
	def bindIDefaultResourceDescriptionStrategy() {
		DronesStructureResourceDescriptionStrategy
	}
	
	override bindIQualifiedNameProvider() {
		DronesStructureQualifiedNameProvider
	}
}