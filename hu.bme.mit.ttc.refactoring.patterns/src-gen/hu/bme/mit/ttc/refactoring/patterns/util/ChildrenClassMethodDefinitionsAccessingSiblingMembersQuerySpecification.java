package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch;
import hu.bme.mit.ttc.refactoring.patterns.ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.MethodsAccessingSiblingMembersQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher in a type-safe way.
 * 
 * @see ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher
 * @see ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch
 * 
 */
@SuppressWarnings("all")
public final class ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification extends BaseGeneratedEMFQuerySpecification<ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher> {
  private ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ChildrenClassMethodDefinitionsAccessingSiblingMembersMatcher.on(engine);
  }
  
  @Override
  public ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch newEmptyMatch() {
    return ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch.newEmptyMatch();
  }
  
  @Override
  public ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch newMatch(final Object... parameters) {
    return ChildrenClassMethodDefinitionsAccessingSiblingMembersMatch.newMatch((TypeGraphBasic.TClass) parameters[0], (TypeGraphBasic.TMethodSignature) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification INSTANCE = make();
    
    public static ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification make() {
      return new ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.childrenClassMethodDefinitionsAccessingSiblingMembers";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parentClass","methodSignature");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("parentClass", "TypeGraphBasic.TClass"),new PParameter("methodSignature", "TypeGraphBasic.TMethodSignature"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_parentClass = body.getOrCreateVariableByName("parentClass");
      	PVariable var_methodSignature = body.getOrCreateVariableByName("methodSignature");
      	PVariable var_childClass = body.getOrCreateVariableByName("childClass");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_methodDefinition = body.getOrCreateVariableByName("methodDefinition");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_parentClass, "parentClass"),
      				
      		new ExportedParameter(body, var_methodSignature, "methodSignature")
      	));
      	new TypeConstraint(body, new FlatTuple(var_parentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature")));
      	new TypeConstraint(body, new FlatTuple(var_parentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_parentClass, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "childClasses")));
      	new Equality(body, var__virtual_0_, var_childClass);
      	new TypeConstraint(body, new FlatTuple(var_childClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_childClass, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "defines")));
      	new Equality(body, var__virtual_1_, var_methodDefinition);
      	new TypeConstraint(body, new FlatTuple(var_methodSignature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignature, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature", "definitions")));
      	new Equality(body, var__virtual_2_, var_methodDefinition);
      	new PositivePatternCall(body, new FlatTuple(var_methodDefinition), MethodsAccessingSiblingMembersQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
