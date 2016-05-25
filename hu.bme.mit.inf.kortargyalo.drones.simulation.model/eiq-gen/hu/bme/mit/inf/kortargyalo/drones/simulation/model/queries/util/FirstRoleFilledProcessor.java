package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.FirstRoleFilledMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.firstRoleFilled pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class FirstRoleFilledProcessor implements IMatchProcessor<FirstRoleFilledMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pTask the value of pattern parameter task in the currently processed match
   * 
   */
  public abstract void process(final TaskInstance pTask);
  
  @Override
  public void process(final FirstRoleFilledMatch match) {
    process(match.getTask());
  }
}
