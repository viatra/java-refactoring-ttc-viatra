package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphBasic.TMethodDefinition;
import TypeGraphBasic.TMethodSignature;
import hu.bme.mit.ttc.refactoring.patterns.MethodDefinitionInClassListMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodDefinitionInClassListQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.methodDefinitionInClassList pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MethodDefinitionInClassListMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // pattern for PG refactor
 * pattern methodDefinitionInClassList(parentClass : TClass, methodSignature : TMethodSignature, clazz : TClass, methodDefinition : TMethodDefinition) {
 * 	TClass.childClasses(parentClass, clazz);
 * 	TMethodSignature.definitions(methodSignature, methodDefinition);
 * 	TClass.defines(clazz, methodDefinition);
 * }
 * </pre></code>
 * 
 * @see MethodDefinitionInClassListMatch
 * @see MethodDefinitionInClassListProcessor
 * @see MethodDefinitionInClassListQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MethodDefinitionInClassListMatcher extends BaseMatcher<MethodDefinitionInClassListMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MethodDefinitionInClassListMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MethodDefinitionInClassListMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MethodDefinitionInClassListMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PARENTCLASS = 0;
  
  private final static int POSITION_METHODSIGNATURE = 1;
  
  private final static int POSITION_CLAZZ = 2;
  
  private final static int POSITION_METHODDEFINITION = 3;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MethodDefinitionInClassListMatcher.class);
  
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
  public MethodDefinitionInClassListMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MethodDefinitionInClassListMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @return matches represented as a MethodDefinitionInClassListMatch object.
   * 
   */
  public Collection<MethodDefinitionInClassListMatch> getAllMatches(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
    return rawGetAllMatches(new Object[]{pParentClass, pMethodSignature, pClazz, pMethodDefinition});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @return a match represented as a MethodDefinitionInClassListMatch object, or null if no match is found.
   * 
   */
  public MethodDefinitionInClassListMatch getOneArbitraryMatch(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
    return rawGetOneArbitraryMatch(new Object[]{pParentClass, pMethodSignature, pClazz, pMethodDefinition});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
    return rawHasMatch(new Object[]{pParentClass, pMethodSignature, pClazz, pMethodDefinition});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
    return rawCountMatches(new Object[]{pParentClass, pMethodSignature, pClazz, pMethodDefinition});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition, final IMatchProcessor<? super MethodDefinitionInClassListMatch> processor) {
    rawForEachMatch(new Object[]{pParentClass, pMethodSignature, pClazz, pMethodDefinition}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition, final IMatchProcessor<? super MethodDefinitionInClassListMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pParentClass, pMethodSignature, pClazz, pMethodDefinition}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param pClazz the fixed value of pattern parameter clazz, or null if not bound.
   * @param pMethodDefinition the fixed value of pattern parameter methodDefinition, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MethodDefinitionInClassListMatch newMatch(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
    return MethodDefinitionInClassListMatch.newMatch(pParentClass, pMethodSignature, pClazz, pMethodDefinition);
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
  public Set<TClass> getAllValuesOfparentClass(final MethodDefinitionInClassListMatch partialMatch) {
    return rawAccumulateAllValuesOfparentClass(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for parentClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfparentClass(final TMethodSignature pMethodSignature, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
    return rawAccumulateAllValuesOfparentClass(new Object[]{
    null, 
    pMethodSignature, 
    pClazz, 
    pMethodDefinition
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
  public Set<TMethodSignature> getAllValuesOfmethodSignature(final MethodDefinitionInClassListMatch partialMatch) {
    return rawAccumulateAllValuesOfmethodSignature(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TMethodSignature> getAllValuesOfmethodSignature(final TClass pParentClass, final TClass pClazz, final TMethodDefinition pMethodDefinition) {
    return rawAccumulateAllValuesOfmethodSignature(new Object[]{
    pParentClass, 
    null, 
    pClazz, 
    pMethodDefinition
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
  public Set<TClass> getAllValuesOfclazz(final MethodDefinitionInClassListMatch partialMatch) {
    return rawAccumulateAllValuesOfclazz(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for clazz.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclazz(final TClass pParentClass, final TMethodSignature pMethodSignature, final TMethodDefinition pMethodDefinition) {
    return rawAccumulateAllValuesOfclazz(new Object[]{
    pParentClass, 
    pMethodSignature, 
    null, 
    pMethodDefinition
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodDefinition.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TMethodDefinition> rawAccumulateAllValuesOfmethodDefinition(final Object[] parameters) {
    Set<TMethodDefinition> results = new HashSet<TMethodDefinition>();
    rawAccumulateAllValues(POSITION_METHODDEFINITION, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodDefinition.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TMethodDefinition> getAllValuesOfmethodDefinition() {
    return rawAccumulateAllValuesOfmethodDefinition(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodDefinition.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TMethodDefinition> getAllValuesOfmethodDefinition(final MethodDefinitionInClassListMatch partialMatch) {
    return rawAccumulateAllValuesOfmethodDefinition(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodDefinition.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TMethodDefinition> getAllValuesOfmethodDefinition(final TClass pParentClass, final TMethodSignature pMethodSignature, final TClass pClazz) {
    return rawAccumulateAllValuesOfmethodDefinition(new Object[]{
    pParentClass, 
    pMethodSignature, 
    pClazz, 
    null
    });
  }
  
  @Override
  protected MethodDefinitionInClassListMatch tupleToMatch(final Tuple t) {
    try {
    	return MethodDefinitionInClassListMatch.newMatch((TypeGraphBasic.TClass) t.get(POSITION_PARENTCLASS), (TypeGraphBasic.TMethodSignature) t.get(POSITION_METHODSIGNATURE), (TypeGraphBasic.TClass) t.get(POSITION_CLAZZ), (TypeGraphBasic.TMethodDefinition) t.get(POSITION_METHODDEFINITION));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MethodDefinitionInClassListMatch arrayToMatch(final Object[] match) {
    try {
    	return MethodDefinitionInClassListMatch.newMatch((TypeGraphBasic.TClass) match[POSITION_PARENTCLASS], (TypeGraphBasic.TMethodSignature) match[POSITION_METHODSIGNATURE], (TypeGraphBasic.TClass) match[POSITION_CLAZZ], (TypeGraphBasic.TMethodDefinition) match[POSITION_METHODDEFINITION]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MethodDefinitionInClassListMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MethodDefinitionInClassListMatch.newMutableMatch((TypeGraphBasic.TClass) match[POSITION_PARENTCLASS], (TypeGraphBasic.TMethodSignature) match[POSITION_METHODSIGNATURE], (TypeGraphBasic.TClass) match[POSITION_CLAZZ], (TypeGraphBasic.TMethodDefinition) match[POSITION_METHODDEFINITION]);
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
  public static IQuerySpecification<MethodDefinitionInClassListMatcher> querySpecification() throws IncQueryException {
    return MethodDefinitionInClassListQuerySpecification.instance();
  }
}
