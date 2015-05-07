package hu.bme.mit.ttc.refactoring.patterns;

import hu.bme.mit.ttc.refactoring.patterns.util.CsBNamesQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.csBNames pattern,
 * to be used in conjunction with {@link CsBNamesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CsBNamesMatcher
 * @see CsBNamesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CsBNamesMatch extends BasePatternMatch {
  private String fParentName;
  
  private String fChild1Name;
  
  private String fChildNName;
  
  private static List<String> parameterNames = makeImmutableList("parentName", "child1Name", "childNName");
  
  private CsBNamesMatch(final String pParentName, final String pChild1Name, final String pChildNName) {
    this.fParentName = pParentName;
    this.fChild1Name = pChild1Name;
    this.fChildNName = pChildNName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("parentName".equals(parameterName)) return this.fParentName;
    if ("child1Name".equals(parameterName)) return this.fChild1Name;
    if ("childNName".equals(parameterName)) return this.fChildNName;
    return null;
  }
  
  public String getParentName() {
    return this.fParentName;
  }
  
  public String getChild1Name() {
    return this.fChild1Name;
  }
  
  public String getChildNName() {
    return this.fChildNName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("parentName".equals(parameterName) ) {
    	this.fParentName = (java.lang.String) newValue;
    	return true;
    }
    if ("child1Name".equals(parameterName) ) {
    	this.fChild1Name = (java.lang.String) newValue;
    	return true;
    }
    if ("childNName".equals(parameterName) ) {
    	this.fChildNName = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setParentName(final String pParentName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParentName = pParentName;
  }
  
  public void setChild1Name(final String pChild1Name) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChild1Name = pChild1Name;
  }
  
  public void setChildNName(final String pChildNName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChildNName = pChildNName;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.csBNames";
  }
  
  @Override
  public List<String> parameterNames() {
    return CsBNamesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParentName, fChild1Name, fChildNName};
  }
  
  @Override
  public CsBNamesMatch toImmutable() {
    return isMutable() ? newMatch(fParentName, fChild1Name, fChildNName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"parentName\"=" + prettyPrintValue(fParentName) + ", ");
    
    result.append("\"child1Name\"=" + prettyPrintValue(fChild1Name) + ", ");
    
    result.append("\"childNName\"=" + prettyPrintValue(fChildNName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fParentName == null) ? 0 : fParentName.hashCode());
    result = prime * result + ((fChild1Name == null) ? 0 : fChild1Name.hashCode());
    result = prime * result + ((fChildNName == null) ? 0 : fChildNName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CsBNamesMatch)) { // this should be infrequent
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
    CsBNamesMatch other = (CsBNamesMatch) obj;
    if (fParentName == null) {if (other.fParentName != null) return false;}
    else if (!fParentName.equals(other.fParentName)) return false;
    if (fChild1Name == null) {if (other.fChild1Name != null) return false;}
    else if (!fChild1Name.equals(other.fChild1Name)) return false;
    if (fChildNName == null) {if (other.fChildNName != null) return false;}
    else if (!fChildNName.equals(other.fChildNName)) return false;
    return true;
  }
  
  @Override
  public CsBNamesQuerySpecification specification() {
    try {
    	return CsBNamesQuerySpecification.instance();
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
  public static CsBNamesMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParentName the fixed value of pattern parameter parentName, or null if not bound.
   * @param pChild1Name the fixed value of pattern parameter child1Name, or null if not bound.
   * @param pChildNName the fixed value of pattern parameter childNName, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CsBNamesMatch newMutableMatch(final String pParentName, final String pChild1Name, final String pChildNName) {
    return new Mutable(pParentName, pChild1Name, pChildNName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParentName the fixed value of pattern parameter parentName, or null if not bound.
   * @param pChild1Name the fixed value of pattern parameter child1Name, or null if not bound.
   * @param pChildNName the fixed value of pattern parameter childNName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CsBNamesMatch newMatch(final String pParentName, final String pChild1Name, final String pChildNName) {
    return new Immutable(pParentName, pChild1Name, pChildNName);
  }
  
  private static final class Mutable extends CsBNamesMatch {
    Mutable(final String pParentName, final String pChild1Name, final String pChildNName) {
      super(pParentName, pChild1Name, pChildNName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CsBNamesMatch {
    Immutable(final String pParentName, final String pChild1Name, final String pChildNName) {
      super(pParentName, pChild1Name, pChildNName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
