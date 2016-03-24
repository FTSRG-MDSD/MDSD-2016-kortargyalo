package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveDimensionMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveDimension pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NonpositiveDimensionProcessor implements IMatchProcessor<NonpositiveDimensionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDimension the value of pattern parameter Dimension in the currently processed match
   * 
   */
  public abstract void process(final Dimension pDimension);
  
  @Override
  public void process(final NonpositiveDimensionMatch match) {
    process(match.getDimension());
  }
}
