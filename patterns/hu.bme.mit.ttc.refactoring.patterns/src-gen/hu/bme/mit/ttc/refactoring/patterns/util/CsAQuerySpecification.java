package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.CsAMatch;
import hu.bme.mit.ttc.refactoring.patterns.CsAMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.CommonParentQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate CsAMatcher in a type-safe way.
 * 
 * @see CsAMatcher
 * @see CsAMatch
 * 
 */
@SuppressWarnings("all")
public final class CsAQuerySpecification extends BaseGeneratedEMFQuerySpecification<CsAMatcher> {
  private CsAQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CsAQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CsAMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CsAMatcher.on(engine);
  }
  
  @Override
  public CsAMatch newEmptyMatch() {
    return CsAMatch.newEmptyMatch();
  }
  
  @Override
  public CsAMatch newMatch(final Object... parameters) {
    return CsAMatch.newMatch((TypeGraphBasic.TClass) parameters[0], (TypeGraphBasic.TClass) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CsAQuerySpecification INSTANCE = make();
    
    public static CsAQuerySpecification make() {
      return new CsAQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CsAQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.csA";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("child1","childN");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("child1", "TypeGraphBasic.TClass"),new PParameter("childN", "TypeGraphBasic.TClass"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_child1 = body.getOrCreateVariableByName("child1");
      	PVariable var_childN = body.getOrCreateVariableByName("childN");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_child1, "child1"),
      				
      		new ExportedParameter(body, var_childN, "childN")
      	));
      	new TypeConstraint(body, new FlatTuple(var_child1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_childN), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new NegativePatternCall(body, new FlatTuple(var___0_, var_child1, var_childN), CommonParentQuerySpecification.instance().getInternalQueryRepresentation());
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
