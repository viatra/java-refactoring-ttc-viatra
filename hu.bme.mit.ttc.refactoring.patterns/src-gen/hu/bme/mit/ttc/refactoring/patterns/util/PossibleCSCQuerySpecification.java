package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.PossibleCSCMatch;
import hu.bme.mit.ttc.refactoring.patterns.PossibleCSCMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesWithDifferentParentsQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate PossibleCSCMatcher in a type-safe way.
 * 
 * @see PossibleCSCMatcher
 * @see PossibleCSCMatch
 * 
 */
@SuppressWarnings("all")
public final class PossibleCSCQuerySpecification extends BaseGeneratedEMFQuerySpecification<PossibleCSCMatcher> {
  private PossibleCSCQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PossibleCSCQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PossibleCSCMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PossibleCSCMatcher.on(engine);
  }
  
  @Override
  public PossibleCSCMatch newEmptyMatch() {
    return PossibleCSCMatch.newEmptyMatch();
  }
  
  @Override
  public PossibleCSCMatch newMatch(final Object... parameters) {
    return PossibleCSCMatch.newMatch((java.lang.String) parameters[0], (TypeGraphBasic.TMethodSignature) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static PossibleCSCQuerySpecification INSTANCE = make();
    
    public static PossibleCSCQuerySpecification make() {
      return new PossibleCSCQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static PossibleCSCQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.possibleCSC";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("concatSignature","methodSignature");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("concatSignature", "java.lang.String"),new PParameter("methodSignature", "TypeGraphBasic.TMethodSignature"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_concatSignature = body.getOrCreateVariableByName("concatSignature");
      	PVariable var_methodSignature = body.getOrCreateVariableByName("methodSignature");
      	PVariable var_classListTrace = body.getOrCreateVariableByName("classListTrace");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_concatSignature, "concatSignature"),
      				
      		new ExportedParameter(body, var_methodSignature, "methodSignature")
      	));
      	new TypeConstraint(body, new FlatTuple(var_methodSignature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature")));
      	new TypeConstraint(body, new FlatTuple(var_classListTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace")));
      	new TypeConstraint(body, new FlatTuple(var_classListTrace, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace", "concatSignature")));
      	new Equality(body, var__virtual_0_, var_concatSignature);
      	new TypeConstraint(body, new FlatTuple(var_classListTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace")));
      	new TypeConstraint(body, new FlatTuple(var_classListTrace, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace", "tClasses")));
      	new TypeConstraint(body, new FlatTuple(var__virtual_1_, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "signature")));
      	new Equality(body, var__virtual_2_, var_methodSignature);
      	new NegativePatternCall(body, new FlatTuple(var_classListTrace, var___0_, var___1_), ChildClassesWithDifferentParentsQuerySpecification.instance().getInternalQueryRepresentation());
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
