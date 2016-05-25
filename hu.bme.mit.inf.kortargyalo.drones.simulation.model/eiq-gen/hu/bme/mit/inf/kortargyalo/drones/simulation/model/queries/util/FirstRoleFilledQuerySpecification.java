package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.FirstRoleFilledMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.FirstRoleFilledMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.RoleFilledQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate FirstRoleFilledMatcher in a type-safe way.
 * 
 * @see FirstRoleFilledMatcher
 * @see FirstRoleFilledMatch
 * 
 */
@SuppressWarnings("all")
public final class FirstRoleFilledQuerySpecification extends BaseGeneratedEMFQuerySpecification<FirstRoleFilledMatcher> {
  private FirstRoleFilledQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FirstRoleFilledQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected FirstRoleFilledMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FirstRoleFilledMatcher.on(engine);
  }
  
  @Override
  public FirstRoleFilledMatch newEmptyMatch() {
    return FirstRoleFilledMatch.newEmptyMatch();
  }
  
  @Override
  public FirstRoleFilledMatch newMatch(final Object... parameters) {
    return FirstRoleFilledMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static FirstRoleFilledQuerySpecification INSTANCE = make();
    
    public static FirstRoleFilledQuerySpecification make() {
      return new FirstRoleFilledQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static FirstRoleFilledQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.firstRoleFilled";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("task");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("task", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_task = body.getOrCreateVariableByName("task");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "TaskInstance")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_task, "task")
      		));
      		// 	TaskInstance.state(task, ::NOT_STARTED)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, getEnumLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "TaskState", "NOT_STARTED").getInstance());
      		new TypeConstraint(body, new FlatTuple(var_task), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "TaskInstance")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_task, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "TaskInstance", "state")));
      		new Equality(body, var__virtual_1_, var__virtual_0_);
      		// 	count find roleFilled(task, _) == 1
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new PatternMatchCounter(body, new FlatTuple(var_task, var___0_), RoleFilledQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_2_);
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new ConstantValue(body, var__virtual_3_, 1);
      		new Equality(body, var__virtual_2_, var__virtual_3_);
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
