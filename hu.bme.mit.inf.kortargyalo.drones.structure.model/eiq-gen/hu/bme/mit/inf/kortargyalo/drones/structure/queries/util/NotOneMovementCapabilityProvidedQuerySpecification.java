package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NotOneMovementCapabilityProvidedMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NotOneMovementCapabilityProvidedMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate NotOneMovementCapabilityProvidedMatcher in a type-safe way.
 * 
 * @see NotOneMovementCapabilityProvidedMatcher
 * @see NotOneMovementCapabilityProvidedMatch
 * 
 */
@SuppressWarnings("all")
public final class NotOneMovementCapabilityProvidedQuerySpecification extends BaseGeneratedEMFQuerySpecification<NotOneMovementCapabilityProvidedMatcher> {
  private NotOneMovementCapabilityProvidedQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NotOneMovementCapabilityProvidedQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NotOneMovementCapabilityProvidedMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NotOneMovementCapabilityProvidedMatcher.on(engine);
  }
  
  @Override
  public NotOneMovementCapabilityProvidedMatch newEmptyMatch() {
    return NotOneMovementCapabilityProvidedMatch.newEmptyMatch();
  }
  
  @Override
  public NotOneMovementCapabilityProvidedMatch newMatch(final Object... parameters) {
    return NotOneMovementCapabilityProvidedMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static NotOneMovementCapabilityProvidedQuerySpecification INSTANCE = make();
    
    public static NotOneMovementCapabilityProvidedQuerySpecification make() {
      return new NotOneMovementCapabilityProvidedQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NotOneMovementCapabilityProvidedQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.notOneMovementCapabilityProvided";
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
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		new TypeConstraint(body, new FlatTuple(var_DroneType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_DroneType, "DroneType")
      		));
      		// 	1 != count find providedMovementCapability(DroneType, _)
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new ConstantValue(body, var__virtual_0_, 1);
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new PatternMatchCounter(body, new FlatTuple(var_DroneType, var___0_), ProvidedMovementCapabilityQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_1_);
      		new Inequality(body, var__virtual_0_, var__virtual_1_);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "A drone type must have exactly one movement capability.");
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
}
