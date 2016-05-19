package hu.bme.mit.inf.kortargyalo.drones.tooling.project

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DronesStructureFactory
import hu.bme.mit.inf.kortargyalo.drones.tooling.Activator
import java.lang.reflect.InvocationTargetException
import java.util.Collections
import org.apache.log4j.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IProjectDescription
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.pde.core.project.IBundleProjectDescription
import org.eclipse.pde.core.project.IBundleProjectService
import org.eclipse.sirius.business.api.componentization.ViewpointRegistry
import org.eclipse.sirius.business.api.dialect.DialectManager
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand
import org.eclipse.sirius.business.api.session.SessionManager
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallback
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager
import org.eclipse.ui.actions.WorkspaceModifyOperation
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.osgi.framework.Version

@FinalFieldsConstructor
class CreateDronesProjectOperation extends WorkspaceModifyOperation {

	val logger = Logger.getLogger(CreateDronesProjectOperation)

	val IProject project
	val IProjectDescription description

	override protected execute(
		IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		monitor.beginTask("", IProgressMonitor.UNKNOWN)
		try {
			val srcPath = new Path("src/")
			val srcGenPath = new Path("src-gen/")
			val modelFileName = '''«description.name».dronesstructure'''

			val context = Activator.context
			val ref = context.getServiceReference(IBundleProjectService)
			val service = context.getService(ref)
			try {
				service.getDescription(project) => [
					bundleName = description.name
					bundleVersion = new Version(1, 0, 0, "qualifier")
					singleton = true
					targetVersion = IBundleProjectDescription.VERSION_3_6
					symbolicName = description.name
					extensionRegistry = false
					binIncludes = #[srcPath.append(modelFileName)]
					bundleClasspath = #[srcPath, srcGenPath].map [
						service.newBundleClasspathEntry(it, null, null)
					]
					executionEnvironments = #["JavaSE-1.8"]
					requiredBundles = #[
						"org.eclipse.xtext.xbase.lib",
						"hu.bme.mit.inf.kortargyalo.drones.simulation.runtime"
					].map[service.newRequiredBundle(it, null, false, false)]
					apply(monitor)
				]
			} finally {
				context.ungetService(ref)
			}

			project.setDefaultCharset("UTF-8", monitor)

			val newDescription = project.description => [
				val natures = natureIds.toSet => [
					add("org.eclipse.xtext.ui.shared.xtextNature")
				]
				natureIds = natures
			]
			project.setDescription(newDescription, monitor)

			var srcFolder = project.getFolder(srcPath).createIfNotExists(monitor)
			project.getFolder(srcGenPath).createIfNotExists(monitor)

			val modelEmfUri = srcFolder.getFile(modelFileName).toEmfUri
			val resourceSet = new ResourceSetImpl
			val resource = resourceSet.createResource(modelEmfUri)
			val dronesStructure = DronesStructureFactory.eINSTANCE.createDronesStructure
			resource.contents.add(dronesStructure)
			resource.save(Collections.EMPTY_MAP)

			ModelingProjectManager.INSTANCE.convertToModelingProject(project, monitor)

			val airdEmfUri = project.getFile("representations.aird").toEmfUri
			val siriusSession = SessionManager.INSTANCE.getSession(airdEmfUri, null)
			if (siriusSession == null) {
				logger.error("Sirius session was not found for project " + project.name)
				return
			}
			val editingDomain = siriusSession.transactionalEditingDomain
			val commandStack = editingDomain.commandStack

			// The resource was added to semanticResources already by
			// ModelingProjectManager.INSTANCE.convertToModelingProject.
			// commandStack.execute(new AddSemanticResourceCommand(siriusSession, modelEmfUri, monitor))
			val viewpoints = ViewpointRegistry.instance.viewpoints.toList
			val viewpoint = viewpoints.findFirst[name == "hu.bme.mit.inf.kortargyalo.drones.structure.model"]
			if (viewpoint == null) {
				logger.error("Structural model viewpoint was not found for project " + project.name)
				siriusSession.save(monitor)
				return
			}
			commandStack.execute(new ChangeViewpointSelectionCommand(
				siriusSession,
				new ViewpointSelectionCallback,
				Collections.singleton(viewpoint),
				Collections.EMPTY_SET,
				false,
				monitor
			))
			val representations = DialectManager.INSTANCE.getAvailableRepresentationDescriptions(
				siriusSession.getSelectedViewpoints(false),
				dronesStructure
			);
			val diagramDescription = representations.findFirst[name == "DroneStructuralDiagram"]
			if (diagramDescription == null) {
				logger.error("Drone Structural Diagram representation was not found for project " + project.name)
				siriusSession.save(monitor)
				return
			}
			val tableDescription = representations.findFirst[name == "CapabilitiesCrossTable"]
			if (tableDescription == null) {
				logger.error("Capabilities Table representation was not found for project " + project.name)
				siriusSession.save(monitor)
				return
			}
			val resourceInSession = siriusSession.semanticResources.findFirst[URI == modelEmfUri]
			if (resourceInSession == null) {
				logger.error("Semantic resource was not found for project " + project.name)
				siriusSession.save(monitor)
				return
			}
			val rootObject = resourceInSession.contents.get(0)
			commandStack.execute(new CreateRepresentationCommand(
				siriusSession,
				diagramDescription,
				rootObject,
				project.name + " " + diagramDescription.label,
				monitor
			))
			commandStack.execute(new CreateRepresentationCommand(
				siriusSession,
				tableDescription,
				rootObject,
				project.name + " " + tableDescription.label,
				monitor
			))
			SessionManager.INSTANCE.notifyRepresentationCreated(siriusSession)

			siriusSession.save(monitor)
		} finally {
			monitor.done
		}
	}

	private static def createIfNotExists(IFolder folder, IProgressMonitor monitor) {
		if (!folder.exists) {
			folder.create(false, true, monitor)
		}
		folder
	}

	private def toEmfUri(IFile file) {
		URI.createPlatformResourceURI(file.fullPath.toOSString, true)
	}
}
