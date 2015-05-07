package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TClass;
import hu.bme.mit.ttc.refactoring.patterns.ClassesMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassesQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.classes pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link ClassesMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // for checking the abscence of the new_superclass object
 * 
 * pattern classes(class) {
 * 	TClass(class);
 * }
 * </pre></code>
 * 
 * @see ClassesMatch
 * @see ClassesProcessor
 * @see ClassesQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class ClassesMatcher extends BaseMatcher<ClassesMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static ClassesMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    ClassesMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new ClassesMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_CLASS = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(ClassesMatcher.class);
  
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
  public ClassesMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public ClassesMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pClass the fixed value of pattern parameter class, or null if not bound.
   * @return matches represented as a ClassesMatch object.
   * 
   */
  public Collection<ClassesMatch> getAllMatches(final TClass pClass) {
    return rawGetAllMatches(new Object[]{pClass});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pClass the fixed value of pattern parameter class, or null if not bound.
   * @return a match represented as a ClassesMatch object, or null if no match is found.
   * 
   */
  public ClassesMatch getOneArbitraryMatch(final TClass pClass) {
    return rawGetOneArbitraryMatch(new Object[]{pClass});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pClass the fixed value of pattern parameter class, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final TClass pClass) {
    return rawHasMatch(new Object[]{pClass});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pClass the fixed value of pattern parameter class, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final TClass pClass) {
    return rawCountMatches(new Object[]{pClass});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pClass the fixed value of pattern parameter class, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final TClass pClass, final IMatchProcessor<? super ClassesMatch> processor) {
    rawForEachMatch(new Object[]{pClass}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pClass the fixed value of pattern parameter class, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final TClass pClass, final IMatchProcessor<? super ClassesMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pClass}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pClass the fixed value of pattern parameter class, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public ClassesMatch newMatch(final TClass pClass) {
    return ClassesMatch.newMatch(pClass);
  }
  
  /**
   * Retrieve the set of values that occur in matches for class.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<TClass> rawAccumulateAllValuesOfclass(final Object[] parameters) {
    Set<TClass> results = new HashSet<TClass>();
    rawAccumulateAllValues(POSITION_CLASS, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for class.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TClass> getAllValuesOfclass() {
    return rawAccumulateAllValuesOfclass(emptyArray());
  }
  
  @Override
  protected ClassesMatch tupleToMatch(final Tuple t) {
    try {
    	return ClassesMatch.newMatch((TypeGraphBasic.TClass) t.get(POSITION_CLASS));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ClassesMatch arrayToMatch(final Object[] match) {
    try {
    	return ClassesMatch.newMatch((TypeGraphBasic.TClass) match[POSITION_CLASS]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected ClassesMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return ClassesMatch.newMutableMatch((TypeGraphBasic.TClass) match[POSITION_CLASS]);
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
  public static IQuerySpecification<ClassesMatcher> querySpecification() throws IncQueryException {
    return ClassesQuerySpecification.instance();
  }
}
