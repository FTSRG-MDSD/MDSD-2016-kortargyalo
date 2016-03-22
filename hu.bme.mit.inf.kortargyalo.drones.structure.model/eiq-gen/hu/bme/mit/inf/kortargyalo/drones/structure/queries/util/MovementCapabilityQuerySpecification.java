package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.MovementCapabilityMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.MovementCapabilityMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.ProvidedMovementCapabilityQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MovementCapabilityMatcher in a type-safe way.
 * 
 * @see MovementCapabilityMatcher
 * @see MovementCapabilityMatch
 * 
 */
@SuppressWarnings("all")
public final class MovementCapabilityQuerySpecification extends BaseGeneratedEMFQuerySpecification<MovementCapabilityMatcher> {
  private MovementCapabilityQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MovementCapabilityQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MovementCapabilityMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MovementCapabilityMatcher.on(engine);
  }
  
  @Override
  public MovementCapabilityMatch newEmptyMatch() {
    return MovementCapabilityMatch.newEmptyMatch();
  }
  
  @Override
  public MovementCapabilityMatch newMatch(final Object... parameters) {
    return MovementCapabilityMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) parameters[0], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static MovementCapabilityQuerySpecification INSTANCE = make();
    
    public static MovementCapabilityQuerySpecification make() {
      return new MovementCapabilityQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MovementCapabilityQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.movementCapability";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("This","Target");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("This", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType"),new PParameter("Target", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_This = body.getOrCreateVariableByName("This");
      		PVariable var_Target = body.getOrCreateVariableByName("Target");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_This), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType")));
      		new TypeConstraint(body, new FlatTuple(var_Target), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "ProvidedCapability")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_This, "This"),
      		   new ExportedParameter(body, var_Target, "Target")
      		));
      		// 	find providedMovementCapability(This, Target)
      		new PositivePatternCall(body, new FlatTuple(var_This, var_Target), ProvidedMovementCapabilityQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	1 == count find providedMovementCapability(This, _)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, 1);
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new PatternMatchCounter(body, new FlatTuple(var_This, var___0_), ProvidedMovementCapabilityQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      		new Equality(body, var__virtual_0_, var__virtual_1_);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("QueryBasedFeature");
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
}
