package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.childClasses pattern,
 * to be used in conjunction with {@link ChildClassesMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see ChildClassesMatcher
 * @see ChildClassesProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class ChildClassesMatch extends BasePatternMatch {
  private TClass fParentClass;
  
  private TClass fChildClass;
  
  private static List<String> parameterNames = makeImmutableList("parentClass", "childClass");
  
  private ChildClassesMatch(final TClass pParentClass, final TClass pChildClass) {
    this.fParentClass = pParentClass;
    this.fChildClass = pChildClass;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("parentClass".equals(parameterName)) return this.fParentClass;
    if ("childClass".equals(parameterName)) return this.fChildClass;
    return null;
  }
  
  public TClass getParentClass() {
    return this.fParentClass;
  }
  
  public TClass getChildClass() {
    return this.fChildClass;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("parentClass".equals(parameterName) ) {
    	this.fParentClass = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    if ("childClass".equals(parameterName) ) {
    	this.fChildClass = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    return false;
  }
  
  public void setParentClass(final TClass pParentClass) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fParentClass = pParentClass;
  }
  
  public void setChildClass(final TClass pChildClass) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fChildClass = pChildClass;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.childClasses";
  }
  
  @Override
  public List<String> parameterNames() {
    return ChildClassesMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fParentClass, fChildClass};
  }
  
  @Override
  public ChildClassesMatch toImmutable() {
    return isMutable() ? newMatch(fParentClass, fChildClass) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"parentClass\"=" + prettyPrintValue(fParentClass) + ", ");
    
    result.append("\"childClass\"=" + prettyPrintValue(fChildClass)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fParentClass == null) ? 0 : fParentClass.hashCode());
    result = prime * result + ((fChildClass == null) ? 0 : fChildClass.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof ChildClassesMatch)) { // this should be infrequent
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
    ChildClassesMatch other = (ChildClassesMatch) obj;
    if (fParentClass == null) {if (other.fParentClass != null) return false;}
    else if (!fParentClass.equals(other.fParentClass)) return false;
    if (fChildClass == null) {if (other.fChildClass != null) return false;}
    else if (!fChildClass.equals(other.fChildClass)) return false;
    return true;
  }
  
  @Override
  public ChildClassesQuerySpecification specification() {
    try {
    	return ChildClassesQuerySpecification.instance();
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
  public static ChildClassesMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pChildClass the fixed value of pattern parameter childClass, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static ChildClassesMatch newMutableMatch(final TClass pParentClass, final TClass pChildClass) {
    return new Mutable(pParentClass, pChildClass);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pChildClass the fixed value of pattern parameter childClass, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static ChildClassesMatch newMatch(final TClass pParentClass, final TClass pChildClass) {
    return new Immutable(pParentClass, pChildClass);
  }
  
  private static final class Mutable extends ChildClassesMatch {
    Mutable(final TClass pParentClass, final TClass pChildClass) {
      super(pParentClass, pChildClass);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends ChildClassesMatch {
    Immutable(final TClass pParentClass, final TClass pChildClass) {
      super(pParentClass, pChildClass);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
