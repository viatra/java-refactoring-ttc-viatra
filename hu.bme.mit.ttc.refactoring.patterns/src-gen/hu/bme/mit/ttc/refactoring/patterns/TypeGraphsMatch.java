package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TypeGraph;
import hu.bme.mit.ttc.refactoring.patterns.util.TypeGraphsQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.typeGraphs pattern,
 * to be used in conjunction with {@link TypeGraphsMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TypeGraphsMatcher
 * @see TypeGraphsProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TypeGraphsMatch extends BasePatternMatch {
  private TypeGraph fTypeGraph;
  
  private static List<String> parameterNames = makeImmutableList("typeGraph");
  
  private TypeGraphsMatch(final TypeGraph pTypeGraph) {
    this.fTypeGraph = pTypeGraph;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("typeGraph".equals(parameterName)) return this.fTypeGraph;
    return null;
  }
  
  public TypeGraph getTypeGraph() {
    return this.fTypeGraph;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("typeGraph".equals(parameterName) ) {
    	this.fTypeGraph = (TypeGraphBasic.TypeGraph) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTypeGraph(final TypeGraph pTypeGraph) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTypeGraph = pTypeGraph;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.typeGraphs";
  }
  
  @Override
  public List<String> parameterNames() {
    return TypeGraphsMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTypeGraph};
  }
  
  @Override
  public TypeGraphsMatch toImmutable() {
    return isMutable() ? newMatch(fTypeGraph) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"typeGraph\"=" + prettyPrintValue(fTypeGraph)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTypeGraph == null) ? 0 : fTypeGraph.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TypeGraphsMatch)) { // this should be infrequent
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
    TypeGraphsMatch other = (TypeGraphsMatch) obj;
    if (fTypeGraph == null) {if (other.fTypeGraph != null) return false;}
    else if (!fTypeGraph.equals(other.fTypeGraph)) return false;
    return true;
  }
  
  @Override
  public TypeGraphsQuerySpecification specification() {
    try {
    	return TypeGraphsQuerySpecification.instance();
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
  public static TypeGraphsMatch newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTypeGraph the fixed value of pattern parameter typeGraph, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TypeGraphsMatch newMutableMatch(final TypeGraph pTypeGraph) {
    return new Mutable(pTypeGraph);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTypeGraph the fixed value of pattern parameter typeGraph, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static TypeGraphsMatch newMatch(final TypeGraph pTypeGraph) {
    return new Immutable(pTypeGraph);
  }
  
  private static final class Mutable extends TypeGraphsMatch {
    Mutable(final TypeGraph pTypeGraph) {
      super(pTypeGraph);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TypeGraphsMatch {
    Immutable(final TypeGraph pTypeGraph) {
      super(pTypeGraph);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
