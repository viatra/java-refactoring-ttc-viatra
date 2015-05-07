package hu.bme.mit.ttc.refactoring.patterns;

import hu.bme.mit.ttc.refactoring.patterns.ClassesMatcher;
import hu.bme.mit.ttc.refactoring.patterns.CommonParentMatcher;
import hu.bme.mit.ttc.refactoring.patterns.CsAMatcher;
import hu.bme.mit.ttc.refactoring.patterns.CsANamesMatcher;
import hu.bme.mit.ttc.refactoring.patterns.CsBMatcher;
import hu.bme.mit.ttc.refactoring.patterns.CsBNamesMatcher;
import hu.bme.mit.ttc.refactoring.patterns.HasMethodMatcher;
import hu.bme.mit.ttc.refactoring.patterns.PumMatcher;
import hu.bme.mit.ttc.refactoring.patterns.PumNamesMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassesQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.CommonParentQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.CsANamesQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.CsAQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.CsBNamesQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.CsBQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.HasMethodQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.PumNamesQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.PumQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in refactoring.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file refactoring.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.ttc.refactoring.patterns, the group contains the definition of the following patterns: <ul>
 * <li>csANames</li>
 * <li>csA</li>
 * <li>csBNames</li>
 * <li>csB</li>
 * <li>commonParent</li>
 * <li>classes</li>
 * <li>pumNames</li>
 * <li>pum</li>
 * <li>hasMethod</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class Refactoring extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Refactoring instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new Refactoring();
    }
    return INSTANCE;
  }
  
  private static Refactoring INSTANCE;
  
  private Refactoring() throws IncQueryException {
    querySpecifications.add(CsANamesQuerySpecification.instance());
    querySpecifications.add(CsAQuerySpecification.instance());
    querySpecifications.add(CsBNamesQuerySpecification.instance());
    querySpecifications.add(CsBQuerySpecification.instance());
    querySpecifications.add(CommonParentQuerySpecification.instance());
    querySpecifications.add(ClassesQuerySpecification.instance());
    querySpecifications.add(PumNamesQuerySpecification.instance());
    querySpecifications.add(PumQuerySpecification.instance());
    querySpecifications.add(HasMethodQuerySpecification.instance());
  }
  
  public CsANamesQuerySpecification getCsANames() throws IncQueryException {
    return CsANamesQuerySpecification.instance();
  }
  
  public CsANamesMatcher getCsANames(final IncQueryEngine engine) throws IncQueryException {
    return CsANamesMatcher.on(engine);
  }
  
  public CsAQuerySpecification getCsA() throws IncQueryException {
    return CsAQuerySpecification.instance();
  }
  
  public CsAMatcher getCsA(final IncQueryEngine engine) throws IncQueryException {
    return CsAMatcher.on(engine);
  }
  
  public CsBNamesQuerySpecification getCsBNames() throws IncQueryException {
    return CsBNamesQuerySpecification.instance();
  }
  
  public CsBNamesMatcher getCsBNames(final IncQueryEngine engine) throws IncQueryException {
    return CsBNamesMatcher.on(engine);
  }
  
  public CsBQuerySpecification getCsB() throws IncQueryException {
    return CsBQuerySpecification.instance();
  }
  
  public CsBMatcher getCsB(final IncQueryEngine engine) throws IncQueryException {
    return CsBMatcher.on(engine);
  }
  
  public CommonParentQuerySpecification getCommonParent() throws IncQueryException {
    return CommonParentQuerySpecification.instance();
  }
  
  public CommonParentMatcher getCommonParent(final IncQueryEngine engine) throws IncQueryException {
    return CommonParentMatcher.on(engine);
  }
  
  public ClassesQuerySpecification getClasses() throws IncQueryException {
    return ClassesQuerySpecification.instance();
  }
  
  public ClassesMatcher getClasses(final IncQueryEngine engine) throws IncQueryException {
    return ClassesMatcher.on(engine);
  }
  
  public PumNamesQuerySpecification getPumNames() throws IncQueryException {
    return PumNamesQuerySpecification.instance();
  }
  
  public PumNamesMatcher getPumNames(final IncQueryEngine engine) throws IncQueryException {
    return PumNamesMatcher.on(engine);
  }
  
  public PumQuerySpecification getPum() throws IncQueryException {
    return PumQuerySpecification.instance();
  }
  
  public PumMatcher getPum(final IncQueryEngine engine) throws IncQueryException {
    return PumMatcher.on(engine);
  }
  
  public HasMethodQuerySpecification getHasMethod() throws IncQueryException {
    return HasMethodQuerySpecification.instance();
  }
  
  public HasMethodMatcher getHasMethod(final IncQueryEngine engine) throws IncQueryException {
    return HasMethodMatcher.on(engine);
  }
}
