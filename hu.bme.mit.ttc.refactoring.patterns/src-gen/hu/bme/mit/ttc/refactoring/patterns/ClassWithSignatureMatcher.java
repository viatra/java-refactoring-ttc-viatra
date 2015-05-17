package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.ClassWithSignatureMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassWithSignatureQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.classWithSignature pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ClassWithSignatureMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern classWithSignature(clazz : TClass, methodSignature : TMethodSignature) {
 * 	TClass(clazz);
 * 	TMethodSignature(methodSignature);
 * 	TMethodSignature.definitions(methodSignature, methodDefinition);
 * 	TClass.defines(clazz, methodDefinition);
 * }
 * </pre></code>
 * 
 * @see ClassWithSignatureMatch
 * @see ClassWithSignatureProcessor
 * @see ClassWithSignatureQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ClassWithSignatureMatcher extends BaseMatcher<ClassWithSignatureMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ClassWithSignatureMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ClassWithSignatureMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ClassWithSignatureMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CLAZZ = 0;
  
  private final static int POSITION_METHODSIGNATURE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ClassWithSignatureMatcher.class);
  
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
  public ClassWithSignatureMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ClassWithSignatureMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return matches represented as a ClassWithSignatureMatch object.
   * 
   */
  public Collection<ClassWithSignatureMatch> getAllMatches(final TClass pClazz, final TMethodSignature pMethodSignature) {
    return rawGetAllMatches(new Object[]{pClazz, pMethodSignature});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return a match represented as a ClassWithSignatureMatch object, or null if no match is found.
   * 
   */
  public ClassWithSignatureMatch getOneArbitraryMatch(final TClass pClazz, final TMethodSignature pMethodSignature) {
    return rawGetOneArbitraryMatch(new Object[]{pClazz, pMethodSignature});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TClass pClazz, final TMethodSignature pMethodSignature) {
    return rawHasMatch(new Object[]{pClazz, pMethodSignature});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TClass pClazz, final TMethodSignature pMethodSignature) {
    return rawCountMatches(new Object[]{pClazz, pMethodSignature});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TClass pClazz, final TMethodSignature pMethodSignature, final IMatchProcessor<? super ClassWithSignatureMatch> processor) {
    rawForEachMatch(new Object[]{pClazz, pMethodSignature}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TClass pClazz, final TMethodSignature pMethodSignature, final IMatchProcessor<? super ClassWithSignatureMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pClazz, pMethodSignature}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ClassWithSignatureMatch newMatch(final TClass pClazz, final TMethodSignature pMethodSignature) {
    return ClassWithSignatureMatch.newMatch(pClazz, pMethodSignature);
  }
  
  /**
   * Retrieve the set of values that occur in matches for clazz.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TClass> rawAccumulateAllValuesOfclazz(final Object[] parameters) {
    Set<TClass> results = new HashSet<TClass>();
    rawAccumulateAllValues(POSITION_CLAZZ, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for clazz.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclazz() {
    return rawAccumulateAllValuesOfclazz(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for clazz.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclazz(final ClassWithSignatureMatch partialMatch) {
    return rawAccumulateAllValuesOfclazz(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for clazz.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclazz(final TMethodSignature pMethodSignature) {
    return rawAccumulateAllValuesOfclazz(new Object[]{
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
  public Set<TMethodSignature> getAllValuesOfmethodSignature(final ClassWithSignatureMatch partialMatch) {
    return rawAccumulateAllValuesOfmethodSignature(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TMethodSignature> getAllValuesOfmethodSignature(final TClass pClazz) {
    return rawAccumulateAllValuesOfmethodSignature(new Object[]{
    pClazz, 
    null
    });
  }
  
  @Override
  protected ClassWithSignatureMatch tupleToMatch(final Tuple t) {
    try {
    	return ClassWithSignatureMatch.newMatch((TypeGraphBasic.TClass) t.get(POSITION_CLAZZ), (TypeGraphBasic.TMethodSignature) t.get(POSITION_METHODSIGNATURE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ClassWithSignatureMatch arrayToMatch(final Object[] match) {
    try {
    	return ClassWithSignatureMatch.newMatch((TypeGraphBasic.TClass) match[POSITION_CLAZZ], (TypeGraphBasic.TMethodSignature) match[POSITION_METHODSIGNATURE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ClassWithSignatureMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ClassWithSignatureMatch.newMutableMatch((TypeGraphBasic.TClass) match[POSITION_CLAZZ], (TypeGraphBasic.TMethodSignature) match[POSITION_METHODSIGNATURE]);
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
  public static IQuerySpecification<ClassWithSignatureMatcher> querySpecification() throws IncQueryException {
    return ClassWithSignatureQuerySpecification.instance();
  }
}
