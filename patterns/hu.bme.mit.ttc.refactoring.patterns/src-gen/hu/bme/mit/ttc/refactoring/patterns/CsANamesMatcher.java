package hu.bme.mit.ttc.refactoring.patterns;

import hu.bme.mit.ttc.refactoring.patterns.CsANamesMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.CsANamesQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.csANames pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CsANamesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // Create Superclass refactoring, case (a)
 * 
 * pattern csANames(child1Name, childNName) {
 * 	TClass.tName(child1, child1Name);
 * 	TClass.tName(childN, childNName);
 * 	find csA(child1, childN);
 * }
 * </pre></code>
 * 
 * @see CsANamesMatch
 * @see CsANamesProcessor
 * @see CsANamesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CsANamesMatcher extends BaseMatcher<CsANamesMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CsANamesMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CsANamesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CsANamesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CHILD1NAME = 0;
  
  private final static int POSITION_CHILDNNAME = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CsANamesMatcher.class);
  
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
  public CsANamesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CsANamesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pChild1Name the fixed value of pattern parameter child1Name, or null if not bound.
   * @param pChildNName the fixed value of pattern parameter childNName, or null if not bound.
   * @return matches represented as a CsANamesMatch object.
   * 
   */
  public Collection<CsANamesMatch> getAllMatches(final String pChild1Name, final String pChildNName) {
    return rawGetAllMatches(new Object[]{pChild1Name, pChildNName});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pChild1Name the fixed value of pattern parameter child1Name, or null if not bound.
   * @param pChildNName the fixed value of pattern parameter childNName, or null if not bound.
   * @return a match represented as a CsANamesMatch object, or null if no match is found.
   * 
   */
  public CsANamesMatch getOneArbitraryMatch(final String pChild1Name, final String pChildNName) {
    return rawGetOneArbitraryMatch(new Object[]{pChild1Name, pChildNName});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pChild1Name the fixed value of pattern parameter child1Name, or null if not bound.
   * @param pChildNName the fixed value of pattern parameter childNName, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pChild1Name, final String pChildNName) {
    return rawHasMatch(new Object[]{pChild1Name, pChildNName});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pChild1Name the fixed value of pattern parameter child1Name, or null if not bound.
   * @param pChildNName the fixed value of pattern parameter childNName, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pChild1Name, final String pChildNName) {
    return rawCountMatches(new Object[]{pChild1Name, pChildNName});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pChild1Name the fixed value of pattern parameter child1Name, or null if not bound.
   * @param pChildNName the fixed value of pattern parameter childNName, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pChild1Name, final String pChildNName, final IMatchProcessor<? super CsANamesMatch> processor) {
    rawForEachMatch(new Object[]{pChild1Name, pChildNName}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pChild1Name the fixed value of pattern parameter child1Name, or null if not bound.
   * @param pChildNName the fixed value of pattern parameter childNName, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pChild1Name, final String pChildNName, final IMatchProcessor<? super CsANamesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pChild1Name, pChildNName}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pChild1Name the fixed value of pattern parameter child1Name, or null if not bound.
   * @param pChildNName the fixed value of pattern parameter childNName, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CsANamesMatch newMatch(final String pChild1Name, final String pChildNName) {
    return CsANamesMatch.newMatch(pChild1Name, pChildNName);
  }
  
  /**
   * Retrieve the set of values that occur in matches for child1Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfchild1Name(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_CHILD1NAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for child1Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfchild1Name() {
    return rawAccumulateAllValuesOfchild1Name(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for child1Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfchild1Name(final CsANamesMatch partialMatch) {
    return rawAccumulateAllValuesOfchild1Name(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for child1Name.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfchild1Name(final String pChildNName) {
    return rawAccumulateAllValuesOfchild1Name(new Object[]{
    null, 
    pChildNName
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for childNName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfchildNName(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_CHILDNNAME, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for childNName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfchildNName() {
    return rawAccumulateAllValuesOfchildNName(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for childNName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfchildNName(final CsANamesMatch partialMatch) {
    return rawAccumulateAllValuesOfchildNName(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for childNName.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfchildNName(final String pChild1Name) {
    return rawAccumulateAllValuesOfchildNName(new Object[]{
    pChild1Name, 
    null
    });
  }
  
  @Override
  protected CsANamesMatch tupleToMatch(final Tuple t) {
    try {
    	return CsANamesMatch.newMatch((java.lang.String) t.get(POSITION_CHILD1NAME), (java.lang.String) t.get(POSITION_CHILDNNAME));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CsANamesMatch arrayToMatch(final Object[] match) {
    try {
    	return CsANamesMatch.newMatch((java.lang.String) match[POSITION_CHILD1NAME], (java.lang.String) match[POSITION_CHILDNNAME]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CsANamesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CsANamesMatch.newMutableMatch((java.lang.String) match[POSITION_CHILD1NAME], (java.lang.String) match[POSITION_CHILDNNAME]);
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
  public static IQuerySpecification<CsANamesMatcher> querySpecification() throws IncQueryException {
    return CsANamesQuerySpecification.instance();
  }
}
