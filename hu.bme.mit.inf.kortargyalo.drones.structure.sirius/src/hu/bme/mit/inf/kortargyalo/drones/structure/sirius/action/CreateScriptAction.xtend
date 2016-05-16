package hu.bme.mit.inf.kortargyalo.drones.structure.sirius.action

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone
import hu.bme.mit.inf.kortargyalo.drones.tooling.behavior.CreateBehaviorModelOperation
import java.lang.reflect.InvocationTargetException
import java.util.Collection
import java.util.Map
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction
import org.eclipse.ui.PartInitException
import org.eclipse.ui.PlatformUI
import org.eclipse.ui.part.FileEditorInput

class CreateScriptAction extends AbstractExternalJavaAction {

	val logger = Logger.getLogger(CreateScriptAction)

	override canExecute(Collection<? extends EObject> selections) {
		return selections.size == 1 && selections.get(0) instanceof Drone
	}

	override execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		if (!canExecute(selections)) {
			return
		}
		val drone = selections.get(0) as Drone
		val op = new CreateBehaviorModelOperation(drone)
		try {
			// We must run this action on the UI thread.
			PlatformUI.workbench.activeWorkbenchWindow.run(true, true, op)
		} catch (InterruptedException e) {
			logger.error(e.message, e)
			return
		} catch (InvocationTargetException e) {
			logger.error(e.targetException.message, e)
			return
		}

		// https://wiki.eclipse.org/FAQ_How_do_I_open_an_editor_programmatically%3F
		val scriptFile = op.scriptFile
		if (scriptFile == null) {
			logger.warn("No script file was created")
			return
		}
		val editorDesc = PlatformUI.workbench.editorRegistry.getDefaultEditor(scriptFile.name)
		if (editorDesc == null) {
			logger.error("Cannot find default editor for " + scriptFile.name)
			return
		}
		try {
			PlatformUI.workbench.activeWorkbenchWindow.activePage.openEditor(new FileEditorInput(scriptFile),
				editorDesc.id)
		} catch (PartInitException e) {
			logger.error("Error while opening " + scriptFile.name + ": " + e.message, e)
			return
		}
	}

}
