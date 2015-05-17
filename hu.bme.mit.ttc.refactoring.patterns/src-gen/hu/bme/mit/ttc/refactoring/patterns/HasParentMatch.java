package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.util.HasParentQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.hasParent pattern,
 * to be used in conjunction with {@link HasParentMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see HasParentMatcher
 * @see HasParentProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class HasParentMatch extends BasePatternMatch {
  private TClass fTClass;
  
  private static List<String> parameterNames = makeImmutableList("tClass");
  
  private HasParentMatch(final TClass pTClass) {
    this.fTClass = pTClass;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("tClass".equals(parameterName)) return this.fTClass;
    return null;
  }
  
  public TClass getTClass() {
    return this.fTClass;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("tClass".equals(parameterName) ) {
    	this.fTClass = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTClass(final TClass pTClass) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTClass = pTClass;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.hasParent";
  }
  
  @Override
  public List<String> parameterNames() {
    return HasParentMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTClass};
  }
  
  @Override
  public HasParentMatch toImmutable() {
    return isMutable() ? newMatch(fTClass) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"tClass\"=" + prettyPrintValue(fTClass)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTClass == null) ? 0 : fTClass.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof HasParentMatch)) { // this should be infrequent
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
    HasParentMatch other = (HasParentMatch) obj;
    if (fTClass == null) {if (other.fTClass != null) return false;}
    else if (!fTClass.equals(other.fTClass)) return false;
    return true;
  }
  
  @Override
  public HasParentQuerySpecification specification() {
    try {
    	return HasParentQuerySpecification.instance();
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
  public static HasParentMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static HasParentMatch newMutableMatch(final TClass pTClass) {
    return new Mutable(pTClass);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static HasParentMatch newMatch(final TClass pTClass) {
    return new Immutable(pTClass);
  }
  
  private static final class Mutable extends HasParentMatch {
    Mutable(final TClass pTClass) {
      super(pTClass);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends HasParentMatch {
    Immutable(final TClass pTClass) {
      super(pTClass);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
