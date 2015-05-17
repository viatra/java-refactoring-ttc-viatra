package hu.bme.mit.ttc.refactoring.patterns.util;

import com.google.common.collect.Sets;
import hu.bme.mit.ttc.refactoring.patterns.PackageWithNameMatch;
import hu.bme.mit.ttc.refactoring.patterns.PackageWithNameMatcher;
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
 * A pattern-specific query specification that can instantiate PackageWithNameMatcher in a type-safe way.
 * 
 * @see PackageWithNameMatcher
 * @see PackageWithNameMatch
 * 
 */
@SuppressWarnings("all")
public final class PackageWithNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<PackageWithNameMatcher> {
  private PackageWithNameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PackageWithNameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PackageWithNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PackageWithNameMatcher.on(engine);
  }
  
  @Override
  public PackageWithNameMatch newEmptyMatch() {
    return PackageWithNameMatch.newEmptyMatch();
  }
  
  @Override
  public PackageWithNameMatch newMatch(final Object... parameters) {
    return PackageWithNameMatch.newMatch((TypeGraphBasic.TPackage) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static PackageWithNameQuerySpecification INSTANCE = make();
    
    public static PackageWithNameQuerySpecification make() {
      return new PackageWithNameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static PackageWithNameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.ttc.refactoring.patterns.packageWithName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("tPackage","packageName");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("tPackage", "TypeGraphBasic.TPackage"),new PParameter("packageName", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_tPackage = body.getOrCreateVariableByName("tPackage");
      	PVariable var_packageName = body.getOrCreateVariableByName("packageName");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_tPackage, "tPackage"),
      				
      		new ExportedParameter(body, var_packageName, "packageName")
      	));
      	new TypeConstraint(body, new FlatTuple(var_tPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TPackage")));
      	new TypeConstraint(body, new FlatTuple(var_tPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TPackage")));
      	new TypeConstraint(body, new FlatTuple(var_tPackage, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("platform:/plugin/TypeGraphBasic/model/TypeGraphBasic.ecore", "TPackage", "tName")));
      	new Equality(body, var__virtual_0_, var_packageName);
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
