package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneInChargerMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.droneInCharger pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class DroneInChargerProcessor implements IMatchProcessor<DroneInChargerMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDrone the value of pattern parameter drone in the currently processed match
   * @param pCharger the value of pattern parameter charger in the currently processed match
   * 
   */
  public abstract void process(final DroneInstance pDrone, final Charger pCharger);
  
  @Override
  public void process(final DroneInChargerMatch match) {
    process(match.getDrone(), match.getCharger());
  }
}
