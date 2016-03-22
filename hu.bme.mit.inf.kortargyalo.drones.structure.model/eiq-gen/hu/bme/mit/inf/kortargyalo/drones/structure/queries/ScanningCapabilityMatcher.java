package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.ScanningCapabilityMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.ScanningCapabilityQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.scanningCapability pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ScanningCapabilityMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}QueryBasedFeature
 * pattern scanningCapability(This : DroneType, Target : ProvidedCapability) {
 * 	find providedScanningCapability(This, Target);
 * 	1 == count find providedScanningCapability(This, _);
 * }
 * </pre></code>
 * 
 * @see ScanningCapabilityMatch
 * @see ScanningCapabilityProcessor
 * @see ScanningCapabilityQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ScanningCapabilityMatcher extends BaseMatcher<ScanningCapabilityMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ScanningCapabilityMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ScanningCapabilityMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ScanningCapabilityMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_THIS = 0;
  
  private final static int POSITION_TARGET = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ScanningCapabilityMatcher.class);
  
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
  public ScanningCapabilityMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ScanningCapabilityMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pThis the fixed value of pattern parameter This, or null if not bound.
   * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
   * @return matches represented as a ScanningCapabilityMatch object.
   * 
   */
  public Collection<ScanningCapabilityMatch> getAllMatches(final DroneType pThis, final ProvidedCapability pTarget) {
    return rawGetAllMatches(new Object[]{pThis, pTarget});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pThis the fixed value of pattern parameter This, or null if not bound.
   * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
   * @return a match represented as a ScanningCapabilityMatch object, or null if no match is found.
   * 
   */
  public ScanningCapabilityMatch getOneArbitraryMatch(final DroneType pThis, final ProvidedCapability pTarget) {
    return rawGetOneArbitraryMatch(new Object[]{pThis, pTarget});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pThis the fixed value of pattern parameter This, or null if not bound.
   * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DroneType pThis, final ProvidedCapability pTarget) {
    return rawHasMatch(new Object[]{pThis, pTarget});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pThis the fixed value of pattern parameter This, or null if not bound.
   * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DroneType pThis, final ProvidedCapability pTarget) {
    return rawCountMatches(new Object[]{pThis, pTarget});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pThis the fixed value of pattern parameter This, or null if not bound.
   * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DroneType pThis, final ProvidedCapability pTarget, final IMatchProcessor<? super ScanningCapabilityMatch> processor) {
    rawForEachMatch(new Object[]{pThis, pTarget}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pThis the fixed value of pattern parameter This, or null if not bound.
   * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DroneType pThis, final ProvidedCapability pTarget, final IMatchProcessor<? super ScanningCapabilityMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pThis, pTarget}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pThis the fixed value of pattern parameter This, or null if not bound.
   * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ScanningCapabilityMatch newMatch(final DroneType pThis, final ProvidedCapability pTarget) {
    return ScanningCapabilityMatch.newMatch(pThis, pTarget);
  }
  
  /**
   * Retrieve the set of values that occur in matches for This.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DroneType> rawAccumulateAllValuesOfThis(final Object[] parameters) {
    Set<DroneType> results = new HashSet<DroneType>();
    rawAccumulateAllValues(POSITION_THIS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for This.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneType> getAllValuesOfThis() {
    return rawAccumulateAllValuesOfThis(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for This.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneType> getAllValuesOfThis(final ScanningCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfThis(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for This.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneType> getAllValuesOfThis(final ProvidedCapability pTarget) {
    return rawAccumulateAllValuesOfThis(new Object[]{
    null, 
    pTarget
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ProvidedCapability> rawAccumulateAllValuesOfTarget(final Object[] parameters) {
    Set<ProvidedCapability> results = new HashSet<ProvidedCapability>();
    rawAccumulateAllValues(POSITION_TARGET, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ProvidedCapability> getAllValuesOfTarget() {
    return rawAccumulateAllValuesOfTarget(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ProvidedCapability> getAllValuesOfTarget(final ScanningCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfTarget(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Target.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ProvidedCapability> getAllValuesOfTarget(final DroneType pThis) {
    return rawAccumulateAllValuesOfTarget(new Object[]{
    pThis, 
    null
    });
  }
  
  @Override
  protected ScanningCapabilityMatch tupleToMatch(final Tuple t) {
    try {
    	return ScanningCapabilityMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) t.get(POSITION_THIS), (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability) t.get(POSITION_TARGET));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ScanningCapabilityMatch arrayToMatch(final Object[] match) {
    try {
    	return ScanningCapabilityMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) match[POSITION_THIS], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability) match[POSITION_TARGET]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ScanningCapabilityMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ScanningCapabilityMatch.newMutableMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) match[POSITION_THIS], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability) match[POSITION_TARGET]);
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
  public static IQuerySpecification<ScanningCapabilityMatcher> querySpecification() throws IncQueryException {
    return ScanningCapabilityQuerySpecification.instance();
  }
}
