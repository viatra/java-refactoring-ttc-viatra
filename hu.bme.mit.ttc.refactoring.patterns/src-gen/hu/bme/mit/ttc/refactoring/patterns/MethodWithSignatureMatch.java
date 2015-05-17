package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphTrace.MethodSignatureTrace;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodWithSignatureQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.methodWithSignature pattern,
 * to be used in conjunction with {@link MethodWithSignatureMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MethodWithSignatureMatcher
 * @see MethodWithSignatureProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MethodWithSignatureMatch extends BasePatternMatch {
  private MethodSignatureTrace fTrace;
  
  private String fSignature;
  
  private static List<String> parameterNames = makeImmutableList("trace", "signature");
  
  private MethodWithSignatureMatch(final MethodSignatureTrace pTrace, final String pSignature) {
    this.fTrace = pTrace;
    this.fSignature = pSignature;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("trace".equals(parameterName)) return this.fTrace;
    if ("signature".equals(parameterName)) return this.fSignature;
    return null;
  }
  
  public MethodSignatureTrace getTrace() {
    return this.fTrace;
  }
  
  public String getSignature() {
    return this.fSignature;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("trace".equals(parameterName) ) {
    	this.fTrace = (TypeGraphTrace.MethodSignatureTrace) newValue;
    	return true;
    }
    if ("signature".equals(parameterName) ) {
    	this.fSignature = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTrace(final MethodSignatureTrace pTrace) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrace = pTrace;
  }
  
  public void setSignature(final String pSignature) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSignature = pSignature;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.methodWithSignature";
  }
  
  @Override
  public List<String> parameterNames() {
    return MethodWithSignatureMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTrace, fSignature};
  }
  
  @Override
  public MethodWithSignatureMatch toImmutable() {
    return isMutable() ? newMatch(fTrace, fSignature) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"trace\"=" + prettyPrintValue(fTrace) + ", ");
    
    result.append("\"signature\"=" + prettyPrintValue(fSignature)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTrace == null) ? 0 : fTrace.hashCode());
    result = prime * result + ((fSignature == null) ? 0 : fSignature.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MethodWithSignatureMatch)) { // this should be infrequent
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
    MethodWithSignatureMatch other = (MethodWithSignatureMatch) obj;
    if (fTrace == null) {if (other.fTrace != null) return false;}
    else if (!fTrace.equals(other.fTrace)) return false;
    if (fSignature == null) {if (other.fSignature != null) return false;}
    else if (!fSignature.equals(other.fSignature)) return false;
    return true;
  }
  
  @Override
  public MethodWithSignatureQuerySpecification specification() {
    try {
    	return MethodWithSignatureQuerySpecification.instance();
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
  public static MethodWithSignatureMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MethodWithSignatureMatch newMutableMatch(final MethodSignatureTrace pTrace, final String pSignature) {
    return new Mutable(pTrace, pSignature);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MethodWithSignatureMatch newMatch(final MethodSignatureTrace pTrace, final String pSignature) {
    return new Immutable(pTrace, pSignature);
  }
  
  private static final class Mutable extends MethodWithSignatureMatch {
    Mutable(final MethodSignatureTrace pTrace, final String pSignature) {
      super(pTrace, pSignature);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MethodWithSignatureMatch {
    Immutable(final MethodSignatureTrace pTrace, final String pSignature) {
      super(pTrace, pSignature);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
