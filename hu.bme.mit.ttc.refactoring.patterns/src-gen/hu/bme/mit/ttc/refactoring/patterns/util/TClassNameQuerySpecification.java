package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.TClassNameMatch;
import hu.bme.mit.ttc.refactoring.patterns.TClassNameMatcher;
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
 * A pattern-specific query specification that can instantiate TClassNameMatcher in a type-safe way.
 * 
 * @see TClassNameMatcher
 * @see TClassNameMatch
 * 
 */
@SuppressWarnings("all")
public final class TClassNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<TClassNameMatcher> {
  private TClassNameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TClassNameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TClassNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TClassNameMatcher.on(engine);
  }
  
  @Override
  public TClassNameMatch newEmptyMatch() {
    return TClassNameMatch.newEmptyMatch();
  }
  
  @Override
  public TClassNameMatch newMatch(final Object... parameters) {
    return TClassNameMatch.newMatch((TypeGraphBasic.TClass) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TClassNameQuerySpecification INSTANCE = make();
    
    public static TClassNameQuerySpecification make() {
      return new TClassNameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TClassNameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.tClassName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("tClass","className");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("tClass", "TypeGraphBasic.TClass"),new PParameter("className", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_tClass = body.getOrCreateVariableByName("tClass");
      	PVariable var_className = body.getOrCreateVariableByName("className");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_tClass, "tClass"),
      				
      		new ExportedParameter(body, var_className, "className")
      	));
      	new TypeConstraint(body, new FlatTuple(var_tClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_tClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_tClass, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "tName")));
      	new Equality(body, var__virtual_0_, var_className);
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
