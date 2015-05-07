package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.PumNamesMatch;
import hu.bme.mit.ttc.refactoring.patterns.PumNamesMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.PumQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate PumNamesMatcher in a type-safe way.
 * 
 * @see PumNamesMatcher
 * @see PumNamesMatch
 * 
 */
@SuppressWarnings("all")
public final class PumNamesQuerySpecification extends BaseGeneratedEMFQuerySpecification<PumNamesMatcher> {
  private PumNamesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PumNamesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PumNamesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PumNamesMatcher.on(engine);
  }
  
  @Override
  public PumNamesMatch newEmptyMatch() {
    return PumNamesMatch.newEmptyMatch();
  }
  
  @Override
  public PumNamesMatch newMatch(final Object... parameters) {
    return PumNamesMatch.newMatch((java.lang.String) parameters[0], (java.lang.String) parameters[1], (java.lang.String) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static PumNamesQuerySpecification INSTANCE = make();
    
    public static PumNamesQuerySpecification make() {
      return new PumNamesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static PumNamesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.pumNames";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parentName","child1Name","childNName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("parentName", "java.lang.String"),new PParameter("child1Name", "java.lang.String"),new PParameter("childNName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_parentName = body.getOrCreateVariableByName("parentName");
      	PVariable var_child1Name = body.getOrCreateVariableByName("child1Name");
      	PVariable var_childNName = body.getOrCreateVariableByName("childNName");
      	PVariable var_parent = body.getOrCreateVariableByName("parent");
      	PVariable var_child1 = body.getOrCreateVariableByName("child1");
      	PVariable var_childN = body.getOrCreateVariableByName("childN");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_parentName, "parentName"),
      				
      		new ExportedParameter(body, var_child1Name, "child1Name"),
      				
      		new ExportedParameter(body, var_childNName, "childNName")
      	));
      	new PositivePatternCall(body, new FlatTuple(var_parent, var_child1, var_childN), PumQuerySpecification.instance().getInternalQueryRepresentation());
      	new TypeConstraint(body, new FlatTuple(var_parent), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_parent, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "tName")));
      	new Equality(body, var__virtual_0_, var_parentName);
      	new TypeConstraint(body, new FlatTuple(var_child1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_child1, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "tName")));
      	new Equality(body, var__virtual_1_, var_child1Name);
      	new TypeConstraint(body, new FlatTuple(var_childN), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_childN, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass", "tName")));
      	new Equality(body, var__virtual_2_, var_childNName);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern pumNames";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("child1Name", "childNName");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.String child1Name = (java.lang.String) provider.getValue("child1Name");
      			java.lang.String childNName = (java.lang.String) provider.getValue("childNName");
      			return evaluateExpression_1_1(child1Name, childNName);
      		}
      
      },  null); 
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
  
  private static boolean evaluateExpression_1_1(final String child1Name, final String childNName) {
    boolean _lessThan = (child1Name.compareTo(childNName) < 0);
    return _lessThan;
  }
}
