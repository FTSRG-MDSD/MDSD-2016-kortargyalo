package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NegativeEnergyConsumptionMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NegativeEnergyConsumptionMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate NegativeEnergyConsumptionMatcher in a type-safe way.
 * 
 * @see NegativeEnergyConsumptionMatcher
 * @see NegativeEnergyConsumptionMatch
 * 
 */
@SuppressWarnings("all")
public final class NegativeEnergyConsumptionQuerySpecification extends BaseGeneratedEMFQuerySpecification<NegativeEnergyConsumptionMatcher> {
  private NegativeEnergyConsumptionQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NegativeEnergyConsumptionQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NegativeEnergyConsumptionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NegativeEnergyConsumptionMatcher.on(engine);
  }
  
  @Override
  public NegativeEnergyConsumptionMatch newEmptyMatch() {
    return NegativeEnergyConsumptionMatch.newEmptyMatch();
  }
  
  @Override
  public NegativeEnergyConsumptionMatch newMatch(final Object... parameters) {
    return NegativeEnergyConsumptionMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static NegativeEnergyConsumptionQuerySpecification INSTANCE = make();
    
    public static NegativeEnergyConsumptionQuerySpecification make() {
      return new NegativeEnergyConsumptionQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NegativeEnergyConsumptionQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.negativeEnergyConsumption";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("DroneType");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("DroneType", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_DroneType = body.getOrCreateVariableByName("DroneType");
      		PVariable var_Consumption = body.getOrCreateVariableByName("Consumption");
      		new TypeConstraint(body, new FlatTuple(var_DroneType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_DroneType, "DroneType")
      		));
      		// 	DroneType.idleEneryConsumption(DroneType, Consumption)
      		new TypeConstraint(body, new FlatTuple(var_DroneType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_DroneType, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType", "idleEneryConsumption")));
      		new Equality(body, var__virtual_0_, var_Consumption);
      		// 	check(Consumption < 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern negativeEnergyConsumption";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("Consumption");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Double Consumption = (java.lang.Double) provider.getValue("Consumption");
      		                                    return evaluateExpression_1_1(Consumption);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Idle energy consumption of drone type $DroneType.name$ must not be negative.");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "DroneType"
      		                }));
      		addAnnotation(annotation);
      	}
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Double Consumption) {
    return ((Consumption).doubleValue() < 0);
  }
}
