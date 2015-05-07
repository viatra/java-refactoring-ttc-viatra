package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.util.CsAQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.csA pattern,
 * to be used in conjunction with {@link CsAMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CsAMatcher
 * @see CsAProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CsAMatch extends BasePatternMatch {
  private TClass fChild1;
  
  private TClass fChildN;
  
  private static List<String> parameterNames = makeImmutableList("child1", "childN");
  
  private CsAMatch(final TClass pChild1, final TClass pChildN) {
    this.fChild1 = pChild1;
    this.fChildN = pChildN;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("child1".equals(parameterName)) return this.fChild1;
    if ("childN".equals(parameterName)) return this.fChildN;
    return null;
  }
  
  public TClass getChild1() {
    return this.fChild1;
  }
  
  public TClass getChildN() {
    return this.fChildN;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("child1".equals(parameterName) ) {
    	this.fChild1 = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    if ("childN".equals(parameterName) ) {
    	this.fChildN = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    return false;
  }
  
  public void setChild1(final TClass pChild1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChild1 = pChild1;
  }
  
  public void setChildN(final TClass pChildN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChildN = pChildN;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.csA";
  }
  
  @Override
  public List<String> parameterNames() {
    return CsAMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fChild1, fChildN};
  }
  
  @Override
  public CsAMatch toImmutable() {
    return isMutable() ? newMatch(fChild1, fChildN) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"child1\"=" + prettyPrintValue(fChild1) + ", ");
    
    result.append("\"childN\"=" + prettyPrintValue(fChildN)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fChild1 == null) ? 0 : fChild1.hashCode());
    result = prime * result + ((fChildN == null) ? 0 : fChildN.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CsAMatch)) { // this should be infrequent
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
    CsAMatch other = (CsAMatch) obj;
    if (fChild1 == null) {if (other.fChild1 != null) return false;}
    else if (!fChild1.equals(other.fChild1)) return false;
    if (fChildN == null) {if (other.fChildN != null) return false;}
    else if (!fChildN.equals(other.fChildN)) return false;
    return true;
  }
  
  @Override
  public CsAQuerySpecification specification() {
    try {
    	return CsAQuerySpecification.instance();
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
  public static CsAMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CsAMatch newMutableMatch(final TClass pChild1, final TClass pChildN) {
    return new Mutable(pChild1, pChildN);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CsAMatch newMatch(final TClass pChild1, final TClass pChildN) {
    return new Immutable(pChild1, pChildN);
  }
  
  private static final class Mutable extends CsAMatch {
    Mutable(final TClass pChild1, final TClass pChildN) {
      super(pChild1, pChildN);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CsAMatch {
    Immutable(final TClass pChild1, final TClass pChildN) {
      super(pChild1, pChildN);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
