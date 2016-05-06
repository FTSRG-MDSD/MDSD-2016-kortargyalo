package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CollisionHelper;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CrashMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CrashMatcher;
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
 * A pattern-specific query specification that can instantiate CrashMatcher in a type-safe way.
 * 
 * @see CrashMatcher
 * @see CrashMatch
 * 
 */
@SuppressWarnings("all")
public final class CrashQuerySpecification extends BaseGeneratedEMFQuerySpecification<CrashMatcher> {
  private CrashQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CrashQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CrashMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CrashMatcher.on(engine);
  }
  
  @Override
  public CrashMatch newEmptyMatch() {
    return CrashMatch.newEmptyMatch();
  }
  
  @Override
  public CrashMatch newMatch(final Object... parameters) {
    return CrashMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) parameters[0], (hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CrashQuerySpecification INSTANCE = make();
    
    public static CrashQuerySpecification make() {
      return new CrashQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CrashQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.crash";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("drone1","drone2");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("drone1", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance"),new PParameter("drone2", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_drone1 = body.getOrCreateVariableByName("drone1");
      		PVariable var_drone2 = body.getOrCreateVariableByName("drone2");
      		PVariable var_drone1position = body.getOrCreateVariableByName("drone1position");
      		PVariable var_drone1positionx = body.getOrCreateVariableByName("drone1positionx");
      		PVariable var_drone1positiony = body.getOrCreateVariableByName("drone1positiony");
      		PVariable var_drone1positionz = body.getOrCreateVariableByName("drone1positionz");
      		PVariable var_drone1dimension = body.getOrCreateVariableByName("drone1dimension");
      		PVariable var_drone1dimensionz = body.getOrCreateVariableByName("drone1dimensionz");
      		PVariable var_drone1dimensiony = body.getOrCreateVariableByName("drone1dimensiony");
      		PVariable var_drone1dimensionx = body.getOrCreateVariableByName("drone1dimensionx");
      		PVariable var_drone2position = body.getOrCreateVariableByName("drone2position");
      		PVariable var_drone2positionx = body.getOrCreateVariableByName("drone2positionx");
      		PVariable var_drone2positiony = body.getOrCreateVariableByName("drone2positiony");
      		PVariable var_drone2positionz = body.getOrCreateVariableByName("drone2positionz");
      		PVariable var_drone2dimension = body.getOrCreateVariableByName("drone2dimension");
      		PVariable var_drone2dimensionz = body.getOrCreateVariableByName("drone2dimensionz");
      		PVariable var_drone2dimensiony = body.getOrCreateVariableByName("drone2dimensiony");
      		PVariable var_drone2dimensionx = body.getOrCreateVariableByName("drone2dimensionx");
      		new TypeConstraint(body, new FlatTuple(var_drone1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		new TypeConstraint(body, new FlatTuple(var_drone2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_drone1, "drone1"),
      		   new ExportedParameter(body, var_drone2, "drone2")
      		));
      		// 	DroneInstance.position(drone1,drone1position)
      		new TypeConstraint(body, new FlatTuple(var_drone1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_drone1, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "position")));
      		new Equality(body, var__virtual_0_, var_drone1position);
      		// 	Position.x(drone1position,drone1positionx)
      		new TypeConstraint(body, new FlatTuple(var_drone1position), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_drone1position, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "x")));
      		new Equality(body, var__virtual_1_, var_drone1positionx);
      		// 	Position.y(drone1position,drone1positiony)
      		new TypeConstraint(body, new FlatTuple(var_drone1position), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_drone1position, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "y")));
      		new Equality(body, var__virtual_2_, var_drone1positiony);
      		// 	Position.z(drone1position,drone1positionz)
      		new TypeConstraint(body, new FlatTuple(var_drone1position), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_drone1position, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "z")));
      		new Equality(body, var__virtual_3_, var_drone1positionz);
      		// 	DroneInstance.drone.dronetype.dimension(drone1,drone1dimension)
      		new TypeConstraint(body, new FlatTuple(var_drone1), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_drone1, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "drone")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Drone", "dronetype")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_5_, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType", "dimension")));
      		new Equality(body, var__virtual_6_, var_drone1dimension);
      		// 	Dimension.depth(drone1dimension, drone1dimensionz)
      		new TypeConstraint(body, new FlatTuple(var_drone1dimension), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension")));
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new TypeConstraint(body, new FlatTuple(var_drone1dimension, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "depth")));
      		new Equality(body, var__virtual_7_, var_drone1dimensionz);
      		// 	Dimension.height(drone1dimension, drone1dimensiony)
      		new TypeConstraint(body, new FlatTuple(var_drone1dimension), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension")));
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new TypeConstraint(body, new FlatTuple(var_drone1dimension, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "height")));
      		new Equality(body, var__virtual_8_, var_drone1dimensiony);
      		// 	Dimension.width(drone1dimension, drone1dimensionx)
      		new TypeConstraint(body, new FlatTuple(var_drone1dimension), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension")));
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new TypeConstraint(body, new FlatTuple(var_drone1dimension, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "width")));
      		new Equality(body, var__virtual_9_, var_drone1dimensionx);
      		// 		DroneInstance.position(drone2,drone2position)
      		new TypeConstraint(body, new FlatTuple(var_drone2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new TypeConstraint(body, new FlatTuple(var_drone2, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "position")));
      		new Equality(body, var__virtual_10_, var_drone2position);
      		// 	Position.x(drone2position,drone2positionx)
      		new TypeConstraint(body, new FlatTuple(var_drone2position), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position")));
      		PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
      		new TypeConstraint(body, new FlatTuple(var_drone2position, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "x")));
      		new Equality(body, var__virtual_11_, var_drone2positionx);
      		// 	Position.y(drone2position,drone2positiony)
      		new TypeConstraint(body, new FlatTuple(var_drone2position), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position")));
      		PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
      		new TypeConstraint(body, new FlatTuple(var_drone2position, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "y")));
      		new Equality(body, var__virtual_12_, var_drone2positiony);
      		// 	Position.z(drone2position,drone2positionz)
      		new TypeConstraint(body, new FlatTuple(var_drone2position), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position")));
      		PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
      		new TypeConstraint(body, new FlatTuple(var_drone2position, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "z")));
      		new Equality(body, var__virtual_13_, var_drone2positionz);
      		// 	DroneInstance.drone.dronetype.dimension(drone2,drone2dimension)
      		new TypeConstraint(body, new FlatTuple(var_drone2), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
      		new TypeConstraint(body, new FlatTuple(var_drone2, var__virtual_14_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "drone")));
      		PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_14_, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Drone", "dronetype")));
      		PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_15_, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType", "dimension")));
      		new Equality(body, var__virtual_16_, var_drone2dimension);
      		// 	Dimension.depth(drone2dimension, drone2dimensionz)
      		new TypeConstraint(body, new FlatTuple(var_drone2dimension), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension")));
      		PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
      		new TypeConstraint(body, new FlatTuple(var_drone2dimension, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "depth")));
      		new Equality(body, var__virtual_17_, var_drone2dimensionz);
      		// 	Dimension.height(drone2dimension, drone2dimensiony)
      		new TypeConstraint(body, new FlatTuple(var_drone2dimension), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension")));
      		PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
      		new TypeConstraint(body, new FlatTuple(var_drone2dimension, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "height")));
      		new Equality(body, var__virtual_18_, var_drone2dimensiony);
      		// 	Dimension.width(drone2dimension, drone2dimensionx)
      		new TypeConstraint(body, new FlatTuple(var_drone2dimension), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension")));
      		PVariable var__virtual_19_ = body.getOrCreateVariableByName(".virtual{19}");
      		new TypeConstraint(body, new FlatTuple(var_drone2dimension, var__virtual_19_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "width")));
      		new Equality(body, var__virtual_19_, var_drone2dimensionx);
      		// 	check(CollisionHelper.collide(drone1positionx,drone1positiony, drone1positionz, drone1dimensionx, drone1dimensiony, drone1dimensionz,drone2positionx, drone2positiony, drone2positionz,drone2dimensionx, drone2dimensiony, drone2dimensionz))
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern crash";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("drone1dimensionx", "drone1dimensiony", "drone1dimensionz", "drone1positionx", "drone1positiony", "drone1positionz", "drone2dimensionx", "drone2dimensiony", "drone2dimensionz", "drone2positionx", "drone2positiony", "drone2positionz");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Double drone1dimensionx = (java.lang.Double) provider.getValue("drone1dimensionx");
      		                                    java.lang.Double drone1dimensiony = (java.lang.Double) provider.getValue("drone1dimensiony");
      		                                    java.lang.Double drone1dimensionz = (java.lang.Double) provider.getValue("drone1dimensionz");
      		                                    java.lang.Double drone1positionx = (java.lang.Double) provider.getValue("drone1positionx");
      		                                    java.lang.Double drone1positiony = (java.lang.Double) provider.getValue("drone1positiony");
      		                                    java.lang.Double drone1positionz = (java.lang.Double) provider.getValue("drone1positionz");
      		                                    java.lang.Double drone2dimensionx = (java.lang.Double) provider.getValue("drone2dimensionx");
      		                                    java.lang.Double drone2dimensiony = (java.lang.Double) provider.getValue("drone2dimensiony");
      		                                    java.lang.Double drone2dimensionz = (java.lang.Double) provider.getValue("drone2dimensionz");
      		                                    java.lang.Double drone2positionx = (java.lang.Double) provider.getValue("drone2positionx");
      		                                    java.lang.Double drone2positiony = (java.lang.Double) provider.getValue("drone2positiony");
      		                                    java.lang.Double drone2positionz = (java.lang.Double) provider.getValue("drone2positionz");
      		                                    return evaluateExpression_1_1(drone1dimensionx, drone1dimensiony, drone1dimensionz, drone1positionx, drone1positiony, drone1positionz, drone2dimensionx, drone2dimensiony, drone2dimensionz, drone2positionx, drone2positiony, drone2positionz);
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
  
  private static boolean evaluateExpression_1_1(final Double drone1dimensionx, final Double drone1dimensiony, final Double drone1dimensionz, final Double drone1positionx, final Double drone1positiony, final Double drone1positionz, final Double drone2dimensionx, final Double drone2dimensiony, final Double drone2dimensionz, final Double drone2positionx, final Double drone2positiony, final Double drone2positionz) {
    boolean _collide = CollisionHelper.collide((drone1positionx).doubleValue(), (drone1positiony).doubleValue(), (drone1positionz).doubleValue(), (drone1dimensionx).doubleValue(), (drone1dimensiony).doubleValue(), (drone1dimensionz).doubleValue(), (drone2positionx).doubleValue(), (drone2positiony).doubleValue(), (drone2positionz).doubleValue(), (drone2dimensionx).doubleValue(), (drone2dimensiony).doubleValue(), (drone2dimensionz).doubleValue());
    return _collide;
  }
}
