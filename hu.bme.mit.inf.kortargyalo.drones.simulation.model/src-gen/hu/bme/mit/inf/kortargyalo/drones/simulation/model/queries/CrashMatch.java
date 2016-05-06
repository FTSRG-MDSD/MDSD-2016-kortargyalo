package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.CrashQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.crash pattern,
 * to be used in conjunction with {@link CrashMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CrashMatcher
 * @see CrashProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CrashMatch extends BasePatternMatch {
  private DroneInstance fDrone1;
  
  private DroneInstance fDrone2;
  
  private static List<String> parameterNames = makeImmutableList("drone1", "drone2");
  
  private CrashMatch(final DroneInstance pDrone1, final DroneInstance pDrone2) {
    this.fDrone1 = pDrone1;
    this.fDrone2 = pDrone2;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("drone1".equals(parameterName)) return this.fDrone1;
    if ("drone2".equals(parameterName)) return this.fDrone2;
    return null;
  }
  
  public DroneInstance getDrone1() {
    return this.fDrone1;
  }
  
  public DroneInstance getDrone2() {
    return this.fDrone2;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("drone1".equals(parameterName) ) {
    	this.fDrone1 = (DroneInstance) newValue;
    	return true;
    }
    if ("drone2".equals(parameterName) ) {
    	this.fDrone2 = (DroneInstance) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDrone1(final DroneInstance pDrone1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDrone1 = pDrone1;
  }
  
  public void setDrone2(final DroneInstance pDrone2) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDrone2 = pDrone2;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.crash";
  }
  
  @Override
  public List<String> parameterNames() {
    return CrashMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDrone1, fDrone2};
  }
  
  @Override
  public CrashMatch toImmutable() {
    return isMutable() ? newMatch(fDrone1, fDrone2) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"drone1\"=" + prettyPrintValue(fDrone1) + ", ");
    
    result.append("\"drone2\"=" + prettyPrintValue(fDrone2)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDrone1 == null) ? 0 : fDrone1.hashCode());
    result = prime * result + ((fDrone2 == null) ? 0 : fDrone2.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CrashMatch)) { // this should be infrequent
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
    CrashMatch other = (CrashMatch) obj;
    if (fDrone1 == null) {if (other.fDrone1 != null) return false;}
    else if (!fDrone1.equals(other.fDrone1)) return false;
    if (fDrone2 == null) {if (other.fDrone2 != null) return false;}
    else if (!fDrone2.equals(other.fDrone2)) return false;
    return true;
  }
  
  @Override
  public CrashQuerySpecification specification() {
    try {
    	return CrashQuerySpecification.instance();
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
  public static CrashMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDrone1 the fixed value of pattern parameter drone1, or null if not bound.
   * @param pDrone2 the fixed value of pattern parameter drone2, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CrashMatch newMutableMatch(final DroneInstance pDrone1, final DroneInstance pDrone2) {
    return new Mutable(pDrone1, pDrone2);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrone1 the fixed value of pattern parameter drone1, or null if not bound.
   * @param pDrone2 the fixed value of pattern parameter drone2, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CrashMatch newMatch(final DroneInstance pDrone1, final DroneInstance pDrone2) {
    return new Immutable(pDrone1, pDrone2);
  }
  
  private static final class Mutable extends CrashMatch {
    Mutable(final DroneInstance pDrone1, final DroneInstance pDrone2) {
      super(pDrone1, pDrone2);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CrashMatch {
    Immutable(final DroneInstance pDrone1, final DroneInstance pDrone2) {
      super(pDrone1, pDrone2);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
