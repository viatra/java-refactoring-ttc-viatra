package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.ClassWithSignatureMatch;
import hu.bme.mit.ttc.refactoring.patterns.ClassWithSignatureMatcher;
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
 * A pattern-specific query specification that can instantiate ClassWithSignatureMatcher in a type-safe way.
 * 
 * @see ClassWithSignatureMatcher
 * @see ClassWithSignatureMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassWithSignatureQuerySpecification extends BaseGeneratedEMFQuerySpecification<ClassWithSignatureMatcher> {
  private ClassWithSignatureQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassWithSignatureQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ClassWithSignatureMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClassWithSignatureMatcher.on(engine);
  }
  
  @Override
  public ClassWithSignatureMatch newEmptyMatch() {
    return ClassWithSignatureMatch.newEmptyMatch();
  }
  
  @Override
  public ClassWithSignatureMatch newMatch(final Object... parameters) {
    return ClassWithSignatureMatch.newMatch((TypeGraphBasic.TClass) parameters[0], (TypeGraphBasic.TMethodSignature) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ClassWithSignatureQuerySpecification INSTANCE = make();
    
    public static ClassWithSignatureQuerySpecification make() {
      return new ClassWithSignatureQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ClassWithSignatureQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.classWithSignature";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("clazz","methodSignature");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("clazz", "TypeGraphBasic.TClass"),new PParameter("methodSignature", "TypeGraphBasic.TMethodSignature"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_clazz = body.getOrCreateVariableByName("clazz");
      	PVariable var_methodSignature = body.getOrCreateVariableByName("methodSignature");
      	PVariable var_methodDefinition = body.getOrCreateVariableByName("methodDefinition");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_clazz, "clazz"),
      				
      		new ExportedParameter(body, var_methodSignature, "methodSignature")
      	));
      	new TypeConstraint(body, new FlatTuple(var_clazz), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature")));
      	new TypeConstraint(body, new FlatTuple(var_clazz), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignature, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature", "definitions")));
      	new Equality(body, var__virtual_0_, var_methodDefinition);
      	new TypeConstraint(body, new FlatTuple(var_clazz), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_clazz, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "defines")));
      	new Equality(body, var__virtual_1_, var_methodDefinition);
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
