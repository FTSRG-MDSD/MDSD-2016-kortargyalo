package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.DuplicateNameMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.DuplicateNameQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.duplicateName pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link DuplicateNameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(
 * 	key = {"NamedElement"},
 * 	severity = "error",
 * 	message = "Duplicate name $Name$."
 * )
 * pattern duplicateName(NamedElement : NamedElement, Name : ecore::EString) {
 * 	find inRelatedScope(NamedElement, Other);
 * 	NamedElement.name(NamedElement, Name);
 * 	NamedElement.name(Other, Name);
 * 	NamedElement != Other;
 * }
 * </pre></code>
 * 
 * @see DuplicateNameMatch
 * @see DuplicateNameProcessor
 * @see DuplicateNameQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class DuplicateNameMatcher extends BaseMatcher<DuplicateNameMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static DuplicateNameMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    DuplicateNameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new DuplicateNameMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_NAMEDELEMENT = 0;
  
  private final static int POSITION_NAME = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(DuplicateNameMatcher.class);
  
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
  public DuplicateNameMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public DuplicateNameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pNamedElement the fixed value of pattern parameter NamedElement, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return matches represented as a DuplicateNameMatch object.
   * 
   */
  public Collection<DuplicateNameMatch> getAllMatches(final NamedElement pNamedElement, final String pName) {
    return rawGetAllMatches(new Object[]{pNamedElement, pName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pNamedElement the fixed value of pattern parameter NamedElement, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return a match represented as a DuplicateNameMatch object, or null if no match is found.
   * 
   */
  public DuplicateNameMatch getOneArbitraryMatch(final NamedElement pNamedElement, final String pName) {
    return rawGetOneArbitraryMatch(new Object[]{pNamedElement, pName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pNamedElement the fixed value of pattern parameter NamedElement, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final NamedElement pNamedElement, final String pName) {
    return rawHasMatch(new Object[]{pNamedElement, pName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pNamedElement the fixed value of pattern parameter NamedElement, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final NamedElement pNamedElement, final String pName) {
    return rawCountMatches(new Object[]{pNamedElement, pName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pNamedElement the fixed value of pattern parameter NamedElement, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final NamedElement pNamedElement, final String pName, final IMatchProcessor<? super DuplicateNameMatch> processor) {
    rawForEachMatch(new Object[]{pNamedElement, pName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pNamedElement the fixed value of pattern parameter NamedElement, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final NamedElement pNamedElement, final String pName, final IMatchProcessor<? super DuplicateNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pNamedElement, pName}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pNamedElement the fixed value of pattern parameter NamedElement, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public DuplicateNameMatch newMatch(final NamedElement pNamedElement, final String pName) {
    return DuplicateNameMatch.newMatch(pNamedElement, pName);
  }
  
  /**
   * Retrieve the set of values that occur in matches for NamedElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<NamedElement> rawAccumulateAllValuesOfNamedElement(final Object[] parameters) {
    Set<NamedElement> results = new HashSet<NamedElement>();
    rawAccumulateAllValues(POSITION_NAMEDELEMENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for NamedElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<NamedElement> getAllValuesOfNamedElement() {
    return rawAccumulateAllValuesOfNamedElement(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for NamedElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<NamedElement> getAllValuesOfNamedElement(final DuplicateNameMatch partialMatch) {
    return rawAccumulateAllValuesOfNamedElement(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for NamedElement.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<NamedElement> getAllValuesOfNamedElement(final String pName) {
    return rawAccumulateAllValuesOfNamedElement(new Object[]{
    null, 
    pName
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfName() {
    return rawAccumulateAllValuesOfName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfName(final DuplicateNameMatch partialMatch) {
    return rawAccumulateAllValuesOfName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfName(final NamedElement pNamedElement) {
    return rawAccumulateAllValuesOfName(new Object[]{
    pNamedElement, 
    null
    });
  }
  
  @Override
  protected DuplicateNameMatch tupleToMatch(final Tuple t) {
    try {
    	return DuplicateNameMatch.newMatch((NamedElement) t.get(POSITION_NAMEDELEMENT), (String) t.get(POSITION_NAME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DuplicateNameMatch arrayToMatch(final Object[] match) {
    try {
    	return DuplicateNameMatch.newMatch((NamedElement) match[POSITION_NAMEDELEMENT], (String) match[POSITION_NAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected DuplicateNameMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return DuplicateNameMatch.newMutableMatch((NamedElement) match[POSITION_NAMEDELEMENT], (String) match[POSITION_NAME]);
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
  public static IQuerySpecification<DuplicateNameMatcher> querySpecification() throws IncQueryException {
    return DuplicateNameQuerySpecification.instance();
  }
}
