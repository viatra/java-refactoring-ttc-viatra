package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphBasic.TMethodSignature;
import TypeGraphTrace.MethodSignatureTrace;
import hu.bme.mit.ttc.refactoring.patterns.MethodSignatureAndTraceMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodSignatureAndTraceQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.methodSignatureAndTrace pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MethodSignatureAndTraceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern methodSignatureAndTrace(trace : MethodSignatureTrace, methodSignature : TMethodSignature) {
 * 	MethodSignatureTrace.tMethodSignature(trace, methodSignature);
 * }
 * </pre></code>
 * 
 * @see MethodSignatureAndTraceMatch
 * @see MethodSignatureAndTraceProcessor
 * @see MethodSignatureAndTraceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MethodSignatureAndTraceMatcher extends BaseMatcher<MethodSignatureAndTraceMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MethodSignatureAndTraceMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MethodSignatureAndTraceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MethodSignatureAndTraceMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TRACE = 0;
  
  private final static int POSITION_METHODSIGNATURE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MethodSignatureAndTraceMatcher.class);
  
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
  public MethodSignatureAndTraceMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MethodSignatureAndTraceMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return matches represented as a MethodSignatureAndTraceMatch object.
   * 
   */
  public Collection<MethodSignatureAndTraceMatch> getAllMatches(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature) {
    return rawGetAllMatches(new Object[]{pTrace, pMethodSignature});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return a match represented as a MethodSignatureAndTraceMatch object, or null if no match is found.
   * 
   */
  public MethodSignatureAndTraceMatch getOneArbitraryMatch(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature) {
    return rawGetOneArbitraryMatch(new Object[]{pTrace, pMethodSignature});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature) {
    return rawHasMatch(new Object[]{pTrace, pMethodSignature});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature) {
    return rawCountMatches(new Object[]{pTrace, pMethodSignature});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature, final IMatchProcessor<? super MethodSignatureAndTraceMatch> processor) {
    rawForEachMatch(new Object[]{pTrace, pMethodSignature}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature, final IMatchProcessor<? super MethodSignatureAndTraceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTrace, pMethodSignature}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pMethodSignature the fixed value of pattern parameter methodSignature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MethodSignatureAndTraceMatch newMatch(final MethodSignatureTrace pTrace, final TMethodSignature pMethodSignature) {
    return MethodSignatureAndTraceMatch.newMatch(pTrace, pMethodSignature);
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<MethodSignatureTrace> rawAccumulateAllValuesOftrace(final Object[] parameters) {
    Set<MethodSignatureTrace> results = new HashSet<MethodSignatureTrace>();
    rawAccumulateAllValues(POSITION_TRACE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MethodSignatureTrace> getAllValuesOftrace() {
    return rawAccumulateAllValuesOftrace(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MethodSignatureTrace> getAllValuesOftrace(final MethodSignatureAndTraceMatch partialMatch) {
    return rawAccumulateAllValuesOftrace(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MethodSignatureTrace> getAllValuesOftrace(final TMethodSignature pMethodSignature) {
    return rawAccumulateAllValuesOftrace(new Object[]{
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
  public Set<TMethodSignature> getAllValuesOfmethodSignature(final MethodSignatureAndTraceMatch partialMatch) {
    return rawAccumulateAllValuesOfmethodSignature(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for methodSignature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<TMethodSignature> getAllValuesOfmethodSignature(final MethodSignatureTrace pTrace) {
    return rawAccumulateAllValuesOfmethodSignature(new Object[]{
    pTrace, 
    null
    });
  }
  
  @Override
  protected MethodSignatureAndTraceMatch tupleToMatch(final Tuple t) {
    try {
    	return MethodSignatureAndTraceMatch.newMatch((TypeGraphTrace.MethodSignatureTrace) t.get(POSITION_TRACE), (TypeGraphBasic.TMethodSignature) t.get(POSITION_METHODSIGNATURE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MethodSignatureAndTraceMatch arrayToMatch(final Object[] match) {
    try {
    	return MethodSignatureAndTraceMatch.newMatch((TypeGraphTrace.MethodSignatureTrace) match[POSITION_TRACE], (TypeGraphBasic.TMethodSignature) match[POSITION_METHODSIGNATURE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MethodSignatureAndTraceMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MethodSignatureAndTraceMatch.newMutableMatch((TypeGraphTrace.MethodSignatureTrace) match[POSITION_TRACE], (TypeGraphBasic.TMethodSignature) match[POSITION_METHODSIGNATURE]);
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
  public static IQuerySpecification<MethodSignatureAndTraceMatcher> querySpecification() throws IncQueryException {
    return MethodSignatureAndTraceQuerySpecification.instance();
  }
}
