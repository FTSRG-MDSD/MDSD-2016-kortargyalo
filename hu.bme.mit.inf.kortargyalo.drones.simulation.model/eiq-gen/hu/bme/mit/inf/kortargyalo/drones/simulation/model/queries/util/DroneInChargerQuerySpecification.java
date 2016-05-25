package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneInChargerMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneInChargerMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate DroneInChargerMatcher in a type-safe way.
 * 
 * @see DroneInChargerMatcher
 * @see DroneInChargerMatch
 * 
 */
@SuppressWarnings("all")
public final class DroneInChargerQuerySpecification extends BaseGeneratedEMFQuerySpecification<DroneInChargerMatcher> {
  private DroneInChargerQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DroneInChargerQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DroneInChargerMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DroneInChargerMatcher.on(engine);
  }
  
  @Override
  public DroneInChargerMatch newEmptyMatch() {
    return DroneInChargerMatch.newEmptyMatch();
  }
  
  @Override
  public DroneInChargerMatch newMatch(final Object... parameters) {
    return DroneInChargerMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) parameters[0], (hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static DroneInChargerQuerySpecification INSTANCE = make();
    
    public static DroneInChargerQuerySpecification make() {
      return new DroneInChargerQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DroneInChargerQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.droneInCharger";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("drone","charger");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("drone", "hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance"),new PParameter("charger", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Charger"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_drone = body.getOrCreateVariableByName("drone");
      		PVariable var_charger = body.getOrCreateVariableByName("charger");
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		new TypeConstraint(body, new FlatTuple(var_charger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Charger")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_drone, "drone"),
      		   new ExportedParameter(body, var_charger, "charger")
      		));
      		// 	DroneInstance(drone)
      		new TypeConstraint(body, new FlatTuple(var_drone), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesSimulation", "DroneInstance")));
      		// 	Charger(charger)
      		new TypeConstraint(body, new FlatTuple(var_charger), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Charger")));
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
}
