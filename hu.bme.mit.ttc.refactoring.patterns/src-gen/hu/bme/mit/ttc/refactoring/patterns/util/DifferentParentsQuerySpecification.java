package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.DifferentParentsMatch;
import hu.bme.mit.ttc.refactoring.patterns.DifferentParentsMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.HasParentQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate DifferentParentsMatcher in a type-safe way.
 * 
 * @see DifferentParentsMatcher
 * @see DifferentParentsMatch
 * 
 */
@SuppressWarnings("all")
public final class DifferentParentsQuerySpecification extends BaseGeneratedEMFQuerySpecification<DifferentParentsMatcher> {
  private DifferentParentsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DifferentParentsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DifferentParentsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DifferentParentsMatcher.on(engine);
  }
  
  @Override
  public DifferentParentsMatch newEmptyMatch() {
    return DifferentParentsMatch.newEmptyMatch();
  }
  
  @Override
  public DifferentParentsMatch newMatch(final Object... parameters) {
    return DifferentParentsMatch.newMatch((TypeGraphBasic.TClass) parameters[0], (TypeGraphBasic.TClass) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static DifferentParentsQuerySpecification INSTANCE = make();
    
    public static DifferentParentsQuerySpecification make() {
      return new DifferentParentsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DifferentParentsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.differentParents";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("classOne","classTwo");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("classOne", "TypeGraphBasic.TClass"),new PParameter("classTwo", "TypeGraphBasic.TClass"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_classOne = body.getOrCreateVariableByName("classOne");
      	PVariable var_classTwo = body.getOrCreateVariableByName("classTwo");
      	PVariable var_parentClassOne = body.getOrCreateVariableByName("parentClassOne");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_parentClassTwo = body.getOrCreateVariableByName("parentClassTwo");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_classOne, "classOne"),
      				
      		new ExportedParameter(body, var_classTwo, "classTwo")
      	));
      	new TypeConstraint(body, new FlatTuple(var_classOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classOne, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "parentClass")));
      	new Equality(body, var__virtual_0_, var_parentClassOne);
      	new TypeConstraint(body, new FlatTuple(var_classTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classTwo, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "parentClass")));
      	new Equality(body, var__virtual_1_, var_parentClassTwo);
      	new Inequality(body, var_parentClassOne, var_parentClassTwo);
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_classOne = body.getOrCreateVariableByName("classOne");
      	PVariable var_classTwo = body.getOrCreateVariableByName("classTwo");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_classOne, "classOne"),
      				
      		new ExportedParameter(body, var_classTwo, "classTwo")
      	));
      	new TypeConstraint(body, new FlatTuple(var_classOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new PositivePatternCall(body, new FlatTuple(var_classOne), HasParentQuerySpecification.instance().getInternalQueryRepresentation());
      	new NegativePatternCall(body, new FlatTuple(var_classTwo), HasParentQuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      {
      	PBody body = new PBody(this);
      	PVariable var_classOne = body.getOrCreateVariableByName("classOne");
      	PVariable var_classTwo = body.getOrCreateVariableByName("classTwo");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_classOne, "classOne"),
      				
      		new ExportedParameter(body, var_classTwo, "classTwo")
      	));
      	new TypeConstraint(body, new FlatTuple(var_classOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new PositivePatternCall(body, new FlatTuple(var_classTwo), HasParentQuerySpecification.instance().getInternalQueryRepresentation());
      	new NegativePatternCall(body, new FlatTuple(var_classOne), HasParentQuerySpecification.instance().getInternalQueryRepresentation());
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
