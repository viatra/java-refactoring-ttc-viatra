package hu.bme.mit.ttc.refactoring.patterns;

import hu.bme.mit.ttc.refactoring.patterns.ChildClassesMatcher;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesWithSignatureMatcher;
import hu.bme.mit.ttc.refactoring.patterns.ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher;
import hu.bme.mit.ttc.refactoring.patterns.ClassWithNameMatcher;
import hu.bme.mit.ttc.refactoring.patterns.ClassWithSignatureMatcher;
import hu.bme.mit.ttc.refactoring.patterns.MethodDefinitionInClassListMatcher;
import hu.bme.mit.ttc.refactoring.patterns.MethodWithSignatureMatcher;
import hu.bme.mit.ttc.refactoring.patterns.MethodsAccessingSiblingMembersMatcher;
import hu.bme.mit.ttc.refactoring.patterns.PossiblePUMMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesWithSignatureQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassWithNameQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassWithSignatureQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodDefinitionInClassListQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodWithSignatureQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodsAccessingSiblingMembersQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.PossiblePUMQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in PUMQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file PUMQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.ttc.refactoring.patterns, the group contains the definition of the following patterns: <ul>
 * <li>possiblePUM</li>
 * <li>childClasses</li>
 * <li>childClassesWithSignature</li>
 * <li>classWithSignature</li>
 * <li>methodsAccessingSiblingMembers</li>
 * <li>childrenClassMethodDefinitionsAccessingSiblingMembers</li>
 * <li>classWithName</li>
 * <li>methodWithSignature</li>
 * <li>methodDefinitionInClassList</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class PUMQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static PUMQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new PUMQueries();
    }
    return INSTANCE;
  }
  
  private static PUMQueries INSTANCE;
  
  private PUMQueries() throws IncQueryException {
    querySpecifications.add(PossiblePUMQuerySpecification.instance());
    querySpecifications.add(ChildClassesQuerySpecification.instance());
    querySpecifications.add(ChildClassesWithSignatureQuerySpecification.instance());
    querySpecifications.add(ClassWithSignatureQuerySpecification.instance());
    querySpecifications.add(MethodsAccessingSiblingMembersQuerySpecification.instance());
    querySpecifications.add(ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification.instance());
    querySpecifications.add(ClassWithNameQuerySpecification.instance());
    querySpecifications.add(MethodWithSignatureQuerySpecification.instance());
    querySpecifications.add(MethodDefinitionInClassListQuerySpecification.instance());
  }
  
  public PossiblePUMQuerySpecification getPossiblePUM() throws IncQueryException {
    return PossiblePUMQuerySpecification.instance();
  }
  
  public PossiblePUMMatcher getPossiblePUM(final IncQueryEngine engine) throws IncQueryException {
    return PossiblePUMMatcher.on(engine);
  }
  
  public ChildClassesQuerySpecification getChildClasses() throws IncQueryException {
    return ChildClassesQuerySpecification.instance();
  }
  
  public ChildClassesMatcher getChildClasses(final IncQueryEngine engine) throws IncQueryException {
    return ChildClassesMatcher.on(engine);
  }
  
  public ChildClassesWithSignatureQuerySpecification getChildClassesWithSignature() throws IncQueryException {
    return ChildClassesWithSignatureQuerySpecification.instance();
  }
  
  public ChildClassesWithSignatureMatcher getChildClassesWithSignature(final IncQueryEngine engine) throws IncQueryException {
    return ChildClassesWithSignatureMatcher.on(engine);
  }
  
  public ClassWithSignatureQuerySpecification getClassWithSignature() throws IncQueryException {
    return ClassWithSignatureQuerySpecification.instance();
  }
  
  public ClassWithSignatureMatcher getClassWithSignature(final IncQueryEngine engine) throws IncQueryException {
    return ClassWithSignatureMatcher.on(engine);
  }
  
  public MethodsAccessingSiblingMembersQuerySpecification getMethodsAccessingSiblingMembers() throws IncQueryException {
    return MethodsAccessingSiblingMembersQuerySpecification.instance();
  }
  
  public MethodsAccessingSiblingMembersMatcher getMethodsAccessingSiblingMembers(final IncQueryEngine engine) throws IncQueryException {
    return MethodsAccessingSiblingMembersMatcher.on(engine);
  }
  
  public ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification getChildrenClassMethodDefinitionsAccessingSiblingMembers() throws IncQueryException {
    return ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification.instance();
  }
  
  public ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher getChildrenClassMethodDefinitionsAccessingSiblingMembers(final IncQueryEngine engine) throws IncQueryException {
    return ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher.on(engine);
  }
  
  public ClassWithNameQuerySpecification getClassWithName() throws IncQueryException {
    return ClassWithNameQuerySpecification.instance();
  }
  
  public ClassWithNameMatcher getClassWithName(final IncQueryEngine engine) throws IncQueryException {
    return ClassWithNameMatcher.on(engine);
  }
  
  public MethodWithSignatureQuerySpecification getMethodWithSignature() throws IncQueryException {
    return MethodWithSignatureQuerySpecification.instance();
  }
  
  public MethodWithSignatureMatcher getMethodWithSignature(final IncQueryEngine engine) throws IncQueryException {
    return MethodWithSignatureMatcher.on(engine);
  }
  
  public MethodDefinitionInClassListQuerySpecification getMethodDefinitionInClassList() throws IncQueryException {
    return MethodDefinitionInClassListQuerySpecification.instance();
  }
  
  public MethodDefinitionInClassListMatcher getMethodDefinitionInClassList(final IncQueryEngine engine) throws IncQueryException {
    return MethodDefinitionInClassListMatcher.on(engine);
  }
}
