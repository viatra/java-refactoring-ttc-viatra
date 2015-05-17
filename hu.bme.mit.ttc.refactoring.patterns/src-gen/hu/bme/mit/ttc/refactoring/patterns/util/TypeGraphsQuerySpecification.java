package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.TypeGraphsMatch;
import hu.bme.mit.ttc.refactoring.patterns.TypeGraphsMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate TypeGraphsMatcher in a type-safe way.
 * 
 * @see TypeGraphsMatcher
 * @see TypeGraphsMatch
 * 
 */
@SuppressWarnings("all")
public final class TypeGraphsQuerySpecification extends BaseGeneratedEMFQuerySpecification<TypeGraphsMatcher> {
  private TypeGraphsQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TypeGraphsQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TypeGraphsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TypeGraphsMatcher.on(engine);
  }
  
  @Override
  public TypeGraphsMatch newEmptyMatch() {
    return TypeGraphsMatch.newEmptyMatch();
  }
  
  @Override
  public TypeGraphsMatch newMatch(final Object... parameters) {
    return TypeGraphsMatch.newMatch((TypeGraphBasic.TypeGraph) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static TypeGraphsQuerySpecification INSTANCE = make();
    
    public static TypeGraphsQuerySpecification make() {
      return new TypeGraphsQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TypeGraphsQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.typeGraphs";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("typeGraph");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("typeGraph", "TypeGraphBasic.TypeGraph"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_typeGraph = body.getOrCreateVariableByName("typeGraph");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_typeGraph, "typeGraph")
      	));
      	new TypeConstraint(body, new FlatTuple(var_typeGraph), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TypeGraph")));
      	new TypeConstraint(body, new FlatTuple(var_typeGraph), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TypeGraph")));
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
