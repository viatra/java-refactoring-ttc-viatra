package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.ClassesOfClassListTraceMatch;
import hu.bme.mit.ttc.refactoring.patterns.ClassesOfClassListTraceMatcher;
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
 * A pattern-specific query specification that can instantiate ClassesOfClassListTraceMatcher in a type-safe way.
 * 
 * @see ClassesOfClassListTraceMatcher
 * @see ClassesOfClassListTraceMatch
 * 
 */
@SuppressWarnings("all")
public final class ClassesOfClassListTraceQuerySpecification extends BaseGeneratedEMFQuerySpecification<ClassesOfClassListTraceMatcher> {
  private ClassesOfClassListTraceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ClassesOfClassListTraceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ClassesOfClassListTraceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ClassesOfClassListTraceMatcher.on(engine);
  }
  
  @Override
  public ClassesOfClassListTraceMatch newEmptyMatch() {
    return ClassesOfClassListTraceMatch.newEmptyMatch();
  }
  
  @Override
  public ClassesOfClassListTraceMatch newMatch(final Object... parameters) {
    return ClassesOfClassListTraceMatch.newMatch((java.lang.String) parameters[0], (TypeGraphBasic.TClass) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static ClassesOfClassListTraceQuerySpecification INSTANCE = make();
    
    public static ClassesOfClassListTraceQuerySpecification make() {
      return new ClassesOfClassListTraceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ClassesOfClassListTraceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.classesOfClassListTrace";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("concatSignature","tClass");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("concatSignature", "java.lang.String"),new PParameter("tClass", "TypeGraphBasic.TClass"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_concatSignature = body.getOrCreateVariableByName("concatSignature");
      	PVariable var_tClass = body.getOrCreateVariableByName("tClass");
      	PVariable var_classListTrace = body.getOrCreateVariableByName("classListTrace");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_concatSignature, "concatSignature"),
      				
      		new ExportedParameter(body, var_tClass, "tClass")
      	));
      	new TypeConstraint(body, new FlatTuple(var_tClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classListTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace")));
      	new TypeConstraint(body, new FlatTuple(var_classListTrace, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace", "concatSignature")));
      	new Equality(body, var__virtual_0_, var_concatSignature);
      	new TypeConstraint(body, new FlatTuple(var_classListTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace")));
      	new TypeConstraint(body, new FlatTuple(var_classListTrace, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace", "tClasses")));
      	new Equality(body, var__virtual_1_, var_tClass);
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
