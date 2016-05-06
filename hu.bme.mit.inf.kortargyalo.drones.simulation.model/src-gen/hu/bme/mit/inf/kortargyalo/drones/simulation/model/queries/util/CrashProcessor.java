package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CrashMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.crash pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CrashProcessor implements IMatchProcessor<CrashMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDrone1 the value of pattern parameter drone1 in the currently processed match
   * @param pDrone2 the value of pattern parameter drone2 in the currently processed match
   * 
   */
  public abstract void process(final DroneInstance pDrone1, final DroneInstance pDrone2);
  
  @Override
  public void process(final CrashMatch match) {
    process(match.getDrone1(), match.getDrone2());
  }
}
