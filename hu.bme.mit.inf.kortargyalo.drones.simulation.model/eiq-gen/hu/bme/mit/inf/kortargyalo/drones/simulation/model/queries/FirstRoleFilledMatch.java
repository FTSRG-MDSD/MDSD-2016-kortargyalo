package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.FirstRoleFilledQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.firstRoleFilled pattern,
 * to be used in conjunction with {@link FirstRoleFilledMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see FirstRoleFilledMatcher
 * @see FirstRoleFilledProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class FirstRoleFilledMatch extends BasePatternMatch {
  private TaskInstance fTask;
  
  private static List<String> parameterNames = makeImmutableList("task");
  
  private FirstRoleFilledMatch(final TaskInstance pTask) {
    this.fTask = pTask;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("task".equals(parameterName)) return this.fTask;
    return null;
  }
  
  public TaskInstance getTask() {
    return this.fTask;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("task".equals(parameterName) ) {
    	this.fTask = (hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTask(final TaskInstance pTask) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTask = pTask;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.firstRoleFilled";
  }
  
  @Override
  public List<String> parameterNames() {
    return FirstRoleFilledMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTask};
  }
  
  @Override
  public FirstRoleFilledMatch toImmutable() {
    return isMutable() ? newMatch(fTask) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"task\"=" + prettyPrintValue(fTask)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTask == null) ? 0 : fTask.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof FirstRoleFilledMatch)) { // this should be infrequent
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
    FirstRoleFilledMatch other = (FirstRoleFilledMatch) obj;
    if (fTask == null) {if (other.fTask != null) return false;}
    else if (!fTask.equals(other.fTask)) return false;
    return true;
  }
  
  @Override
  public FirstRoleFilledQuerySpecification specification() {
    try {
    	return FirstRoleFilledQuerySpecification.instance();
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
  public static FirstRoleFilledMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static FirstRoleFilledMatch newMutableMatch(final TaskInstance pTask) {
    return new Mutable(pTask);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTask the fixed value of pattern parameter task, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static FirstRoleFilledMatch newMatch(final TaskInstance pTask) {
    return new Immutable(pTask);
  }
  
  private static final class Mutable extends FirstRoleFilledMatch {
    Mutable(final TaskInstance pTask) {
      super(pTask);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends FirstRoleFilledMatch {
    Immutable(final TaskInstance pTask) {
      super(pTask);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
