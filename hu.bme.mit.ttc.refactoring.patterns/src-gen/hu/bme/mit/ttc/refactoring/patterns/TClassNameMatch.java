package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.util.TClassNameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.tClassName pattern,
 * to be used in conjunction with {@link TClassNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TClassNameMatcher
 * @see TClassNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TClassNameMatch extends BasePatternMatch {
  private TClass fTClass;
  
  private String fClassName;
  
  private static List<String> parameterNames = makeImmutableList("tClass", "className");
  
  private TClassNameMatch(final TClass pTClass, final String pClassName) {
    this.fTClass = pTClass;
    this.fClassName = pClassName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("tClass".equals(parameterName)) return this.fTClass;
    if ("className".equals(parameterName)) return this.fClassName;
    return null;
  }
  
  public TClass getTClass() {
    return this.fTClass;
  }
  
  public String getClassName() {
    return this.fClassName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("tClass".equals(parameterName) ) {
    	this.fTClass = (TypeGraphBasic.TClass) newValue;
    	return true;
    }
    if ("className".equals(parameterName) ) {
    	this.fClassName = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTClass(final TClass pTClass) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTClass = pTClass;
  }
  
  public void setClassName(final String pClassName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fClassName = pClassName;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.tClassName";
  }
  
  @Override
  public List<String> parameterNames() {
    return TClassNameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTClass, fClassName};
  }
  
  @Override
  public TClassNameMatch toImmutable() {
    return isMutable() ? newMatch(fTClass, fClassName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"tClass\"=" + prettyPrintValue(fTClass) + ", ");
    
    result.append("\"className\"=" + prettyPrintValue(fClassName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTClass == null) ? 0 : fTClass.hashCode());
    result = prime * result + ((fClassName == null) ? 0 : fClassName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TClassNameMatch)) { // this should be infrequent
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
    TClassNameMatch other = (TClassNameMatch) obj;
    if (fTClass == null) {if (other.fTClass != null) return false;}
    else if (!fTClass.equals(other.fTClass)) return false;
    if (fClassName == null) {if (other.fClassName != null) return false;}
    else if (!fClassName.equals(other.fClassName)) return false;
    return true;
  }
  
  @Override
  public TClassNameQuerySpecification specification() {
    try {
    	return TClassNameQuerySpecification.instance();
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
  public static TClassNameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @param pClassName the fixed value of pattern parameter className, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TClassNameMatch newMutableMatch(final TClass pTClass, final String pClassName) {
    return new Mutable(pTClass, pClassName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @param pClassName the fixed value of pattern parameter className, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TClassNameMatch newMatch(final TClass pTClass, final String pClassName) {
    return new Immutable(pTClass, pClassName);
  }
  
  private static final class Mutable extends TClassNameMatch {
    Mutable(final TClass pTClass, final String pClassName) {
      super(pTClass, pClassName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TClassNameMatch {
    Immutable(final TClass pTClass, final String pClassName) {
      super(pTClass, pClassName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
