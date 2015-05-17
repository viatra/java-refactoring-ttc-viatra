package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassWithSignatureQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.classWithSignature pattern,
 * to be used in conjunction with {@link ClassWithSignatureMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ClassWithSignatureMatcher
 * @see ClassWithSignatureProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ClassWithSignatureMatch extends BasePatternMatch {
  private TClass fClazz;
  
  private TMethodSignature fMethodSignature;
  
  private static List<String> parameterNames = makeImmutableList("clazz", "methodSignature");
  
  private ClassWithSignatureMatch(final TClass pClazz, final TMethodSignature pMethodSignature) {
    this.fClazz = pClazz;
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("clazz".equals(parameterName)) return this.fClazz;
    if ("methodSignature".equals(parameterName)) return this.fMethodSignature;
    return null;
  }
  
  public TClass getClazz() {
    return this.fClazz;
  }
  
  public TMethodSignature getMethodSignature() {
    return this.fMethodSignature;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("clazz".equals(parameterName) ) {
    	this.fClazz = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    if ("methodSignature".equals(parameterName) ) {
    	this.fMethodSignature = (TypeGraphBasic.TMethodSignature) newValue;
    	return true;
    }
    return false;
  }
  
  public void setClazz(final TClass pClazz) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fClazz = pClazz;
  }
  
  public void setMethodSignature(final TMethodSignature pMethodSignature) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.classWithSignature";
  }
  
  @Override
  public List<String> parameterNames() {
    return ClassWithSignatureMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fClazz, fMethodSignature};
  }
  
  @Override
  public ClassWithSignatureMatch toImmutable() {
    return isMutable() ? newMatch(fClazz, fMethodSignature) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"clazz\"=" + prettyPrintValue(fClazz) + ", ");
    
    result.append("\"methodSignature\"=" + prettyPrintValue(fMethodSignature)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fClazz == null) ? 0 : fClazz.hashCode());
    result = prime * result + ((fMethodSignature == null) ? 0 : fMethodSignature.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ClassWithSignatureMatch)) { // this should be infrequent
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
    ClassWithSignatureMatch other = (ClassWithSignatureMatch) obj;
    if (fClazz == null) {if (other.fClazz != null) return false;}
    else if (!fClazz.equals(other.fClazz)) return false;
    if (fMethodSignature == null) {if (other.fMethodSignature != null) return false;}
    else if (!fMethodSignature.equals(other.fMethodSignature)) return false;
    return true;
  }
  
  @Override
  public ClassWithSignatureQuerySpecification specification() {
    try {
    	return ClassWithSignatureQuerySpecification.instance();
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
  public static ClassWithSignatureMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ClassWithSignatureMatch newMutableMatch(final TClass pClazz, final TMethodSignature pMethodSignature) {
    return new Mutable(pClazz, pMethodSignature);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ClassWithSignatureMatch newMatch(final TClass pClazz, final TMethodSignature pMethodSignature) {
    return new Immutable(pClazz, pMethodSignature);
  }
  
  private static final class Mutable extends ClassWithSignatureMatch {
    Mutable(final TClass pClazz, final TMethodSignature pMethodSignature) {
      super(pClazz, pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ClassWithSignatureMatch {
    Immutable(final TClass pClazz, final TMethodSignature pMethodSignature) {
      super(pClazz, pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
