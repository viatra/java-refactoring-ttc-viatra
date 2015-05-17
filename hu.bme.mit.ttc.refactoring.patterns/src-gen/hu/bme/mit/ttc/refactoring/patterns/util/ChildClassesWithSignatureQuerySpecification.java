package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesWithSignatureMatch;
import hu.bme.mit.ttc.refactoring.patterns.ChildClassesWithSignatureMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.ClassWithSignatureQuerySpecification;
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
 * A pattern-specific query specification that can instantiate ChildClassesWithSignatureMatcher in a type-safe way.
 * 
 * @see ChildClassesWithSignatureMatcher
 * @see ChildClassesWithSignatureMatch
 * 
 */
@SuppressWarnings("all")
public final class ChildClassesWithSignatureQuerySpecification extends BaseGeneratedEMFQuerySpecification<ChildClassesWithSignatureMatcher> {
  private ChildClassesWithSignatureQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ChildClassesWithSignatureQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChildClassesWithSignatureMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ChildClassesWithSignatureMatcher.on(engine);
  }
  
  @Override
  public ChildClassesWithSignatureMatch newEmptyMatch() {
    return ChildClassesWithSignatureMatch.newEmptyMatch();
  }
  
  @Override
  public ChildClassesWithSignatureMatch newMatch(final Object... parameters) {
    return ChildClassesWithSignatureMatch.newMatch((TypeGraphBasic.TClass) parameters[0], (TypeGraphBasic.TClass) parameters[1], (TypeGraphBasic.TMethodSignature) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static ChildClassesWithSignatureQuerySpecification INSTANCE = make();
    
    public static ChildClassesWithSignatureQuerySpecification make() {
      return new ChildClassesWithSignatureQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ChildClassesWithSignatureQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.childClassesWithSignature";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parentClass","clazz","methodSignature");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("parentClass", "TypeGraphBasic.TClass"),new PParameter("clazz", "TypeGraphBasic.TClass"),new PParameter("methodSignature", "TypeGraphBasic.TMethodSignature"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_parentClass = body.getOrCreateVariableByName("parentClass");
      	PVariable var_clazz = body.getOrCreateVariableByName("clazz");
      	PVariable var_methodSignature = body.getOrCreateVariableByName("methodSignature");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_parentClass, "parentClass"),
      				
      		new ExportedParameter(body, var_clazz, "clazz"),
      				
      		new ExportedParameter(body, var_methodSignature, "methodSignature")
      	));
      	new TypeConstraint(body, new FlatTuple(var_parentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_clazz), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TMethodSignature")));
      	new TypeConstraint(body, new FlatTuple(var_parentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_parentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_parentClass, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "childClasses")));
      	new Equality(body, var__virtual_0_, var_clazz);
      	new PositivePatternCall(body, new FlatTuple(var_clazz, var_methodSignature), ClassWithSignatureQuerySpecification.instance().getInternalQueryRepresentation());
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
