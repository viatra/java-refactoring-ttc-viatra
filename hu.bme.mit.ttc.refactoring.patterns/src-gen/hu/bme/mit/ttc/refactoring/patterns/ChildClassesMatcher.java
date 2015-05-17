package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.childClasses pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ChildClassesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern childClasses(parentClass : TClass, childClass : TClass) {
 * 	TClass.childClasses(parentClass, childClass);
 * }
 * </pre></code>
 * 
 * @see ChildClassesMatch
 * @see ChildClassesProcessor
 * @see ChildClassesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ChildClassesMatcher extends BaseMatcher<ChildClassesMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ChildClassesMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ChildClassesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ChildClassesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PARENTCLASS = 0;
  
  private final static int POSITION_CHILDCLASS = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ChildClassesMatcher.class);
  
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
  public ChildClassesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ChildClassesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pChildClass the fixed value of pattern parameter childClass, or null if not bound.
   * @return matches represented as a ChildClassesMatch object.
   * 
   */
  public Collection<ChildClassesMatch> getAllMatches(final TClass pParentClass, final TClass pChildClass) {
    return rawGetAllMatches(new Object[]{pParentClass, pChildClass});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pChildClass the fixed value of pattern parameter childClass, or null if not bound.
   * @return a match represented as a ChildClassesMatch object, or null if no match is found.
   * 
   */
  public ChildClassesMatch getOneArbitraryMatch(final TClass pParentClass, final TClass pChildClass) {
    return rawGetOneArbitraryMatch(new Object[]{pParentClass, pChildClass});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pChildClass the fixed value of pattern parameter childClass, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TClass pParentClass, final TClass pChildClass) {
    return rawHasMatch(new Object[]{pParentClass, pChildClass});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pChildClass the fixed value of pattern parameter childClass, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TClass pParentClass, final TClass pChildClass) {
    return rawCountMatches(new Object[]{pParentClass, pChildClass});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pChildClass the fixed value of pattern parameter childClass, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TClass pParentClass, final TClass pChildClass, final IMatchProcessor<? super ChildClassesMatch> processor) {
    rawForEachMatch(new Object[]{pParentClass, pChildClass}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pChildClass the fixed value of pattern parameter childClass, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TClass pParentClass, final TClass pChildClass, final IMatchProcessor<? super ChildClassesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pParentClass, pChildClass}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pParentClass the fixed value of pattern parameter parentClass, or null if not bound.
   * @param pChildClass the fixed value of pattern parameter childClass, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ChildClassesMatch newMatch(final TClass pParentClass, final TClass pChildClass) {
    return ChildClassesMatch.newMatch(pParentClass, pChildClass);
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
  public Set<TClass> getAllValuesOfparentClass(final ChildClassesMatch partialMatch) {
    return rawAccumulateAllValuesOfparentClass(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for parentClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfparentClass(final TClass pChildClass) {
    return rawAccumulateAllValuesOfparentClass(new Object[]{
    null, 
    pChildClass
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for childClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TClass> rawAccumulateAllValuesOfchildClass(final Object[] parameters) {
    Set<TClass> results = new HashSet<TClass>();
    rawAccumulateAllValues(POSITION_CHILDCLASS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for childClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfchildClass() {
    return rawAccumulateAllValuesOfchildClass(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for childClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfchildClass(final ChildClassesMatch partialMatch) {
    return rawAccumulateAllValuesOfchildClass(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for childClass.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfchildClass(final TClass pParentClass) {
    return rawAccumulateAllValuesOfchildClass(new Object[]{
    pParentClass, 
    null
    });
  }
  
  @Override
  protected ChildClassesMatch tupleToMatch(final Tuple t) {
    try {
    	return ChildClassesMatch.newMatch((TypeGraphBasic.TClass) t.get(POSITION_PARENTCLASS), (TypeGraphBasic.TClass) t.get(POSITION_CHILDCLASS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ChildClassesMatch arrayToMatch(final Object[] match) {
    try {
    	return ChildClassesMatch.newMatch((TypeGraphBasic.TClass) match[POSITION_PARENTCLASS], (TypeGraphBasic.TClass) match[POSITION_CHILDCLASS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ChildClassesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ChildClassesMatch.newMutableMatch((TypeGraphBasic.TClass) match[POSITION_PARENTCLASS], (TypeGraphBasic.TClass) match[POSITION_CHILDCLASS]);
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
  public static IQuerySpecification<ChildClassesMatcher> querySpecification() throws IncQueryException {
    return ChildClassesQuerySpecification.instance();
  }
}
