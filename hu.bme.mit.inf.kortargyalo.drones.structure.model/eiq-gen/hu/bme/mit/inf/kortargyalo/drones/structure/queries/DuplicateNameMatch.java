package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.DuplicateNameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.inf.kortargyalo.drones.structure.queries.duplicateName pattern,
 * to be used in conjunction with {@link DuplicateNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DuplicateNameMatcher
 * @see DuplicateNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DuplicateNameMatch extends BasePatternMatch {
  private NamedElement fNamedElement;
  
  private String fName;
  
  private static List<String> parameterNames = makeImmutableList("NamedElement", "Name");
  
  private DuplicateNameMatch(final NamedElement pNamedElement, final String pName) {
    this.fNamedElement = pNamedElement;
    this.fName = pName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("NamedElement".equals(parameterName)) return this.fNamedElement;
    if ("Name".equals(parameterName)) return this.fName;
    return null;
  }
  
  public NamedElement getNamedElement() {
    return this.fNamedElement;
  }
  
  public String getName() {
    return this.fName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("NamedElement".equals(parameterName) ) {
    	this.fNamedElement = (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement) newValue;
    	return true;
    }
    if ("Name".equals(parameterName) ) {
    	this.fName = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setNamedElement(final NamedElement pNamedElement) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fNamedElement = pNamedElement;
  }
  
  public void setName(final String pName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fName = pName;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.duplicateName";
  }
  
  @Override
  public List<String> parameterNames() {
    return DuplicateNameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fNamedElement, fName};
  }
  
  @Override
  public DuplicateNameMatch toImmutable() {
    return isMutable() ? newMatch(fNamedElement, fName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"NamedElement\"=" + prettyPrintValue(fNamedElement) + ", ");
    
    result.append("\"Name\"=" + prettyPrintValue(fName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fNamedElement == null) ? 0 : fNamedElement.hashCode());
    result = prime * result + ((fName == null) ? 0 : fName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DuplicateNameMatch)) { // this should be infrequent
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
    DuplicateNameMatch other = (DuplicateNameMatch) obj;
    if (fNamedElement == null) {if (other.fNamedElement != null) return false;}
    else if (!fNamedElement.equals(other.fNamedElement)) return false;
    if (fName == null) {if (other.fName != null) return false;}
    else if (!fName.equals(other.fName)) return false;
    return true;
  }
  
  @Override
  public DuplicateNameQuerySpecification specification() {
    try {
    	return DuplicateNameQuerySpecification.instance();
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
  public static DuplicateNameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pNamedElement the fixed value of pattern parameter NamedElement, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DuplicateNameMatch newMutableMatch(final NamedElement pNamedElement, final String pName) {
    return new Mutable(pNamedElement, pName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pNamedElement the fixed value of pattern parameter NamedElement, or null if not bound.
   * @param pName the fixed value of pattern parameter Name, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DuplicateNameMatch newMatch(final NamedElement pNamedElement, final String pName) {
    return new Immutable(pNamedElement, pName);
  }
  
  private static final class Mutable extends DuplicateNameMatch {
    Mutable(final NamedElement pNamedElement, final String pName) {
      super(pNamedElement, pName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DuplicateNameMatch {
    Immutable(final NamedElement pNamedElement, final String pName) {
      super(pNamedElement, pName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
