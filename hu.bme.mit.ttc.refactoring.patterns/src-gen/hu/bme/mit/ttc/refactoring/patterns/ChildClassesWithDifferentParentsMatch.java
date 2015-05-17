package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphTrace.ClassListTrace;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesWithDifferentParentsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.childClassesWithDifferentParents pattern,
 * to be used in conjunction with {@link ChildClassesWithDifferentParentsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ChildClassesWithDifferentParentsMatcher
 * @see ChildClassesWithDifferentParentsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ChildClassesWithDifferentParentsMatch extends BasePatternMatch {
  private ClassListTrace fClassListTrace;
  
  private TClass fClassOne;
  
  private TClass fClassTwo;
  
  private static List<String> parameterNames = makeImmutableList("classListTrace", "classOne", "classTwo");
  
  private ChildClassesWithDifferentParentsMatch(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo) {
    this.fClassListTrace = pClassListTrace;
    this.fClassOne = pClassOne;
    this.fClassTwo = pClassTwo;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("classListTrace".equals(parameterName)) return this.fClassListTrace;
    if ("classOne".equals(parameterName)) return this.fClassOne;
    if ("classTwo".equals(parameterName)) return this.fClassTwo;
    return null;
  }
  
  public ClassListTrace getClassListTrace() {
    return this.fClassListTrace;
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
    if ("classListTrace".equals(parameterName) ) {
    	this.fClassListTrace = (TypeGraphTrace.ClassListTrace) newValue;
    	return true;
    }
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
  
  public void setClassListTrace(final ClassListTrace pClassListTrace) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fClassListTrace = pClassListTrace;
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
    return "hu.bme.mit.ttc.refactoring.patterns.childClassesWithDifferentParents";
  }
  
  @Override
  public List<String> parameterNames() {
    return ChildClassesWithDifferentParentsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fClassListTrace, fClassOne, fClassTwo};
  }
  
  @Override
  public ChildClassesWithDifferentParentsMatch toImmutable() {
    return isMutable() ? newMatch(fClassListTrace, fClassOne, fClassTwo) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"classListTrace\"=" + prettyPrintValue(fClassListTrace) + ", ");
    
    result.append("\"classOne\"=" + prettyPrintValue(fClassOne) + ", ");
    
    result.append("\"classTwo\"=" + prettyPrintValue(fClassTwo)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fClassListTrace == null) ? 0 : fClassListTrace.hashCode());
    result = prime * result + ((fClassOne == null) ? 0 : fClassOne.hashCode());
    result = prime * result + ((fClassTwo == null) ? 0 : fClassTwo.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ChildClassesWithDifferentParentsMatch)) { // this should be infrequent
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
    ChildClassesWithDifferentParentsMatch other = (ChildClassesWithDifferentParentsMatch) obj;
    if (fClassListTrace == null) {if (other.fClassListTrace != null) return false;}
    else if (!fClassListTrace.equals(other.fClassListTrace)) return false;
    if (fClassOne == null) {if (other.fClassOne != null) return false;}
    else if (!fClassOne.equals(other.fClassOne)) return false;
    if (fClassTwo == null) {if (other.fClassTwo != null) return false;}
    else if (!fClassTwo.equals(other.fClassTwo)) return false;
    return true;
  }
  
  @Override
  public ChildClassesWithDifferentParentsQuerySpecification specification() {
    try {
    	return ChildClassesWithDifferentParentsQuerySpecification.instance();
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
  public static ChildClassesWithDifferentParentsMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pClassListTrace the fixed value of pattern parameter classListTrace, or null if not bound.
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ChildClassesWithDifferentParentsMatch newMutableMatch(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo) {
    return new Mutable(pClassListTrace, pClassOne, pClassTwo);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pClassListTrace the fixed value of pattern parameter classListTrace, or null if not bound.
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ChildClassesWithDifferentParentsMatch newMatch(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo) {
    return new Immutable(pClassListTrace, pClassOne, pClassTwo);
  }
  
  private static final class Mutable extends ChildClassesWithDifferentParentsMatch {
    Mutable(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo) {
      super(pClassListTrace, pClassOne, pClassTwo);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ChildClassesWithDifferentParentsMatch {
    Immutable(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo) {
      super(pClassListTrace, pClassOne, pClassTwo);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
