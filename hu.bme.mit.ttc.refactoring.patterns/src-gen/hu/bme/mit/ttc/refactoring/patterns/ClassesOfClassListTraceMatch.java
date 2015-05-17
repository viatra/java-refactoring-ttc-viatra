package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassesOfClassListTraceQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.classesOfClassListTrace pattern,
 * to be used in conjunction with {@link ClassesOfClassListTraceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ClassesOfClassListTraceMatcher
 * @see ClassesOfClassListTraceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ClassesOfClassListTraceMatch extends BasePatternMatch {
  private String fConcatSignature;
  
  private TClass fTClass;
  
  private static List<String> parameterNames = makeImmutableList("concatSignature", "tClass");
  
  private ClassesOfClassListTraceMatch(final String pConcatSignature, final TClass pTClass) {
    this.fConcatSignature = pConcatSignature;
    this.fTClass = pTClass;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("concatSignature".equals(parameterName)) return this.fConcatSignature;
    if ("tClass".equals(parameterName)) return this.fTClass;
    return null;
  }
  
  public String getConcatSignature() {
    return this.fConcatSignature;
  }
  
  public TClass getTClass() {
    return this.fTClass;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("concatSignature".equals(parameterName) ) {
    	this.fConcatSignature = (java.lang.String) newValue;
    	return true;
    }
    if ("tClass".equals(parameterName) ) {
    	this.fTClass = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    return false;
  }
  
  public void setConcatSignature(final String pConcatSignature) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fConcatSignature = pConcatSignature;
  }
  
  public void setTClass(final TClass pTClass) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTClass = pTClass;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.classesOfClassListTrace";
  }
  
  @Override
  public List<String> parameterNames() {
    return ClassesOfClassListTraceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fConcatSignature, fTClass};
  }
  
  @Override
  public ClassesOfClassListTraceMatch toImmutable() {
    return isMutable() ? newMatch(fConcatSignature, fTClass) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"concatSignature\"=" + prettyPrintValue(fConcatSignature) + ", ");
    
    result.append("\"tClass\"=" + prettyPrintValue(fTClass)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fConcatSignature == null) ? 0 : fConcatSignature.hashCode());
    result = prime * result + ((fTClass == null) ? 0 : fTClass.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ClassesOfClassListTraceMatch)) { // this should be infrequent
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
    ClassesOfClassListTraceMatch other = (ClassesOfClassListTraceMatch) obj;
    if (fConcatSignature == null) {if (other.fConcatSignature != null) return false;}
    else if (!fConcatSignature.equals(other.fConcatSignature)) return false;
    if (fTClass == null) {if (other.fTClass != null) return false;}
    else if (!fTClass.equals(other.fTClass)) return false;
    return true;
  }
  
  @Override
  public ClassesOfClassListTraceQuerySpecification specification() {
    try {
    	return ClassesOfClassListTraceQuerySpecification.instance();
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
  public static ClassesOfClassListTraceMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ClassesOfClassListTraceMatch newMutableMatch(final String pConcatSignature, final TClass pTClass) {
    return new Mutable(pConcatSignature, pTClass);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ClassesOfClassListTraceMatch newMatch(final String pConcatSignature, final TClass pTClass) {
    return new Immutable(pConcatSignature, pTClass);
  }
  
  private static final class Mutable extends ClassesOfClassListTraceMatch {
    Mutable(final String pConcatSignature, final TClass pTClass) {
      super(pConcatSignature, pTClass);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ClassesOfClassListTraceMatch {
    Immutable(final String pConcatSignature, final TClass pTClass) {
      super(pConcatSignature, pTClass);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
