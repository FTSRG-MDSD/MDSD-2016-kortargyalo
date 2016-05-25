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
 * A pattern-specific query specification that can instantiate ObservesSameObjectMatcher in a type-safe way.
 * 
 * @see ObservesSameObjectMatcher
 * @see ObservesSameObjectMatch
 * 
 */
@SuppressWarnings("all")
final class ObservesSameObjectQuerySpecification extends BaseGeneratedEMFQuerySpecification<IncQueryMatcher<IPatternMatch>> {
  private ObservesSameObjectQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ObservesSameObjectQuerySpecification instance() throws IncQueryException {
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
    private final static ObservesSameObjectQuerySpecification INSTANCE = make();
    
    public static ObservesSameObjectQuerySpecification make() {
      return new ObservesSameObjectQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ObservesSameObjectQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.observesSameObject";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("left","right");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("left", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation"),new PParameter("right", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_left = body.getOrCreateVariableByName("left");
      		PVariable var_right = body.getOrCreateVariableByName("right");
      		PVariable var_obstacle = body.getOrCreateVariableByName("obstacle");
      		new TypeConstraint(body, new FlatTuple(var_left), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation")));
      		new TypeConstraint(body, new FlatTuple(var_right), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_left, "left"),
      		   new ExportedParameter(body, var_right, "right")
      		));
      		// 	ObstacleObservation.obstacle(left, obstacle)
      		new TypeConstraint(body, new FlatTuple(var_left), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "ObstacleObservation")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_left, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "ObstacleObservation", "obstacle")));
      		new Equality(body, var__virtual_0_, var_obstacle);
      		// 	ObstacleObservation.obstacle(right, obstacle)
      		new TypeConstraint(body, new FlatTuple(var_right), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "ObstacleObservation")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_right, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "ObstacleObservation", "obstacle")));
      		new Equality(body, var__virtual_1_, var_obstacle);
      		bodies.add(body);
      	}
      	{
      		PBody body = new PBody(this);
      		PVariable var_left = body.getOrCreateVariableByName("left");
      		PVariable var_right = body.getOrCreateVariableByName("right");
      		PVariable var_drone = body.getOrCreateVariableByName("drone");
      		new TypeConstraint(body, new FlatTuple(var_left), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation")));
      		new TypeConstraint(body, new FlatTuple(var_right), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_left, "left"),
      		   new ExportedParameter(body, var_right, "right")
      		));
      		// 	DroneObservation.drone(left, drone)
      		new TypeConstraint(body, new FlatTuple(var_left), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneObservation")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_left, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneObservation", "drone")));
      		new Equality(body, var__virtual_0_, var_drone);
      		// 	DroneObservation.drone(right, drone)
      		new TypeConstraint(body, new FlatTuple(var_right), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneObservation")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_right, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneObservation", "drone")));
      		new Equality(body, var__virtual_1_, var_drone);
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
