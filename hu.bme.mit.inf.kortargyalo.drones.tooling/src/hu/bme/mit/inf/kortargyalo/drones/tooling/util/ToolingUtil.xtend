package hu.bme.mit.inf.kortargyalo.drones.tooling.util

import org.apache.log4j.Logger
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.emf.common.util.URI

class ToolingUtil {

	static val logger = Logger.getLogger(ToolingUtil)

	static def getFile(URI uri) {
		if (uri == null || !uri.platformResource) {
			logger.error("URI " + uri + " is not a platform resource URI, cannot find the corresponding project")
			return null
		}
		// https://www.eclipse.org/forums/index.php?t=msg&th=1066967&goto=1696822&#msg_1696822
		ResourcesPlugin.workspace.root.getFile(new Path(uri.toPlatformString(true)))
	}

	static def getProject(IFile file) {
		val project = file?.project
		if (project == null) {
			logger.error("Resource " + file + " is not in a project")
			return null
		}
		project
	}

	static def getProject(URI uri) {
		val file = getFile(uri)
		if (file == null) {
			return null
		}
		getProject(file)
	}

}
