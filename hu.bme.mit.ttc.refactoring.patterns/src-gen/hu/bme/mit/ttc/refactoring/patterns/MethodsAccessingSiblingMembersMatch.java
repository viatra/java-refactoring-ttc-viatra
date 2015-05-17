package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TMethodDefinition;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodsAccessingSiblingMembersQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.methodsAccessingSiblingMembers pattern,
 * to be used in conjunction with {@link MethodsAccessingSiblingMembersMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see MethodsAccessingSiblingMembersMatcher
 * @see MethodsAccessingSiblingMembersProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class MethodsAccessingSiblingMembersMatch extends BasePatternMatch {
  private TMethodDefinition fMethodDefinition;
  
  private static List<String> parameterNames = makeImmutableList("methodDefinition");
  
  private MethodsAccessingSiblingMembersMatch(final TMethodDefinition pMethodDefinition) {
    this.fMethodDefinition = pMethodDefinition;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("methodDefinition".equals(parameterName)) return this.fMethodDefinition;
    return null;
  }
  
  public TMethodDefinition getMethodDefinition() {
    return this.fMethodDefinition;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("methodDefinition".equals(parameterName) ) {
    	this.fMethodDefinition = (TypeGraphBasic.TMethodDefinition) newValue;
    	return true;
    }
    return false;
  }
  
  public void setMethodDefinition(final TMethodDefinition pMethodDefinition) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fMethodDefinition = pMethodDefinition;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.methodsAccessingSiblingMembers";
  }
  
  @Override
  public List<String> parameterNames() {
    return MethodsAccessingSiblingMembersMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fMethodDefinition};
  }
  
  @Override
  public MethodsAccessingSiblingMembersMatch toImmutable() {
    return isMutable() ? newMatch(fMethodDefinition) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"methodDefinition\"=" + prettyPrintValue(fMethodDefinition)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fMethodDefinition == null) ? 0 : fMethodDefinition.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof MethodsAccessingSiblingMembersMatch)) { // this should be infrequent
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
    MethodsAccessingSiblingMembersMatch other = (MethodsAccessingSiblingMembersMatch) obj;
    if (fMethodDefinition == null) {if (other.fMethodDefinition != null) return false;}
    else if (!fMethodDefinition.equals(other.fMethodDefinition)) return false;
    return true;
  }
  
  @Override
  public MethodsAccessingSiblingMembersQuerySpecification specification() {
    try {
    	return MethodsAccessingSiblingMembersQuerySpecification.instance();
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
  public static MethodsAccessingSiblingMembersMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static MethodsAccessingSiblingMembersMatch newMutableMatch(final TMethodDefinition pMethodDefinition) {
    return new Mutable(pMethodDefinition);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static MethodsAccessingSiblingMembersMatch newMatch(final TMethodDefinition pMethodDefinition) {
    return new Immutable(pMethodDefinition);
  }
  
  private static final class Mutable extends MethodsAccessingSiblingMembersMatch {
    Mutable(final TMethodDefinition pMethodDefinition) {
      super(pMethodDefinition);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends MethodsAccessingSiblingMembersMatch {
    Immutable(final TMethodDefinition pMethodDefinition) {
      super(pMethodDefinition);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
