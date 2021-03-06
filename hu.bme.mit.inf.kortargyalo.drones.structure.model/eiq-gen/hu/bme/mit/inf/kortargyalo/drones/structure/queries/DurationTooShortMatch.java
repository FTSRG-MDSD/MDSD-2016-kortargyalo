package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.DurationTooShortQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.durationTooShort pattern,
 * to be used in conjunction with {@link DurationTooShortMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DurationTooShortMatcher
 * @see DurationTooShortProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DurationTooShortMatch extends BasePatternMatch {
  private CooperativeAction fAction;
  
  private static List<String> parameterNames = makeImmutableList("Action");
  
  private DurationTooShortMatch(final CooperativeAction pAction) {
    this.fAction = pAction;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Action".equals(parameterName)) return this.fAction;
    return null;
  }
  
  public CooperativeAction getAction() {
    return this.fAction;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Action".equals(parameterName) ) {
    	this.fAction = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction) newValue;
    	return true;
    }
    return false;
  }
  
  public void setAction(final CooperativeAction pAction) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAction = pAction;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.durationTooShort";
  }
  
  @Override
  public List<String> parameterNames() {
    return DurationTooShortMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fAction};
  }
  
  @Override
  public DurationTooShortMatch toImmutable() {
    return isMutable() ? newMatch(fAction) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Action\"=" + prettyPrintValue(fAction)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fAction == null) ? 0 : fAction.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DurationTooShortMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    DurationTooShortMatch other = (DurationTooShortMatch) obj;
    if (fAction == null) {if (other.fAction != null) return false;}
    else if (!fAction.equals(other.fAction)) return false;
    return true;
  }
  
  @Override
  public DurationTooShortQuerySpecification specification() {
    try {
    	return DurationTooShortQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static DurationTooShortMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pAction the fixed value of pattern parameter Action, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DurationTooShortMatch newMutableMatch(final CooperativeAction pAction) {
    return new Mutable(pAction);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pAction the fixed value of pattern parameter Action, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DurationTooShortMatch newMatch(final CooperativeAction pAction) {
    return new Immutable(pAction);
  }
  
  private static final class Mutable extends DurationTooShortMatch {
    Mutable(final CooperativeAction pAction) {
      super(pAction);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DurationTooShortMatch {
    Immutable(final CooperativeAction pAction) {
      super(pAction);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
