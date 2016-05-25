package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneBatteryDepletedMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneBatteryDepletedMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate DroneBatteryDepletedMatcher in a type-safe way.
 * 
 * @see DroneBatteryDepletedMatcher
 * @see DroneBatteryDepletedMatch
 * 
 */
@SuppressWarnings("all")
public final class DroneBatteryDepletedQuerySpecification extends BaseGeneratedEMFQuerySpecification<DroneBatteryDepletedMatcher> {
  private DroneBatteryDepletedQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DroneBatteryDepletedQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DroneBatteryDepletedMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DroneBatteryDepletedMatcher.on(engine);
  }
  
  @Override
  public DroneBatteryDepletedMatch newEmptyMatch() {
    return DroneBatteryDepletedMatch.newEmptyMatch();
  }
  
  @Override
  public DroneBatteryDepletedMatch newMatch(final Object... parameters) {
    return DroneBatteryDepletedMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static DroneBatteryDepletedQuerySpecification INSTANCE = make();
    
    public static DroneBatteryDepletedQuerySpecification make() {
      return new DroneBatteryDepletedQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DroneBatteryDepletedQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.droneBatteryDepleted";
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
      		PVariable var_battery = body.getOrCreateVariableByName("battery");
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_drone, "drone")
      		));
      		// 	DroneInstance.currentBattery(drone, battery)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "currentBattery")));
      		new Equality(body, var__virtual_0_, var_battery);
      		// 	check(battery <= 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern droneBatteryDepleted";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("battery");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Double battery = (java.lang.Double) provider.getValue("battery");
      		                                    return evaluateExpression_1_1(battery);
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
  
  private static boolean evaluateExpression_1_1(final Double battery) {
    return ((battery).doubleValue() <= 0);
  }
}
