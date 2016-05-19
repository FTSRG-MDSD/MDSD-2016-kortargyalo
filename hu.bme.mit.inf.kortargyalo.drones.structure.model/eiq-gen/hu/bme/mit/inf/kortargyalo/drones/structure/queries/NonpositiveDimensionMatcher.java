package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveDimensionMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveDimensionQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveDimension pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NonpositiveDimensionMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // Validation rules for attributes:
 * 
 * {@literal @}Constraint(
 * 	key = {"Dimension"},
 * 	severity = "error",
 * 	message = "Dimensions must be positive."
 * )
 * pattern nonpositiveDimension(Dimension : Dimension) {
 * 	Dimension.width(Dimension, Width);
 * 	Dimension.depth(Dimension, Depth);
 * 	Dimension.height(Dimension, Height);
 * 	check(Width {@literal <}= 0 || Depth {@literal <}= 0 || Height {@literal <}= 0);
 * }
 * </pre></code>
 * 
 * @see NonpositiveDimensionMatch
 * @see NonpositiveDimensionProcessor
 * @see NonpositiveDimensionQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NonpositiveDimensionMatcher extends BaseMatcher<NonpositiveDimensionMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NonpositiveDimensionMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    NonpositiveDimensionMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new NonpositiveDimensionMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DIMENSION = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(NonpositiveDimensionMatcher.class);
  
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
  public NonpositiveDimensionMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public NonpositiveDimensionMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDimension the fixed value of pattern parameter Dimension, or null if not bound.
   * @return matches represented as a NonpositiveDimensionMatch object.
   * 
   */
  public Collection<NonpositiveDimensionMatch> getAllMatches(final Dimension pDimension) {
    return rawGetAllMatches(new Object[]{pDimension});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDimension the fixed value of pattern parameter Dimension, or null if not bound.
   * @return a match represented as a NonpositiveDimensionMatch object, or null if no match is found.
   * 
   */
  public NonpositiveDimensionMatch getOneArbitraryMatch(final Dimension pDimension) {
    return rawGetOneArbitraryMatch(new Object[]{pDimension});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDimension the fixed value of pattern parameter Dimension, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Dimension pDimension) {
    return rawHasMatch(new Object[]{pDimension});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDimension the fixed value of pattern parameter Dimension, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Dimension pDimension) {
    return rawCountMatches(new Object[]{pDimension});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDimension the fixed value of pattern parameter Dimension, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Dimension pDimension, final IMatchProcessor<? super NonpositiveDimensionMatch> processor) {
    rawForEachMatch(new Object[]{pDimension}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDimension the fixed value of pattern parameter Dimension, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Dimension pDimension, final IMatchProcessor<? super NonpositiveDimensionMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDimension}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDimension the fixed value of pattern parameter Dimension, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NonpositiveDimensionMatch newMatch(final Dimension pDimension) {
    return NonpositiveDimensionMatch.newMatch(pDimension);
  }
  
  /**
   * Retrieve the set of values that occur in matches for Dimension.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Dimension> rawAccumulateAllValuesOfDimension(final Object[] parameters) {
    Set<Dimension> results = new HashSet<Dimension>();
    rawAccumulateAllValues(POSITION_DIMENSION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Dimension.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Dimension> getAllValuesOfDimension() {
    return rawAccumulateAllValuesOfDimension(emptyArray());
  }
  
  @Override
  protected NonpositiveDimensionMatch tupleToMatch(final Tuple t) {
    try {
    	return NonpositiveDimensionMatch.newMatch((Dimension) t.get(POSITION_DIMENSION));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NonpositiveDimensionMatch arrayToMatch(final Object[] match) {
    try {
    	return NonpositiveDimensionMatch.newMatch((Dimension) match[POSITION_DIMENSION]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NonpositiveDimensionMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NonpositiveDimensionMatch.newMutableMatch((Dimension) match[POSITION_DIMENSION]);
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
  public static IQuerySpecification<NonpositiveDimensionMatcher> querySpecification() throws IncQueryException {
    return NonpositiveDimensionQuerySpecification.instance();
  }
}
