package hu.bme.mit.inf.kortargyalo.drones.tooling.launching

import hu.bme.mit.inf.kortargyalo.drones.simulation.application.SimulatorApplication
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Scenario
import hu.bme.mit.inf.kortargyalo.drones.tooling.Activator
import hu.bme.mit.inf.kortargyalo.drones.tooling.util.ToolingUtil
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.debug.core.DebugPlugin
import org.eclipse.debug.core.ILaunchConfiguration
import org.eclipse.debug.core.ILaunchConfigurationType
import org.eclipse.debug.core.ILaunchManager
import org.eclipse.debug.ui.DebugUITools
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants
import org.eclipse.pde.core.project.IBundleProjectService
import org.eclipse.pde.internal.launching.launcher.LaunchArgumentsHelper
import org.eclipse.pde.internal.launching.launcher.LauncherUtils
import org.eclipse.pde.internal.ui.IPDEUIConstants
import org.eclipse.pde.launching.IPDELauncherConstants
import org.eclipse.pde.launching.PDESourcePathProvider

class SimulationLaunchConfiguration {

	val Scenario scenario
	val IProject project
	val IFile modelFile

	ILaunchConfiguration launchConfig

	new(Scenario scenario) {
		this.scenario = scenario
		modelFile = ToolingUtil.getFile(scenario.eResource?.URI)
		project = ToolingUtil.getProject(modelFile)
		if (modelFile == null || project == null) {
			throw new RuntimeException("Cannot locate scenario in workspace")
		}
	}

	def findOrCreate() throws CoreException {
		if (launchConfig != null) {
			// Launch configuration was already created.
		}
		val launchManager = DebugPlugin.^default.launchManager
		val pdeLauncherType = launchManager.getLaunchConfigurationType(
			IPDELauncherConstants.ECLIPSE_APPLICATION_LAUNCH_CONFIGURATION_TYPE)
		val name = '''Simulate «project.name».«scenario.name»'''
		launchConfig = launchManager.getLaunchConfigurations(pdeLauncherType).findFirst[it.name == name]
		if (launchConfig != null) {
			// Found existing launch configuration, reuse it.
		}
		launchConfig = doCreate(pdeLauncherType, name)
	}

	def launch() throws CoreException {
		findOrCreate
		DebugUITools.launch(launchConfig, ILaunchManager.RUN_MODE)
	}

	def launchDebug() throws CoreException {
		findOrCreate
		DebugUITools.launch(launchConfig, ILaunchManager.DEBUG_MODE)
	}

	private def doCreate(ILaunchConfigurationType pdeLauncherType, String name) {
		val bundleName = findBundleName
		val workingCopy = pdeLauncherType.newInstance(null, name) => [
			setAttribute(IPDEUIConstants.LAUNCHER_PDE_VERSION, "3.3")
			setAttribute(IPDELauncherConstants.LOCATION, "${workspace_loc}/../runtime-DroneSimulation")
			setAttribute(IPDELauncherConstants.DOCLEAR, true)
			setAttribute(IPDELauncherConstants.ASKCLEAR, false)
			setAttribute(IPDEUIConstants.APPEND_ARGS_EXPLICITLY, true)
			setAttribute(IPDELauncherConstants.APPLICATION, SimulatorApplication.ID)
			setAttribute(IPDELauncherConstants.USE_DEFAULT, true)
			setAttribute(IPDELauncherConstants.AUTOMATIC_ADD, true)
			setAttribute(IPDELauncherConstants.AUTOMATIC_VALIDATE, false)
			var programArguments = LaunchArgumentsHelper.initialProgramArguments
			programArguments += " -droneBundle " + bundleName
			programArguments += ''' -droneModel platform:/plugin/«bundleName»/«modelFile.projectRelativePath»'''
			programArguments += " -droneScenario " + scenario.name
			setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROGRAM_ARGUMENTS, programArguments)
			setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS, LaunchArgumentsHelper.initialVMArguments)
			setAttribute(IPDELauncherConstants.CONFIG_GENERATE_DEFAULT, true)
			setAttribute(IPDELauncherConstants.CONFIG_USE_DEFAULT_AREA, true)
			setAttribute(IPDELauncherConstants.TRACING_CHECKED, IPDELauncherConstants.TRACING_NONE)
			setAttribute(IJavaLaunchConfigurationConstants.ATTR_SOURCE_PATH_PROVIDER, PDESourcePathProvider.ID)
		]
		val config = workingCopy.doSave
		LauncherUtils.validateProjectDependencies(config, new NullProgressMonitor)
		config
	}

//	private def findDepdendecies() {
//		// This does not work, because Xbase has some dependencies that do not get added.
//		val userPlugin = PluginRegistry.findModel(project)
//		val simulatorPlugin = PluginRegistry.findModel(SimulatorApplication.PLUGIN_ID)
//		val pluginIds = DependencyManager.getSelfandDependencies(#[userPlugin, simulatorPlugin],
//			#["org.eclipse.ui.workbench.compatibility"])
//		val workspaceIds = PluginRegistry.workspaceModels.map[bundleDescription.symbolicName].toSet
//		val requiredWorkspaceIds = pluginIds.filter[workspaceIds.contains(it)]
//		val requiredTargetIds = new HashSet(pluginIds)
//		requiredTargetIds.removeAll(workspaceIds)
//		val workspacePluginList = requiredWorkspaceIds.join(",")
//		val targetPluginList = requiredTargetIds.map[it + "@default:default"].join(",")
//		new Pair(workspacePluginList, targetPluginList)
//	}

	private def findBundleName() {
		val context = Activator.context
		val ref = context.getServiceReference(IBundleProjectService)
		val service = context.getService(ref)
		try {
			service.getDescription(project).symbolicName
		} finally {
			context.ungetService(ref)
		}
	}
}
