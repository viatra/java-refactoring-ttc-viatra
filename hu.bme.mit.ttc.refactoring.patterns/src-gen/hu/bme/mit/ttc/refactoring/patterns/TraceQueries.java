package hu.bme.mit.ttc.refactoring.patterns;

import hu.bme.mit.ttc.refactoring.patterns.MethodSignatureMatcher;
import hu.bme.mit.ttc.refactoring.patterns.TClassNameMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodSignatureQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.TClassNameQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in TraceQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file TraceQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.ttc.refactoring.patterns, the group contains the definition of the following patterns: <ul>
 * <li>methodSignature</li>
 * <li>tClassName</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class TraceQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static TraceQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new TraceQueries();
    }
    return INSTANCE;
  }
  
  private static TraceQueries INSTANCE;
  
  private TraceQueries() throws IncQueryException {
    querySpecifications.add(MethodSignatureQuerySpecification.instance());
    querySpecifications.add(TClassNameQuerySpecification.instance());
  }
  
  public MethodSignatureQuerySpecification getMethodSignature() throws IncQueryException {
    return MethodSignatureQuerySpecification.instance();
  }
  
  public MethodSignatureMatcher getMethodSignature(final IncQueryEngine engine) throws IncQueryException {
    return MethodSignatureMatcher.on(engine);
  }
  
  public TClassNameQuerySpecification getTClassName() throws IncQueryException {
    return TClassNameQuerySpecification.instance();
  }
  
  public TClassNameMatcher getTClassName(final IncQueryEngine engine) throws IncQueryException {
    return TClassNameMatcher.on(engine);
  }
}
