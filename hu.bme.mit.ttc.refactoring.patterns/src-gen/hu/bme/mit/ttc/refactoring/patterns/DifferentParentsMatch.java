package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.util.DifferentParentsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.differentParents pattern,
 * to be used in conjunction with {@link DifferentParentsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see DifferentParentsMatcher
 * @see DifferentParentsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class DifferentParentsMatch extends BasePatternMatch {
  private TClass fClassOne;
  
  private TClass fClassTwo;
  
  private static List<String> parameterNames = makeImmutableList("classOne", "classTwo");
  
  private DifferentParentsMatch(final TClass pClassOne, final TClass pClassTwo) {
    this.fClassOne = pClassOne;
    this.fClassTwo = pClassTwo;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("classOne".equals(parameterName)) return this.fClassOne;
    if ("classTwo".equals(parameterName)) return this.fClassTwo;
    return null;
  }
  
  public TClass getClassOne() {
    return this.fClassOne;
  }
  
  public TClass getClassTwo() {
    return this.fClassTwo;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("classOne".equals(parameterName) ) {
    	this.fClassOne = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    if ("classTwo".equals(parameterName) ) {
    	this.fClassTwo = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    return false;
  }
  
  public void setClassOne(final TClass pClassOne) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fClassOne = pClassOne;
  }
  
  public void setClassTwo(final TClass pClassTwo) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fClassTwo = pClassTwo;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.differentParents";
  }
  
  @Override
  public List<String> parameterNames() {
    return DifferentParentsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fClassOne, fClassTwo};
  }
  
  @Override
  public DifferentParentsMatch toImmutable() {
    return isMutable() ? newMatch(fClassOne, fClassTwo) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"classOne\"=" + prettyPrintValue(fClassOne) + ", ");
    
    result.append("\"classTwo\"=" + prettyPrintValue(fClassTwo)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fClassOne == null) ? 0 : fClassOne.hashCode());
    result = prime * result + ((fClassTwo == null) ? 0 : fClassTwo.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof DifferentParentsMatch)) { // this should be infrequent
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
    DifferentParentsMatch other = (DifferentParentsMatch) obj;
    if (fClassOne == null) {if (other.fClassOne != null) return false;}
    else if (!fClassOne.equals(other.fClassOne)) return false;
    if (fClassTwo == null) {if (other.fClassTwo != null) return false;}
    else if (!fClassTwo.equals(other.fClassTwo)) return false;
    return true;
  }
  
  @Override
  public DifferentParentsQuerySpecification specification() {
    try {
    	return DifferentParentsQuerySpecification.instance();
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
  public static DifferentParentsMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static DifferentParentsMatch newMutableMatch(final TClass pClassOne, final TClass pClassTwo) {
    return new Mutable(pClassOne, pClassTwo);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static DifferentParentsMatch newMatch(final TClass pClassOne, final TClass pClassTwo) {
    return new Immutable(pClassOne, pClassTwo);
  }
  
  private static final class Mutable extends DifferentParentsMatch {
    Mutable(final TClass pClassOne, final TClass pClassTwo) {
      super(pClassOne, pClassTwo);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends DifferentParentsMatch {
    Immutable(final TClass pClassOne, final TClass pClassTwo) {
      super(pClassOne, pClassTwo);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
