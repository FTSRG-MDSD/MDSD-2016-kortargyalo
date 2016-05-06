package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.LeftSceneMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.LeftSceneMatcher;
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
 * A pattern-specific query specification that can instantiate LeftSceneMatcher in a type-safe way.
 * 
 * @see LeftSceneMatcher
 * @see LeftSceneMatch
 * 
 */
@SuppressWarnings("all")
public final class LeftSceneQuerySpecification extends BaseGeneratedEMFQuerySpecification<LeftSceneMatcher> {
  private LeftSceneQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static LeftSceneQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected LeftSceneMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return LeftSceneMatcher.on(engine);
  }
  
  @Override
  public LeftSceneMatch newEmptyMatch() {
    return LeftSceneMatch.newEmptyMatch();
  }
  
  @Override
  public LeftSceneMatch newMatch(final Object... parameters) {
    return LeftSceneMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static LeftSceneQuerySpecification INSTANCE = make();
    
    public static LeftSceneQuerySpecification make() {
      return new LeftSceneQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static LeftSceneQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.leftScene";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("drone");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("drone", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_drone = body.getOrCreateVariableByName("drone");
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_drone, "drone")
      		));
      		// 	DroneInstance(drone)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
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
