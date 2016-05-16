package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveRequiredCapabilityMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveRequiredCapabilityMatcher;
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
 * A pattern-specific query specification that can instantiate NonpositiveRequiredCapabilityMatcher in a type-safe way.
 * 
 * @see NonpositiveRequiredCapabilityMatcher
 * @see NonpositiveRequiredCapabilityMatch
 * 
 */
@SuppressWarnings("all")
public final class NonpositiveRequiredCapabilityQuerySpecification extends BaseGeneratedEMFQuerySpecification<NonpositiveRequiredCapabilityMatcher> {
  private NonpositiveRequiredCapabilityQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NonpositiveRequiredCapabilityQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NonpositiveRequiredCapabilityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NonpositiveRequiredCapabilityMatcher.on(engine);
  }
  
  @Override
  public NonpositiveRequiredCapabilityMatch newEmptyMatch() {
    return NonpositiveRequiredCapabilityMatch.newEmptyMatch();
  }
  
  @Override
  public NonpositiveRequiredCapabilityMatch newMatch(final Object... parameters) {
    return NonpositiveRequiredCapabilityMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability) parameters[0], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability) parameters[1], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction) parameters[2], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role) parameters[3]);
  }
  
  private static class LazyHolder {
    private final static NonpositiveRequiredCapabilityQuerySpecification INSTANCE = make();
    
    public static NonpositiveRequiredCapabilityQuerySpecification make() {
      return new NonpositiveRequiredCapabilityQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NonpositiveRequiredCapabilityQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveRequiredCapability";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("RequiredCapability","Capability","Action","Role");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("RequiredCapability", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability"),new PParameter("Capability", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability"),new PParameter("Action", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction"),new PParameter("Role", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_RequiredCapability = body.getOrCreateVariableByName("RequiredCapability");
      		PVariable var_Capability = body.getOrCreateVariableByName("Capability");
      		PVariable var_Action = body.getOrCreateVariableByName("Action");
      		PVariable var_Role = body.getOrCreateVariableByName("Role");
      		PVariable var_Value = body.getOrCreateVariableByName("Value");
      		new TypeConstraint(body, new FlatTuple(var_RequiredCapability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "RequiredCapability")));
      		new TypeConstraint(body, new FlatTuple(var_Capability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Capability")));
      		new TypeConstraint(body, new FlatTuple(var_Action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "CooperativeAction")));
      		new TypeConstraint(body, new FlatTuple(var_Role), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Role")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_RequiredCapability, "RequiredCapability"),
      		   new ExportedParameter(body, var_Capability, "Capability"),
      		   new ExportedParameter(body, var_Action, "Action"),
      		   new ExportedParameter(body, var_Role, "Role")
      		));
      		// 	RequiredCapability.minimalValue(RequiredCapability, Value)
      		new TypeConstraint(body, new FlatTuple(var_RequiredCapability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "RequiredCapability")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_RequiredCapability, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "RequiredCapability", "minimalValue")));
      		new Equality(body, var__virtual_0_, var_Value);
      		// 	check(Value <= 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern nonpositiveRequiredCapability";
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
      		
      		                        },  null); // 	RequiredCapability.capability(RequiredCapability, Capability)
      		new TypeConstraint(body, new FlatTuple(var_RequiredCapability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "RequiredCapability")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_RequiredCapability, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "RequiredCapability", "capability")));
      		new Equality(body, var__virtual_1_, var_Capability);
      		// 	RequiredCapability.role(RequiredCapability, Role)
      		new TypeConstraint(body, new FlatTuple(var_RequiredCapability), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "RequiredCapability")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_RequiredCapability, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "RequiredCapability", "role")));
      		new Equality(body, var__virtual_2_, var_Role);
      		// 	CooperativeAction.roles(Action, Role)
      		new TypeConstraint(body, new FlatTuple(var_Action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "CooperativeAction")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_Action, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "CooperativeAction", "roles")));
      		new Equality(body, var__virtual_3_, var_Role);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Minimal value of provided capability $Capability.name$ of $Action.name$.$Role.name$ must be positive.");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "RequiredCapability"
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
