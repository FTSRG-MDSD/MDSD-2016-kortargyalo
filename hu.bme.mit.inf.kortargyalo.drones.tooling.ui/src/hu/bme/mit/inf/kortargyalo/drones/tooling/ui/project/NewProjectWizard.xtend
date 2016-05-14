package hu.bme.mit.inf.kortargyalo.drones.tooling.ui.project

import java.lang.reflect.InvocationTargetException
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
		
		val op = new CreateProjectOperation(handle, description)
		try {
			container.run(true, true, op)
		} catch (InterruptedException e) {
			e.printStackTrace
		} catch (InvocationTargetException e) {
			if (handle.exists) {
				try {
					handle.delete(true, new NullProgressMonitor)
				} catch (CoreException e1) {
					// Ignore.
				}
			}
			e.printStackTrace
			MessageDialog.openError(shell, "Error", e.targetException.message)
			return false
		}
		
		project = handle
		BasicNewProjectResourceWizard.selectAndReveal(project, workbench.activeWorkbenchWindow)
		true
	}
	
}
