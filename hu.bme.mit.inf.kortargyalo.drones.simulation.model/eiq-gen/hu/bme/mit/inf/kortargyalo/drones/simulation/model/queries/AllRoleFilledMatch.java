package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.AllRoleFilledQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.allRoleFilled pattern,
 * to be used in conjunction with {@link AllRoleFilledMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see AllRoleFilledMatcher
 * @see AllRoleFilledProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class AllRoleFilledMatch extends BasePatternMatch {
  private TaskInstance fT;
  
  private static List<String> parameterNames = makeImmutableList("t");
  
  private AllRoleFilledMatch(final TaskInstance pT) {
    this.fT = pT;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("t".equals(parameterName)) return this.fT;
    return null;
  }
  
  public TaskInstance getT() {
    return this.fT;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("t".equals(parameterName) ) {
    	this.fT = (hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance) newValue;
    	return true;
    }
    return false;
  }
  
  public void setT(final TaskInstance pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.allRoleFilled";
  }
  
  @Override
  public List<String> parameterNames() {
    return AllRoleFilledMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT};
  }
  
  @Override
  public AllRoleFilledMatch toImmutable() {
    return isMutable() ? newMatch(fT) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"t\"=" + prettyPrintValue(fT)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof AllRoleFilledMatch)) { // this should be infrequent
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
    AllRoleFilledMatch other = (AllRoleFilledMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    return true;
  }
  
  @Override
  public AllRoleFilledQuerySpecification specification() {
    try {
    	return AllRoleFilledQuerySpecification.instance();
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
  public static AllRoleFilledMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static AllRoleFilledMatch newMutableMatch(final TaskInstance pT) {
    return new Mutable(pT);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static AllRoleFilledMatch newMatch(final TaskInstance pT) {
    return new Immutable(pT);
  }
  
  private static final class Mutable extends AllRoleFilledMatch {
    Mutable(final TaskInstance pT) {
      super(pT);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends AllRoleFilledMatch {
    Immutable(final TaskInstance pT) {
      super(pT);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
