package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.util.PumQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.pum pattern,
 * to be used in conjunction with {@link PumMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PumMatcher
 * @see PumProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PumMatch extends BasePatternMatch {
  private TClass fParent;
  
  private TClass fChild1;
  
  private TClass fChildN;
  
  private TMethodDefinition fDefinition1;
  
  private TMethodDefinition fDefinitionN;
  
  private TMethodSignature fSignature;
  
  private static List<String> parameterNames = makeImmutableList("parent", "child1", "childN", "definition1", "definitionN", "signature");
  
  private PumMatch(final TClass pParent, final TClass pChild1, final TClass pChildN, final TMethodDefinition pDefinition1, final TMethodDefinition pDefinitionN, final TMethodSignature pSignature) {
    this.fParent = pParent;
    this.fChild1 = pChild1;
    this.fChildN = pChildN;
    this.fDefinition1 = pDefinition1;
    this.fDefinitionN = pDefinitionN;
    this.fSignature = pSignature;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("parent".equals(parameterName)) return this.fParent;
    if ("child1".equals(parameterName)) return this.fChild1;
    if ("childN".equals(parameterName)) return this.fChildN;
    if ("definition1".equals(parameterName)) return this.fDefinition1;
    if ("definitionN".equals(parameterName)) return this.fDefinitionN;
    if ("signature".equals(parameterName)) return this.fSignature;
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
  
  public TMethodDefinition getDefinition1() {
    return this.fDefinition1;
  }
  
  public TMethodDefinition getDefinitionN() {
    return this.fDefinitionN;
  }
  
  public TMethodSignature getSignature() {
    return this.fSignature;
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
    if ("definition1".equals(parameterName) ) {
    	this.fDefinition1 = (TypeGraphBasic.TMethodDefinition) newValue;
    	return true;
    }
    if ("definitionN".equals(parameterName) ) {
    	this.fDefinitionN = (TypeGraphBasic.TMethodDefinition) newValue;
    	return true;
    }
    if ("signature".equals(parameterName) ) {
    	this.fSignature = (TypeGraphBasic.TMethodSignature) newValue;
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
  
  public void setDefinition1(final TMethodDefinition pDefinition1) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDefinition1 = pDefinition1;
  }
  
  public void setDefinitionN(final TMethodDefinition pDefinitionN) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fDefinitionN = pDefinitionN;
  }
  
  public void setSignature(final TMethodSignature pSignature) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fSignature = pSignature;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.pum";
  }
  
  @Override
  public List<String> parameterNames() {
    return PumMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParent, fChild1, fChildN, fDefinition1, fDefinitionN, fSignature};
  }
  
  @Override
  public PumMatch toImmutable() {
    return isMutable() ? newMatch(fParent, fChild1, fChildN, fDefinition1, fDefinitionN, fSignature) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"parent\"=" + prettyPrintValue(fParent) + ", ");
    
    result.append("\"child1\"=" + prettyPrintValue(fChild1) + ", ");
    
    result.append("\"childN\"=" + prettyPrintValue(fChildN) + ", ");
    
    result.append("\"definition1\"=" + prettyPrintValue(fDefinition1) + ", ");
    
    result.append("\"definitionN\"=" + prettyPrintValue(fDefinitionN) + ", ");
    
    result.append("\"signature\"=" + prettyPrintValue(fSignature)
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
    result = prime * result + ((fDefinition1 == null) ? 0 : fDefinition1.hashCode());
    result = prime * result + ((fDefinitionN == null) ? 0 : fDefinitionN.hashCode());
    result = prime * result + ((fSignature == null) ? 0 : fSignature.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PumMatch)) { // this should be infrequent
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
    PumMatch other = (PumMatch) obj;
    if (fParent == null) {if (other.fParent != null) return false;}
    else if (!fParent.equals(other.fParent)) return false;
    if (fChild1 == null) {if (other.fChild1 != null) return false;}
    else if (!fChild1.equals(other.fChild1)) return false;
    if (fChildN == null) {if (other.fChildN != null) return false;}
    else if (!fChildN.equals(other.fChildN)) return false;
    if (fDefinition1 == null) {if (other.fDefinition1 != null) return false;}
    else if (!fDefinition1.equals(other.fDefinition1)) return false;
    if (fDefinitionN == null) {if (other.fDefinitionN != null) return false;}
    else if (!fDefinitionN.equals(other.fDefinitionN)) return false;
    if (fSignature == null) {if (other.fSignature != null) return false;}
    else if (!fSignature.equals(other.fSignature)) return false;
    return true;
  }
  
  @Override
  public PumQuerySpecification specification() {
    try {
    	return PumQuerySpecification.instance();
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
  public static PumMatch newEmptyMatch() {
    return new Mutable(null, null, null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @param pDefinition1 the fixed value of pattern parameter definition1, or null if not bound.
   * @param pDefinitionN the fixed value of pattern parameter definitionN, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PumMatch newMutableMatch(final TClass pParent, final TClass pChild1, final TClass pChildN, final TMethodDefinition pDefinition1, final TMethodDefinition pDefinitionN, final TMethodSignature pSignature) {
    return new Mutable(pParent, pChild1, pChildN, pDefinition1, pDefinitionN, pSignature);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @param pDefinition1 the fixed value of pattern parameter definition1, or null if not bound.
   * @param pDefinitionN the fixed value of pattern parameter definitionN, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static PumMatch newMatch(final TClass pParent, final TClass pChild1, final TClass pChildN, final TMethodDefinition pDefinition1, final TMethodDefinition pDefinitionN, final TMethodSignature pSignature) {
    return new Immutable(pParent, pChild1, pChildN, pDefinition1, pDefinitionN, pSignature);
  }
  
  private static final class Mutable extends PumMatch {
    Mutable(final TClass pParent, final TClass pChild1, final TClass pChildN, final TMethodDefinition pDefinition1, final TMethodDefinition pDefinitionN, final TMethodSignature pSignature) {
      super(pParent, pChild1, pChildN, pDefinition1, pDefinitionN, pSignature);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PumMatch {
    Immutable(final TClass pParent, final TClass pChild1, final TClass pChildN, final TMethodDefinition pDefinition1, final TMethodDefinition pDefinitionN, final TMethodSignature pSignature) {
      super(pParent, pChild1, pChildN, pDefinition1, pDefinitionN, pSignature);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
