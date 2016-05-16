package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveStartTimeoutMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveStartTimeout pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NonpositiveStartTimeoutProcessor implements IMatchProcessor<NonpositiveStartTimeoutMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pAction the value of pattern parameter Action in the currently processed match
   * 
   */
  public abstract void process(final CooperativeAction pAction);
  
  @Override
  public void process(final NonpositiveStartTimeoutMatch match) {
    process(match.getAction());
  }
}
