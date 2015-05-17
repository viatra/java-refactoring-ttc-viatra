package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TMethodSignature;
import TypeGraphTrace.MethodSignatureTrace;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodSignatureAndTraceQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.methodSignatureAndTrace pattern,
 * to be used in conjunction with {@link MethodSignatureAndTraceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MethodSignatureAndTraceMatcher
 * @see MethodSignatureAndTraceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MethodSignatureAndTraceMatch extends BasePatternMatch {
  private MethodSignatureTrace fTrace;
  
  private TMethodSignature fMethodSignature;
  
  private static List<String> parameterNames = makeImmutableList("trace", "methodSignature");
  
  private MethodSignatureAndTraceMatch(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature) {
    this.fTrace = pTrace;
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("trace".equals(parameterName)) return this.fTrace;
    if ("methodSignature".equals(parameterName)) return this.fMethodSignature;
    return null;
  }
  
  public MethodSignatureTrace getTrace() {
    return this.fTrace;
  }
  
  public TMethodSignature getMethodSignature() {
    return this.fMethodSignature;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("trace".equals(parameterName) ) {
    	this.fTrace = (TypeGraphTrace.MethodSignatureTrace) newValue;
    	return true;
    }
    if ("methodSignature".equals(parameterName) ) {
    	this.fMethodSignature = (TypeGraphBasic.TMethodSignature) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTrace(final MethodSignatureTrace pTrace) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTrace = pTrace;
  }
  
  public void setMethodSignature(final TMethodSignature pMethodSignature) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.methodSignatureAndTrace";
  }
  
  @Override
  public List<String> parameterNames() {
    return MethodSignatureAndTraceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTrace, fMethodSignature};
  }
  
  @Override
  public MethodSignatureAndTraceMatch toImmutable() {
    return isMutable() ? newMatch(fTrace, fMethodSignature) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"trace\"=" + prettyPrintValue(fTrace) + ", ");
    
    result.append("\"methodSignature\"=" + prettyPrintValue(fMethodSignature)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTrace == null) ? 0 : fTrace.hashCode());
    result = prime * result + ((fMethodSignature == null) ? 0 : fMethodSignature.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MethodSignatureAndTraceMatch)) { // this should be infrequent
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
    MethodSignatureAndTraceMatch other = (MethodSignatureAndTraceMatch) obj;
    if (fTrace == null) {if (other.fTrace != null) return false;}
    else if (!fTrace.equals(other.fTrace)) return false;
    if (fMethodSignature == null) {if (other.fMethodSignature != null) return false;}
    else if (!fMethodSignature.equals(other.fMethodSignature)) return false;
    return true;
  }
  
  @Override
  public MethodSignatureAndTraceQuerySpecification specification() {
    try {
    	return MethodSignatureAndTraceQuerySpecification.instance();
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
  public static MethodSignatureAndTraceMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MethodSignatureAndTraceMatch newMutableMatch(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature) {
    return new Mutable(pTrace, pMethodSignature);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MethodSignatureAndTraceMatch newMatch(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature) {
    return new Immutable(pTrace, pMethodSignature);
  }
  
  private static final class Mutable extends MethodSignatureAndTraceMatch {
    Mutable(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature) {
      super(pTrace, pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MethodSignatureAndTraceMatch {
    Immutable(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature) {
      super(pTrace, pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
