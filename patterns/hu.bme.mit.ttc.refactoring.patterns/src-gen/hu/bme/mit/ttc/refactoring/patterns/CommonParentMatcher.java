package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.CommonParentMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.CommonParentQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.commonParent pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link CommonParentMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // utility patterns
 * 
 * pattern commonParent(parent, child1, childN) {
 * 	TClass.parentClass(parent, child1);
 * 	TClass.parentClass(parent, childN);	
 * }
 * </pre></code>
 * 
 * @see CommonParentMatch
 * @see CommonParentProcessor
 * @see CommonParentQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class CommonParentMatcher extends BaseMatcher<CommonParentMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static CommonParentMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    CommonParentMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new CommonParentMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PARENT = 0;
  
  private final static int POSITION_CHILD1 = 1;
  
  private final static int POSITION_CHILDN = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(CommonParentMatcher.class);
  
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
  public CommonParentMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public CommonParentMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @return matches represented as a CommonParentMatch object.
   * 
   */
  public Collection<CommonParentMatch> getAllMatches(final TClass pParent, final TClass pChild1, final TClass pChildN) {
    return rawGetAllMatches(new Object[]{pParent, pChild1, pChildN});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @return a match represented as a CommonParentMatch object, or null if no match is found.
   * 
   */
  public CommonParentMatch getOneArbitraryMatch(final TClass pParent, final TClass pChild1, final TClass pChildN) {
    return rawGetOneArbitraryMatch(new Object[]{pParent, pChild1, pChildN});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TClass pParent, final TClass pChild1, final TClass pChildN) {
    return rawHasMatch(new Object[]{pParent, pChild1, pChildN});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TClass pParent, final TClass pChild1, final TClass pChildN) {
    return rawCountMatches(new Object[]{pParent, pChild1, pChildN});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TClass pParent, final TClass pChild1, final TClass pChildN, final IMatchProcessor<? super CommonParentMatch> processor) {
    rawForEachMatch(new Object[]{pParent, pChild1, pChildN}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TClass pParent, final TClass pChild1, final TClass pChildN, final IMatchProcessor<? super CommonParentMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pParent, pChild1, pChildN}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParent the fixed value of pattern parameter parent, or null if not bound.
   * @param pChild1 the fixed value of pattern parameter child1, or null if not bound.
   * @param pChildN the fixed value of pattern parameter childN, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public CommonParentMatch newMatch(final TClass pParent, final TClass pChild1, final TClass pChildN) {
    return CommonParentMatch.newMatch(pParent, pChild1, pChildN);
  }
  
  /**
   * Retrieve the set of values that occur in matches for parent.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TClass> rawAccumulateAllValuesOfparent(final Object[] parameters) {
    Set<TClass> results = new HashSet<TClass>();
    rawAccumulateAllValues(POSITION_PARENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for parent.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfparent() {
    return rawAccumulateAllValuesOfparent(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for parent.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfparent(final CommonParentMatch partialMatch) {
    return rawAccumulateAllValuesOfparent(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for parent.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfparent(final TClass pChild1, final TClass pChildN) {
    return rawAccumulateAllValuesOfparent(new Object[]{
    null, 
    pChild1, 
    pChildN
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for child1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TClass> rawAccumulateAllValuesOfchild1(final Object[] parameters) {
    Set<TClass> results = new HashSet<TClass>();
    rawAccumulateAllValues(POSITION_CHILD1, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for child1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfchild1() {
    return rawAccumulateAllValuesOfchild1(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for child1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfchild1(final CommonParentMatch partialMatch) {
    return rawAccumulateAllValuesOfchild1(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for child1.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfchild1(final TClass pParent, final TClass pChildN) {
    return rawAccumulateAllValuesOfchild1(new Object[]{
    pParent, 
    null, 
    pChildN
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for childN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TClass> rawAccumulateAllValuesOfchildN(final Object[] parameters) {
    Set<TClass> results = new HashSet<TClass>();
    rawAccumulateAllValues(POSITION_CHILDN, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for childN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfchildN() {
    return rawAccumulateAllValuesOfchildN(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for childN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfchildN(final CommonParentMatch partialMatch) {
    return rawAccumulateAllValuesOfchildN(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for childN.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfchildN(final TClass pParent, final TClass pChild1) {
    return rawAccumulateAllValuesOfchildN(new Object[]{
    pParent, 
    pChild1, 
    null
    });
  }
  
  @Override
  protected CommonParentMatch tupleToMatch(final Tuple t) {
    try {
    	return CommonParentMatch.newMatch((TypeGraphBasic.TClass) t.get(POSITION_PARENT), (TypeGraphBasic.TClass) t.get(POSITION_CHILD1), (TypeGraphBasic.TClass) t.get(POSITION_CHILDN));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CommonParentMatch arrayToMatch(final Object[] match) {
    try {
    	return CommonParentMatch.newMatch((TypeGraphBasic.TClass) match[POSITION_PARENT], (TypeGraphBasic.TClass) match[POSITION_CHILD1], (TypeGraphBasic.TClass) match[POSITION_CHILDN]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected CommonParentMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return CommonParentMatch.newMutableMatch((TypeGraphBasic.TClass) match[POSITION_PARENT], (TypeGraphBasic.TClass) match[POSITION_CHILD1], (TypeGraphBasic.TClass) match[POSITION_CHILDN]);
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
  public static IQuerySpecification<CommonParentMatcher> querySpecification() throws IncQueryException {
    return CommonParentQuerySpecification.instance();
  }
}
