package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.ReplacedObservationMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.ReplacedObservationQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.replacedObservation pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ReplacedObservationMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern replacedObservation(old : Observation) {
 * 	DroneInstance.observations(drone, old);
 * 	DroneInstance.observations(drone, novel);
 * 	old != novel;
 * 	find observesSameObject(old, novel);
 * 	Observation.time(old, oldTime);
 * 	Observation.time(novel, newTime);
 * 	Observation.id(old, oldId);
 * 	Observation.time(novel, newId);
 * 	check(oldTime {@literal <} newTime || (oldTime == newTime && oldId {@literal <} newId));
 * }
 * </pre></code>
 * 
 * @see ReplacedObservationMatch
 * @see ReplacedObservationProcessor
 * @see ReplacedObservationQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ReplacedObservationMatcher extends BaseMatcher<ReplacedObservationMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ReplacedObservationMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ReplacedObservationMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ReplacedObservationMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_OLD = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ReplacedObservationMatcher.class);
  
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
  public ReplacedObservationMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ReplacedObservationMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pOld the fixed value of pattern parameter old, or null if not bound.
   * @return matches represented as a ReplacedObservationMatch object.
   * 
   */
  public Collection<ReplacedObservationMatch> getAllMatches(final Observation pOld) {
    return rawGetAllMatches(new Object[]{pOld});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pOld the fixed value of pattern parameter old, or null if not bound.
   * @return a match represented as a ReplacedObservationMatch object, or null if no match is found.
   * 
   */
  public ReplacedObservationMatch getOneArbitraryMatch(final Observation pOld) {
    return rawGetOneArbitraryMatch(new Object[]{pOld});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pOld the fixed value of pattern parameter old, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Observation pOld) {
    return rawHasMatch(new Object[]{pOld});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pOld the fixed value of pattern parameter old, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Observation pOld) {
    return rawCountMatches(new Object[]{pOld});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pOld the fixed value of pattern parameter old, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Observation pOld, final IMatchProcessor<? super ReplacedObservationMatch> processor) {
    rawForEachMatch(new Object[]{pOld}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pOld the fixed value of pattern parameter old, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Observation pOld, final IMatchProcessor<? super ReplacedObservationMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pOld}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pOld the fixed value of pattern parameter old, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ReplacedObservationMatch newMatch(final Observation pOld) {
    return ReplacedObservationMatch.newMatch(pOld);
  }
  
  /**
   * Retrieve the set of values that occur in matches for old.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Observation> rawAccumulateAllValuesOfold(final Object[] parameters) {
    Set<Observation> results = new HashSet<Observation>();
    rawAccumulateAllValues(POSITION_OLD, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for old.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Observation> getAllValuesOfold() {
    return rawAccumulateAllValuesOfold(emptyArray());
  }
  
  @Override
  protected ReplacedObservationMatch tupleToMatch(final Tuple t) {
    try {
    	return ReplacedObservationMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation) t.get(POSITION_OLD));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ReplacedObservationMatch arrayToMatch(final Object[] match) {
    try {
    	return ReplacedObservationMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation) match[POSITION_OLD]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ReplacedObservationMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ReplacedObservationMatch.newMutableMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation) match[POSITION_OLD]);
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
  public static IQuerySpecification<ReplacedObservationMatcher> querySpecification() throws IncQueryException {
    return ReplacedObservationQuerySpecification.instance();
  }
}
