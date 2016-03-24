package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveBatteryCapacityQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveBatteryCapacity pattern,
 * to be used in conjunction with {@link NonpositiveBatteryCapacityMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NonpositiveBatteryCapacityMatcher
 * @see NonpositiveBatteryCapacityProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NonpositiveBatteryCapacityMatch extends BasePatternMatch {
  private DroneType fDroneType;
  
  private static List<String> parameterNames = makeImmutableList("DroneType");
  
  private NonpositiveBatteryCapacityMatch(final DroneType pDroneType) {
    this.fDroneType = pDroneType;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("DroneType".equals(parameterName)) return this.fDroneType;
    return null;
  }
  
  public DroneType getDroneType() {
    return this.fDroneType;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("DroneType".equals(parameterName) ) {
    	this.fDroneType = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDroneType(final DroneType pDroneType) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDroneType = pDroneType;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveBatteryCapacity";
  }
  
  @Override
  public List<String> parameterNames() {
    return NonpositiveBatteryCapacityMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDroneType};
  }
  
  @Override
  public NonpositiveBatteryCapacityMatch toImmutable() {
    return isMutable() ? newMatch(fDroneType) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"DroneType\"=" + prettyPrintValue(fDroneType)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDroneType == null) ? 0 : fDroneType.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NonpositiveBatteryCapacityMatch)) { // this should be infrequent
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
    NonpositiveBatteryCapacityMatch other = (NonpositiveBatteryCapacityMatch) obj;
    if (fDroneType == null) {if (other.fDroneType != null) return false;}
    else if (!fDroneType.equals(other.fDroneType)) return false;
    return true;
  }
  
  @Override
  public NonpositiveBatteryCapacityQuerySpecification specification() {
    try {
    	return NonpositiveBatteryCapacityQuerySpecification.instance();
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
  public static NonpositiveBatteryCapacityMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDroneType the fixed value of pattern parameter DroneType, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NonpositiveBatteryCapacityMatch newMutableMatch(final DroneType pDroneType) {
    return new Mutable(pDroneType);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDroneType the fixed value of pattern parameter DroneType, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static NonpositiveBatteryCapacityMatch newMatch(final DroneType pDroneType) {
    return new Immutable(pDroneType);
  }
  
  private static final class Mutable extends NonpositiveBatteryCapacityMatch {
    Mutable(final DroneType pDroneType) {
      super(pDroneType);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NonpositiveBatteryCapacityMatch {
    Immutable(final DroneType pDroneType) {
      super(pDroneType);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
