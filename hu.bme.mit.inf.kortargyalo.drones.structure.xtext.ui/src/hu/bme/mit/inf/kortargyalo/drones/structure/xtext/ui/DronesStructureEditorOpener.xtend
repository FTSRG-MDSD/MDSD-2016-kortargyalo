package hu.bme.mit.inf.kortargyalo.drones.structure.xtext.ui

import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener
import org.eclipse.ui.IEditorPart
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EReference
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.presentation.DronesStructureEditor
import java.util.Collections
import org.eclipse.emf.ecore.presentation.EcoreEditor

class DronesStructureEditorOpener extends LanguageSpecificURIEditorOpener {
	
	override protected selectAndReveal(IEditorPart openEditor, URI uri, EReference crossReference, int indexInList, boolean select) {
		// TODO Open the Sirius editor.
		val dronesStructureEditor = openEditor.getAdapter(DronesStructureEditor)
		if (dronesStructureEditor != null) {
			var eObject = dronesStructureEditor.editingDomain.resourceSet.getEObject(uri, true)
			dronesStructureEditor.setSelectionToViewer(Collections.singletonList(eObject))
		} else {
			// It is possible that the reflective ECore editor was open when the user tried to navigate to the URI,
			// but the drones structure tree editor was not. In this case, we get the reflective editor as
			// openEditor, despite asking for the generated editor in getEditorId() specifically.
			val ecoreEditor = openEditor.getAdapter(EcoreEditor)
			if (ecoreEditor != null) {
				var eObject = ecoreEditor.editingDomain.resourceSet.getEObject(uri, true)
				ecoreEditor.setSelectionToViewer(Collections.singletonList(eObject))
			}
		}
	}
	
	override protected getEditorId() {
		"hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.presentation.DronesStructureEditorID"
	}
}