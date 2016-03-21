package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.ScanningCapabilityQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.scanningCapability pattern,
 * to be used in conjunction with {@link ScanningCapabilityMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ScanningCapabilityMatcher
 * @see ScanningCapabilityProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ScanningCapabilityMatch extends BasePatternMatch {
  private DroneType fThis;
  
  private ProvidedCapability fTarget;
  
  private static List<String> parameterNames = makeImmutableList("This", "Target");
  
  private ScanningCapabilityMatch(final DroneType pThis, final ProvidedCapability pTarget) {
    this.fThis = pThis;
    this.fTarget = pTarget;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("This".equals(parameterName)) return this.fThis;
    if ("Target".equals(parameterName)) return this.fTarget;
    return null;
  }
  
  public DroneType getThis() {
    return this.fThis;
  }
  
  public ProvidedCapability getTarget() {
    return this.fTarget;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("This".equals(parameterName) ) {
    	this.fThis = (DroneType) newValue;
    	return true;
    }
    if ("Target".equals(parameterName) ) {
    	this.fTarget = (ProvidedCapability) newValue;
    	return true;
    }
    return false;
  }
  
  public void setThis(final DroneType pThis) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fThis = pThis;
  }
  
  public void setTarget(final ProvidedCapability pTarget) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTarget = pTarget;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.scanningCapability";
  }
  
  @Override
  public List<String> parameterNames() {
    return ScanningCapabilityMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fThis, fTarget};
  }
  
  @Override
  public ScanningCapabilityMatch toImmutable() {
    return isMutable() ? newMatch(fThis, fTarget) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"This\"=" + prettyPrintValue(fThis) + ", ");
    
    result.append("\"Target\"=" + prettyPrintValue(fTarget)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fThis == null) ? 0 : fThis.hashCode());
    result = prime * result + ((fTarget == null) ? 0 : fTarget.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ScanningCapabilityMatch)) { // this should be infrequent
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
    ScanningCapabilityMatch other = (ScanningCapabilityMatch) obj;
    if (fThis == null) {if (other.fThis != null) return false;}
    else if (!fThis.equals(other.fThis)) return false;
    if (fTarget == null) {if (other.fTarget != null) return false;}
    else if (!fTarget.equals(other.fTarget)) return false;
    return true;
  }
  
  @Override
  public ScanningCapabilityQuerySpecification specification() {
    try {
    	return ScanningCapabilityQuerySpecification.instance();
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
  public static ScanningCapabilityMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pThis the fixed value of pattern parameter This, or null if not bound.
   * @param pTarget the fixed value of pattern parameter Target, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ScanningCapabilityMatch newMutableMatch(final DroneType pThis, final ProvidedCapability pTarget) {
    return new Mutable(pThis, pTarget);
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
  public static ScanningCapabilityMatch newMatch(final DroneType pThis, final ProvidedCapability pTarget) {
    return new Immutable(pThis, pTarget);
  }
  
  private static final class Mutable extends ScanningCapabilityMatch {
    Mutable(final DroneType pThis, final ProvidedCapability pTarget) {
      super(pThis, pTarget);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ScanningCapabilityMatch {
    Immutable(final DroneType pThis, final ProvidedCapability pTarget) {
      super(pThis, pTarget);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
