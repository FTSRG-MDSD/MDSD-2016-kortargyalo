package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CollisionWithObjectMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.collisionWithObject pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class CollisionWithObjectProcessor implements IMatchProcessor<CollisionWithObjectMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pDrone the value of pattern parameter drone in the currently processed match
   * @param pObstacle the value of pattern parameter obstacle in the currently processed match
   * 
   */
  public abstract void process(final DroneInstance pDrone, final Obstacle pObstacle);
  
  @Override
  public void process(final CollisionWithObjectMatch match) {
    process(match.getDrone(), match.getObstacle());
  }
}
