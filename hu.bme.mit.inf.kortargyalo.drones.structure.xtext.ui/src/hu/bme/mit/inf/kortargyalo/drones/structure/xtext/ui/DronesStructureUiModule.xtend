package hu.bme.mit.inf.kortargyalo.drones.structure.xtext.ui

import org.eclipse.xtext.ui.resource.generic.EmfUiModule
import org.eclipse.ui.plugin.AbstractUIPlugin
import com.google.inject.Binder
import org.eclipse.xtext.ui.editor.IURIEditorOpener
import org.eclipse.xtext.ui.LanguageSpecific

class DronesStructureUiModule extends EmfUiModule {
	
	new(AbstractUIPlugin plugin) {
		super(plugin)
	}
	
	override configureLanguageSpecificURIEditorOpener(Binder binder) {
		binder.bind(IURIEditorOpener).annotatedWith(LanguageSpecific).to(DronesStructureEditorOpener)
	}
	
}