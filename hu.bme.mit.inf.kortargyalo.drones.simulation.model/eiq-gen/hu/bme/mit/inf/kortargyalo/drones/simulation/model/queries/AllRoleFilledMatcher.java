package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllRoleFilledMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.AllRoleFilledQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.allRoleFilled pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link AllRoleFilledMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern allRoleFilled(task : TaskInstance) {
 * 	TaskInstance.state(task, ::WAITING);
 * 	neg find notAllRoleFilled(task);
 * }
 * </pre></code>
 * 
 * @see AllRoleFilledMatch
 * @see AllRoleFilledProcessor
 * @see AllRoleFilledQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class AllRoleFilledMatcher extends BaseMatcher<AllRoleFilledMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static AllRoleFilledMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    AllRoleFilledMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new AllRoleFilledMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TASK = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(AllRoleFilledMatcher.class);
  
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
  public AllRoleFilledMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public AllRoleFilledMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return matches represented as a AllRoleFilledMatch object.
   * 
   */
  public Collection<AllRoleFilledMatch> getAllMatches(final TaskInstance pTask) {
    return rawGetAllMatches(new Object[]{pTask});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return a match represented as a AllRoleFilledMatch object, or null if no match is found.
   * 
   */
  public AllRoleFilledMatch getOneArbitraryMatch(final TaskInstance pTask) {
    return rawGetOneArbitraryMatch(new Object[]{pTask});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TaskInstance pTask) {
    return rawHasMatch(new Object[]{pTask});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TaskInstance pTask) {
    return rawCountMatches(new Object[]{pTask});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TaskInstance pTask, final IMatchProcessor<? super AllRoleFilledMatch> processor) {
    rawForEachMatch(new Object[]{pTask}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TaskInstance pTask, final IMatchProcessor<? super AllRoleFilledMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTask}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AllRoleFilledMatch newMatch(final TaskInstance pTask) {
    return AllRoleFilledMatch.newMatch(pTask);
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TaskInstance> rawAccumulateAllValuesOftask(final Object[] parameters) {
    Set<TaskInstance> results = new HashSet<TaskInstance>();
    rawAccumulateAllValues(POSITION_TASK, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for task.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TaskInstance> getAllValuesOftask() {
    return rawAccumulateAllValuesOftask(emptyArray());
  }
  
  @Override
  protected AllRoleFilledMatch tupleToMatch(final Tuple t) {
    try {
    	return AllRoleFilledMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance) t.get(POSITION_TASK));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AllRoleFilledMatch arrayToMatch(final Object[] match) {
    try {
    	return AllRoleFilledMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance) match[POSITION_TASK]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected AllRoleFilledMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return AllRoleFilledMatch.newMutableMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance) match[POSITION_TASK]);
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
  public static IQuerySpecification<AllRoleFilledMatcher> querySpecification() throws IncQueryException {
    return AllRoleFilledQuerySpecification.instance();
  }
}
