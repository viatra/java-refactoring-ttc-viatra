package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodDefinitionInClassListQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.methodDefinitionInClassList pattern,
 * to be used in conjunction with {@link MethodDefinitionInClassListMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MethodDefinitionInClassListMatcher
 * @see MethodDefinitionInClassListProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MethodDefinitionInClassListMatch extends BasePatternMatch {
  private TClass fParentClass;
  
  private TMethodSignature fMethodSignature;
  
  private TClass fClazz;
  
  private TMethodDefinition fMethodDefinition;
  
  private static List<String> parameterNames = makeImmutableList("parentClass", "methodSignature", "clazz", "methodDefinition");
  
  private MethodDefinitionInClassListMatch(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
    this.fParentClass = pParentClass;
    this.fMethodSignature = pMethodSignature;
    this.fClazz = pClazz;
    this.fMethodDefinition = pMethodDefinition;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("parentClass".equals(parameterName)) return this.fParentClass;
    if ("methodSignature".equals(parameterName)) return this.fMethodSignature;
    if ("clazz".equals(parameterName)) return this.fClazz;
    if ("methodDefinition".equals(parameterName)) return this.fMethodDefinition;
    return null;
  }
  
  public TClass getParentClass() {
    return this.fParentClass;
  }
  
  public TMethodSignature getMethodSignature() {
    return this.fMethodSignature;
  }
  
  public TClass getClazz() {
    return this.fClazz;
  }
  
  public TMethodDefinition getMethodDefinition() {
    return this.fMethodDefinition;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("parentClass".equals(parameterName) ) {
    	this.fParentClass = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    if ("methodSignature".equals(parameterName) ) {
    	this.fMethodSignature = (TypeGraphBasic.TMethodSignature) newValue;
    	return true;
    }
    if ("clazz".equals(parameterName) ) {
    	this.fClazz = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    if ("methodDefinition".equals(parameterName) ) {
    	this.fMethodDefinition = (TypeGraphBasic.TMethodDefinition) newValue;
    	return true;
    }
    return false;
  }
  
  public void setParentClass(final TClass pParentClass) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParentClass = pParentClass;
  }
  
  public void setMethodSignature(final TMethodSignature pMethodSignature) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMethodSignature = pMethodSignature;
  }
  
  public void setClazz(final TClass pClazz) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fClazz = pClazz;
  }
  
  public void setMethodDefinition(final TMethodDefinition pMethodDefinition) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMethodDefinition = pMethodDefinition;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.methodDefinitionInClassList";
  }
  
  @Override
  public List<String> parameterNames() {
    return MethodDefinitionInClassListMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParentClass, fMethodSignature, fClazz, fMethodDefinition};
  }
  
  @Override
  public MethodDefinitionInClassListMatch toImmutable() {
    return isMutable() ? newMatch(fParentClass, fMethodSignature, fClazz, fMethodDefinition) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"parentClass\"=" + prettyPrintValue(fParentClass) + ", ");
    
    result.append("\"methodSignature\"=" + prettyPrintValue(fMethodSignature) + ", ");
    
    result.append("\"clazz\"=" + prettyPrintValue(fClazz) + ", ");
    
    result.append("\"methodDefinition\"=" + prettyPrintValue(fMethodDefinition)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fParentClass == null) ? 0 : fParentClass.hashCode());
    result = prime * result + ((fMethodSignature == null) ? 0 : fMethodSignature.hashCode());
    result = prime * result + ((fClazz == null) ? 0 : fClazz.hashCode());
    result = prime * result + ((fMethodDefinition == null) ? 0 : fMethodDefinition.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MethodDefinitionInClassListMatch)) { // this should be infrequent
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
    MethodDefinitionInClassListMatch other = (MethodDefinitionInClassListMatch) obj;
    if (fParentClass == null) {if (other.fParentClass != null) return false;}
    else if (!fParentClass.equals(other.fParentClass)) return false;
    if (fMethodSignature == null) {if (other.fMethodSignature != null) return false;}
    else if (!fMethodSignature.equals(other.fMethodSignature)) return false;
    if (fClazz == null) {if (other.fClazz != null) return false;}
    else if (!fClazz.equals(other.fClazz)) return false;
    if (fMethodDefinition == null) {if (other.fMethodDefinition != null) return false;}
    else if (!fMethodDefinition.equals(other.fMethodDefinition)) return false;
    return true;
  }
  
  @Override
  public MethodDefinitionInClassListQuerySpecification specification() {
    try {
    	return MethodDefinitionInClassListQuerySpecification.instance();
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
  public static MethodDefinitionInClassListMatch newEmptyMatch() {
    return new Mutable(null, null, null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MethodDefinitionInClassListMatch newMutableMatch(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
    return new Mutable(pParentClass, pMethodSignature, pClazz, pMethodDefinition);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MethodDefinitionInClassListMatch newMatch(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
    return new Immutable(pParentClass, pMethodSignature, pClazz, pMethodDefinition);
  }
  
  private static final class Mutable extends MethodDefinitionInClassListMatch {
    Mutable(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
      super(pParentClass, pMethodSignature, pClazz, pMethodDefinition);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MethodDefinitionInClassListMatch {
    Immutable(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
      super(pParentClass, pMethodSignature, pClazz, pMethodDefinition);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
