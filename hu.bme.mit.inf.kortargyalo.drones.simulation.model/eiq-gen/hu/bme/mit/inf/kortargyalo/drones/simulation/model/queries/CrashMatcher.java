package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CrashMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.CrashQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.crash pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CrashMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //this warning is intentional
 * pattern crash(drone1 : DroneInstance, drone2: DroneInstance){
 * 	DroneInstance.position(drone1,drone1position);
 * 	Position.x(drone1position,drone1positionx);
 * 	Position.y(drone1position,drone1positiony);
 * 	Position.z(drone1position,drone1positionz);
 * 	DroneInstance.drone.dronetype.dimension(drone1,drone1dimension);
 * 	Dimension.width(drone1dimension, drone1dimensionx);
 * 	Dimension.height(drone1dimension, drone1dimensiony);
 * 	Dimension.depth(drone1dimension, drone1dimensionz);
 * 	
 * 	DroneInstance.position(drone2,drone2position);
 * 	Position.x(drone2position,drone2positionx);
 * 	Position.y(drone2position,drone2positiony);
 * 	Position.z(drone2position,drone2positionz);
 * 	DroneInstance.drone.dronetype.dimension(drone2,drone2dimension);
 * 	Dimension.width(drone2dimension, drone2dimensionx);
 * 	Dimension.depth(drone2dimension, drone2dimensionz);
 * 	Dimension.height(drone2dimension, drone2dimensiony);
 * 
 * 	check(CollisionHelper.doDronesCollide(drone1positionx,drone1positiony, drone1positionz, drone1dimensionx, drone1dimensiony, drone1dimensionz,drone2positionx, drone2positiony, drone2positionz,drone2dimensionx, drone2dimensiony, drone2dimensionz));
 * }
 * </pre></code>
 * 
 * @see CrashMatch
 * @see CrashProcessor
 * @see CrashQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CrashMatcher extends BaseMatcher<CrashMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CrashMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CrashMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CrashMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DRONE1 = 0;
  
  private final static int POSITION_DRONE2 = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CrashMatcher.class);
  
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
  public CrashMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CrashMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrone1 the fixed value of pattern parameter drone1, or null if not bound.
   * @param pDrone2 the fixed value of pattern parameter drone2, or null if not bound.
   * @return matches represented as a CrashMatch object.
   * 
   */
  public Collection<CrashMatch> getAllMatches(final DroneInstance pDrone1, final DroneInstance pDrone2) {
    return rawGetAllMatches(new Object[]{pDrone1, pDrone2});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrone1 the fixed value of pattern parameter drone1, or null if not bound.
   * @param pDrone2 the fixed value of pattern parameter drone2, or null if not bound.
   * @return a match represented as a CrashMatch object, or null if no match is found.
   * 
   */
  public CrashMatch getOneArbitraryMatch(final DroneInstance pDrone1, final DroneInstance pDrone2) {
    return rawGetOneArbitraryMatch(new Object[]{pDrone1, pDrone2});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDrone1 the fixed value of pattern parameter drone1, or null if not bound.
   * @param pDrone2 the fixed value of pattern parameter drone2, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DroneInstance pDrone1, final DroneInstance pDrone2) {
    return rawHasMatch(new Object[]{pDrone1, pDrone2});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrone1 the fixed value of pattern parameter drone1, or null if not bound.
   * @param pDrone2 the fixed value of pattern parameter drone2, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DroneInstance pDrone1, final DroneInstance pDrone2) {
    return rawCountMatches(new Object[]{pDrone1, pDrone2});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDrone1 the fixed value of pattern parameter drone1, or null if not bound.
   * @param pDrone2 the fixed value of pattern parameter drone2, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DroneInstance pDrone1, final DroneInstance pDrone2, final IMatchProcessor<? super CrashMatch> processor) {
    rawForEachMatch(new Object[]{pDrone1, pDrone2}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrone1 the fixed value of pattern parameter drone1, or null if not bound.
   * @param pDrone2 the fixed value of pattern parameter drone2, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DroneInstance pDrone1, final DroneInstance pDrone2, final IMatchProcessor<? super CrashMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDrone1, pDrone2}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrone1 the fixed value of pattern parameter drone1, or null if not bound.
   * @param pDrone2 the fixed value of pattern parameter drone2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CrashMatch newMatch(final DroneInstance pDrone1, final DroneInstance pDrone2) {
    return CrashMatch.newMatch(pDrone1, pDrone2);
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DroneInstance> rawAccumulateAllValuesOfdrone1(final Object[] parameters) {
    Set<DroneInstance> results = new HashSet<DroneInstance>();
    rawAccumulateAllValues(POSITION_DRONE1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone1() {
    return rawAccumulateAllValuesOfdrone1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone1(final CrashMatch partialMatch) {
    return rawAccumulateAllValuesOfdrone1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone1(final DroneInstance pDrone2) {
    return rawAccumulateAllValuesOfdrone1(new Object[]{
    null, 
    pDrone2
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DroneInstance> rawAccumulateAllValuesOfdrone2(final Object[] parameters) {
    Set<DroneInstance> results = new HashSet<DroneInstance>();
    rawAccumulateAllValues(POSITION_DRONE2, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone2() {
    return rawAccumulateAllValuesOfdrone2(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone2(final CrashMatch partialMatch) {
    return rawAccumulateAllValuesOfdrone2(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone2.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone2(final DroneInstance pDrone1) {
    return rawAccumulateAllValuesOfdrone2(new Object[]{
    pDrone1, 
    null
    });
  }
  
  @Override
  protected CrashMatch tupleToMatch(final Tuple t) {
    try {
    	return CrashMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) t.get(POSITION_DRONE1), (hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) t.get(POSITION_DRONE2));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CrashMatch arrayToMatch(final Object[] match) {
    try {
    	return CrashMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) match[POSITION_DRONE1], (hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) match[POSITION_DRONE2]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CrashMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CrashMatch.newMutableMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) match[POSITION_DRONE1], (hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) match[POSITION_DRONE2]);
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
  public static IQuerySpecification<CrashMatcher> querySpecification() throws IncQueryException {
    return CrashQuerySpecification.instance();
  }
}
