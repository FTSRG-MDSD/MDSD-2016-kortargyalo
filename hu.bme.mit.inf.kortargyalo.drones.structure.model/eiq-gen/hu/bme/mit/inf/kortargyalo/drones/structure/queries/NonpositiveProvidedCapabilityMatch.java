package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveProvidedCapabilityQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveProvidedCapability pattern,
 * to be used in conjunction with {@link NonpositiveProvidedCapabilityMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NonpositiveProvidedCapabilityMatcher
 * @see NonpositiveProvidedCapabilityProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NonpositiveProvidedCapabilityMatch extends BasePatternMatch {
  private ProvidedCapability fProvidedCapability;
  
  private Capability fCapability;
  
  private DroneType fDroneType;
  
  private static List<String> parameterNames = makeImmutableList("ProvidedCapability", "Capability", "DroneType");
  
  private NonpositiveProvidedCapabilityMatch(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType) {
    this.fProvidedCapability = pProvidedCapability;
    this.fCapability = pCapability;
    this.fDroneType = pDroneType;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("ProvidedCapability".equals(parameterName)) return this.fProvidedCapability;
    if ("Capability".equals(parameterName)) return this.fCapability;
    if ("DroneType".equals(parameterName)) return this.fDroneType;
    return null;
  }
  
  public ProvidedCapability getProvidedCapability() {
    return this.fProvidedCapability;
  }
  
  public Capability getCapability() {
    return this.fCapability;
  }
  
  public DroneType getDroneType() {
    return this.fDroneType;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("ProvidedCapability".equals(parameterName) ) {
    	this.fProvidedCapability = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability) newValue;
    	return true;
    }
    if ("Capability".equals(parameterName) ) {
    	this.fCapability = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability) newValue;
    	return true;
    }
    if ("DroneType".equals(parameterName) ) {
    	this.fDroneType = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) newValue;
    	return true;
    }
    return false;
  }
  
  public void setProvidedCapability(final ProvidedCapability pProvidedCapability) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fProvidedCapability = pProvidedCapability;
  }
  
  public void setCapability(final Capability pCapability) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCapability = pCapability;
  }
  
  public void setDroneType(final DroneType pDroneType) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDroneType = pDroneType;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveProvidedCapability";
  }
  
  @Override
  public List<String> parameterNames() {
    return NonpositiveProvidedCapabilityMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fProvidedCapability, fCapability, fDroneType};
  }
  
  @Override
  public NonpositiveProvidedCapabilityMatch toImmutable() {
    return isMutable() ? newMatch(fProvidedCapability, fCapability, fDroneType) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"ProvidedCapability\"=" + prettyPrintValue(fProvidedCapability) + ", ");
    
    result.append("\"Capability\"=" + prettyPrintValue(fCapability) + ", ");
    
    result.append("\"DroneType\"=" + prettyPrintValue(fDroneType)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fProvidedCapability == null) ? 0 : fProvidedCapability.hashCode());
    result = prime * result + ((fCapability == null) ? 0 : fCapability.hashCode());
    result = prime * result + ((fDroneType == null) ? 0 : fDroneType.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NonpositiveProvidedCapabilityMatch)) { // this should be infrequent
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
    NonpositiveProvidedCapabilityMatch other = (NonpositiveProvidedCapabilityMatch) obj;
    if (fProvidedCapability == null) {if (other.fProvidedCapability != null) return false;}
    else if (!fProvidedCapability.equals(other.fProvidedCapability)) return false;
    if (fCapability == null) {if (other.fCapability != null) return false;}
    else if (!fCapability.equals(other.fCapability)) return false;
    if (fDroneType == null) {if (other.fDroneType != null) return false;}
    else if (!fDroneType.equals(other.fDroneType)) return false;
    return true;
  }
  
  @Override
  public NonpositiveProvidedCapabilityQuerySpecification specification() {
    try {
    	return NonpositiveProvidedCapabilityQuerySpecification.instance();
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
  public static NonpositiveProvidedCapabilityMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pProvidedCapability the fixed value of pattern parameter ProvidedCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pDroneType the fixed value of pattern parameter DroneType, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NonpositiveProvidedCapabilityMatch newMutableMatch(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType) {
    return new Mutable(pProvidedCapability, pCapability, pDroneType);
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
  public static NonpositiveProvidedCapabilityMatch newMatch(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType) {
    return new Immutable(pProvidedCapability, pCapability, pDroneType);
  }
  
  private static final class Mutable extends NonpositiveProvidedCapabilityMatch {
    Mutable(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType) {
      super(pProvidedCapability, pCapability, pDroneType);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NonpositiveProvidedCapabilityMatch {
    Immutable(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType) {
      super(pProvidedCapability, pCapability, pDroneType);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
