package hu.bme.mit.inf.kortargyalo.drones.tooling.behavior

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Drone
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario
import hu.bme.mit.inf.kortargyalo.drones.tooling.util.ToolingUtil
import java.io.ByteArrayInputStream
import java.lang.reflect.InvocationTargetException
import java.nio.charset.StandardCharsets
import org.apache.log4j.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IFolder
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.ui.actions.WorkspaceModifyOperation
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

@FinalFieldsConstructor
class CreateBehaviorModelOperation extends WorkspaceModifyOperation {

	val logger = Logger.getLogger(CreateBehaviorModelOperation)

	val Drone drone
	
	IFile scriptFile
	
	def getScriptFile() {
		scriptFile
	}

	override protected execute(
		IProgressMonitor monitor) throws CoreException, InvocationTargetException, InterruptedException {
		monitor.beginTask("Create behavior model", IProgressMonitor.UNKNOWN)
		
		try {	
			val project = ToolingUtil.getProject(drone.eResource?.URI)
			if (project == null) {
				return
			}
	
			val scenarioEObject = drone.eContainer
			if (scenarioEObject == null || !(scenarioEObject instanceof Scenario)) {
				logger.error("Drone " + drone.name + " is not in a scenario")
				return
			}
			val scenario = scenarioEObject as Scenario
	
			var IFolder folder = project.getFolder("src")
			if (!folder.exists) {
				folder.create(true, false, monitor)
			}
			for (packageComponent : scenario.name.split("\\.")) {
				folder = folder.getFolder(packageComponent)
				if (!folder.exists) {
					folder.create(true, false, monitor)
				}
			}
	
			scriptFile = folder.getFile(drone.name + ".ds")
			if (!scriptFile.exists) {
				val contents = '''
					scenario «scenario.name»
					
					script for «drone.name» {
						// TODO Auto-generated drone script stub
					}
				'''
				val stream = new ByteArrayInputStream(contents.getBytes(StandardCharsets.UTF_8))
				scriptFile.create(stream, true, monitor)
			}
		} finally {
			monitor.done
		}
	}

}
