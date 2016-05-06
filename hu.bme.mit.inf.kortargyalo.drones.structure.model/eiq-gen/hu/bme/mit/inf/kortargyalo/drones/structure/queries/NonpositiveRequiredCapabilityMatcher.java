package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveRequiredCapabilityMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveRequiredCapabilityQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveRequiredCapability pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NonpositiveRequiredCapabilityMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"RequiredCapability"},
 * 	severity = "error",
 * 	message = "Minimal value of provided capability $Capability.name$ of $Action.name$.$Role.name$ must be positive."
 * )
 * pattern nonpositiveRequiredCapability(RequiredCapability : RequiredCapability, Capability : Capability, Action : CooperativeAction, Role : Role) {
 * 	RequiredCapability.minimalValue(RequiredCapability, Value);
 * 	check(Value {@literal <}= 0);
 * 	RequiredCapability.capability(RequiredCapability, Capability);
 * 	RequiredCapability.role(RequiredCapability, Role);
 * 	CooperativeAction.roles(Action, Role);
 * }
 * </pre></code>
 * 
 * @see NonpositiveRequiredCapabilityMatch
 * @see NonpositiveRequiredCapabilityProcessor
 * @see NonpositiveRequiredCapabilityQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NonpositiveRequiredCapabilityMatcher extends BaseMatcher<NonpositiveRequiredCapabilityMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NonpositiveRequiredCapabilityMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    NonpositiveRequiredCapabilityMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new NonpositiveRequiredCapabilityMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_REQUIREDCAPABILITY = 0;
  
  private final static int POSITION_CAPABILITY = 1;
  
  private final static int POSITION_ACTION = 2;
  
  private final static int POSITION_ROLE = 3;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(NonpositiveRequiredCapabilityMatcher.class);
  
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
  public NonpositiveRequiredCapabilityMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public NonpositiveRequiredCapabilityMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRequiredCapability the fixed value of pattern parameter RequiredCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pAction the fixed value of pattern parameter Action, or null if not bound.
   * @param pRole the fixed value of pattern parameter Role, or null if not bound.
   * @return matches represented as a NonpositiveRequiredCapabilityMatch object.
   * 
   */
  public Collection<NonpositiveRequiredCapabilityMatch> getAllMatches(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
    return rawGetAllMatches(new Object[]{pRequiredCapability, pCapability, pAction, pRole});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRequiredCapability the fixed value of pattern parameter RequiredCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pAction the fixed value of pattern parameter Action, or null if not bound.
   * @param pRole the fixed value of pattern parameter Role, or null if not bound.
   * @return a match represented as a NonpositiveRequiredCapabilityMatch object, or null if no match is found.
   * 
   */
  public NonpositiveRequiredCapabilityMatch getOneArbitraryMatch(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
    return rawGetOneArbitraryMatch(new Object[]{pRequiredCapability, pCapability, pAction, pRole});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pRequiredCapability the fixed value of pattern parameter RequiredCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pAction the fixed value of pattern parameter Action, or null if not bound.
   * @param pRole the fixed value of pattern parameter Role, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
    return rawHasMatch(new Object[]{pRequiredCapability, pCapability, pAction, pRole});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pRequiredCapability the fixed value of pattern parameter RequiredCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pAction the fixed value of pattern parameter Action, or null if not bound.
   * @param pRole the fixed value of pattern parameter Role, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
    return rawCountMatches(new Object[]{pRequiredCapability, pCapability, pAction, pRole});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pRequiredCapability the fixed value of pattern parameter RequiredCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pAction the fixed value of pattern parameter Action, or null if not bound.
   * @param pRole the fixed value of pattern parameter Role, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole, final IMatchProcessor<? super NonpositiveRequiredCapabilityMatch> processor) {
    rawForEachMatch(new Object[]{pRequiredCapability, pCapability, pAction, pRole}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pRequiredCapability the fixed value of pattern parameter RequiredCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pAction the fixed value of pattern parameter Action, or null if not bound.
   * @param pRole the fixed value of pattern parameter Role, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole, final IMatchProcessor<? super NonpositiveRequiredCapabilityMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pRequiredCapability, pCapability, pAction, pRole}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pRequiredCapability the fixed value of pattern parameter RequiredCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pAction the fixed value of pattern parameter Action, or null if not bound.
   * @param pRole the fixed value of pattern parameter Role, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NonpositiveRequiredCapabilityMatch newMatch(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
    return NonpositiveRequiredCapabilityMatch.newMatch(pRequiredCapability, pCapability, pAction, pRole);
  }
  
  /**
   * Retrieve the set of values that occur in matches for RequiredCapability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<RequiredCapability> rawAccumulateAllValuesOfRequiredCapability(final Object[] parameters) {
    Set<RequiredCapability> results = new HashSet<RequiredCapability>();
    rawAccumulateAllValues(POSITION_REQUIREDCAPABILITY, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for RequiredCapability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RequiredCapability> getAllValuesOfRequiredCapability() {
    return rawAccumulateAllValuesOfRequiredCapability(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for RequiredCapability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RequiredCapability> getAllValuesOfRequiredCapability(final NonpositiveRequiredCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfRequiredCapability(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for RequiredCapability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<RequiredCapability> getAllValuesOfRequiredCapability(final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
    return rawAccumulateAllValuesOfRequiredCapability(new Object[]{
    null, 
    pCapability, 
    pAction, 
    pRole
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
  public Set<Capability> getAllValuesOfCapability(final NonpositiveRequiredCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfCapability(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Capability.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Capability> getAllValuesOfCapability(final RequiredCapability pRequiredCapability, final CooperativeAction pAction, final Role pRole) {
    return rawAccumulateAllValuesOfCapability(new Object[]{
    pRequiredCapability, 
    null, 
    pAction, 
    pRole
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Action.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<CooperativeAction> rawAccumulateAllValuesOfAction(final Object[] parameters) {
    Set<CooperativeAction> results = new HashSet<CooperativeAction>();
    rawAccumulateAllValues(POSITION_ACTION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Action.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CooperativeAction> getAllValuesOfAction() {
    return rawAccumulateAllValuesOfAction(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Action.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CooperativeAction> getAllValuesOfAction(final NonpositiveRequiredCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfAction(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Action.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<CooperativeAction> getAllValuesOfAction(final RequiredCapability pRequiredCapability, final Capability pCapability, final Role pRole) {
    return rawAccumulateAllValuesOfAction(new Object[]{
    pRequiredCapability, 
    pCapability, 
    null, 
    pRole
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Role.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Role> rawAccumulateAllValuesOfRole(final Object[] parameters) {
    Set<Role> results = new HashSet<Role>();
    rawAccumulateAllValues(POSITION_ROLE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Role.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Role> getAllValuesOfRole() {
    return rawAccumulateAllValuesOfRole(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Role.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Role> getAllValuesOfRole(final NonpositiveRequiredCapabilityMatch partialMatch) {
    return rawAccumulateAllValuesOfRole(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Role.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Role> getAllValuesOfRole(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction) {
    return rawAccumulateAllValuesOfRole(new Object[]{
    pRequiredCapability, 
    pCapability, 
    pAction, 
    null
    });
  }
  
  @Override
  protected NonpositiveRequiredCapabilityMatch tupleToMatch(final Tuple t) {
    try {
    	return NonpositiveRequiredCapabilityMatch.newMatch((RequiredCapability) t.get(POSITION_REQUIREDCAPABILITY), (Capability) t.get(POSITION_CAPABILITY), (CooperativeAction) t.get(POSITION_ACTION), (Role) t.get(POSITION_ROLE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NonpositiveRequiredCapabilityMatch arrayToMatch(final Object[] match) {
    try {
    	return NonpositiveRequiredCapabilityMatch.newMatch((RequiredCapability) match[POSITION_REQUIREDCAPABILITY], (Capability) match[POSITION_CAPABILITY], (CooperativeAction) match[POSITION_ACTION], (Role) match[POSITION_ROLE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NonpositiveRequiredCapabilityMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NonpositiveRequiredCapabilityMatch.newMutableMatch((RequiredCapability) match[POSITION_REQUIREDCAPABILITY], (Capability) match[POSITION_CAPABILITY], (CooperativeAction) match[POSITION_ACTION], (Role) match[POSITION_ROLE]);
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
  public static IQuerySpecification<NonpositiveRequiredCapabilityMatcher> querySpecification() throws IncQueryException {
    return NonpositiveRequiredCapabilityQuerySpecification.instance();
  }
}
