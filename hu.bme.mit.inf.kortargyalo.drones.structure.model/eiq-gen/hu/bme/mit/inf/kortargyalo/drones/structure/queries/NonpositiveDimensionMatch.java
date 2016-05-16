package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveDimensionQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveDimension pattern,
 * to be used in conjunction with {@link NonpositiveDimensionMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NonpositiveDimensionMatcher
 * @see NonpositiveDimensionProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NonpositiveDimensionMatch extends BasePatternMatch {
  private Dimension fDimension;
  
  private static List<String> parameterNames = makeImmutableList("Dimension");
  
  private NonpositiveDimensionMatch(final Dimension pDimension) {
    this.fDimension = pDimension;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("Dimension".equals(parameterName)) return this.fDimension;
    return null;
  }
  
  public Dimension getDimension() {
    return this.fDimension;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("Dimension".equals(parameterName) ) {
    	this.fDimension = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension) newValue;
    	return true;
    }
    return false;
  }
  
  public void setDimension(final Dimension pDimension) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDimension = pDimension;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveDimension";
  }
  
  @Override
  public List<String> parameterNames() {
    return NonpositiveDimensionMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fDimension};
  }
  
  @Override
  public NonpositiveDimensionMatch toImmutable() {
    return isMutable() ? newMatch(fDimension) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"Dimension\"=" + prettyPrintValue(fDimension)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fDimension == null) ? 0 : fDimension.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NonpositiveDimensionMatch)) { // this should be infrequent
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
    NonpositiveDimensionMatch other = (NonpositiveDimensionMatch) obj;
    if (fDimension == null) {if (other.fDimension != null) return false;}
    else if (!fDimension.equals(other.fDimension)) return false;
    return true;
  }
  
  @Override
  public NonpositiveDimensionQuerySpecification specification() {
    try {
    	return NonpositiveDimensionQuerySpecification.instance();
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
  public static NonpositiveDimensionMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pDimension the fixed value of pattern parameter Dimension, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NonpositiveDimensionMatch newMutableMatch(final Dimension pDimension) {
    return new Mutable(pDimension);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDimension the fixed value of pattern parameter Dimension, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static NonpositiveDimensionMatch newMatch(final Dimension pDimension) {
    return new Immutable(pDimension);
  }
  
  private static final class Mutable extends NonpositiveDimensionMatch {
    Mutable(final Dimension pDimension) {
      super(pDimension);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NonpositiveDimensionMatch {
    Immutable(final Dimension pDimension) {
      super(pDimension);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
