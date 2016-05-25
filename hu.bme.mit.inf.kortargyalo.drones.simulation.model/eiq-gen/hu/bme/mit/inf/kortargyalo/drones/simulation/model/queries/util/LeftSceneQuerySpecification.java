package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CollisionHelper;
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
      		PVariable var_x = body.getOrCreateVariableByName("x");
      		PVariable var_y = body.getOrCreateVariableByName("y");
      		PVariable var_z = body.getOrCreateVariableByName("z");
      		PVariable var_ds = body.getOrCreateVariableByName("ds");
      		PVariable var_scenex = body.getOrCreateVariableByName("scenex");
      		PVariable var_sceney = body.getOrCreateVariableByName("sceney");
      		PVariable var_scenez = body.getOrCreateVariableByName("scenez");
      		PVariable var_boundx = body.getOrCreateVariableByName("boundx");
      		PVariable var_boundy = body.getOrCreateVariableByName("boundy");
      		PVariable var_boundz = body.getOrCreateVariableByName("boundz");
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_drone, "drone")
      		));
      		// 	DroneInstance.position.x(drone, x)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "position")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "x")));
      		new Equality(body, var__virtual_1_, var_x);
      		// 	DroneInstance.position.y(drone, y)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "position")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_2_, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "y")));
      		new Equality(body, var__virtual_3_, var_y);
      		// 	DroneInstance.position.z(drone, z)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "position")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_4_, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "z")));
      		new Equality(body, var__virtual_5_, var_z);
      		// 	DronesSimulation.droneInstances(ds, drone)
      		new TypeConstraint(body, new FlatTuple(var_ds), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation")));
      		PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
      		new TypeConstraint(body, new FlatTuple(var_ds, var__virtual_6_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation", "droneInstances")));
      		new Equality(body, var__virtual_6_, var_drone);
      		// 		DronesSimulation.scenario.allowedBounds.position.x(ds, scenex)
      		new TypeConstraint(body, new FlatTuple(var_ds), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation")));
      		PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
      		new TypeConstraint(body, new FlatTuple(var_ds, var__virtual_7_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation", "scenario")));
      		PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_7_, var__virtual_8_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Scenario", "allowedBounds")));
      		PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_8_, var__virtual_9_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "position")));
      		PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_9_, var__virtual_10_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "x")));
      		new Equality(body, var__virtual_10_, var_scenex);
      		// 	DronesSimulation.scenario.allowedBounds.position.y(ds, sceney)
      		new TypeConstraint(body, new FlatTuple(var_ds), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation")));
      		PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
      		new TypeConstraint(body, new FlatTuple(var_ds, var__virtual_11_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation", "scenario")));
      		PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_11_, var__virtual_12_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Scenario", "allowedBounds")));
      		PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_12_, var__virtual_13_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "position")));
      		PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_13_, var__virtual_14_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "y")));
      		new Equality(body, var__virtual_14_, var_sceney);
      		// 	DronesSimulation.scenario.allowedBounds.position.z(ds, scenez)
      		new TypeConstraint(body, new FlatTuple(var_ds), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation")));
      		PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
      		new TypeConstraint(body, new FlatTuple(var_ds, var__virtual_15_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation", "scenario")));
      		PVariable var__virtual_16_ = body.getOrCreateVariableByName(".virtual{16}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_15_, var__virtual_16_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Scenario", "allowedBounds")));
      		PVariable var__virtual_17_ = body.getOrCreateVariableByName(".virtual{17}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_16_, var__virtual_17_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "position")));
      		PVariable var__virtual_18_ = body.getOrCreateVariableByName(".virtual{18}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_17_, var__virtual_18_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Position", "z")));
      		new Equality(body, var__virtual_18_, var_scenez);
      		// 					DronesSimulation.scenario.allowedBounds.dimension.width(ds, boundx)
      		new TypeConstraint(body, new FlatTuple(var_ds), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation")));
      		PVariable var__virtual_19_ = body.getOrCreateVariableByName(".virtual{19}");
      		new TypeConstraint(body, new FlatTuple(var_ds, var__virtual_19_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation", "scenario")));
      		PVariable var__virtual_20_ = body.getOrCreateVariableByName(".virtual{20}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_19_, var__virtual_20_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Scenario", "allowedBounds")));
      		PVariable var__virtual_21_ = body.getOrCreateVariableByName(".virtual{21}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_20_, var__virtual_21_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "dimension")));
      		PVariable var__virtual_22_ = body.getOrCreateVariableByName(".virtual{22}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_21_, var__virtual_22_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "width")));
      		new Equality(body, var__virtual_22_, var_boundx);
      		// 	DronesSimulation.scenario.allowedBounds.dimension.height(ds, boundy)
      		new TypeConstraint(body, new FlatTuple(var_ds), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation")));
      		PVariable var__virtual_23_ = body.getOrCreateVariableByName(".virtual{23}");
      		new TypeConstraint(body, new FlatTuple(var_ds, var__virtual_23_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation", "scenario")));
      		PVariable var__virtual_24_ = body.getOrCreateVariableByName(".virtual{24}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_23_, var__virtual_24_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Scenario", "allowedBounds")));
      		PVariable var__virtual_25_ = body.getOrCreateVariableByName(".virtual{25}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_24_, var__virtual_25_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "dimension")));
      		PVariable var__virtual_26_ = body.getOrCreateVariableByName(".virtual{26}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_25_, var__virtual_26_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "height")));
      		new Equality(body, var__virtual_26_, var_boundy);
      		// 	DronesSimulation.scenario.allowedBounds.dimension.depth(ds, boundz)
      		new TypeConstraint(body, new FlatTuple(var_ds), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation")));
      		PVariable var__virtual_27_ = body.getOrCreateVariableByName(".virtual{27}");
      		new TypeConstraint(body, new FlatTuple(var_ds, var__virtual_27_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DronesSimulation", "scenario")));
      		PVariable var__virtual_28_ = body.getOrCreateVariableByName(".virtual{28}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_27_, var__virtual_28_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Scenario", "allowedBounds")));
      		PVariable var__virtual_29_ = body.getOrCreateVariableByName(".virtual{29}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_28_, var__virtual_29_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "AABB", "dimension")));
      		PVariable var__virtual_30_ = body.getOrCreateVariableByName(".virtual{30}");
      		new TypeConstraint(body, new FlatTuple(var__virtual_29_, var__virtual_30_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "depth")));
      		new Equality(body, var__virtual_30_, var_boundz);
      		// 		check(CollisionHelper.didDroneLeftScene(x,y,z, 		scenex, sceney, scenez, 		boundx, boundy, boundz	))
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern leftScene";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("boundx", "boundy", "boundz", "scenex", "sceney", "scenez", "x", "y", "z");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Double boundx = (java.lang.Double) provider.getValue("boundx");
      		                                    java.lang.Double boundy = (java.lang.Double) provider.getValue("boundy");
      		                                    java.lang.Double boundz = (java.lang.Double) provider.getValue("boundz");
      		                                    java.lang.Double scenex = (java.lang.Double) provider.getValue("scenex");
      		                                    java.lang.Double sceney = (java.lang.Double) provider.getValue("sceney");
      		                                    java.lang.Double scenez = (java.lang.Double) provider.getValue("scenez");
      		                                    java.lang.Double x = (java.lang.Double) provider.getValue("x");
      		                                    java.lang.Double y = (java.lang.Double) provider.getValue("y");
      		                                    java.lang.Double z = (java.lang.Double) provider.getValue("z");
      		                                    return evaluateExpression_1_1(boundx, boundy, boundz, scenex, sceney, scenez, x, y, z);
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
  
  private static boolean evaluateExpression_1_1(final Double boundx, final Double boundy, final Double boundz, final Double scenex, final Double sceney, final Double scenez, final Double x, final Double y, final Double z) {
    boolean _didDroneLeftScene = CollisionHelper.didDroneLeftScene((x).doubleValue(), (y).doubleValue(), (z).doubleValue(), (scenex).doubleValue(), (sceney).doubleValue(), (scenez).doubleValue(), (boundx).doubleValue(), (boundy).doubleValue(), (boundz).doubleValue());
    return _didDroneLeftScene;
  }
}
