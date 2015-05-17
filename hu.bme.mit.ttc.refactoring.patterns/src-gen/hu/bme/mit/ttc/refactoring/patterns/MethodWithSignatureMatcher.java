package hu.bme.mit.ttc.refactoring.patterns;

import TypeGraphTrace.MethodSignatureTrace;
import hu.bme.mit.ttc.refactoring.patterns.MethodWithSignatureMatch;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodWithSignatureQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.ttc.refactoring.patterns.methodWithSignature pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link MethodWithSignatureMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // fire precondition pattern
 * pattern methodWithSignature(trace : MethodSignatureTrace, signature) {
 * 	MethodSignatureTrace.signatureString(trace, signature);
 * }
 * </pre></code>
 * 
 * @see MethodWithSignatureMatch
 * @see MethodWithSignatureProcessor
 * @see MethodWithSignatureQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class MethodWithSignatureMatcher extends BaseMatcher<MethodWithSignatureMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static MethodWithSignatureMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    MethodWithSignatureMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new MethodWithSignatureMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_TRACE = 0;
  
  private final static int POSITION_SIGNATURE = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(MethodWithSignatureMatcher.class);
  
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
  public MethodWithSignatureMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public MethodWithSignatureMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @return matches represented as a MethodWithSignatureMatch object.
   * 
   */
  public Collection<MethodWithSignatureMatch> getAllMatches(final MethodSignatureTrace pTrace, final String pSignature) {
    return rawGetAllMatches(new Object[]{pTrace, pSignature});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @return a match represented as a MethodWithSignatureMatch object, or null if no match is found.
   * 
   */
  public MethodWithSignatureMatch getOneArbitraryMatch(final MethodSignatureTrace pTrace, final String pSignature) {
    return rawGetOneArbitraryMatch(new Object[]{pTrace, pSignature});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final MethodSignatureTrace pTrace, final String pSignature) {
    return rawHasMatch(new Object[]{pTrace, pSignature});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final MethodSignatureTrace pTrace, final String pSignature) {
    return rawCountMatches(new Object[]{pTrace, pSignature});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final MethodSignatureTrace pTrace, final String pSignature, final IMatchProcessor<? super MethodWithSignatureMatch> processor) {
    rawForEachMatch(new Object[]{pTrace, pSignature}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final MethodSignatureTrace pTrace, final String pSignature, final IMatchProcessor<? super MethodWithSignatureMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTrace, pSignature}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
   * @param pSignature the fixed value of pattern parameter signature, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public MethodWithSignatureMatch newMatch(final MethodSignatureTrace pTrace, final String pSignature) {
    return MethodWithSignatureMatch.newMatch(pTrace, pSignature);
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
  public Set<MethodSignatureTrace> getAllValuesOftrace(final MethodWithSignatureMatch partialMatch) {
    return rawAccumulateAllValuesOftrace(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for trace.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<MethodSignatureTrace> getAllValuesOftrace(final String pSignature) {
    return rawAccumulateAllValuesOftrace(new Object[]{
    null, 
    pSignature
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for signature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<String> rawAccumulateAllValuesOfsignature(final Object[] parameters) {
    Set<String> results = new HashSet<String>();
    rawAccumulateAllValues(POSITION_SIGNATURE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for signature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfsignature() {
    return rawAccumulateAllValuesOfsignature(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for signature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfsignature(final MethodWithSignatureMatch partialMatch) {
    return rawAccumulateAllValuesOfsignature(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for signature.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<String> getAllValuesOfsignature(final MethodSignatureTrace pTrace) {
    return rawAccumulateAllValuesOfsignature(new Object[]{
    pTrace, 
    null
    });
  }
  
  @Override
  protected MethodWithSignatureMatch tupleToMatch(final Tuple t) {
    try {
    	return MethodWithSignatureMatch.newMatch((TypeGraphTrace.MethodSignatureTrace) t.get(POSITION_TRACE), (java.lang.String) t.get(POSITION_SIGNATURE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MethodWithSignatureMatch arrayToMatch(final Object[] match) {
    try {
    	return MethodWithSignatureMatch.newMatch((TypeGraphTrace.MethodSignatureTrace) match[POSITION_TRACE], (java.lang.String) match[POSITION_SIGNATURE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected MethodWithSignatureMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return MethodWithSignatureMatch.newMutableMatch((TypeGraphTrace.MethodSignatureTrace) match[POSITION_TRACE], (java.lang.String) match[POSITION_SIGNATURE]);
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
  public static IQuerySpecification<MethodWithSignatureMatcher> querySpecification() throws IncQueryException {
    return MethodWithSignatureQuerySpecification.instance();
  }
}
