package hu.bme.mit.inf.kortargyalo.drones.structure.xtext.ui

import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener
import org.eclipse.ui.IEditorPart
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EReference

class DronesStructureEditorOpener extends LanguageSpecificURIEditorOpener {
	
	override protected selectAndReveal(IEditorPart openEditor, URI uri, EReference crossReference, int indexInList, boolean select) {
		// TODO Open the Sirius editor.
		super.selectAndReveal(openEditor, uri, crossReference, indexInList, select)
	}
	
}