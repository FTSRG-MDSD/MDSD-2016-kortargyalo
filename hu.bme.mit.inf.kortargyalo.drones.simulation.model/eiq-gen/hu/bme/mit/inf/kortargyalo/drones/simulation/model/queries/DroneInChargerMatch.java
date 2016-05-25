package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.DroneInChargerQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.droneInCharger pattern,
 * to be used in conjunction with {@link DroneInChargerMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DroneInChargerMatcher
 * @see DroneInChargerProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DroneInChargerMatch extends BasePatternMatch {
  private DroneInstance fDrone;
  
  private Charger fCharger;
  
  private static List<String> parameterNames = makeImmutableList("drone", "charger");
  
  private DroneInChargerMatch(final DroneInstance pDrone, final Charger pCharger) {
    this.fDrone = pDrone;
    this.fCharger = pCharger;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("drone".equals(parameterName)) return this.fDrone;
    if ("charger".equals(parameterName)) return this.fCharger;
    return null;
  }
  
  public DroneInstance getDrone() {
    return this.fDrone;
  }
  
  public Charger getCharger() {
    return this.fCharger;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("drone".equals(parameterName) ) {
    	this.fDrone = (hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) newValue;
    	return true;
    }
    if ("charger".equals(parameterName) ) {
    	this.fCharger = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDrone(final DroneInstance pDrone) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDrone = pDrone;
  }
  
  public void setCharger(final Charger pCharger) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fCharger = pCharger;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.droneInCharger";
  }
  
  @Override
  public List<String> parameterNames() {
    return DroneInChargerMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDrone, fCharger};
  }
  
  @Override
  public DroneInChargerMatch toImmutable() {
    return isMutable() ? newMatch(fDrone, fCharger) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"drone\"=" + prettyPrintValue(fDrone) + ", ");
    
    result.append("\"charger\"=" + prettyPrintValue(fCharger)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDrone == null) ? 0 : fDrone.hashCode());
    result = prime * result + ((fCharger == null) ? 0 : fCharger.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DroneInChargerMatch)) { // this should be infrequent
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
    DroneInChargerMatch other = (DroneInChargerMatch) obj;
    if (fDrone == null) {if (other.fDrone != null) return false;}
    else if (!fDrone.equals(other.fDrone)) return false;
    if (fCharger == null) {if (other.fCharger != null) return false;}
    else if (!fCharger.equals(other.fCharger)) return false;
    return true;
  }
  
  @Override
  public DroneInChargerQuerySpecification specification() {
    try {
    	return DroneInChargerQuerySpecification.instance();
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
  public static DroneInChargerMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pCharger the fixed value of pattern parameter charger, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DroneInChargerMatch newMutableMatch(final DroneInstance pDrone, final Charger pCharger) {
    return new Mutable(pDrone, pCharger);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param pCharger the fixed value of pattern parameter charger, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DroneInChargerMatch newMatch(final DroneInstance pDrone, final Charger pCharger) {
    return new Immutable(pDrone, pCharger);
  }
  
  private static final class Mutable extends DroneInChargerMatch {
    Mutable(final DroneInstance pDrone, final Charger pCharger) {
      super(pDrone, pCharger);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DroneInChargerMatch {
    Immutable(final DroneInstance pDrone, final Charger pCharger) {
      super(pDrone, pCharger);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
