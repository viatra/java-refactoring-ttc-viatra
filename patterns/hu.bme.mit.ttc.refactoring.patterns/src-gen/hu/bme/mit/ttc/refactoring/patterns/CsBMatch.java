package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.util.CsBQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.csB pattern,
 * to be used in conjunction with {@link CsBMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see CsBMatcher
 * @see CsBProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class CsBMatch extends BasePatternMatch {
  private TClass fParent;
  
  private TClass fChild1;
  
  private TClass fChildN;
  
  private static List<String> parameterNames = makeImmutableList("parent", "child1", "childN");
  
  private CsBMatch(final TClass pParent, final TClass pChild1, final TClass pChildN) {
    this.fParent = pParent;
    this.fChild1 = pChild1;
    this.fChildN = pChildN;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("parent".equals(parameterName)) return this.fParent;
    if ("child1".equals(parameterName)) return this.fChild1;
    if ("childN".equals(parameterName)) return this.fChildN;
    return null;
  }
  
  public TClass getParent() {
    return this.fParent;
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
    if ("parent".equals(parameterName) ) {
    	this.fParent = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
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
  
  public void setParent(final TClass pParent) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParent = pParent;
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
    return "hu.bme.mit.ttc.refactoring.patterns.csB";
  }
  
  @Override
  public List<String> parameterNames() {
    return CsBMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParent, fChild1, fChildN};
  }
  
  @Override
  public CsBMatch toImmutable() {
    return isMutable() ? newMatch(fParent, fChild1, fChildN) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"parent\"=" + prettyPrintValue(fParent) + ", ");
    
    result.append("\"child1\"=" + prettyPrintValue(fChild1) + ", ");
    
    result.append("\"childN\"=" + prettyPrintValue(fChildN)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fParent == null) ? 0 : fParent.hashCode());
    result = prime * result + ((fChild1 == null) ? 0 : fChild1.hashCode());
    result = prime * result + ((fChildN == null) ? 0 : fChildN.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof CsBMatch)) { // this should be infrequent
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
    CsBMatch other = (CsBMatch) obj;
    if (fParent == null) {if (other.fParent != null) return false;}
    else if (!fParent.equals(other.fParent)) return false;
    if (fChild1 == null) {if (other.fChild1 != null) return false;}
    else if (!fChild1.equals(other.fChild1)) return false;
    if (fChildN == null) {if (other.fChildN != null) return false;}
    else if (!fChildN.equals(other.fChildN)) return false;
    return true;
  }
  
  @Override
  public CsBQuerySpecification specification() {
    try {
    	return CsBQuerySpecification.instance();
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
  public static CsBMatch newEmptyMatch() {
    return new Mutable(null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static CsBMatch newMutableMatch(final TClass pParent, final TClass pChild1, final TClass pChildN) {
    return new Mutable(pParent, pChild1, pChildN);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static CsBMatch newMatch(final TClass pParent, final TClass pChild1, final TClass pChildN) {
    return new Immutable(pParent, pChild1, pChildN);
  }
  
  private static final class Mutable extends CsBMatch {
    Mutable(final TClass pParent, final TClass pChild1, final TClass pChildN) {
      super(pParent, pChild1, pChildN);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends CsBMatch {
    Immutable(final TClass pParent, final TClass pChild1, final TClass pChildN) {
      super(pParent, pChild1, pChildN);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
