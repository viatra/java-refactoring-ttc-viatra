package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodSignatureQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.methodSignature pattern,
 * to be used in conjunction with {@link MethodSignatureMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MethodSignatureMatcher
 * @see MethodSignatureProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MethodSignatureMatch extends BasePatternMatch {
  private TMethodSignature fMethodSignature;
  
  private static List<String> parameterNames = makeImmutableList("methodSignature");
  
  private MethodSignatureMatch(final TMethodSignature pMethodSignature) {
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("methodSignature".equals(parameterName)) return this.fMethodSignature;
    return null;
  }
  
  public TMethodSignature getMethodSignature() {
    return this.fMethodSignature;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("methodSignature".equals(parameterName) ) {
    	this.fMethodSignature = (TypeGraphBasic.TMethodSignature) newValue;
    	return true;
    }
    return false;
  }
  
  public void setMethodSignature(final TMethodSignature pMethodSignature) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.methodSignature";
  }
  
  @Override
  public List<String> parameterNames() {
    return MethodSignatureMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMethodSignature};
  }
  
  @Override
  public MethodSignatureMatch toImmutable() {
    return isMutable() ? newMatch(fMethodSignature) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"methodSignature\"=" + prettyPrintValue(fMethodSignature)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMethodSignature == null) ? 0 : fMethodSignature.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MethodSignatureMatch)) { // this should be infrequent
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
    MethodSignatureMatch other = (MethodSignatureMatch) obj;
    if (fMethodSignature == null) {if (other.fMethodSignature != null) return false;}
    else if (!fMethodSignature.equals(other.fMethodSignature)) return false;
    return true;
  }
  
  @Override
  public MethodSignatureQuerySpecification specification() {
    try {
    	return MethodSignatureQuerySpecification.instance();
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
  public static MethodSignatureMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MethodSignatureMatch newMutableMatch(final TMethodSignature pMethodSignature) {
    return new Mutable(pMethodSignature);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MethodSignatureMatch newMatch(final TMethodSignature pMethodSignature) {
    return new Immutable(pMethodSignature);
  }
  
  private static final class Mutable extends MethodSignatureMatch {
    Mutable(final TMethodSignature pMethodSignature) {
      super(pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MethodSignatureMatch {
    Immutable(final TMethodSignature pMethodSignature) {
      super(pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
