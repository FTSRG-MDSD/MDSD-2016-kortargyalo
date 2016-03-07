package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.DuplicateNameMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.structure.queries.duplicateName pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DuplicateNameProcessor implements IMatchProcessor<DuplicateNameMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pNamedElement the value of pattern parameter NamedElement in the currently processed match
   * @param pName the value of pattern parameter Name in the currently processed match
   * 
   */
  public abstract void process(final NamedElement pNamedElement, final String pName);
  
  @Override
  public void process(final DuplicateNameMatch match) {
    process(match.getNamedElement(), match.getName());
  }
}
