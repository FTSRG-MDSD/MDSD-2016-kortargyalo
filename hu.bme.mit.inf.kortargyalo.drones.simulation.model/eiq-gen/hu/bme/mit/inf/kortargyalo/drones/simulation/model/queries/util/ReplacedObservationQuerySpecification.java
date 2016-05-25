package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.base.Objects;
import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.ReplacedObservationMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.ReplacedObservationMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.ObservesSameObjectQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate ReplacedObservationMatcher in a type-safe way.
 * 
 * @see ReplacedObservationMatcher
 * @see ReplacedObservationMatch
 * 
 */
@SuppressWarnings("all")
public final class ReplacedObservationQuerySpecification extends BaseGeneratedEMFQuerySpecification<ReplacedObservationMatcher> {
  private ReplacedObservationQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static ReplacedObservationQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected ReplacedObservationMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return ReplacedObservationMatcher.on(engine);
  }
  
  @Override
  public ReplacedObservationMatch newEmptyMatch() {
    return ReplacedObservationMatch.newEmptyMatch();
  }
  
  @Override
  public ReplacedObservationMatch newMatch(final Object... parameters) {
    return ReplacedObservationMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static ReplacedObservationQuerySpecification INSTANCE = make();
    
    public static ReplacedObservationQuerySpecification make() {
      return new ReplacedObservationQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ReplacedObservationQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.replacedObservation";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("old");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("old", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.Observation"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_old = body.getOrCreateVariableByName("old");
      		PVariable var_drone = body.getOrCreateVariableByName("drone");
      		PVariable var_novel = body.getOrCreateVariableByName("novel");
      		PVariable var_oldTime = body.getOrCreateVariableByName("oldTime");
      		PVariable var_newTime = body.getOrCreateVariableByName("newTime");
      		PVariable var_oldId = body.getOrCreateVariableByName("oldId");
      		PVariable var_newId = body.getOrCreateVariableByName("newId");
      		new TypeConstraint(body, new FlatTuple(var_old), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_old, "old")
      		));
      		// 	DroneInstance.observations(drone, old)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "observations")));
      		new Equality(body, var__virtual_0_, var_old);
      		// 	DroneInstance.observations(drone, novel)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_drone, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance", "observations")));
      		new Equality(body, var__virtual_1_, var_novel);
      		// 	old != novel
      		new Inequality(body, var_old, var_novel);
      		// 	find observesSameObject(old, novel)
      		new PositivePatternCall(body, new FlatTuple(var_old, var_novel), ObservesSameObjectQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Observation.time(old, oldTime)
      		new TypeConstraint(body, new FlatTuple(var_old), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_old, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation", "time")));
      		new Equality(body, var__virtual_2_, var_oldTime);
      		// 	Observation.time(novel, newTime)
      		new TypeConstraint(body, new FlatTuple(var_novel), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation")));
      		PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      		new TypeConstraint(body, new FlatTuple(var_novel, var__virtual_3_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation", "time")));
      		new Equality(body, var__virtual_3_, var_newTime);
      		// 	Observation.id(old, oldId)
      		new TypeConstraint(body, new FlatTuple(var_old), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation")));
      		PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
      		new TypeConstraint(body, new FlatTuple(var_old, var__virtual_4_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation", "id")));
      		new Equality(body, var__virtual_4_, var_oldId);
      		// 	Observation.time(novel, newId)
      		new TypeConstraint(body, new FlatTuple(var_novel), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation")));
      		PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
      		new TypeConstraint(body, new FlatTuple(var_novel, var__virtual_5_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "Observation", "time")));
      		new Equality(body, var__virtual_5_, var_newId);
      		// 	check(oldTime < newTime || (oldTime == newTime && oldId < newId))
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern replacedObservation";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("newId", "newTime", "oldId", "oldTime");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Long newId = (java.lang.Long) provider.getValue("newId");
      		                                    java.lang.Long newTime = (java.lang.Long) provider.getValue("newTime");
      		                                    java.lang.Long oldId = (java.lang.Long) provider.getValue("oldId");
      		                                    java.lang.Long oldTime = (java.lang.Long) provider.getValue("oldTime");
      		                                    return evaluateExpression_1_1(newId, newTime, oldId, oldTime);
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
  
  private static boolean evaluateExpression_1_1(final Long newId, final Long newTime, final Long oldId, final Long oldTime) {
    boolean _or = false;
    boolean _lessThan = (oldTime.compareTo(newTime) < 0);
    if (_lessThan) {
      _or = true;
    } else {
      boolean _and = false;
      boolean _equals = Objects.equal(oldTime, newTime);
      if (!_equals) {
        _and = false;
      } else {
        boolean _lessThan_1 = (oldId.compareTo(newId) < 0);
        _and = _lessThan_1;
      }
      _or = _and;
    }
    return _or;
  }
}
