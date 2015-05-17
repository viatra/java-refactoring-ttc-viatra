package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphTrace.MethodSignatureTrace;
import hu.bme.mit.ttc.refactoring.patterns.util.PossiblePUMQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.possiblePUM pattern,
 * to be used in conjunction with {@link PossiblePUMMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PossiblePUMMatcher
 * @see PossiblePUMProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PossiblePUMMatch extends BasePatternMatch {
  private TClass fParentClass;
  
  private MethodSignatureTrace fMethodSignatureTrace;
  
  private static List<String> parameterNames = makeImmutableList("parentClass", "methodSignatureTrace");
  
  private PossiblePUMMatch(final TClass pParentClass, final MethodSignatureTrace pMethodSignatureTrace) {
    this.fParentClass = pParentClass;
    this.fMethodSignatureTrace = pMethodSignatureTrace;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("parentClass".equals(parameterName)) return this.fParentClass;
    if ("methodSignatureTrace".equals(parameterName)) return this.fMethodSignatureTrace;
    return null;
  }
  
  public TClass getParentClass() {
    return this.fParentClass;
  }
  
  public MethodSignatureTrace getMethodSignatureTrace() {
    return this.fMethodSignatureTrace;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("parentClass".equals(parameterName) ) {
    	this.fParentClass = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    if ("methodSignatureTrace".equals(parameterName) ) {
    	this.fMethodSignatureTrace = (TypeGraphTrace.MethodSignatureTrace) newValue;
    	return true;
    }
    return false;
  }
  
  public void setParentClass(final TClass pParentClass) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParentClass = pParentClass;
  }
  
  public void setMethodSignatureTrace(final MethodSignatureTrace pMethodSignatureTrace) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMethodSignatureTrace = pMethodSignatureTrace;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.possiblePUM";
  }
  
  @Override
  public List<String> parameterNames() {
    return PossiblePUMMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParentClass, fMethodSignatureTrace};
  }
  
  @Override
  public PossiblePUMMatch toImmutable() {
    return isMutable() ? newMatch(fParentClass, fMethodSignatureTrace) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"parentClass\"=" + prettyPrintValue(fParentClass) + ", ");
    
    result.append("\"methodSignatureTrace\"=" + prettyPrintValue(fMethodSignatureTrace)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fParentClass == null) ? 0 : fParentClass.hashCode());
    result = prime * result + ((fMethodSignatureTrace == null) ? 0 : fMethodSignatureTrace.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PossiblePUMMatch)) { // this should be infrequent
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
    PossiblePUMMatch other = (PossiblePUMMatch) obj;
    if (fParentClass == null) {if (other.fParentClass != null) return false;}
    else if (!fParentClass.equals(other.fParentClass)) return false;
    if (fMethodSignatureTrace == null) {if (other.fMethodSignatureTrace != null) return false;}
    else if (!fMethodSignatureTrace.equals(other.fMethodSignatureTrace)) return false;
    return true;
  }
  
  @Override
  public PossiblePUMQuerySpecification specification() {
    try {
    	return PossiblePUMQuerySpecification.instance();
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
  public static PossiblePUMMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignatureTrace the fixed value of pattern parameter methodSignatureTrace, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PossiblePUMMatch newMutableMatch(final TClass pParentClass, final MethodSignatureTrace pMethodSignatureTrace) {
    return new Mutable(pParentClass, pMethodSignatureTrace);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignatureTrace the fixed value of pattern parameter methodSignatureTrace, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static PossiblePUMMatch newMatch(final TClass pParentClass, final MethodSignatureTrace pMethodSignatureTrace) {
    return new Immutable(pParentClass, pMethodSignatureTrace);
  }
  
  private static final class Mutable extends PossiblePUMMatch {
    Mutable(final TClass pParentClass, final MethodSignatureTrace pMethodSignatureTrace) {
      super(pParentClass, pMethodSignatureTrace);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PossiblePUMMatch {
    Immutable(final TClass pParentClass, final MethodSignatureTrace pMethodSignatureTrace) {
      super(pParentClass, pMethodSignatureTrace);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
