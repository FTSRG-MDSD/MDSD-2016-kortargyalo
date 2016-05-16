package hu.bme.mit.inf.kortargyalo.drones.structure.sirius.action

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario
import java.util.Collection
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction
import hu.bme.mit.inf.kortargyalo.drones.tooling.launching.SimulationLaunchConfiguration

class DebugSimulationAction extends AbstractExternalJavaAction {

	override canExecute(Collection<? extends EObject> selections) {
		return selections.size == 1 && selections.get(0) instanceof Scenario
	}

	override execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		if (!canExecute(selections)) {
			return
		}
		val scenario = selections.get(0) as Scenario
		val launcher = new SimulationLaunchConfiguration(scenario)
		launcher.launchDebug
	}
}
