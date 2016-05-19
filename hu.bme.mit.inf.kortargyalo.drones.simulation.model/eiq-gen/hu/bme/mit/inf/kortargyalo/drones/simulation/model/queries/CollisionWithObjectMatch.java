package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.CollisionWithObjectQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.collisionWithObject pattern,
 * to be used in conjunction with {@link CollisionWithObjectMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CollisionWithObjectMatcher
 * @see CollisionWithObjectProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CollisionWithObjectMatch extends BasePatternMatch {
  private DroneInstance fDrone;
  
  private Obstacle fObject;
  
  private static List<String> parameterNames = makeImmutableList("drone", "object");
  
  private CollisionWithObjectMatch(final DroneInstance pDrone, final Obstacle pObject) {
    this.fDrone = pDrone;
    this.fObject = pObject;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("drone".equals(parameterName)) return this.fDrone;
    if ("object".equals(parameterName)) return this.fObject;
    return null;
  }
  
  public DroneInstance getDrone() {
    return this.fDrone;
  }
  
  public Obstacle getObject() {
    return this.fObject;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("drone".equals(parameterName) ) {
    	this.fDrone = (DroneInstance) newValue;
    	return true;
    }
    if ("object".equals(parameterName) ) {
    	this.fObject = (Obstacle) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDrone(final DroneInstance pDrone) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDrone = pDrone;
  }
  
  public void setObject(final Obstacle pObject) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fObject = pObject;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.collisionWithObject";
  }
  
  @Override
  public List<String> parameterNames() {
    return CollisionWithObjectMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDrone, fObject};
  }
  
  @Override
  public CollisionWithObjectMatch toImmutable() {
    return isMutable() ? newMatch(fDrone, fObject) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"drone\"=" + prettyPrintValue(fDrone) + ", ");
    
    result.append("\"object\"=" + prettyPrintValue(fObject)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDrone == null) ? 0 : fDrone.hashCode());
    result = prime * result + ((fObject == null) ? 0 : fObject.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CollisionWithObjectMatch)) { // this should be infrequent
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
    CollisionWithObjectMatch other = (CollisionWithObjectMatch) obj;
    if (fDrone == null) {if (other.fDrone != null) return false;}
    else if (!fDrone.equals(other.fDrone)) return false;
    if (fObject == null) {if (other.fObject != null) return false;}
    else if (!fObject.equals(other.fObject)) return false;
    return true;
  }
  
  @Override
  public CollisionWithObjectQuerySpecification specification() {
    try {
    	return CollisionWithObjectQuerySpecification.instance();
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
  public static CollisionWithObjectMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CollisionWithObjectMatch newMutableMatch(final DroneInstance pDrone, final Obstacle pObject) {
    return new Mutable(pDrone, pObject);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pObject the fixed value of pattern parameter object, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CollisionWithObjectMatch newMatch(final DroneInstance pDrone, final Obstacle pObject) {
    return new Immutable(pDrone, pObject);
  }
  
  private static final class Mutable extends CollisionWithObjectMatch {
    Mutable(final DroneInstance pDrone, final Obstacle pObject) {
      super(pDrone, pObject);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CollisionWithObjectMatch {
    Immutable(final DroneInstance pDrone, final Obstacle pObject) {
      super(pDrone, pObject);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
