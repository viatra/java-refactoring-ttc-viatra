package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.PossibleCSCMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.PossibleCSCQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.possibleCSC pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PossibleCSCMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * Main decision pattern. If the preconditions are statisfied (the
 *   targetClass should not exist), the pattern returns its parameters, if:
 *    - every child class has the same parent
 *  
 * pattern possibleCSC(concatSignature, methodSignature : TMethodSignature) {
 * 	ClassListTrace.concatSignature(classListTrace, concatSignature);
 * 	ClassListTrace.tClasses.signature(classListTrace, methodSignature);
 * 	
 * 	neg find childClassesWithDifferentParents(classListTrace, _, _);
 * 	
 * 	
 * 	  patterns for Extension 2. -- extract superclass
 * 	  additional parameter: targetTClass : TClass) {
 * 	  
 * 	//	neg find childClassesWithoutGivenMethodSignature(classListTrace, methodSignature, _);
 * 	//	neg find listedClassMethodDefinitionsAccessingListSiblingMembers(classListTrace, methodSignature);
 * 	
 * 	//	TClass(targetTClass); // the targetClass has to be bound from outside
 * 	//	neg find classWithName(targetTClass, _); // no existing target class
 * }
 * </pre></code>
 * 
 * @see PossibleCSCMatch
 * @see PossibleCSCProcessor
 * @see PossibleCSCQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PossibleCSCMatcher extends BaseMatcher<PossibleCSCMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PossibleCSCMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PossibleCSCMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PossibleCSCMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CONCATSIGNATURE = 0;
  
  private final static int POSITION_METHODSIGNATURE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PossibleCSCMatcher.class);
  
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
  public PossibleCSCMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public PossibleCSCMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return matches represented as a PossibleCSCMatch object.
   * 
   */
  public Collection<PossibleCSCMatch> getAllMatches(final String pConcatSignature, final TMethodSignature pMethodSignature) {
    return rawGetAllMatches(new Object[]{pConcatSignature, pMethodSignature});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return a match represented as a PossibleCSCMatch object, or null if no match is found.
   * 
   */
  public PossibleCSCMatch getOneArbitraryMatch(final String pConcatSignature, final TMethodSignature pMethodSignature) {
    return rawGetOneArbitraryMatch(new Object[]{pConcatSignature, pMethodSignature});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pConcatSignature, final TMethodSignature pMethodSignature) {
    return rawHasMatch(new Object[]{pConcatSignature, pMethodSignature});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pConcatSignature, final TMethodSignature pMethodSignature) {
    return rawCountMatches(new Object[]{pConcatSignature, pMethodSignature});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pConcatSignature, final TMethodSignature pMethodSignature, final IMatchProcessor<? super PossibleCSCMatch> processor) {
    rawForEachMatch(new Object[]{pConcatSignature, pMethodSignature}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pConcatSignature, final TMethodSignature pMethodSignature, final IMatchProcessor<? super PossibleCSCMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pConcatSignature, pMethodSignature}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PossibleCSCMatch newMatch(final String pConcatSignature, final TMethodSignature pMethodSignature) {
    return PossibleCSCMatch.newMatch(pConcatSignature, pMethodSignature);
  }
  
  /**
   * Retrieve the set of values that occur in matches for concatSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfconcatSignature(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_CONCATSIGNATURE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for concatSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfconcatSignature() {
    return rawAccumulateAllValuesOfconcatSignature(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for concatSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfconcatSignature(final PossibleCSCMatch partialMatch) {
    return rawAccumulateAllValuesOfconcatSignature(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for concatSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfconcatSignature(final TMethodSignature pMethodSignature) {
    return rawAccumulateAllValuesOfconcatSignature(new Object[]{
    null, 
    pMethodSignature
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TMethodSignature> rawAccumulateAllValuesOfmethodSignature(final Object[] parameters) {
    Set<TMethodSignature> results = new HashSet<TMethodSignature>();
    rawAccumulateAllValues(POSITION_METHODSIGNATURE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TMethodSignature> getAllValuesOfmethodSignature() {
    return rawAccumulateAllValuesOfmethodSignature(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TMethodSignature> getAllValuesOfmethodSignature(final PossibleCSCMatch partialMatch) {
    return rawAccumulateAllValuesOfmethodSignature(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TMethodSignature> getAllValuesOfmethodSignature(final String pConcatSignature) {
    return rawAccumulateAllValuesOfmethodSignature(new Object[]{
    pConcatSignature, 
    null
    });
  }
  
  @Override
  protected PossibleCSCMatch tupleToMatch(final Tuple t) {
    try {
    	return PossibleCSCMatch.newMatch((java.lang.String) t.get(POSITION_CONCATSIGNATURE), (TypeGraphBasic.TMethodSignature) t.get(POSITION_METHODSIGNATURE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PossibleCSCMatch arrayToMatch(final Object[] match) {
    try {
    	return PossibleCSCMatch.newMatch((java.lang.String) match[POSITION_CONCATSIGNATURE], (TypeGraphBasic.TMethodSignature) match[POSITION_METHODSIGNATURE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PossibleCSCMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return PossibleCSCMatch.newMutableMatch((java.lang.String) match[POSITION_CONCATSIGNATURE], (TypeGraphBasic.TMethodSignature) match[POSITION_METHODSIGNATURE]);
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
  public static IQuerySpecification<PossibleCSCMatcher> querySpecification() throws IncQueryException {
    return PossibleCSCQuerySpecification.instance();
  }
}
