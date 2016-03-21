package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.xtext2xmi;

import java.io.IOException;
import java.util.Collections;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.DronesBehavior;

public class SaveToXMIHandler implements IHandler {
	
	private static final Logger LOG = Logger.getLogger(SaveToXMIHandler.class);

	@Override
	public void addHandlerListener(IHandlerListener handlerListener) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection currentSelection = HandlerUtil.getCurrentSelection(event);
		if (currentSelection instanceof IStructuredSelection) {

			Object _element = ((IStructuredSelection) currentSelection)
					.getFirstElement();
			if (_element instanceof IFile) {
				IFile selectedFile = (IFile) _element;
				ResourceSet set = new ResourceSetImpl();

				Resource res = set.getResource(
						URI.createPlatformResourceURI(
						selectedFile.getFullPath().toString(), true), true);
				
				DronesBehavior ds = (DronesBehavior) res.getContents().get(0);
				
			    // Obtain a new resource set
			    ResourceSet resSet = new ResourceSetImpl();

			    // create a resource
			    String filePath = selectedFile.getFullPath().removeFileExtension().addFileExtension("dronesbehavior").toString();
			    
			    Resource resource = resSet.createResource(URI
			        .createPlatformResourceURI(filePath, true));
			    // Get the first model element and cast it to the right type, in my
			    // example everything is hierarchical included in this first node
			    EcoreUtil.resolveAll(ds);
			    resource.getContents().add(EcoreUtil.copy(ds));
				
				try{
					resource.save(Collections.EMPTY_MAP);
				}catch(IOException e){
					LOG.error(e.getMessage(), e);
					throw new ExecutionException(e.getMessage(), e);
				}
				
				 
				 
				 
			}
		}
		return null;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean isHandled() {
		return true;
	}

	@Override
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}

}
