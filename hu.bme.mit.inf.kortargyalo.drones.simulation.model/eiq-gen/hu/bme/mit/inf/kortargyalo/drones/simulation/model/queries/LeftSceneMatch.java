package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.LeftSceneQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.leftScene pattern,
 * to be used in conjunction with {@link LeftSceneMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see LeftSceneMatcher
 * @see LeftSceneProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class LeftSceneMatch extends BasePatternMatch {
  private DroneInstance fDrone;
  
  private static List<String> parameterNames = makeImmutableList("drone");
  
  private LeftSceneMatch(final DroneInstance pDrone) {
    this.fDrone = pDrone;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("drone".equals(parameterName)) return this.fDrone;
    return null;
  }
  
  public DroneInstance getDrone() {
    return this.fDrone;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("drone".equals(parameterName) ) {
    	this.fDrone = (hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDrone(final DroneInstance pDrone) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDrone = pDrone;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.leftScene";
  }
  
  @Override
  public List<String> parameterNames() {
    return LeftSceneMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDrone};
  }
  
  @Override
  public LeftSceneMatch toImmutable() {
    return isMutable() ? newMatch(fDrone) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"drone\"=" + prettyPrintValue(fDrone)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDrone == null) ? 0 : fDrone.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof LeftSceneMatch)) { // this should be infrequent
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
    LeftSceneMatch other = (LeftSceneMatch) obj;
    if (fDrone == null) {if (other.fDrone != null) return false;}
    else if (!fDrone.equals(other.fDrone)) return false;
    return true;
  }
  
  @Override
  public LeftSceneQuerySpecification specification() {
    try {
    	return LeftSceneQuerySpecification.instance();
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
  public static LeftSceneMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static LeftSceneMatch newMutableMatch(final DroneInstance pDrone) {
    return new Mutable(pDrone);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static LeftSceneMatch newMatch(final DroneInstance pDrone) {
    return new Immutable(pDrone);
  }
  
  private static final class Mutable extends LeftSceneMatch {
    Mutable(final DroneInstance pDrone) {
      super(pDrone);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends LeftSceneMatch {
    Immutable(final DroneInstance pDrone) {
      super(pDrone);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
