package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveWeightMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveWeight pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NonpositiveWeightProcessor implements IMatchProcessor<NonpositiveWeightMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDroneType the value of pattern parameter DroneType in the currently processed match
   * 
   */
  public abstract void process(final DroneType pDroneType);
  
  @Override
  public void process(final NonpositiveWeightMatch match) {
    process(match.getDroneType());
  }
}
