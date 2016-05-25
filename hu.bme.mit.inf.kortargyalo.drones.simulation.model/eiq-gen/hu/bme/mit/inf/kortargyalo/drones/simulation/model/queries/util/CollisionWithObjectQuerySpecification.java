package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CollisionHelper;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CollisionWithObjectMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CollisionWithObjectMatcher;
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
 * A pattern-specific query specification that can instantiate CollisionWithObjectMatcher in a type-safe way.
 * 
 * @see CollisionWithObjectMatcher
 * @see CollisionWithObjectMatch
 * 
 */
@SuppressWarnings("all")
public final class CollisionWithObjectQuerySpecification extends BaseGeneratedEMFQuerySpecification<CollisionWithObjectMatcher> {
  private CollisionWithObjectQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static CollisionWithObjectQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected CollisionWithObjectMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return CollisionWithObjectMatcher.on(engine);
  }
  
  @Override
  public CollisionWithObjectMatch newEmptyMatch() {
    return CollisionWithObjectMatch.newEmptyMatch();
  }
  
  @Override
  public CollisionWithObjectMatch newMatch(final Object... parameters) {
    return CollisionWithObjectMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) parameters[0], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static CollisionWithObjectQuerySpecification INSTANCE = make();
    
    public static CollisionWithObjectQuerySpecification make() {
      return new CollisionWithObjectQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static CollisionWithObjectQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.collisionWithObject";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("drone","obstacle");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("drone", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance"),new PParameter("obstacle", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Obstacle"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_drone = body.getOrCreateVariableByName("drone");
      		PVariable var_obstacle = body.getOrCreateVariableByName("obstacle");
      		PVariable var_dronepositionx = body.getOrCreateVariableByName("dronepositionx");
      		PVariable var_dronepositiony = body.getOrCreateVariableByName("dronepositiony");
      		PVariable var_dronepositionz = body.getOrCreateVariableByName("dronepositionz");
      		PVariable var_dronedimensionx = body.getOrCreateVariableByName("dronedimensionx");
      		PVariable var_dronedimensiony = body.getOrCreateVariableByName("dronedimensiony");
      		PVariable var_dronedimensionz = body.getOrCreateVariableByName("dronedimensionz");
      		PVariable var_objectx = body.getOrCreateVariableByName("objectx");
      		PVariable var_objecty = body.getOrCreateVariableByName("objecty");
      		PVariable var_objectz = body.getOrCreateVariableByName("objectz");
      		PVariable var_objectdimx = body.getOrCreateVariableByName("objectdimx");
      		PVariable var_objectdimy = body.getOrCreateVariableByName("objectdimy");
      		PVariable var_objectdimz = body.getOrCreateVariableByName("objectdimz");
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		new TypeConstraint(body, new FlatTuple(var_obstacle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Obstacle")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_drone, "drone"),
      		   new ExportedParameter(body, var_obstacle, "obstacle")
      		));
      		// 	DroneInstance.position.x(drone,dronepositionx)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "position")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "x")));
      		new Equality(body, var__virtual_1_, var_dronepositionx);
      		// 	DroneInstance.position.y(drone,dronepositiony)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "position")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "y")));
      		new Equality(body, var__virtual_3_, var_dronepositiony);
      		// 	DroneInstance.position.z(drone,dronepositionz)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "position")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "z")));
      		new Equality(body, var__virtual_5_, var_dronepositionz);
      		// 	DroneInstance.drone.dronetype.dimension.width(drone,dronedimensionx)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "drone")));
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_6_, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Drone", "dronetype")));
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_7_, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType", "dimension")));
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_8_, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "width")));
      		new Equality(body, var__virtual_9_, var_dronedimensionx);
      		// 	DroneInstance.drone.dronetype.dimension.height(drone,dronedimensiony)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "drone")));
      		PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_10_, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Drone", "dronetype")));
      		PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_11_, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType", "dimension")));
      		PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_12_, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "height")));
      		new Equality(body, var__virtual_13_, var_dronedimensiony);
      		// 	DroneInstance.drone.dronetype.dimension.depth(drone,dronedimensionz)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_14_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "drone")));
      		PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_14_, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Drone", "dronetype")));
      		PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_15_, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType", "dimension")));
      		PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_16_, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "depth")));
      		new Equality(body, var__virtual_17_, var_dronedimensionz);
      		// 		Obstacle.position.x(obstacle, objectx)
      		new TypeConstraint(body, new FlatTuple(var_obstacle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Obstacle")));
      		PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
      		new TypeConstraint(body, new FlatTuple(var_obstacle, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "position")));
      		PVariable var__virtual_19_ = body.getOrCreateVariableByName(".virtual{19}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_18_, var__virtual_19_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "x")));
      		new Equality(body, var__virtual_19_, var_objectx);
      		// 	Obstacle.position.y(obstacle, objecty)
      		new TypeConstraint(body, new FlatTuple(var_obstacle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Obstacle")));
      		PVariable var__virtual_20_ = body.getOrCreateVariableByName(".virtual{20}");
      		new TypeConstraint(body, new FlatTuple(var_obstacle, var__virtual_20_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "position")));
      		PVariable var__virtual_21_ = body.getOrCreateVariableByName(".virtual{21}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_20_, var__virtual_21_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "y")));
      		new Equality(body, var__virtual_21_, var_objecty);
      		// 	Obstacle.position.z(obstacle, objectz)
      		new TypeConstraint(body, new FlatTuple(var_obstacle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Obstacle")));
      		PVariable var__virtual_22_ = body.getOrCreateVariableByName(".virtual{22}");
      		new TypeConstraint(body, new FlatTuple(var_obstacle, var__virtual_22_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "position")));
      		PVariable var__virtual_23_ = body.getOrCreateVariableByName(".virtual{23}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_22_, var__virtual_23_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "z")));
      		new Equality(body, var__virtual_23_, var_objectz);
      		// 	Obstacle.dimension.width(obstacle, objectdimx)
      		new TypeConstraint(body, new FlatTuple(var_obstacle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Obstacle")));
      		PVariable var__virtual_24_ = body.getOrCreateVariableByName(".virtual{24}");
      		new TypeConstraint(body, new FlatTuple(var_obstacle, var__virtual_24_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "dimension")));
      		PVariable var__virtual_25_ = body.getOrCreateVariableByName(".virtual{25}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_24_, var__virtual_25_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "width")));
      		new Equality(body, var__virtual_25_, var_objectdimx);
      		// 	Obstacle.dimension.height(obstacle, objectdimy)
      		new TypeConstraint(body, new FlatTuple(var_obstacle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Obstacle")));
      		PVariable var__virtual_26_ = body.getOrCreateVariableByName(".virtual{26}");
      		new TypeConstraint(body, new FlatTuple(var_obstacle, var__virtual_26_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "dimension")));
      		PVariable var__virtual_27_ = body.getOrCreateVariableByName(".virtual{27}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_26_, var__virtual_27_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "height")));
      		new Equality(body, var__virtual_27_, var_objectdimy);
      		// 	Obstacle.dimension.depth(obstacle, objectdimz)
      		new TypeConstraint(body, new FlatTuple(var_obstacle), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Obstacle")));
      		PVariable var__virtual_28_ = body.getOrCreateVariableByName(".virtual{28}");
      		new TypeConstraint(body, new FlatTuple(var_obstacle, var__virtual_28_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "dimension")));
      		PVariable var__virtual_29_ = body.getOrCreateVariableByName(".virtual{29}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_28_, var__virtual_29_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "depth")));
      		new Equality(body, var__virtual_29_, var_objectdimz);
      		// 		check(CollisionHelper.doCollideWithObstacle(dronepositionx, dronepositiony, dronepositionz, dronedimensionx, dronedimensiony, dronedimensionz, objectx, objecty, objectz, objectdimx, objectdimy, objectdimz))
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern collisionWithObject";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("dronedimensionx", "dronedimensiony", "dronedimensionz", "dronepositionx", "dronepositiony", "dronepositionz", "objectdimx", "objectdimy", "objectdimz", "objectx", "objecty", "objectz");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Double dronedimensionx = (java.lang.Double) provider.getValue("dronedimensionx");
      		                                    java.lang.Double dronedimensiony = (java.lang.Double) provider.getValue("dronedimensiony");
      		                                    java.lang.Double dronedimensionz = (java.lang.Double) provider.getValue("dronedimensionz");
      		                                    java.lang.Double dronepositionx = (java.lang.Double) provider.getValue("dronepositionx");
      		                                    java.lang.Double dronepositiony = (java.lang.Double) provider.getValue("dronepositiony");
      		                                    java.lang.Double dronepositionz = (java.lang.Double) provider.getValue("dronepositionz");
      		                                    java.lang.Double objectdimx = (java.lang.Double) provider.getValue("objectdimx");
      		                                    java.lang.Double objectdimy = (java.lang.Double) provider.getValue("objectdimy");
      		                                    java.lang.Double objectdimz = (java.lang.Double) provider.getValue("objectdimz");
      		                                    java.lang.Double objectx = (java.lang.Double) provider.getValue("objectx");
      		                                    java.lang.Double objecty = (java.lang.Double) provider.getValue("objecty");
      		                                    java.lang.Double objectz = (java.lang.Double) provider.getValue("objectz");
      		                                    return evaluateExpression_1_1(dronedimensionx, dronedimensiony, dronedimensionz, dronepositionx, dronepositiony, dronepositionz, objectdimx, objectdimy, objectdimz, objectx, objecty, objectz);
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
  
  private static boolean evaluateExpression_1_1(final Double dronedimensionx, final Double dronedimensiony, final Double dronedimensionz, final Double dronepositionx, final Double dronepositiony, final Double dronepositionz, final Double objectdimx, final Double objectdimy, final Double objectdimz, final Double objectx, final Double objecty, final Double objectz) {
    boolean _doCollideWithObstacle = CollisionHelper.doCollideWithObstacle((dronepositionx).doubleValue(), (dronepositiony).doubleValue(), (dronepositionz).doubleValue(), (dronedimensionx).doubleValue(), (dronedimensiony).doubleValue(), (dronedimensionz).doubleValue(), (objectx).doubleValue(), (objecty).doubleValue(), (objectz).doubleValue(), (objectdimx).doubleValue(), (objectdimy).doubleValue(), (objectdimz).doubleValue());
    return _doCollideWithObstacle;
  }
}
