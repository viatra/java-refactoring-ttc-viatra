package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.childrenClassMethodDefinitionsAccessingSiblingMembers pattern,
 * to be used in conjunction with {@link ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher
 * @see ChildrenClassMethodDefinitionsAccessingSiblingMembersProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch extends BasePatternMatch {
  private TClass fParentClass;
  
  private TMethodSignature fMethodSignature;
  
  private static List<String> parameterNames = makeImmutableList("parentClass", "methodSignature");
  
  private ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch(final TClass pParentClass, final TMethodSignature pMethodSignature) {
    this.fParentClass = pParentClass;
    this.fMethodSignature = pMethodSignature;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("parentClass".equals(parameterName)) return this.fParentClass;
    if ("methodSignature".equals(parameterName)) return this.fMethodSignature;
    return null;
  }
  
  public TClass getParentClass() {
    return this.fParentClass;
  }
  
  public TMethodSignature getMethodSignature() {
    return this.fMethodSignature;
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
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.childrenClassMethodDefinitionsAccessingSiblingMembers";
  }
  
  @Override
  public List<String> parameterNames() {
    return ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParentClass, fMethodSignature};
  }
  
  @Override
  public ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch toImmutable() {
    return isMutable() ? newMatch(fParentClass, fMethodSignature) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"parentClass\"=" + prettyPrintValue(fParentClass) + ", ");
    
    result.append("\"methodSignature\"=" + prettyPrintValue(fMethodSignature)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fParentClass == null) ? 0 : fParentClass.hashCode());
    result = prime * result + ((fMethodSignature == null) ? 0 : fMethodSignature.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch)) { // this should be infrequent
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
    ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch other = (ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch) obj;
    if (fParentClass == null) {if (other.fParentClass != null) return false;}
    else if (!fParentClass.equals(other.fParentClass)) return false;
    if (fMethodSignature == null) {if (other.fMethodSignature != null) return false;}
    else if (!fMethodSignature.equals(other.fMethodSignature)) return false;
    return true;
  }
  
  @Override
  public ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification specification() {
    try {
    	return ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification.instance();
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
  public static ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch newMutableMatch(final TClass pParentClass, final TMethodSignature pMethodSignature) {
    return new Mutable(pParentClass, pMethodSignature);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch newMatch(final TClass pParentClass, final TMethodSignature pMethodSignature) {
    return new Immutable(pParentClass, pMethodSignature);
  }
  
  private static final class Mutable extends ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch {
    Mutable(final TClass pParentClass, final TMethodSignature pMethodSignature) {
      super(pParentClass, pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch {
    Immutable(final TClass pParentClass, final TMethodSignature pMethodSignature) {
      super(pParentClass, pMethodSignature);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
