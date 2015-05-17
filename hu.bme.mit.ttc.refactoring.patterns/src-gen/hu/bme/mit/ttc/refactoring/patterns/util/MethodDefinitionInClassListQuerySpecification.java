package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.MethodDefinitionInClassListMatch;
import hu.bme.mit.ttc.refactoring.patterns.MethodDefinitionInClassListMatcher;
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
 * A pattern-specific query specification that can instantiate MethodDefinitionInClassListMatcher in a type-safe way.
 * 
 * @see MethodDefinitionInClassListMatcher
 * @see MethodDefinitionInClassListMatch
 * 
 */
@SuppressWarnings("all")
public final class MethodDefinitionInClassListQuerySpecification extends BaseGeneratedEMFQuerySpecification<MethodDefinitionInClassListMatcher> {
  private MethodDefinitionInClassListQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MethodDefinitionInClassListQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MethodDefinitionInClassListMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MethodDefinitionInClassListMatcher.on(engine);
  }
  
  @Override
  public MethodDefinitionInClassListMatch newEmptyMatch() {
    return MethodDefinitionInClassListMatch.newEmptyMatch();
  }
  
  @Override
  public MethodDefinitionInClassListMatch newMatch(final Object... parameters) {
    return MethodDefinitionInClassListMatch.newMatch((TypeGraphBasic.TClass) parameters[0], (TypeGraphBasic.TMethodSignature) parameters[1], (TypeGraphBasic.TClass) parameters[2], (TypeGraphBasic.TMethodDefinition) parameters[3]);
  }
  
  private static class LazyHolder {
    private final static MethodDefinitionInClassListQuerySpecification INSTANCE = make();
    
    public static MethodDefinitionInClassListQuerySpecification make() {
      return new MethodDefinitionInClassListQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MethodDefinitionInClassListQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.methodDefinitionInClassList";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parentClass","methodSignature","clazz","methodDefinition");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("parentClass", "TypeGraphBasic.TClass"),new PParameter("methodSignature", "TypeGraphBasic.TMethodSignature"),new PParameter("clazz", "TypeGraphBasic.TClass"),new PParameter("methodDefinition", "TypeGraphBasic.TMethodDefinition"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_parentClass = body.getOrCreateVariableByName("parentClass");
      	PVariable var_methodSignature = body.getOrCreateVariableByName("methodSignature");
      	PVariable var_clazz = body.getOrCreateVariableByName("clazz");
      	PVariable var_methodDefinition = body.getOrCreateVariableByName("methodDefinition");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_parentClass, "parentClass"),
      				
      		new ExportedParameter(body, var_methodSignature, "methodSignature"),
      				
      		new ExportedParameter(body, var_clazz, "clazz"),
      				
      		new ExportedParameter(body, var_methodDefinition, "methodDefinition")
      	));
      	new TypeConstraint(body, new FlatTuple(var_parentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature")));
      	new TypeConstraint(body, new FlatTuple(var_clazz), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_methodDefinition), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodDefinition")));
      	new TypeConstraint(body, new FlatTuple(var_parentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_parentClass, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "childClasses")));
      	new Equality(body, var__virtual_0_, var_clazz);
      	new TypeConstraint(body, new FlatTuple(var_methodSignature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignature, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature", "definitions")));
      	new Equality(body, var__virtual_1_, var_methodDefinition);
      	new TypeConstraint(body, new FlatTuple(var_clazz), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_clazz, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "defines")));
      	new Equality(body, var__virtual_2_, var_methodDefinition);
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
