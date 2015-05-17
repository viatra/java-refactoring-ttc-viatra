package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesWithDifferentParentsMatch;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesWithDifferentParentsMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.DifferentParentsQuerySpecification;
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
 * A pattern-specific query specification that can instantiate ChildClassesWithDifferentParentsMatcher in a type-safe way.
 * 
 * @see ChildClassesWithDifferentParentsMatcher
 * @see ChildClassesWithDifferentParentsMatch
 * 
 */
@SuppressWarnings("all")
public final class ChildClassesWithDifferentParentsQuerySpecification extends BaseGeneratedEMFQuerySpecification<ChildClassesWithDifferentParentsMatcher> {
  private ChildClassesWithDifferentParentsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ChildClassesWithDifferentParentsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChildClassesWithDifferentParentsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ChildClassesWithDifferentParentsMatcher.on(engine);
  }
  
  @Override
  public ChildClassesWithDifferentParentsMatch newEmptyMatch() {
    return ChildClassesWithDifferentParentsMatch.newEmptyMatch();
  }
  
  @Override
  public ChildClassesWithDifferentParentsMatch newMatch(final Object... parameters) {
    return ChildClassesWithDifferentParentsMatch.newMatch((TypeGraphTrace.ClassListTrace) parameters[0], (TypeGraphBasic.TClass) parameters[1], (TypeGraphBasic.TClass) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static ChildClassesWithDifferentParentsQuerySpecification INSTANCE = make();
    
    public static ChildClassesWithDifferentParentsQuerySpecification make() {
      return new ChildClassesWithDifferentParentsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ChildClassesWithDifferentParentsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.childClassesWithDifferentParents";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("classListTrace","classOne","classTwo");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("classListTrace", "TypeGraphTrace.ClassListTrace"),new PParameter("classOne", "TypeGraphBasic.TClass"),new PParameter("classTwo", "TypeGraphBasic.TClass"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_classListTrace = body.getOrCreateVariableByName("classListTrace");
      	PVariable var_classOne = body.getOrCreateVariableByName("classOne");
      	PVariable var_classTwo = body.getOrCreateVariableByName("classTwo");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_classListTrace, "classListTrace"),
      				
      		new ExportedParameter(body, var_classOne, "classOne"),
      				
      		new ExportedParameter(body, var_classTwo, "classTwo")
      	));
      	new TypeConstraint(body, new FlatTuple(var_classListTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace")));
      	new TypeConstraint(body, new FlatTuple(var_classOne), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classTwo), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_classListTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace")));
      	new TypeConstraint(body, new FlatTuple(var_classListTrace, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace", "tClasses")));
      	new Equality(body, var__virtual_0_, var_classOne);
      	new TypeConstraint(body, new FlatTuple(var_classListTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace")));
      	new TypeConstraint(body, new FlatTuple(var_classListTrace, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "ClassListTrace", "tClasses")));
      	new Equality(body, var__virtual_1_, var_classTwo);
      	new PositivePatternCall(body, new FlatTuple(var_classOne, var_classTwo), DifferentParentsQuerySpecification.instance().getInternalQueryRepresentation());
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
