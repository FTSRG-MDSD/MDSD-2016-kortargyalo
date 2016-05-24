package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveRequiredCapabilityQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveRequiredCapability pattern,
 * to be used in conjunction with {@link NonpositiveRequiredCapabilityMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NonpositiveRequiredCapabilityMatcher
 * @see NonpositiveRequiredCapabilityProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NonpositiveRequiredCapabilityMatch extends BasePatternMatch {
  private RequiredCapability fRequiredCapability;
  
  private Capability fCapability;
  
  private CooperativeAction fAction;
  
  private Role fRole;
  
  private static List<String> parameterNames = makeImmutableList("RequiredCapability", "Capability", "Action", "Role");
  
  private NonpositiveRequiredCapabilityMatch(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
    this.fRequiredCapability = pRequiredCapability;
    this.fCapability = pCapability;
    this.fAction = pAction;
    this.fRole = pRole;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("RequiredCapability".equals(parameterName)) return this.fRequiredCapability;
    if ("Capability".equals(parameterName)) return this.fCapability;
    if ("Action".equals(parameterName)) return this.fAction;
    if ("Role".equals(parameterName)) return this.fRole;
    return null;
  }
  
  public RequiredCapability getRequiredCapability() {
    return this.fRequiredCapability;
  }
  
  public Capability getCapability() {
    return this.fCapability;
  }
  
  public CooperativeAction getAction() {
    return this.fAction;
  }
  
  public Role getRole() {
    return this.fRole;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("RequiredCapability".equals(parameterName) ) {
    	this.fRequiredCapability = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability) newValue;
    	return true;
    }
    if ("Capability".equals(parameterName) ) {
    	this.fCapability = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability) newValue;
    	return true;
    }
    if ("Action".equals(parameterName) ) {
    	this.fAction = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction) newValue;
    	return true;
    }
    if ("Role".equals(parameterName) ) {
    	this.fRole = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role) newValue;
    	return true;
    }
    return false;
  }
  
  public void setRequiredCapability(final RequiredCapability pRequiredCapability) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRequiredCapability = pRequiredCapability;
  }
  
  public void setCapability(final Capability pCapability) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCapability = pCapability;
  }
  
  public void setAction(final CooperativeAction pAction) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fAction = pAction;
  }
  
  public void setRole(final Role pRole) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fRole = pRole;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveRequiredCapability";
  }
  
  @Override
  public List<String> parameterNames() {
    return NonpositiveRequiredCapabilityMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fRequiredCapability, fCapability, fAction, fRole};
  }
  
  @Override
  public NonpositiveRequiredCapabilityMatch toImmutable() {
    return isMutable() ? newMatch(fRequiredCapability, fCapability, fAction, fRole) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"RequiredCapability\"=" + prettyPrintValue(fRequiredCapability) + ", ");
    
    result.append("\"Capability\"=" + prettyPrintValue(fCapability) + ", ");
    
    result.append("\"Action\"=" + prettyPrintValue(fAction) + ", ");
    
    result.append("\"Role\"=" + prettyPrintValue(fRole)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fRequiredCapability == null) ? 0 : fRequiredCapability.hashCode());
    result = prime * result + ((fCapability == null) ? 0 : fCapability.hashCode());
    result = prime * result + ((fAction == null) ? 0 : fAction.hashCode());
    result = prime * result + ((fRole == null) ? 0 : fRole.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NonpositiveRequiredCapabilityMatch)) { // this should be infrequent
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
    NonpositiveRequiredCapabilityMatch other = (NonpositiveRequiredCapabilityMatch) obj;
    if (fRequiredCapability == null) {if (other.fRequiredCapability != null) return false;}
    else if (!fRequiredCapability.equals(other.fRequiredCapability)) return false;
    if (fCapability == null) {if (other.fCapability != null) return false;}
    else if (!fCapability.equals(other.fCapability)) return false;
    if (fAction == null) {if (other.fAction != null) return false;}
    else if (!fAction.equals(other.fAction)) return false;
    if (fRole == null) {if (other.fRole != null) return false;}
    else if (!fRole.equals(other.fRole)) return false;
    return true;
  }
  
  @Override
  public NonpositiveRequiredCapabilityQuerySpecification specification() {
    try {
    	return NonpositiveRequiredCapabilityQuerySpecification.instance();
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
  public static NonpositiveRequiredCapabilityMatch newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pRequiredCapability the fixed value of pattern parameter RequiredCapability, or null if not bound.
   * @param pCapability the fixed value of pattern parameter Capability, or null if not bound.
   * @param pAction the fixed value of pattern parameter Action, or null if not bound.
   * @param pRole the fixed value of pattern parameter Role, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NonpositiveRequiredCapabilityMatch newMutableMatch(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
    return new Mutable(pRequiredCapability, pCapability, pAction, pRole);
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
  public static NonpositiveRequiredCapabilityMatch newMatch(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
    return new Immutable(pRequiredCapability, pCapability, pAction, pRole);
  }
  
  private static final class Mutable extends NonpositiveRequiredCapabilityMatch {
    Mutable(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
      super(pRequiredCapability, pCapability, pAction, pRole);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NonpositiveRequiredCapabilityMatch {
    Immutable(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole) {
      super(pRequiredCapability, pCapability, pAction, pRole);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
