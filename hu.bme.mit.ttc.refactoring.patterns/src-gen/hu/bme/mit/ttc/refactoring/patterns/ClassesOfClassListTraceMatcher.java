package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.ClassesOfClassListTraceMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassesOfClassListTraceQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.classesOfClassListTrace pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ClassesOfClassListTraceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern classesOfClassListTrace(concatSignature, tClass : TClass) {
 * 	ClassListTrace.concatSignature(classListTrace, concatSignature);
 * 	ClassListTrace.tClasses(classListTrace, tClass);
 * }
 * </pre></code>
 * 
 * @see ClassesOfClassListTraceMatch
 * @see ClassesOfClassListTraceProcessor
 * @see ClassesOfClassListTraceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ClassesOfClassListTraceMatcher extends BaseMatcher<ClassesOfClassListTraceMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ClassesOfClassListTraceMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ClassesOfClassListTraceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ClassesOfClassListTraceMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CONCATSIGNATURE = 0;
  
  private final static int POSITION_TCLASS = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ClassesOfClassListTraceMatcher.class);
  
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
  public ClassesOfClassListTraceMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ClassesOfClassListTraceMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @return matches represented as a ClassesOfClassListTraceMatch object.
   * 
   */
  public Collection<ClassesOfClassListTraceMatch> getAllMatches(final String pConcatSignature, final TClass pTClass) {
    return rawGetAllMatches(new Object[]{pConcatSignature, pTClass});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @return a match represented as a ClassesOfClassListTraceMatch object, or null if no match is found.
   * 
   */
  public ClassesOfClassListTraceMatch getOneArbitraryMatch(final String pConcatSignature, final TClass pTClass) {
    return rawGetOneArbitraryMatch(new Object[]{pConcatSignature, pTClass});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final String pConcatSignature, final TClass pTClass) {
    return rawHasMatch(new Object[]{pConcatSignature, pTClass});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final String pConcatSignature, final TClass pTClass) {
    return rawCountMatches(new Object[]{pConcatSignature, pTClass});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final String pConcatSignature, final TClass pTClass, final IMatchProcessor<? super ClassesOfClassListTraceMatch> processor) {
    rawForEachMatch(new Object[]{pConcatSignature, pTClass}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final String pConcatSignature, final TClass pTClass, final IMatchProcessor<? super ClassesOfClassListTraceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pConcatSignature, pTClass}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pConcatSignature the fixed value of pattern parameter concatSignature, or null if not bound.
   * @param pTClass the fixed value of pattern parameter tClass, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ClassesOfClassListTraceMatch newMatch(final String pConcatSignature, final TClass pTClass) {
    return ClassesOfClassListTraceMatch.newMatch(pConcatSignature, pTClass);
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
  public Set<String> getAllValuesOfconcatSignature(final ClassesOfClassListTraceMatch partialMatch) {
    return rawAccumulateAllValuesOfconcatSignature(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for concatSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfconcatSignature(final TClass pTClass) {
    return rawAccumulateAllValuesOfconcatSignature(new Object[]{
    null, 
    pTClass
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for tClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TClass> rawAccumulateAllValuesOftClass(final Object[] parameters) {
    Set<TClass> results = new HashSet<TClass>();
    rawAccumulateAllValues(POSITION_TCLASS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for tClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOftClass() {
    return rawAccumulateAllValuesOftClass(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for tClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOftClass(final ClassesOfClassListTraceMatch partialMatch) {
    return rawAccumulateAllValuesOftClass(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for tClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOftClass(final String pConcatSignature) {
    return rawAccumulateAllValuesOftClass(new Object[]{
    pConcatSignature, 
    null
    });
  }
  
  @Override
  protected ClassesOfClassListTraceMatch tupleToMatch(final Tuple t) {
    try {
    	return ClassesOfClassListTraceMatch.newMatch((java.lang.String) t.get(POSITION_CONCATSIGNATURE), (TypeGraphBasic.TClass) t.get(POSITION_TCLASS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ClassesOfClassListTraceMatch arrayToMatch(final Object[] match) {
    try {
    	return ClassesOfClassListTraceMatch.newMatch((java.lang.String) match[POSITION_CONCATSIGNATURE], (TypeGraphBasic.TClass) match[POSITION_TCLASS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ClassesOfClassListTraceMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ClassesOfClassListTraceMatch.newMutableMatch((java.lang.String) match[POSITION_CONCATSIGNATURE], (TypeGraphBasic.TClass) match[POSITION_TCLASS]);
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
  public static IQuerySpecification<ClassesOfClassListTraceMatcher> querySpecification() throws IncQueryException {
    return ClassesOfClassListTraceQuerySpecification.instance();
  }
}
