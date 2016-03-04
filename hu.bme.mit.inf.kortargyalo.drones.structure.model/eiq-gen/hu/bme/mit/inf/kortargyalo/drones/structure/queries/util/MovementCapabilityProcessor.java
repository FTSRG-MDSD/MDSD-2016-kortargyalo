package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.MovementCapabilityMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.structure.queries.movementCapability pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class MovementCapabilityProcessor implements IMatchProcessor<MovementCapabilityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pThis the value of pattern parameter This in the currently processed match
   * @param pTarget the value of pattern parameter Target in the currently processed match
   * 
   */
  public abstract void process(final DroneType pThis, final ProvidedCapability pTarget);
  
  @Override
  public void process(final MovementCapabilityMatch match) {
    process(match.getThis(), match.getTarget());
  }
}
