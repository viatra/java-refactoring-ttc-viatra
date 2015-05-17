package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import TypeGraphTrace.ClassListTrace;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesWithDifferentParentsMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesWithDifferentParentsQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.childClassesWithDifferentParents pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ChildClassesWithDifferentParentsMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern childClassesWithDifferentParents(classListTrace : ClassListTrace, classOne : TClass, classTwo : TClass){//, parentClassOne : TClass, parentClassTwo : TClass) {
 * 	ClassListTrace.tClasses(classListTrace, classOne);
 * 	ClassListTrace.tClasses(classListTrace, classTwo);
 * 	find differentParents(classOne, classTwo);
 * }
 * </pre></code>
 * 
 * @see ChildClassesWithDifferentParentsMatch
 * @see ChildClassesWithDifferentParentsProcessor
 * @see ChildClassesWithDifferentParentsQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ChildClassesWithDifferentParentsMatcher extends BaseMatcher<ChildClassesWithDifferentParentsMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ChildClassesWithDifferentParentsMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ChildClassesWithDifferentParentsMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ChildClassesWithDifferentParentsMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CLASSLISTTRACE = 0;
  
  private final static int POSITION_CLASSONE = 1;
  
  private final static int POSITION_CLASSTWO = 2;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ChildClassesWithDifferentParentsMatcher.class);
  
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
  public ChildClassesWithDifferentParentsMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ChildClassesWithDifferentParentsMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pClassListTrace the fixed value of pattern parameter classListTrace, or null if not bound.
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @return matches represented as a ChildClassesWithDifferentParentsMatch object.
   * 
   */
  public Collection<ChildClassesWithDifferentParentsMatch> getAllMatches(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo) {
    return rawGetAllMatches(new Object[]{pClassListTrace, pClassOne, pClassTwo});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pClassListTrace the fixed value of pattern parameter classListTrace, or null if not bound.
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @return a match represented as a ChildClassesWithDifferentParentsMatch object, or null if no match is found.
   * 
   */
  public ChildClassesWithDifferentParentsMatch getOneArbitraryMatch(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo) {
    return rawGetOneArbitraryMatch(new Object[]{pClassListTrace, pClassOne, pClassTwo});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pClassListTrace the fixed value of pattern parameter classListTrace, or null if not bound.
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo) {
    return rawHasMatch(new Object[]{pClassListTrace, pClassOne, pClassTwo});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pClassListTrace the fixed value of pattern parameter classListTrace, or null if not bound.
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo) {
    return rawCountMatches(new Object[]{pClassListTrace, pClassOne, pClassTwo});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pClassListTrace the fixed value of pattern parameter classListTrace, or null if not bound.
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo, final IMatchProcessor<? super ChildClassesWithDifferentParentsMatch> processor) {
    rawForEachMatch(new Object[]{pClassListTrace, pClassOne, pClassTwo}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pClassListTrace the fixed value of pattern parameter classListTrace, or null if not bound.
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo, final IMatchProcessor<? super ChildClassesWithDifferentParentsMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pClassListTrace, pClassOne, pClassTwo}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pClassListTrace the fixed value of pattern parameter classListTrace, or null if not bound.
   * @param pClassOne the fixed value of pattern parameter classOne, or null if not bound.
   * @param pClassTwo the fixed value of pattern parameter classTwo, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ChildClassesWithDifferentParentsMatch newMatch(final ClassListTrace pClassListTrace, final TClass pClassOne, final TClass pClassTwo) {
    return ChildClassesWithDifferentParentsMatch.newMatch(pClassListTrace, pClassOne, pClassTwo);
  }
  
  /**
   * Retrieve the set of values that occur in matches for classListTrace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<ClassListTrace> rawAccumulateAllValuesOfclassListTrace(final Object[] parameters) {
    Set<ClassListTrace> results = new HashSet<ClassListTrace>();
    rawAccumulateAllValues(POSITION_CLASSLISTTRACE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for classListTrace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ClassListTrace> getAllValuesOfclassListTrace() {
    return rawAccumulateAllValuesOfclassListTrace(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for classListTrace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ClassListTrace> getAllValuesOfclassListTrace(final ChildClassesWithDifferentParentsMatch partialMatch) {
    return rawAccumulateAllValuesOfclassListTrace(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for classListTrace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<ClassListTrace> getAllValuesOfclassListTrace(final TClass pClassOne, final TClass pClassTwo) {
    return rawAccumulateAllValuesOfclassListTrace(new Object[]{
    null, 
    pClassOne, 
    pClassTwo
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for classOne.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TClass> rawAccumulateAllValuesOfclassOne(final Object[] parameters) {
    Set<TClass> results = new HashSet<TClass>();
    rawAccumulateAllValues(POSITION_CLASSONE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for classOne.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclassOne() {
    return rawAccumulateAllValuesOfclassOne(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for classOne.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclassOne(final ChildClassesWithDifferentParentsMatch partialMatch) {
    return rawAccumulateAllValuesOfclassOne(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for classOne.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclassOne(final ClassListTrace pClassListTrace, final TClass pClassTwo) {
    return rawAccumulateAllValuesOfclassOne(new Object[]{
    pClassListTrace, 
    null, 
    pClassTwo
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for classTwo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TClass> rawAccumulateAllValuesOfclassTwo(final Object[] parameters) {
    Set<TClass> results = new HashSet<TClass>();
    rawAccumulateAllValues(POSITION_CLASSTWO, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for classTwo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclassTwo() {
    return rawAccumulateAllValuesOfclassTwo(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for classTwo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclassTwo(final ChildClassesWithDifferentParentsMatch partialMatch) {
    return rawAccumulateAllValuesOfclassTwo(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for classTwo.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclassTwo(final ClassListTrace pClassListTrace, final TClass pClassOne) {
    return rawAccumulateAllValuesOfclassTwo(new Object[]{
    pClassListTrace, 
    pClassOne, 
    null
    });
  }
  
  @Override
  protected ChildClassesWithDifferentParentsMatch tupleToMatch(final Tuple t) {
    try {
    	return ChildClassesWithDifferentParentsMatch.newMatch((TypeGraphTrace.ClassListTrace) t.get(POSITION_CLASSLISTTRACE), (TypeGraphBasic.TClass) t.get(POSITION_CLASSONE), (TypeGraphBasic.TClass) t.get(POSITION_CLASSTWO));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ChildClassesWithDifferentParentsMatch arrayToMatch(final Object[] match) {
    try {
    	return ChildClassesWithDifferentParentsMatch.newMatch((TypeGraphTrace.ClassListTrace) match[POSITION_CLASSLISTTRACE], (TypeGraphBasic.TClass) match[POSITION_CLASSONE], (TypeGraphBasic.TClass) match[POSITION_CLASSTWO]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ChildClassesWithDifferentParentsMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ChildClassesWithDifferentParentsMatch.newMutableMatch((TypeGraphTrace.ClassListTrace) match[POSITION_CLASSLISTTRACE], (TypeGraphBasic.TClass) match[POSITION_CLASSONE], (TypeGraphBasic.TClass) match[POSITION_CLASSTWO]);
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
  public static IQuerySpecification<ChildClassesWithDifferentParentsMatcher> querySpecification() throws IncQueryException {
    return ChildClassesWithDifferentParentsQuerySpecification.instance();
  }
}
