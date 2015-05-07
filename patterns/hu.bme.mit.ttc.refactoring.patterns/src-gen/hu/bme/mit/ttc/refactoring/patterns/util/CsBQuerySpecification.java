package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.CsBMatch;
import hu.bme.mit.ttc.refactoring.patterns.CsBMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.CommonParentQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CsBMatcher in a type-safe way.
 * 
 * @see CsBMatcher
 * @see CsBMatch
 * 
 */
@SuppressWarnings("all")
public final class CsBQuerySpecification extends BaseGeneratedEMFQuerySpecification<CsBMatcher> {
  private CsBQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CsBQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CsBMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CsBMatcher.on(engine);
  }
  
  @Override
  public CsBMatch newEmptyMatch() {
    return CsBMatch.newEmptyMatch();
  }
  
  @Override
  public CsBMatch newMatch(final Object... parameters) {
    return CsBMatch.newMatch((TypeGraphBasic.TClass) parameters[0], (TypeGraphBasic.TClass) parameters[1], (TypeGraphBasic.TClass) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static CsBQuerySpecification INSTANCE = make();
    
    public static CsBQuerySpecification make() {
      return new CsBQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CsBQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.csB";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parent","child1","childN");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("parent", "TypeGraphBasic.TClass"),new PParameter("child1", "TypeGraphBasic.TClass"),new PParameter("childN", "TypeGraphBasic.TClass"));
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
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_parent, "parent"),
      				
      		new ExportedParameter(body, var_child1, "child1"),
      				
      		new ExportedParameter(body, var_childN, "childN")
      	));
      	new PositivePatternCall(body, new FlatTuple(var_parent, var_child1, var_childN), CommonParentQuerySpecification.instance().getInternalQueryRepresentation());
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
