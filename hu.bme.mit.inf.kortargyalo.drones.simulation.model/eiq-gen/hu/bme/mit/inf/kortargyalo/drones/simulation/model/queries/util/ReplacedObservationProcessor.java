package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.ReplacedObservationMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.replacedObservation pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ReplacedObservationProcessor implements IMatchProcessor<ReplacedObservationMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pOld the value of pattern parameter old in the currently processed match
   * 
   */
  public abstract void process(final Observation pOld);
  
  @Override
  public void process(final ReplacedObservationMatch match) {
    process(match.getOld());
  }
}
