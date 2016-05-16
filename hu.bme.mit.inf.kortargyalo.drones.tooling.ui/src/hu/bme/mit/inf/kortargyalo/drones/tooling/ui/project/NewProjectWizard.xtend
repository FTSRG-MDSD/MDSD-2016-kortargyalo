package hu.bme.mit.inf.kortargyalo.drones.tooling.ui.project

import hu.bme.mit.inf.kortargyalo.drones.tooling.project.CreateDronesProjectOperation
import java.lang.reflect.InvocationTargetException
import org.apache.log4j.Logger
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspace
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IConfigurationElement
import org.eclipse.core.runtime.IExecutableExtension
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.jface.dialogs.MessageDialog
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jface.wizard.Wizard
import org.eclipse.ui.INewWizard
import org.eclipse.ui.IWorkbench
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard

class NewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	val logger = Logger.getLogger(NewProjectWizard)

	IConfigurationElement config
	WizardNewProjectCreationPage projectCreationPage
	IProject project
	IWorkbench workbench
	IWorkspace workspace

	override setInitializationData(IConfigurationElement config, String propertyName, Object data) throws CoreException {
		this.config = config
	}

	override addPages() {
		projectCreationPage = new WizardNewProjectCreationPage("NewDronesProject") => [
			title = "New Drones Simulation Project"
			description = "Create a new drones simulation project."
		]
		addPage(projectCreationPage)
	}

	override init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench
		workspace = ResourcesPlugin.workspace
	}

	override performFinish() {
		if (project != null) {
			return true
		}
		
		BasicNewProjectResourceWizard.updatePerspective(config)
		
		val handle = projectCreationPage.projectHandle
		if (handle.exists) {
			return false
		}
		val description = workspace.newProjectDescription(handle.name) => [
			locationURI = if(projectCreationPage.useDefaults) null else projectCreationPage.locationURI
		]
		
		val op = new CreateDronesProjectOperation(handle, description)
		try {
			container.run(true, true, op)
		} catch (InterruptedException e) {
			logger.error(e.message, e)
		} catch (InvocationTargetException e) {
			if (handle.exists) {
				try {
					handle.delete(true, new NullProgressMonitor)
				} catch (CoreException e1) {
					logger.error("Exception while deleting Drones Project", e1)
				}
			}
			val message = "Unable to create Drones Project: " + e.targetException.message
			logger.error(message, e)
			MessageDialog.openError(shell, "Error", message)
			return false
		}
		
		project = handle
		BasicNewProjectResourceWizard.selectAndReveal(project, workbench.activeWorkbenchWindow)
		true
	}
	
}
