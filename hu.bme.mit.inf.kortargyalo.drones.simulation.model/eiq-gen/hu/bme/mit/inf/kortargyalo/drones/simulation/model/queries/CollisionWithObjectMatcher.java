package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CollisionWithObjectMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.CollisionWithObjectQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.collisionWithObject pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CollisionWithObjectMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern collisionWithObject(drone : DroneInstance, object : Obstacle){
 * 	DroneInstance.position(drone,droneposition);
 * 	Position.x(droneposition,dronepositionx);
 * 	Position.y(droneposition,dronepositiony);
 * 	Position.z(droneposition,dronepositionz);
 * 	DroneInstance.drone.dronetype.dimension(drone,dronedimension);
 * 	Dimension.width(dronedimension, dronedimensionx);
 * 	Dimension.height(dronedimension, dronedimensiony);
 * 	Dimension.depth(dronedimension, dronedimensionz);	
 * 
 * 	Obstacle.position.x(object, objectx);
 * 	Obstacle.position.y(object, objecty);
 * 	Obstacle.position.z(object, objectz);
 * 	Obstacle.dimension.width(object, objectdimx);
 * 	Obstacle.dimension.height(object, objectdimy);
 * 	Obstacle.dimension.depth(object, objectdimz);
 * 	
 * 	check(CollisionHelper.doCollideWithObstacle(dronepositionx, dronepositiony, dronepositionz, dronedimensionx, dronedimensiony, dronedimensionz, objectx, objecty, objectz, objectdimx, objectdimy, objectdimz));
 * 		
 * }
 * </pre></code>
 * 
 * @see CollisionWithObjectMatch
 * @see CollisionWithObjectProcessor
 * @see CollisionWithObjectQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CollisionWithObjectMatcher extends BaseMatcher<CollisionWithObjectMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CollisionWithObjectMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CollisionWithObjectMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CollisionWithObjectMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DRONE = 0;
  
  private final static int POSITION_OBJECT = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CollisionWithObjectMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public CollisionWithObjectMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public CollisionWithObjectMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @return matches represented as a CollisionWithObjectMatch object.
   * 
   */
  public Collection<CollisionWithObjectMatch> getAllMatches(final DroneInstance pDrone, final Obstacle pObject) {
    return rawGetAllMatches(new Object[]{pDrone, pObject});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @return a match represented as a CollisionWithObjectMatch object, or null if no match is found.
   * 
   */
  public CollisionWithObjectMatch getOneArbitraryMatch(final DroneInstance pDrone, final Obstacle pObject) {
    return rawGetOneArbitraryMatch(new Object[]{pDrone, pObject});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DroneInstance pDrone, final Obstacle pObject) {
    return rawHasMatch(new Object[]{pDrone, pObject});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DroneInstance pDrone, final Obstacle pObject) {
    return rawCountMatches(new Object[]{pDrone, pObject});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DroneInstance pDrone, final Obstacle pObject, final IMatchProcessor<? super CollisionWithObjectMatch> processor) {
    rawForEachMatch(new Object[]{pDrone, pObject}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DroneInstance pDrone, final Obstacle pObject, final IMatchProcessor<? super CollisionWithObjectMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDrone, pObject}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CollisionWithObjectMatch newMatch(final DroneInstance pDrone, final Obstacle pObject) {
    return CollisionWithObjectMatch.newMatch(pDrone, pObject);
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DroneInstance> rawAccumulateAllValuesOfdrone(final Object[] parameters) {
    Set<DroneInstance> results = new HashSet<DroneInstance>();
    rawAccumulateAllValues(POSITION_DRONE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone() {
    return rawAccumulateAllValuesOfdrone(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone(final CollisionWithObjectMatch partialMatch) {
    return rawAccumulateAllValuesOfdrone(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone(final Obstacle pObject) {
    return rawAccumulateAllValuesOfdrone(new Object[]{
    null, 
    pObject
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Obstacle> rawAccumulateAllValuesOfobject(final Object[] parameters) {
    Set<Obstacle> results = new HashSet<Obstacle>();
    rawAccumulateAllValues(POSITION_OBJECT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Obstacle> getAllValuesOfobject() {
    return rawAccumulateAllValuesOfobject(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Obstacle> getAllValuesOfobject(final CollisionWithObjectMatch partialMatch) {
    return rawAccumulateAllValuesOfobject(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for object.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Obstacle> getAllValuesOfobject(final DroneInstance pDrone) {
    return rawAccumulateAllValuesOfobject(new Object[]{
    pDrone, 
    null
    });
  }
  
  @Override
  protected CollisionWithObjectMatch tupleToMatch(final Tuple t) {
    try {
    	return CollisionWithObjectMatch.newMatch((DroneInstance) t.get(POSITION_DRONE), (Obstacle) t.get(POSITION_OBJECT));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CollisionWithObjectMatch arrayToMatch(final Object[] match) {
    try {
    	return CollisionWithObjectMatch.newMatch((DroneInstance) match[POSITION_DRONE], (Obstacle) match[POSITION_OBJECT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CollisionWithObjectMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CollisionWithObjectMatch.newMutableMatch((DroneInstance) match[POSITION_DRONE], (Obstacle) match[POSITION_OBJECT]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<CollisionWithObjectMatcher> querySpecification() throws IncQueryException {
    return CollisionWithObjectQuerySpecification.instance();
  }
}
