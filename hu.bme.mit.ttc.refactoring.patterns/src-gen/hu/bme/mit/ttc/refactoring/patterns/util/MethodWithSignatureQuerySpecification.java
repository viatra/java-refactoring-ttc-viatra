package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.MethodWithSignatureMatch;
import hu.bme.mit.ttc.refactoring.patterns.MethodWithSignatureMatcher;
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
 * A pattern-specific query specification that can instantiate MethodWithSignatureMatcher in a type-safe way.
 * 
 * @see MethodWithSignatureMatcher
 * @see MethodWithSignatureMatch
 * 
 */
@SuppressWarnings("all")
public final class MethodWithSignatureQuerySpecification extends BaseGeneratedEMFQuerySpecification<MethodWithSignatureMatcher> {
  private MethodWithSignatureQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MethodWithSignatureQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MethodWithSignatureMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MethodWithSignatureMatcher.on(engine);
  }
  
  @Override
  public MethodWithSignatureMatch newEmptyMatch() {
    return MethodWithSignatureMatch.newEmptyMatch();
  }
  
  @Override
  public MethodWithSignatureMatch newMatch(final Object... parameters) {
    return MethodWithSignatureMatch.newMatch((TypeGraphTrace.MethodSignatureTrace) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static MethodWithSignatureQuerySpecification INSTANCE = make();
    
    public static MethodWithSignatureQuerySpecification make() {
      return new MethodWithSignatureQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MethodWithSignatureQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.methodWithSignature";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("trace","signature");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("trace", "TypeGraphTrace.MethodSignatureTrace"),new PParameter("signature", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_trace = body.getOrCreateVariableByName("trace");
      	PVariable var_signature = body.getOrCreateVariableByName("signature");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_trace, "trace"),
      				
      		new ExportedParameter(body, var_signature, "signature")
      	));
      	new TypeConstraint(body, new FlatTuple(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "MethodSignatureTrace")));
      	new TypeConstraint(body, new FlatTuple(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "MethodSignatureTrace")));
      	new TypeConstraint(body, new FlatTuple(var_trace, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "MethodSignatureTrace", "signatureString")));
      	new Equality(body, var__virtual_0_, var_signature);
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
