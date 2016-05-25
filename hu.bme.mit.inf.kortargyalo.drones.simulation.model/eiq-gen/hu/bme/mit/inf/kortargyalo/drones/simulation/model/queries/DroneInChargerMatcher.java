package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneInChargerMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.DroneInChargerQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.droneInCharger pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DroneInChargerMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern droneInCharger(drone : DroneInstance, charger : Charger){
 * 	DroneInstance.position.x(drone,dronepositionx);
 * 	DroneInstance.position.y(drone,dronepositiony);
 * 	DroneInstance.position.z(drone,dronepositionz);
 * 	DroneInstance.drone.dronetype.dimension.width(drone,dronedimensionx);
 * 	DroneInstance.drone.dronetype.dimension.height(drone,dronedimensiony);
 * 	DroneInstance.drone.dronetype.dimension.depth(drone,dronedimensionz);
 * 
 * 	Charger(charger);
 * 
 * 	Charger.position.x(charger, objectx);
 * 	Charger.position.y(charger, objecty);
 * 	Charger.position.z(charger, objectz);
 * 	Charger.dimension.width(charger, objectdimx);
 * 	Charger.dimension.height(charger, objectdimy);
 * 	Charger.dimension.depth(charger, objectdimz);
 * 
 * 	check(CollisionHelper.doCollideWithObstacle(dronepositionx, dronepositiony, dronepositionz, dronedimensionx, dronedimensiony, dronedimensionz, objectx, objecty, objectz, objectdimx, objectdimy, objectdimz));
 * }
 * </pre></code>
 * 
 * @see DroneInChargerMatch
 * @see DroneInChargerProcessor
 * @see DroneInChargerQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DroneInChargerMatcher extends BaseMatcher<DroneInChargerMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DroneInChargerMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    DroneInChargerMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new DroneInChargerMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DRONE = 0;
  
  private final static int POSITION_CHARGER = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(DroneInChargerMatcher.class);
  
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
  public DroneInChargerMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public DroneInChargerMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pCharger the fixed value of pattern parameter charger, or null if not bound.
   * @return matches represented as a DroneInChargerMatch object.
   * 
   */
  public Collection<DroneInChargerMatch> getAllMatches(final DroneInstance pDrone, final Charger pCharger) {
    return rawGetAllMatches(new Object[]{pDrone, pCharger});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pCharger the fixed value of pattern parameter charger, or null if not bound.
   * @return a match represented as a DroneInChargerMatch object, or null if no match is found.
   * 
   */
  public DroneInChargerMatch getOneArbitraryMatch(final DroneInstance pDrone, final Charger pCharger) {
    return rawGetOneArbitraryMatch(new Object[]{pDrone, pCharger});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pCharger the fixed value of pattern parameter charger, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DroneInstance pDrone, final Charger pCharger) {
    return rawHasMatch(new Object[]{pDrone, pCharger});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pCharger the fixed value of pattern parameter charger, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DroneInstance pDrone, final Charger pCharger) {
    return rawCountMatches(new Object[]{pDrone, pCharger});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pCharger the fixed value of pattern parameter charger, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DroneInstance pDrone, final Charger pCharger, final IMatchProcessor<? super DroneInChargerMatch> processor) {
    rawForEachMatch(new Object[]{pDrone, pCharger}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pCharger the fixed value of pattern parameter charger, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DroneInstance pDrone, final Charger pCharger, final IMatchProcessor<? super DroneInChargerMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDrone, pCharger}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pCharger the fixed value of pattern parameter charger, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DroneInChargerMatch newMatch(final DroneInstance pDrone, final Charger pCharger) {
    return DroneInChargerMatch.newMatch(pDrone, pCharger);
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
  public Set<DroneInstance> getAllValuesOfdrone(final DroneInChargerMatch partialMatch) {
    return rawAccumulateAllValuesOfdrone(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone(final Charger pCharger) {
    return rawAccumulateAllValuesOfdrone(new Object[]{
    null, 
    pCharger
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for charger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Charger> rawAccumulateAllValuesOfcharger(final Object[] parameters) {
    Set<Charger> results = new HashSet<Charger>();
    rawAccumulateAllValues(POSITION_CHARGER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for charger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Charger> getAllValuesOfcharger() {
    return rawAccumulateAllValuesOfcharger(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for charger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Charger> getAllValuesOfcharger(final DroneInChargerMatch partialMatch) {
    return rawAccumulateAllValuesOfcharger(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for charger.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Charger> getAllValuesOfcharger(final DroneInstance pDrone) {
    return rawAccumulateAllValuesOfcharger(new Object[]{
    pDrone, 
    null
    });
  }
  
  @Override
  protected DroneInChargerMatch tupleToMatch(final Tuple t) {
    try {
    	return DroneInChargerMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) t.get(POSITION_DRONE), (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger) t.get(POSITION_CHARGER));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DroneInChargerMatch arrayToMatch(final Object[] match) {
    try {
    	return DroneInChargerMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) match[POSITION_DRONE], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger) match[POSITION_CHARGER]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DroneInChargerMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return DroneInChargerMatch.newMutableMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) match[POSITION_DRONE], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger) match[POSITION_CHARGER]);
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
  public static IQuerySpecification<DroneInChargerMatcher> querySpecification() throws IncQueryException {
    return DroneInChargerQuerySpecification.instance();
  }
}
