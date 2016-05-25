package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.ReplacedObservationQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.replacedObservation pattern,
 * to be used in conjunction with {@link ReplacedObservationMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ReplacedObservationMatcher
 * @see ReplacedObservationProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ReplacedObservationMatch extends BasePatternMatch {
  private Observation fOld;
  
  private static List<String> parameterNames = makeImmutableList("old");
  
  private ReplacedObservationMatch(final Observation pOld) {
    this.fOld = pOld;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("old".equals(parameterName)) return this.fOld;
    return null;
  }
  
  public Observation getOld() {
    return this.fOld;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("old".equals(parameterName) ) {
    	this.fOld = (hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation) newValue;
    	return true;
    }
    return false;
  }
  
  public void setOld(final Observation pOld) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fOld = pOld;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.replacedObservation";
  }
  
  @Override
  public List<String> parameterNames() {
    return ReplacedObservationMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fOld};
  }
  
  @Override
  public ReplacedObservationMatch toImmutable() {
    return isMutable() ? newMatch(fOld) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"old\"=" + prettyPrintValue(fOld)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fOld == null) ? 0 : fOld.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ReplacedObservationMatch)) { // this should be infrequent
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
    ReplacedObservationMatch other = (ReplacedObservationMatch) obj;
    if (fOld == null) {if (other.fOld != null) return false;}
    else if (!fOld.equals(other.fOld)) return false;
    return true;
  }
  
  @Override
  public ReplacedObservationQuerySpecification specification() {
    try {
    	return ReplacedObservationQuerySpecification.instance();
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
  public static ReplacedObservationMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pOld the fixed value of pattern parameter old, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ReplacedObservationMatch newMutableMatch(final Observation pOld) {
    return new Mutable(pOld);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pOld the fixed value of pattern parameter old, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ReplacedObservationMatch newMatch(final Observation pOld) {
    return new Immutable(pOld);
  }
  
  private static final class Mutable extends ReplacedObservationMatch {
    Mutable(final Observation pOld) {
      super(pOld);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ReplacedObservationMatch {
    Immutable(final Observation pOld) {
      super(pOld);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
