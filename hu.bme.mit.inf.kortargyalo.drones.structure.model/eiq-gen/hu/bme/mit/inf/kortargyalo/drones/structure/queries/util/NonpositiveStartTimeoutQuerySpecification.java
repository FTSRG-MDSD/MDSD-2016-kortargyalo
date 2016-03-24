package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveStartTimeoutMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveStartTimeoutMatcher;
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
 * A pattern-specific query specification that can instantiate NonpositiveStartTimeoutMatcher in a type-safe way.
 * 
 * @see NonpositiveStartTimeoutMatcher
 * @see NonpositiveStartTimeoutMatch
 * 
 */
@SuppressWarnings("all")
public final class NonpositiveStartTimeoutQuerySpecification extends BaseGeneratedEMFQuerySpecification<NonpositiveStartTimeoutMatcher> {
  private NonpositiveStartTimeoutQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NonpositiveStartTimeoutQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NonpositiveStartTimeoutMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NonpositiveStartTimeoutMatcher.on(engine);
  }
  
  @Override
  public NonpositiveStartTimeoutMatch newEmptyMatch() {
    return NonpositiveStartTimeoutMatch.newEmptyMatch();
  }
  
  @Override
  public NonpositiveStartTimeoutMatch newMatch(final Object... parameters) {
    return NonpositiveStartTimeoutMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static NonpositiveStartTimeoutQuerySpecification INSTANCE = make();
    
    public static NonpositiveStartTimeoutQuerySpecification make() {
      return new NonpositiveStartTimeoutQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NonpositiveStartTimeoutQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveStartTimeout";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Action");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("Action", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_Action = body.getOrCreateVariableByName("Action");
      		PVariable var_StartTimeout = body.getOrCreateVariableByName("StartTimeout");
      		new TypeConstraint(body, new FlatTuple(var_Action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "CooperativeAction")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_Action, "Action")
      		));
      		// 	CooperativeAction.startTimeout(Action, StartTimeout)
      		new TypeConstraint(body, new FlatTuple(var_Action), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "CooperativeAction")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_Action, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "CooperativeAction", "startTimeout")));
      		new Equality(body, var__virtual_0_, var_StartTimeout);
      		// 	check(StartTimeout <= 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern nonpositiveStartTimeout";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("StartTimeout");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Double StartTimeout = (java.lang.Double) provider.getValue("StartTimeout");
      		                                    return evaluateExpression_1_1(StartTimeout);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Start timeout of cooperative action $Action.name$ must be positive.");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "Action"
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
  
  private static boolean evaluateExpression_1_1(final Double StartTimeout) {
    return ((StartTimeout).doubleValue() <= 0);
  }
}
