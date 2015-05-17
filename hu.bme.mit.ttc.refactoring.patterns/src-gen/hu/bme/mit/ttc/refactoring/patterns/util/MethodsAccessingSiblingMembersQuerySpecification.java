package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.MethodsAccessingSiblingMembersMatch;
import hu.bme.mit.ttc.refactoring.patterns.MethodsAccessingSiblingMembersMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MethodsAccessingSiblingMembersMatcher in a type-safe way.
 * 
 * @see MethodsAccessingSiblingMembersMatcher
 * @see MethodsAccessingSiblingMembersMatch
 * 
 */
@SuppressWarnings("all")
public final class MethodsAccessingSiblingMembersQuerySpecification extends BaseGeneratedEMFQuerySpecification<MethodsAccessingSiblingMembersMatcher> {
  private MethodsAccessingSiblingMembersQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MethodsAccessingSiblingMembersQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MethodsAccessingSiblingMembersMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MethodsAccessingSiblingMembersMatcher.on(engine);
  }
  
  @Override
  public MethodsAccessingSiblingMembersMatch newEmptyMatch() {
    return MethodsAccessingSiblingMembersMatch.newEmptyMatch();
  }
  
  @Override
  public MethodsAccessingSiblingMembersMatch newMatch(final Object... parameters) {
    return MethodsAccessingSiblingMembersMatch.newMatch((TypeGraphBasic.TMethodDefinition) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static MethodsAccessingSiblingMembersQuerySpecification INSTANCE = make();
    
    public static MethodsAccessingSiblingMembersQuerySpecification make() {
      return new MethodsAccessingSiblingMembersQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MethodsAccessingSiblingMembersQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.methodsAccessingSiblingMembers";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("methodDefinition");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("methodDefinition", "TypeGraphBasic.TMethodDefinition"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_methodDefinition = body.getOrCreateVariableByName("methodDefinition");
      	PVariable var_accessedMember = body.getOrCreateVariableByName("accessedMember");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_tClass = body.getOrCreateVariableByName("tClass");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_methodDefinition, "methodDefinition")
      	));
      	new TypeConstraint(body, new FlatTuple(var_methodDefinition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodDefinition")));
      	new TypeConstraint(body, new FlatTuple(var_methodDefinition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMember")));
      	new TypeConstraint(body, new FlatTuple(var_methodDefinition, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMember", "access")));
      	new Equality(body, var__virtual_0_, var_accessedMember);
      	new TypeConstraint(body, new FlatTuple(var_tClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_tClass, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "defines")));
      	new Equality(body, var__virtual_1_, var_methodDefinition);
      	new TypeConstraint(body, new FlatTuple(var_tClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_tClass, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "defines")));
      	new Equality(body, var__virtual_2_, var_accessedMember);
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_methodDefinition = body.getOrCreateVariableByName("methodDefinition");
      	PVariable var_tClass = body.getOrCreateVariableByName("tClass");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_accessedMember = body.getOrCreateVariableByName("accessedMember");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_otherClass = body.getOrCreateVariableByName("otherClass");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_methodDefinition, "methodDefinition")
      	));
      	new TypeConstraint(body, new FlatTuple(var_methodDefinition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodDefinition")));
      	new TypeConstraint(body, new FlatTuple(var_tClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_tClass, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "defines")));
      	new Equality(body, var__virtual_0_, var_methodDefinition);
      	new TypeConstraint(body, new FlatTuple(var_methodDefinition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMember")));
      	new TypeConstraint(body, new FlatTuple(var_methodDefinition, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMember", "access")));
      	new Equality(body, var__virtual_1_, var_accessedMember);
      	new TypeConstraint(body, new FlatTuple(var_otherClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_otherClass, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "defines")));
      	new Equality(body, var__virtual_2_, var_accessedMember);
      	new TypeConstraint(body, new FlatTuple(var_tClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_tClass, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "parentClass")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_3_, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "childClasses")));
      	new Equality(body, var__virtual_4_, var_otherClass);
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
