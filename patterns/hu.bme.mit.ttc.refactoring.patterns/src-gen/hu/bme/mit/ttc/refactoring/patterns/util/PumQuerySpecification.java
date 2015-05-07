package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.PumMatch;
import hu.bme.mit.ttc.refactoring.patterns.PumMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.HasMethodQuerySpecification;
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
 * A pattern-specific query specification that can instantiate PumMatcher in a type-safe way.
 * 
 * @see PumMatcher
 * @see PumMatch
 * 
 */
@SuppressWarnings("all")
public final class PumQuerySpecification extends BaseGeneratedEMFQuerySpecification<PumMatcher> {
  private PumQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PumQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PumMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PumMatcher.on(engine);
  }
  
  @Override
  public PumMatch newEmptyMatch() {
    return PumMatch.newEmptyMatch();
  }
  
  @Override
  public PumMatch newMatch(final Object... parameters) {
    return PumMatch.newMatch((TypeGraphBasic.TClass) parameters[0], (TypeGraphBasic.TClass) parameters[1], (TypeGraphBasic.TClass) parameters[2], (TypeGraphBasic.TMethodDefinition) parameters[3], (TypeGraphBasic.TMethodDefinition) parameters[4], (TypeGraphBasic.TMethodSignature) parameters[5]);
  }
  
  private static class LazyHolder {
    private final static PumQuerySpecification INSTANCE = make();
    
    public static PumQuerySpecification make() {
      return new PumQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static PumQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.pum";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parent","child1","childN","definition1","definitionN","signature");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("parent", "TypeGraphBasic.TClass"),new PParameter("child1", "TypeGraphBasic.TClass"),new PParameter("childN", "TypeGraphBasic.TClass"),new PParameter("definition1", "TypeGraphBasic.TMethodDefinition"),new PParameter("definitionN", "TypeGraphBasic.TMethodDefinition"),new PParameter("signature", "TypeGraphBasic.TMethodSignature"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_parent = body.getOrCreateVariableByName("parent");
      	PVariable var_child1 = body.getOrCreateVariableByName("child1");
      	PVariable var_childN = body.getOrCreateVariableByName("childN");
      	PVariable var_definition1 = body.getOrCreateVariableByName("definition1");
      	PVariable var_definitionN = body.getOrCreateVariableByName("definitionN");
      	PVariable var_signature = body.getOrCreateVariableByName("signature");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      	PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_parent, "parent"),
      				
      		new ExportedParameter(body, var_child1, "child1"),
      				
      		new ExportedParameter(body, var_childN, "childN"),
      				
      		new ExportedParameter(body, var_definition1, "definition1"),
      				
      		new ExportedParameter(body, var_definitionN, "definitionN"),
      				
      		new ExportedParameter(body, var_signature, "signature")
      	));
      	new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "childClasses")));
      	new Equality(body, var__virtual_0_, var_child1);
      	new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "childClasses")));
      	new Equality(body, var__virtual_1_, var_childN);
      	new TypeConstraint(body, new FlatTuple(var_child1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_child1, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "defines")));
      	new Equality(body, var__virtual_2_, var_definition1);
      	new TypeConstraint(body, new FlatTuple(var_childN), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_childN, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "defines")));
      	new Equality(body, var__virtual_3_, var_definitionN);
      	new TypeConstraint(body, new FlatTuple(var_definition1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodDefinition")));
      	new TypeConstraint(body, new FlatTuple(var_definition1, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodDefinition", "signature")));
      	new Equality(body, var__virtual_4_, var_signature);
      	new TypeConstraint(body, new FlatTuple(var_definitionN), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodDefinition")));
      	new TypeConstraint(body, new FlatTuple(var_definitionN, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodDefinition", "signature")));
      	new Equality(body, var__virtual_5_, var_signature);
      	new NegativePatternCall(body, new FlatTuple(var_parent, var_signature), HasMethodQuerySpecification.instance().getInternalQueryRepresentation());
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
