package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveProvidedCapabilityMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveProvidedCapabilityMatcher;
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
 * A pattern-specific query specification that can instantiate NonpositiveProvidedCapabilityMatcher in a type-safe way.
 * 
 * @see NonpositiveProvidedCapabilityMatcher
 * @see NonpositiveProvidedCapabilityMatch
 * 
 */
@SuppressWarnings("all")
public final class NonpositiveProvidedCapabilityQuerySpecification extends BaseGeneratedEMFQuerySpecification<NonpositiveProvidedCapabilityMatcher> {
  private NonpositiveProvidedCapabilityQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NonpositiveProvidedCapabilityQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NonpositiveProvidedCapabilityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NonpositiveProvidedCapabilityMatcher.on(engine);
  }
  
  @Override
  public NonpositiveProvidedCapabilityMatch newEmptyMatch() {
    return NonpositiveProvidedCapabilityMatch.newEmptyMatch();
  }
  
  @Override
  public NonpositiveProvidedCapabilityMatch newMatch(final Object... parameters) {
    return NonpositiveProvidedCapabilityMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability) parameters[0], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability) parameters[1], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) parameters[2]);
  }
  
  private static class LazyHolder {
    private final static NonpositiveProvidedCapabilityQuerySpecification INSTANCE = make();
    
    public static NonpositiveProvidedCapabilityQuerySpecification make() {
      return new NonpositiveProvidedCapabilityQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NonpositiveProvidedCapabilityQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveProvidedCapability";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("ProvidedCapability","Capability","DroneType");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("ProvidedCapability", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability"),new PParameter("Capability", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability"),new PParameter("DroneType", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_ProvidedCapability = body.getOrCreateVariableByName("ProvidedCapability");
      		PVariable var_Capability = body.getOrCreateVariableByName("Capability");
      		PVariable var_DroneType = body.getOrCreateVariableByName("DroneType");
      		PVariable var_Value = body.getOrCreateVariableByName("Value");
      		new TypeConstraint(body, new FlatTuple(var_ProvidedCapability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "ProvidedCapability")));
      		new TypeConstraint(body, new FlatTuple(var_Capability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Capability")));
      		new TypeConstraint(body, new FlatTuple(var_DroneType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_ProvidedCapability, "ProvidedCapability"),
      		   new ExportedParameter(body, var_Capability, "Capability"),
      		   new ExportedParameter(body, var_DroneType, "DroneType")
      		));
      		// 	ProvidedCapability.maximalValue(ProvidedCapability, Value)
      		new TypeConstraint(body, new FlatTuple(var_ProvidedCapability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "ProvidedCapability")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_ProvidedCapability, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "ProvidedCapability", "maximalValue")));
      		new Equality(body, var__virtual_0_, var_Value);
      		// 	check(Value <= 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern nonpositiveProvidedCapability";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("Value");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Double Value = (java.lang.Double) provider.getValue("Value");
      		                                    return evaluateExpression_1_1(Value);
      		                                }
      		
      		                        },  null); // 	ProvidedCapability.capability(ProvidedCapability, Capability)
      		new TypeConstraint(body, new FlatTuple(var_ProvidedCapability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "ProvidedCapability")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_ProvidedCapability, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "ProvidedCapability", "capability")));
      		new Equality(body, var__virtual_1_, var_Capability);
      		// 	ProvidedCapability.droneType(ProvidedCapability, DroneType)
      		new TypeConstraint(body, new FlatTuple(var_ProvidedCapability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "ProvidedCapability")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_ProvidedCapability, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "ProvidedCapability", "droneType")));
      		new Equality(body, var__virtual_2_, var_DroneType);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Maximal value of provided capability $Capability.name$ of $DroneType.name$ must be positive.");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "ProvidedCapability"
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
  
  private static boolean evaluateExpression_1_1(final Double Value) {
    return ((Value).doubleValue() <= 0);
  }
}
