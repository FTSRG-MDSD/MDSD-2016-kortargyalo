package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NegativeCostProvidedCapabilityMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NegativeCostProvidedCapabilityQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.negativeCostProvidedCapability pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NegativeCostProvidedCapabilityMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"ProvidedCapability"},
 * 	severity = "error",
 * 	message = "Energy consumption of provided capability $Capability.name$ of $DroneType.name$ must not be negative."
 * )
 * pattern negativeCostProvidedCapability(ProvidedCapability : ProvidedCapability, Capability : Capability, DroneType : DroneType) {
 * 	ProvidedCapability.energyConsumptionPerValue(ProvidedCapability, Value);
 * 	check(Value {@literal <} 0);
 * 	ProvidedCapability.capability(ProvidedCapability, Capability);
 * 	ProvidedCapability.droneType(ProvidedCapability, DroneType);
 * }
 * </pre></code>
 * 
 * @see NegativeCostProvidedCapabilityMatch
 * @see NegativeCostProvidedCapabilityProcessor
 * @see NegativeCostProvidedCapabilityQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NegativeCostProvidedCapabilityMatcher extends BaseMatcher<NegativeCostProvidedCapabilityMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NegativeCostProvidedCapabilityMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    NegativeCostProvidedCapabilityMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new NegativeCostProvidedCapabilityMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PROVIDEDCAPABILITY = 0;
  
  private final static int POSITION_CAPABILITY = 1;
  
  private final static int POSITION_DRONETYPE = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(NegativeCostProvidedCapabilityMatcher.class);
  
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
  public NegativeCostProvidedCapabilityMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public NegativeCostProvidedCapabilityMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pProvidedCapability the fixed value of pattern parameter ProvidedCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pDroneType the fixed value of pattern parameter DroneType, or null if not bound.
   * @return matches represented as a NegativeCostProvidedCapabilityMatch object.
   * 
   */
  public Collection<NegativeCostProvidedCapabilityMatch> getAllMatches(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType) {
    return rawGetAllMatches(new Object[]{pProvidedCapability, pCapability, pDroneType});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pProvidedCapability the fixed value of pattern parameter ProvidedCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pDroneType the fixed value of pattern parameter DroneType, or null if not bound.
   * @return a match represented as a NegativeCostProvidedCapabilityMatch object, or null if no match is found.
   * 
   */
  public NegativeCostProvidedCapabilityMatch getOneArbitraryMatch(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType) {
    return rawGetOneArbitraryMatch(new Object[]{pProvidedCapability, pCapability, pDroneType});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pProvidedCapability the fixed value of pattern parameter ProvidedCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pDroneType the fixed value of pattern parameter DroneType, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType) {
    return rawHasMatch(new Object[]{pProvidedCapability, pCapability, pDroneType});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pProvidedCapability the fixed value of pattern parameter ProvidedCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pDroneType the fixed value of pattern parameter DroneType, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType) {
    return rawCountMatches(new Object[]{pProvidedCapability, pCapability, pDroneType});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pProvidedCapability the fixed value of pattern parameter ProvidedCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pDroneType the fixed value of pattern parameter DroneType, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType, final IMatchProcessor<? super NegativeCostProvidedCapabilityMatch> processor) {
    rawForEachMatch(new Object[]{pProvidedCapability, pCapability, pDroneType}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pProvidedCapability the fixed value of pattern parameter ProvidedCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pDroneType the fixed value of pattern parameter DroneType, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType, final IMatchProcessor<? super NegativeCostProvidedCapabilityMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pProvidedCapability, pCapability, pDroneType}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pProvidedCapability the fixed value of pattern parameter ProvidedCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pDroneType the fixed value of pattern parameter DroneType, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NegativeCostProvidedCapabilityMatch newMatch(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType) {
    return NegativeCostProvidedCapabilityMatch.newMatch(pProvidedCapability, pCapability, pDroneType);
  }
  
  /**
   * Retrieve the set of values that occur in matches for ProvidedCapability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ProvidedCapability> rawAccumulateAllValuesOfProvidedCapability(final Object[] parameters) {
    Set<ProvidedCapability> results = new HashSet<ProvidedCapability>();
    rawAccumulateAllValues(POSITION_PROVIDEDCAPABILITY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for ProvidedCapability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ProvidedCapability> getAllValuesOfProvidedCapability() {
    return rawAccumulateAllValuesOfProvidedCapability(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ProvidedCapability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ProvidedCapability> getAllValuesOfProvidedCapability(final NegativeCostProvidedCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfProvidedCapability(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for ProvidedCapability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ProvidedCapability> getAllValuesOfProvidedCapability(final Capability pCapability, final DroneType pDroneType) {
    return rawAccumulateAllValuesOfProvidedCapability(new Object[]{
    null, 
    pCapability, 
    pDroneType
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Capability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Capability> rawAccumulateAllValuesOfCapability(final Object[] parameters) {
    Set<Capability> results = new HashSet<Capability>();
    rawAccumulateAllValues(POSITION_CAPABILITY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Capability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Capability> getAllValuesOfCapability() {
    return rawAccumulateAllValuesOfCapability(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Capability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Capability> getAllValuesOfCapability(final NegativeCostProvidedCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfCapability(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Capability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Capability> getAllValuesOfCapability(final ProvidedCapability pProvidedCapability, final DroneType pDroneType) {
    return rawAccumulateAllValuesOfCapability(new Object[]{
    pProvidedCapability, 
    null, 
    pDroneType
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for DroneType.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DroneType> rawAccumulateAllValuesOfDroneType(final Object[] parameters) {
    Set<DroneType> results = new HashSet<DroneType>();
    rawAccumulateAllValues(POSITION_DRONETYPE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for DroneType.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneType> getAllValuesOfDroneType() {
    return rawAccumulateAllValuesOfDroneType(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for DroneType.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneType> getAllValuesOfDroneType(final NegativeCostProvidedCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfDroneType(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for DroneType.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneType> getAllValuesOfDroneType(final ProvidedCapability pProvidedCapability, final Capability pCapability) {
    return rawAccumulateAllValuesOfDroneType(new Object[]{
    pProvidedCapability, 
    pCapability, 
    null
    });
  }
  
  @Override
  protected NegativeCostProvidedCapabilityMatch tupleToMatch(final Tuple t) {
    try {
    	return NegativeCostProvidedCapabilityMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability) t.get(POSITION_PROVIDEDCAPABILITY), (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability) t.get(POSITION_CAPABILITY), (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) t.get(POSITION_DRONETYPE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NegativeCostProvidedCapabilityMatch arrayToMatch(final Object[] match) {
    try {
    	return NegativeCostProvidedCapabilityMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability) match[POSITION_PROVIDEDCAPABILITY], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability) match[POSITION_CAPABILITY], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) match[POSITION_DRONETYPE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NegativeCostProvidedCapabilityMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NegativeCostProvidedCapabilityMatch.newMutableMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability) match[POSITION_PROVIDEDCAPABILITY], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability) match[POSITION_CAPABILITY], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) match[POSITION_DRONETYPE]);
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
  public static IQuerySpecification<NegativeCostProvidedCapabilityMatcher> querySpecification() throws IncQueryException {
    return NegativeCostProvidedCapabilityQuerySpecification.instance();
  }
}
