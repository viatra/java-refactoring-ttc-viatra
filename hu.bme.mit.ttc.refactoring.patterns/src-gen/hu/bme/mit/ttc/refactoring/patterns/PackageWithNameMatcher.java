package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TPackage;
import hu.bme.mit.ttc.refactoring.patterns.PackageWithNameMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.PackageWithNameQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.packageWithName pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PackageWithNameMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // pattern for PG refactor
 * pattern packageWithName(tPackage : TPackage, packageName) {
 * 	TPackage.tName(tPackage, packageName);
 * }
 * </pre></code>
 * 
 * @see PackageWithNameMatch
 * @see PackageWithNameProcessor
 * @see PackageWithNameQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PackageWithNameMatcher extends BaseMatcher<PackageWithNameMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PackageWithNameMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PackageWithNameMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PackageWithNameMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TPACKAGE = 0;
  
  private final static int POSITION_PACKAGENAME = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PackageWithNameMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public PackageWithNameMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public PackageWithNameMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTPackage the fixed value of pattern parameter tPackage, or null if not bound.
   * @param pPackageName the fixed value of pattern parameter packageName, or null if not bound.
   * @return matches represented as a PackageWithNameMatch object.
   * 
   */
  public Collection<PackageWithNameMatch> getAllMatches(final TPackage pTPackage, final String pPackageName) {
    return rawGetAllMatches(new Object[]{pTPackage, pPackageName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTPackage the fixed value of pattern parameter tPackage, or null if not bound.
   * @param pPackageName the fixed value of pattern parameter packageName, or null if not bound.
   * @return a match represented as a PackageWithNameMatch object, or null if no match is found.
   * 
   */
  public PackageWithNameMatch getOneArbitraryMatch(final TPackage pTPackage, final String pPackageName) {
    return rawGetOneArbitraryMatch(new Object[]{pTPackage, pPackageName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTPackage the fixed value of pattern parameter tPackage, or null if not bound.
   * @param pPackageName the fixed value of pattern parameter packageName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TPackage pTPackage, final String pPackageName) {
    return rawHasMatch(new Object[]{pTPackage, pPackageName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTPackage the fixed value of pattern parameter tPackage, or null if not bound.
   * @param pPackageName the fixed value of pattern parameter packageName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TPackage pTPackage, final String pPackageName) {
    return rawCountMatches(new Object[]{pTPackage, pPackageName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTPackage the fixed value of pattern parameter tPackage, or null if not bound.
   * @param pPackageName the fixed value of pattern parameter packageName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TPackage pTPackage, final String pPackageName, final IMatchProcessor<? super PackageWithNameMatch> processor) {
    rawForEachMatch(new Object[]{pTPackage, pPackageName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTPackage the fixed value of pattern parameter tPackage, or null if not bound.
   * @param pPackageName the fixed value of pattern parameter packageName, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TPackage pTPackage, final String pPackageName, final IMatchProcessor<? super PackageWithNameMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTPackage, pPackageName}, processor);
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
  public PackageWithNameMatch newMatch(final TPackage pTPackage, final String pPackageName) {
    return PackageWithNameMatch.newMatch(pTPackage, pPackageName);
  }
  
  /**
   * Retrieve the set of values that occur in matches for tPackage.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TPackage> rawAccumulateAllValuesOftPackage(final Object[] parameters) {
    Set<TPackage> results = new HashSet<TPackage>();
    rawAccumulateAllValues(POSITION_TPACKAGE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for tPackage.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TPackage> getAllValuesOftPackage() {
    return rawAccumulateAllValuesOftPackage(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for tPackage.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TPackage> getAllValuesOftPackage(final PackageWithNameMatch partialMatch) {
    return rawAccumulateAllValuesOftPackage(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for tPackage.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TPackage> getAllValuesOftPackage(final String pPackageName) {
    return rawAccumulateAllValuesOftPackage(new Object[]{
    null, 
    pPackageName
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for packageName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfpackageName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_PACKAGENAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for packageName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfpackageName() {
    return rawAccumulateAllValuesOfpackageName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for packageName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfpackageName(final PackageWithNameMatch partialMatch) {
    return rawAccumulateAllValuesOfpackageName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for packageName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfpackageName(final TPackage pTPackage) {
    return rawAccumulateAllValuesOfpackageName(new Object[]{
    pTPackage, 
    null
    });
  }
  
  @Override
  protected PackageWithNameMatch tupleToMatch(final Tuple t) {
    try {
    	return PackageWithNameMatch.newMatch((TypeGraphBasic.TPackage) t.get(POSITION_TPACKAGE), (java.lang.String) t.get(POSITION_PACKAGENAME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PackageWithNameMatch arrayToMatch(final Object[] match) {
    try {
    	return PackageWithNameMatch.newMatch((TypeGraphBasic.TPackage) match[POSITION_TPACKAGE], (java.lang.String) match[POSITION_PACKAGENAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PackageWithNameMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return PackageWithNameMatch.newMutableMatch((TypeGraphBasic.TPackage) match[POSITION_TPACKAGE], (java.lang.String) match[POSITION_PACKAGENAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PackageWithNameMatcher> querySpecification() throws IncQueryException {
    return PackageWithNameQuerySpecification.instance();
  }
}
