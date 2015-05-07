package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TSignature;
import hu.bme.mit.ttc.refactoring.patterns.util.HasMethodQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.hasMethod pattern,
 * to be used in conjunction with {@link HasMethodMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see HasMethodMatcher
 * @see HasMethodProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class HasMethodMatch extends BasePatternMatch {
  private TClass fClass;
  
  private TSignature fMethodSignature;
  
  private static List<String> parameterNames = makeImmutableList("class", "methodSignature");
  
  private HasMethodMatch(final TClass pClass, final TSignature pMethodSignature) {
    this.fClass = pClass;
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("class".equals(parameterName)) return this.fClass;
    if ("methodSignature".equals(parameterName)) return this.fMethodSignature;
    return null;
  }
  
  public TClass getValueOfClass() {
    return this.fClass;
  }
  
  public TSignature getMethodSignature() {
    return this.fMethodSignature;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("class".equals(parameterName) ) {
    	this.fClass = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    if ("methodSignature".equals(parameterName) ) {
    	this.fMethodSignature = (TypeGraphBasic.TSignature) newValue;
    	return true;
    }
    return false;
  }
  
  public void setClass(final TClass pClass) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fClass = pClass;
  }
  
  public void setMethodSignature(final TSignature pMethodSignature) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.hasMethod";
  }
  
  @Override
  public List<String> parameterNames() {
    return HasMethodMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fClass, fMethodSignature};
  }
  
  @Override
  public HasMethodMatch toImmutable() {
    return isMutable() ? newMatch(fClass, fMethodSignature) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
    
    result.append("\"methodSignature\"=" + prettyPrintValue(fMethodSignature)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fClass == null) ? 0 : fClass.hashCode());
    result = prime * result + ((fMethodSignature == null) ? 0 : fMethodSignature.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof HasMethodMatch)) { // this should be infrequent
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
    HasMethodMatch other = (HasMethodMatch) obj;
    if (fClass == null) {if (other.fClass != null) return false;}
    else if (!fClass.equals(other.fClass)) return false;
    if (fMethodSignature == null) {if (other.fMethodSignature != null) return false;}
    else if (!fMethodSignature.equals(other.fMethodSignature)) return false;
    return true;
  }
  
  @Override
  public HasMethodQuerySpecification specification() {
    try {
    	return HasMethodQuerySpecification.instance();
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
  public static HasMethodMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pClass the fixed value of pattern parameter class, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static HasMethodMatch newMutableMatch(final TClass pClass, final TSignature pMethodSignature) {
    return new Mutable(pClass, pMethodSignature);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pClass the fixed value of pattern parameter class, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static HasMethodMatch newMatch(final TClass pClass, final TSignature pMethodSignature) {
    return new Immutable(pClass, pMethodSignature);
  }
  
  private static final class Mutable extends HasMethodMatch {
    Mutable(final TClass pClass, final TSignature pMethodSignature) {
      super(pClass, pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends HasMethodMatch {
    Immutable(final TClass pClass, final TSignature pMethodSignature) {
      super(pClass, pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
