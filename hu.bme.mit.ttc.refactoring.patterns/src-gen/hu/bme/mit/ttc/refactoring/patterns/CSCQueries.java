package hu.bme.mit.ttc.refactoring.patterns;

import hu.bme.mit.ttc.refactoring.patterns.ChildClassesWithDifferentParentsMatcher;
import hu.bme.mit.ttc.refactoring.patterns.ClassWithNameMatcher;
import hu.bme.mit.ttc.refactoring.patterns.ClassesOfClassListTraceMatcher;
import hu.bme.mit.ttc.refactoring.patterns.DifferentParentsMatcher;
import hu.bme.mit.ttc.refactoring.patterns.HasParentMatcher;
import hu.bme.mit.ttc.refactoring.patterns.MethodSignatureAndTraceMatcher;
import hu.bme.mit.ttc.refactoring.patterns.PackageWithNameMatcher;
import hu.bme.mit.ttc.refactoring.patterns.PossibleCSCMatcher;
import hu.bme.mit.ttc.refactoring.patterns.TypeGraphsMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesWithDifferentParentsQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassWithNameQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassesOfClassListTraceQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.DifferentParentsQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.HasParentQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodSignatureAndTraceQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.PackageWithNameQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.PossibleCSCQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.TypeGraphsQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in CSCQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file CSCQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.ttc.refactoring.patterns, the group contains the definition of the following patterns: <ul>
 * <li>possibleCSC</li>
 * <li>childClassesWithDifferentParents</li>
 * <li>differentParents</li>
 * <li>hasParent</li>
 * <li>classesOfClassListTrace</li>
 * <li>methodSignatureAndTrace</li>
 * <li>packageWithName</li>
 * <li>typeGraphs</li>
 * <li>classWithName</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class CSCQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static CSCQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new CSCQueries();
    }
    return INSTANCE;
  }
  
  private static CSCQueries INSTANCE;
  
  private CSCQueries() throws IncQueryException {
    querySpecifications.add(PossibleCSCQuerySpecification.instance());
    querySpecifications.add(ChildClassesWithDifferentParentsQuerySpecification.instance());
    querySpecifications.add(DifferentParentsQuerySpecification.instance());
    querySpecifications.add(HasParentQuerySpecification.instance());
    querySpecifications.add(ClassesOfClassListTraceQuerySpecification.instance());
    querySpecifications.add(MethodSignatureAndTraceQuerySpecification.instance());
    querySpecifications.add(PackageWithNameQuerySpecification.instance());
    querySpecifications.add(TypeGraphsQuerySpecification.instance());
    querySpecifications.add(ClassWithNameQuerySpecification.instance());
  }
  
  public PossibleCSCQuerySpecification getPossibleCSC() throws IncQueryException {
    return PossibleCSCQuerySpecification.instance();
  }
  
  public PossibleCSCMatcher getPossibleCSC(final IncQueryEngine engine) throws IncQueryException {
    return PossibleCSCMatcher.on(engine);
  }
  
  public ChildClassesWithDifferentParentsQuerySpecification getChildClassesWithDifferentParents() throws IncQueryException {
    return ChildClassesWithDifferentParentsQuerySpecification.instance();
  }
  
  public ChildClassesWithDifferentParentsMatcher getChildClassesWithDifferentParents(final IncQueryEngine engine) throws IncQueryException {
    return ChildClassesWithDifferentParentsMatcher.on(engine);
  }
  
  public DifferentParentsQuerySpecification getDifferentParents() throws IncQueryException {
    return DifferentParentsQuerySpecification.instance();
  }
  
  public DifferentParentsMatcher getDifferentParents(final IncQueryEngine engine) throws IncQueryException {
    return DifferentParentsMatcher.on(engine);
  }
  
  public HasParentQuerySpecification getHasParent() throws IncQueryException {
    return HasParentQuerySpecification.instance();
  }
  
  public HasParentMatcher getHasParent(final IncQueryEngine engine) throws IncQueryException {
    return HasParentMatcher.on(engine);
  }
  
  public ClassesOfClassListTraceQuerySpecification getClassesOfClassListTrace() throws IncQueryException {
    return ClassesOfClassListTraceQuerySpecification.instance();
  }
  
  public ClassesOfClassListTraceMatcher getClassesOfClassListTrace(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfClassListTraceMatcher.on(engine);
  }
  
  public MethodSignatureAndTraceQuerySpecification getMethodSignatureAndTrace() throws IncQueryException {
    return MethodSignatureAndTraceQuerySpecification.instance();
  }
  
  public MethodSignatureAndTraceMatcher getMethodSignatureAndTrace(final IncQueryEngine engine) throws IncQueryException {
    return MethodSignatureAndTraceMatcher.on(engine);
  }
  
  public PackageWithNameQuerySpecification getPackageWithName() throws IncQueryException {
    return PackageWithNameQuerySpecification.instance();
  }
  
  public PackageWithNameMatcher getPackageWithName(final IncQueryEngine engine) throws IncQueryException {
    return PackageWithNameMatcher.on(engine);
  }
  
  public TypeGraphsQuerySpecification getTypeGraphs() throws IncQueryException {
    return TypeGraphsQuerySpecification.instance();
  }
  
  public TypeGraphsMatcher getTypeGraphs(final IncQueryEngine engine) throws IncQueryException {
    return TypeGraphsMatcher.on(engine);
  }
  
  public ClassWithNameQuerySpecification getClassWithName() throws IncQueryException {
    return ClassWithNameQuerySpecification.instance();
  }
  
  public ClassWithNameMatcher getClassWithName(final IncQueryEngine engine) throws IncQueryException {
    return ClassWithNameMatcher.on(engine);
  }
}
