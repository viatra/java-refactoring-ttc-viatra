package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TPackage;
import hu.bme.mit.ttc.refactoring.patterns.util.PackageWithNameQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.ttc.refactoring.patterns.packageWithName pattern,
 * to be used in conjunction with {@link PackageWithNameMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PackageWithNameMatcher
 * @see PackageWithNameProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class PackageWithNameMatch extends BasePatternMatch {
  private TPackage fTPackage;
  
  private String fPackageName;
  
  private static List<String> parameterNames = makeImmutableList("tPackage", "packageName");
  
  private PackageWithNameMatch(final TPackage pTPackage, final String pPackageName) {
    this.fTPackage = pTPackage;
    this.fPackageName = pPackageName;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("tPackage".equals(parameterName)) return this.fTPackage;
    if ("packageName".equals(parameterName)) return this.fPackageName;
    return null;
  }
  
  public TPackage getTPackage() {
    return this.fTPackage;
  }
  
  public String getPackageName() {
    return this.fPackageName;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("tPackage".equals(parameterName) ) {
    	this.fTPackage = (TypeGraphBasic.TPackage) newValue;
    	return true;
    }
    if ("packageName".equals(parameterName) ) {
    	this.fPackageName = (java.lang.String) newValue;
    	return true;
    }
    return false;
  }
  
  public void setTPackage(final TPackage pTPackage) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fTPackage = pTPackage;
  }
  
  public void setPackageName(final String pPackageName) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPackageName = pPackageName;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.ttc.refactoring.patterns.packageWithName";
  }
  
  @Override
  public List<String> parameterNames() {
    return PackageWithNameMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fTPackage, fPackageName};
  }
  
  @Override
  public PackageWithNameMatch toImmutable() {
    return isMutable() ? newMatch(fTPackage, fPackageName) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"tPackage\"=" + prettyPrintValue(fTPackage) + ", ");
    
    result.append("\"packageName\"=" + prettyPrintValue(fPackageName)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fTPackage == null) ? 0 : fTPackage.hashCode());
    result = prime * result + ((fPackageName == null) ? 0 : fPackageName.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PackageWithNameMatch)) { // this should be infrequent
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
    PackageWithNameMatch other = (PackageWithNameMatch) obj;
    if (fTPackage == null) {if (other.fTPackage != null) return false;}
    else if (!fTPackage.equals(other.fTPackage)) return false;
    if (fPackageName == null) {if (other.fPackageName != null) return false;}
    else if (!fPackageName.equals(other.fPackageName)) return false;
    return true;
  }
  
  @Override
  public PackageWithNameQuerySpecification specification() {
    try {
    	return PackageWithNameQuerySpecification.instance();
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
  public static PackageWithNameMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pTPackage the fixed value of pattern parameter tPackage, or null if not bound.
   * @param pPackageName the fixed value of pattern parameter packageName, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PackageWithNameMatch newMutableMatch(final TPackage pTPackage, final String pPackageName) {
    return new Mutable(pTPackage, pPackageName);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTPackage the fixed value of pattern parameter tPackage, or null if not bound.
   * @param pPackageName the fixed value of pattern parameter packageName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static PackageWithNameMatch newMatch(final TPackage pTPackage, final String pPackageName) {
    return new Immutable(pTPackage, pPackageName);
  }
  
  private static final class Mutable extends PackageWithNameMatch {
    Mutable(final TPackage pTPackage, final String pPackageName) {
      super(pTPackage, pPackageName);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PackageWithNameMatch {
    Immutable(final TPackage pTPackage, final String pPackageName) {
      super(pTPackage, pPackageName);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
