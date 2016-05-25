package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
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
 * A pattern-specific query specification that can instantiate RoleFilledMatcher in a type-safe way.
 * 
 * @see RoleFilledMatcher
 * @see RoleFilledMatch
 * 
 */
@SuppressWarnings("all")
final class RoleFilledQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  private RoleFilledQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static RoleFilledQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected IncQueryMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newEmptyMatch() {
    throw new UnsupportedOperationException();
  }
  
  @Override
  public IPatternMatch newMatch(final Object... parameters) {
    throw new UnsupportedOperationException();
  }
  
  private static class LazyHolder {
    private final static RoleFilledQuerySpecification INSTANCE = make();
    
    public static RoleFilledQuerySpecification make() {
      return new RoleFilledQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static RoleFilledQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.roleFilled";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("task","role");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("task", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance"),new PParameter("role", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.RoleInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_task = body.getOrCreateVariableByName("task");
      		PVariable var_role = body.getOrCreateVariableByName("role");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "TaskInstance")));
      		new TypeConstraint(body, new FlatTuple(var_role), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "RoleInstance")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_task, "task"),
      		   new ExportedParameter(body, var_role, "role")
      		));
      		// 	TaskInstance.roleInstances(task, role)
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "TaskInstance")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_task, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "TaskInstance", "roleInstances")));
      		new Equality(body, var__virtual_0_, var_role);
      		// 	RoleInstance.allocatedDrone(role, _)
      		new TypeConstraint(body, new FlatTuple(var_role), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "RoleInstance")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_role, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "RoleInstance", "allocatedDrone")));
      		new Equality(body, var__virtual_1_, var___0_);
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
