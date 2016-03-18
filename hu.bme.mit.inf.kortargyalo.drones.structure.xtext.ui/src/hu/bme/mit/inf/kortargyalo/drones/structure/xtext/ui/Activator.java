package hu.bme.mit.inf.kortargyalo.drones.structure.xtext.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.util.Modules;

import hu.bme.mit.inf.kortargyalo.drones.structure.xtext.DronesStructureRuntimeModule;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "hu.bme.mit.inf.kortargyalo.drones.structure.xtext.ui"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	private Injector injector;

	public Injector getInjector() {
		return injector;
	}

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.
	 * BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		initializeDronesStructureInjector();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.
	 * BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		injector = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	private void initializeDronesStructureInjector() {
		injector = Guice.createInjector(Modules
				.override(
						Modules.override(new DronesStructureRuntimeModule()).with(new DronesStructureUiModule(plugin)))
				.with(new SharedStateModule()));
	}
}
