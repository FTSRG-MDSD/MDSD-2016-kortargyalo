package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.resource

import com.google.inject.Inject
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Signal
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.IResourceDescriptions
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.resource.XbaseResourceDescriptionStrategy

class DroneScriptResourceDescriptionStrategy extends XbaseResourceDescriptionStrategy {

	public static val SCENARIO_NAME_KEY = "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.resource.SCENARIO_NAME"

	final static val LOG = Logger.getLogger(DroneScriptResourceDescriptionStrategy)

	@Inject IResourceDescriptions globalResourceDescriptions

	@Inject IQualifiedNameConverter qualifiedNameConverter

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Signal) {
			createSignalEObjectDescriptions(eObject, acceptor)
		} else {
			super.createEObjectDescriptions(eObject, acceptor)
		}
	}

	private def createSignalEObjectDescriptions(Signal signal, IAcceptor<IEObjectDescription> acceptor) {
		if(qualifiedNameProvider == null) return false
		try {
			val qualifiedName = qualifiedNameProvider.getFullyQualifiedName(signal)
			// val qualifiedName = qualifiedNameConverter.toQualifiedName(signal.name)
			val userData = newHashMap
			val scenario = EcoreUtil2.getContainerOfType(signal, DronesBehavior)?.scenario
			if (scenario != null) {
				val scenarioName = globalResourceDescriptions.getExportedObjectsByObject(scenario).head?.name
				if (scenarioName != null) {
					userData.put(SCENARIO_NAME_KEY, qualifiedNameConverter.toString(scenarioName))
				}
			}
			acceptor.accept(EObjectDescription.create(qualifiedName, signal, userData))
		} catch (Exception e) {
			LOG.error(e.message, e)
		}
		false
	}
}
