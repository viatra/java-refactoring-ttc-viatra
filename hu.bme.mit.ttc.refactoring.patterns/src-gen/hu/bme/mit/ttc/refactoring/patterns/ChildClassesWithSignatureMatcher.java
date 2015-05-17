package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesWithSignatureMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesWithSignatureQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.childClassesWithSignature pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ChildClassesWithSignatureMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern childClassesWithSignature(parentClass : TClass, clazz : TClass, methodSignature : TMethodSignature) {
 * 	TClass(parentClass);
 * 	TClass.childClasses(parentClass, clazz);
 * 	
 * 	find classWithSignature(clazz, methodSignature);
 * }
 * </pre></code>
 * 
 * @see ChildClassesWithSignatureMatch
 * @see ChildClassesWithSignatureProcessor
 * @see ChildClassesWithSignatureQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ChildClassesWithSignatureMatcher extends BaseMatcher<ChildClassesWithSignatureMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ChildClassesWithSignatureMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ChildClassesWithSignatureMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ChildClassesWithSignatureMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PARENTCLASS = 0;
  
  private final static int POSITION_CLAZZ = 1;
  
  private final static int POSITION_METHODSIGNATURE = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ChildClassesWithSignatureMatcher.class);
  
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
  public ChildClassesWithSignatureMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ChildClassesWithSignatureMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return matches represented as a ChildClassesWithSignatureMatch object.
   * 
   */
  public Collection<ChildClassesWithSignatureMatch> getAllMatches(final TClass pParentClass, final TClass pClazz, final TMethodSignature pMethodSignature) {
    return rawGetAllMatches(new Object[]{pParentClass, pClazz, pMethodSignature});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return a match represented as a ChildClassesWithSignatureMatch object, or null if no match is found.
   * 
   */
  public ChildClassesWithSignatureMatch getOneArbitraryMatch(final TClass pParentClass, final TClass pClazz, final TMethodSignature pMethodSignature) {
    return rawGetOneArbitraryMatch(new Object[]{pParentClass, pClazz, pMethodSignature});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TClass pParentClass, final TClass pClazz, final TMethodSignature pMethodSignature) {
    return rawHasMatch(new Object[]{pParentClass, pClazz, pMethodSignature});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TClass pParentClass, final TClass pClazz, final TMethodSignature pMethodSignature) {
    return rawCountMatches(new Object[]{pParentClass, pClazz, pMethodSignature});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TClass pParentClass, final TClass pClazz, final TMethodSignature pMethodSignature, final IMatchProcessor<? super ChildClassesWithSignatureMatch> processor) {
    rawForEachMatch(new Object[]{pParentClass, pClazz, pMethodSignature}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TClass pParentClass, final TClass pClazz, final TMethodSignature pMethodSignature, final IMatchProcessor<? super ChildClassesWithSignatureMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pParentClass, pClazz, pMethodSignature}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ChildClassesWithSignatureMatch newMatch(final TClass pParentClass, final TClass pClazz, final TMethodSignature pMethodSignature) {
    return ChildClassesWithSignatureMatch.newMatch(pParentClass, pClazz, pMethodSignature);
  }
  
  /**
   * Retrieve the set of values that occur in matches for parentClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TClass> rawAccumulateAllValuesOfparentClass(final Object[] parameters) {
    Set<TClass> results = new HashSet<TClass>();
    rawAccumulateAllValues(POSITION_PARENTCLASS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for parentClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfparentClass() {
    return rawAccumulateAllValuesOfparentClass(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for parentClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfparentClass(final ChildClassesWithSignatureMatch partialMatch) {
    return rawAccumulateAllValuesOfparentClass(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for parentClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfparentClass(final TClass pClazz, final TMethodSignature pMethodSignature) {
    return rawAccumulateAllValuesOfparentClass(new Object[]{
    null, 
    pClazz, 
    pMethodSignature
    });
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
  public Set<TClass> getAllValuesOfclazz(final ChildClassesWithSignatureMatch partialMatch) {
    return rawAccumulateAllValuesOfclazz(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for clazz.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclazz(final TClass pParentClass, final TMethodSignature pMethodSignature) {
    return rawAccumulateAllValuesOfclazz(new Object[]{
    pParentClass, 
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
  public Set<TMethodSignature> getAllValuesOfmethodSignature(final ChildClassesWithSignatureMatch partialMatch) {
    return rawAccumulateAllValuesOfmethodSignature(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TMethodSignature> getAllValuesOfmethodSignature(final TClass pParentClass, final TClass pClazz) {
    return rawAccumulateAllValuesOfmethodSignature(new Object[]{
    pParentClass, 
    pClazz, 
    null
    });
  }
  
  @Override
  protected ChildClassesWithSignatureMatch tupleToMatch(final Tuple t) {
    try {
    	return ChildClassesWithSignatureMatch.newMatch((TypeGraphBasic.TClass) t.get(POSITION_PARENTCLASS), (TypeGraphBasic.TClass) t.get(POSITION_CLAZZ), (TypeGraphBasic.TMethodSignature) t.get(POSITION_METHODSIGNATURE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ChildClassesWithSignatureMatch arrayToMatch(final Object[] match) {
    try {
    	return ChildClassesWithSignatureMatch.newMatch((TypeGraphBasic.TClass) match[POSITION_PARENTCLASS], (TypeGraphBasic.TClass) match[POSITION_CLAZZ], (TypeGraphBasic.TMethodSignature) match[POSITION_METHODSIGNATURE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ChildClassesWithSignatureMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ChildClassesWithSignatureMatch.newMutableMatch((TypeGraphBasic.TClass) match[POSITION_PARENTCLASS], (TypeGraphBasic.TClass) match[POSITION_CLAZZ], (TypeGraphBasic.TMethodSignature) match[POSITION_METHODSIGNATURE]);
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
  public static IQuerySpecification<ChildClassesWithSignatureMatcher> querySpecification() throws IncQueryException {
    return ChildClassesWithSignatureQuerySpecification.instance();
  }
}
