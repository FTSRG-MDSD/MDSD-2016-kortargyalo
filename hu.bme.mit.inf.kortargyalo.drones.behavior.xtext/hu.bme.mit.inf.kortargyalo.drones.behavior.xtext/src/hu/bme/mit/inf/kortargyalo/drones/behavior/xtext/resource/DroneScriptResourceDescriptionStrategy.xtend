package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.resource

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehaviorPackage
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Signal
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.util.IAcceptor
import org.eclipse.xtext.xbase.resource.XbaseResourceDescriptionStrategy

class DroneScriptResourceDescriptionStrategy extends XbaseResourceDescriptionStrategy {

	public static val SCENARIO_NAME_KEY = "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.resource.SCENARIO_NAME"

	final static val LOG = Logger.getLogger(DroneScriptResourceDescriptionStrategy)

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Signal) {
			createSignalEObjectDescriptions(eObject, acceptor)
		} else {
			super.createEObjectDescriptions(eObject, acceptor)
		}
	}

	private def createSignalEObjectDescriptions(Signal signal, IAcceptor<IEObjectDescription> acceptor) {
		if (qualifiedNameProvider == null) {
			return false
		}
		try {
			val qualifiedName = qualifiedNameProvider.getFullyQualifiedName(signal)
			if (qualifiedName == null) {
				return false
			}
			val userData = newHashMap
			
			val dronesBehavior = EcoreUtil2.getContainerOfType(signal, DronesBehavior)
			val nodes = NodeModelUtils.findNodesForFeature(dronesBehavior, DronesBehaviorPackage.eINSTANCE.dronesBehavior_Scenario)
			var String scenarioName = null
			// Access the textual model directly instead of the semantic model to avoid cyclic reference resolution.
			if (nodes.size == 1 && !nodes.get(0).text.isNullOrEmpty) {
				scenarioName = nodes.get(0).text.trim
			} else {
				val scenario = dronesBehavior?.scenario
				if (scenario != null) {
					scenarioName = scenario.name
				} 
			}

			if (scenarioName != null) {
				userData.put(SCENARIO_NAME_KEY, scenarioName)
				acceptor.accept(EObjectDescription.create(qualifiedName, signal, userData))
			}
		} catch (Exception e) {
			LOG.error(e.message, e)
		}
		false
	}
}
