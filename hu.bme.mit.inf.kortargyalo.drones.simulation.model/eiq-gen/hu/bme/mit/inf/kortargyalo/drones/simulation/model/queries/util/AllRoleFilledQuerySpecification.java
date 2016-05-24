package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllRoleFilledMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllRoleFilledMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.NotAllRoleFilledQuerySpecification;
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
 * A pattern-specific query specification that can instantiate AllRoleFilledMatcher in a type-safe way.
 * 
 * @see AllRoleFilledMatcher
 * @see AllRoleFilledMatch
 * 
 */
@SuppressWarnings("all")
public final class AllRoleFilledQuerySpecification extends BaseGeneratedEMFQuerySpecification<AllRoleFilledMatcher> {
  private AllRoleFilledQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllRoleFilledQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllRoleFilledMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AllRoleFilledMatcher.on(engine);
  }
  
  @Override
  public AllRoleFilledMatch newEmptyMatch() {
    return AllRoleFilledMatch.newEmptyMatch();
  }
  
  @Override
  public AllRoleFilledMatch newMatch(final Object... parameters) {
    return AllRoleFilledMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static AllRoleFilledQuerySpecification INSTANCE = make();
    
    public static AllRoleFilledQuerySpecification make() {
      return new AllRoleFilledQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AllRoleFilledQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.allRoleFilled";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("t", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_t = body.getOrCreateVariableByName("t");
      		new TypeConstraint(body, new FlatTuple(var_t), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "TaskInstance")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_t, "t")
      		));
      		// 	neg find notAllRoleFilled(t)
      		new NegativePatternCall(body, new FlatTuple(var_t), NotAllRoleFilledQuerySpecification.instance().getInternalQueryRepresentation());
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
