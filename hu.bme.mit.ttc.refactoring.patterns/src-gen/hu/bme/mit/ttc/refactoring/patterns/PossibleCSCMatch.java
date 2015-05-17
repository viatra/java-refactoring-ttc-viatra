package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.util.PossibleCSCQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.possibleCSC pattern,
 * to be used in conjunction with {@link PossibleCSCMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PossibleCSCMatcher
 * @see PossibleCSCProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PossibleCSCMatch extends BasePatternMatch {
  private String fConcatSignature;
  
  private TMethodSignature fMethodSignature;
  
  private static List<String> parameterNames = makeImmutableList("concatSignature", "methodSignature");
  
  private PossibleCSCMatch(final String pConcatSignature, final TMethodSignature pMethodSignature) {
    this.fConcatSignature = pConcatSignature;
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("concatSignature".equals(parameterName)) return this.fConcatSignature;
    if ("methodSignature".equals(parameterName)) return this.fMethodSignature;
    return null;
  }
  
  public String getConcatSignature() {
    return this.fConcatSignature;
  }
  
  public TMethodSignature getMethodSignature() {
    return this.fMethodSignature;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("concatSignature".equals(parameterName) ) {
    	this.fConcatSignature = (java.lang.String) newValue;
    	return true;
    }
    if ("methodSignature".equals(parameterName) ) {
    	this.fMethodSignature = (TypeGraphBasic.TMethodSignature) newValue;
    	return true;
    }
    return false;
  }
  
  public void setConcatSignature(final String pConcatSignature) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fConcatSignature = pConcatSignature;
  }
  
  public void setMethodSignature(final TMethodSignature pMethodSignature) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.possibleCSC";
  }
  
  @Override
  public List<String> parameterNames() {
    return PossibleCSCMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fConcatSignature, fMethodSignature};
  }
  
  @Override
  public PossibleCSCMatch toImmutable() {
    return isMutable() ? newMatch(fConcatSignature, fMethodSignature) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"concatSignature\"=" + prettyPrintValue(fConcatSignature) + ", ");
    
    result.append("\"methodSignature\"=" + prettyPrintValue(fMethodSignature)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fConcatSignature == null) ? 0 : fConcatSignature.hashCode());
    result = prime * result + ((fMethodSignature == null) ? 0 : fMethodSignature.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PossibleCSCMatch)) { // this should be infrequent
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
    PossibleCSCMatch other = (PossibleCSCMatch) obj;
    if (fConcatSignature == null) {if (other.fConcatSignature != null) return false;}
    else if (!fConcatSignature.equals(other.fConcatSignature)) return false;
    if (fMethodSignature == null) {if (other.fMethodSignature != null) return false;}
    else if (!fMethodSignature.equals(other.fMethodSignature)) return false;
    return true;
  }
  
  @Override
  public PossibleCSCQuerySpecification specification() {
    try {
    	return PossibleCSCQuerySpecification.instance();
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
  public static PossibleCSCMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PossibleCSCMatch newMutableMatch(final String pConcatSignature, final TMethodSignature pMethodSignature) {
    return new Mutable(pConcatSignature, pMethodSignature);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static PossibleCSCMatch newMatch(final String pConcatSignature, final TMethodSignature pMethodSignature) {
    return new Immutable(pConcatSignature, pMethodSignature);
  }
  
  private static final class Mutable extends PossibleCSCMatch {
    Mutable(final String pConcatSignature, final TMethodSignature pMethodSignature) {
      super(pConcatSignature, pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PossibleCSCMatch {
    Immutable(final String pConcatSignature, final TMethodSignature pMethodSignature) {
      super(pConcatSignature, pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
