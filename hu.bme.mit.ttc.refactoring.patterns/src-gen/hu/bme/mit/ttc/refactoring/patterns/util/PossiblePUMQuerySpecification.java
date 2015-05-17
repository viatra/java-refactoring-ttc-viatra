package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.PossiblePUMMatch;
import hu.bme.mit.ttc.refactoring.patterns.PossiblePUMMatcher;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildClassesWithSignatureQuerySpecification;
import hu.bme.mit.ttc.refactoring.patterns.util.ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate PossiblePUMMatcher in a type-safe way.
 * 
 * @see PossiblePUMMatcher
 * @see PossiblePUMMatch
 * 
 */
@SuppressWarnings("all")
public final class PossiblePUMQuerySpecification extends BaseGeneratedEMFQuerySpecification<PossiblePUMMatcher> {
  private PossiblePUMQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PossiblePUMQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PossiblePUMMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PossiblePUMMatcher.on(engine);
  }
  
  @Override
  public PossiblePUMMatch newEmptyMatch() {
    return PossiblePUMMatch.newEmptyMatch();
  }
  
  @Override
  public PossiblePUMMatch newMatch(final Object... parameters) {
    return PossiblePUMMatch.newMatch((TypeGraphBasic.TClass) parameters[0], (TypeGraphTrace.MethodSignatureTrace) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static PossiblePUMQuerySpecification INSTANCE = make();
    
    public static PossiblePUMQuerySpecification make() {
      return new PossiblePUMQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static PossiblePUMQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.possiblePUM";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("parentClass","methodSignatureTrace");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("parentClass", "TypeGraphBasic.TClass"),new PParameter("methodSignatureTrace", "TypeGraphTrace.MethodSignatureTrace"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_parentClass = body.getOrCreateVariableByName("parentClass");
      	PVariable var_methodSignatureTrace = body.getOrCreateVariableByName("methodSignatureTrace");
      	PVariable var_methodSignature = body.getOrCreateVariableByName("methodSignature");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var_N = body.getOrCreateVariableByName("N");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	PVariable var_M = body.getOrCreateVariableByName("M");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      	PVariable var_childClass = body.getOrCreateVariableByName("childClass");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_parentClass, "parentClass"),
      				
      		new ExportedParameter(body, var_methodSignatureTrace, "methodSignatureTrace")
      	));
      	new TypeConstraint(body, new FlatTuple(var_parentClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TClass")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignatureTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "MethodSignatureTrace")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignatureTrace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "MethodSignatureTrace")));
      	new TypeConstraint(body, new FlatTuple(var_methodSignatureTrace, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphTrace.ecore", "MethodSignatureTrace", "tMethodSignature")));
      	new Equality(body, var__virtual_0_, var_methodSignature);
      	new PatternMatchCounter(body, new FlatTuple(var_parentClass, var___0_, var_methodSignature), ChildClassesWithSignatureQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      	new Equality(body, var_N, var__virtual_1_);
      	new PatternMatchCounter(body, new FlatTuple(var_parentClass, var___1_), ChildClassesQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_2_);
      	new Equality(body, var_M, var__virtual_2_);
      new ExpressionEvaluation(body, new IExpressionEvaluator() {
      	
      	@Override
      	public String getShortDescription() {
      		return "Expression evaluation from pattern possiblePUM";
      	}
      
      	@Override
      	public Iterable<String> getInputParameterNames() {
      		return Arrays.asList("M", "N");
      	}
      
      	@Override
      	public Object evaluateExpression(IValueProvider provider) throws Exception {
      			java.lang.Integer M = (java.lang.Integer) provider.getValue("M");
      			java.lang.Integer N = (java.lang.Integer) provider.getValue("N");
      			return evaluateExpression_1_1(M, N);
      		}
      
      },  null); 
      	new NegativePatternCall(body, new FlatTuple(var_parentClass, var_methodSignature), ClassWithSignatureQuerySpecification.instance().getInternalQueryRepresentation());
      	new NegativePatternCall(body, new FlatTuple(var_childClass, var_methodSignature), ChildrenClassMethodDefinitionsAccessingSiblingMembersQuerySpecification.instance().getInternalQueryRepresentation());
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
  
  private static boolean evaluateExpression_1_1(final Integer M, final Integer N) {
    boolean _and = false;
    boolean _equals = Objects.equal(N, M);
    if (!_equals) {
      _and = false;
    } else {
      _and = ((N).intValue() != 0);
    }
    return _and;
  }
}
