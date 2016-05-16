package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.MoreThanOneScanningCapabilitiesMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.MoreThanOneScanningCapabilitiesMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.ProvidedScanningCapabilityQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate MoreThanOneScanningCapabilitiesMatcher in a type-safe way.
 * 
 * @see MoreThanOneScanningCapabilitiesMatcher
 * @see MoreThanOneScanningCapabilitiesMatch
 * 
 */
@SuppressWarnings("all")
public final class MoreThanOneScanningCapabilitiesQuerySpecification extends BaseGeneratedEMFQuerySpecification<MoreThanOneScanningCapabilitiesMatcher> {
  private MoreThanOneScanningCapabilitiesQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static MoreThanOneScanningCapabilitiesQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected MoreThanOneScanningCapabilitiesMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return MoreThanOneScanningCapabilitiesMatcher.on(engine);
  }
  
  @Override
  public MoreThanOneScanningCapabilitiesMatch newEmptyMatch() {
    return MoreThanOneScanningCapabilitiesMatch.newEmptyMatch();
  }
  
  @Override
  public MoreThanOneScanningCapabilitiesMatch newMatch(final Object... parameters) {
    return MoreThanOneScanningCapabilitiesMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static MoreThanOneScanningCapabilitiesQuerySpecification INSTANCE = make();
    
    public static MoreThanOneScanningCapabilitiesQuerySpecification make() {
      return new MoreThanOneScanningCapabilitiesQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static MoreThanOneScanningCapabilitiesQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.moreThanOneScanningCapabilities";
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
      		PVariable var_Capability1 = body.getOrCreateVariableByName("Capability1");
      		PVariable var_Capability2 = body.getOrCreateVariableByName("Capability2");
      		new TypeConstraint(body, new FlatTuple(var_DroneType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "DroneType")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_DroneType, "DroneType")
      		));
      		// 	find providedScanningCapability(DroneType, Capability1)
      		new PositivePatternCall(body, new FlatTuple(var_DroneType, var_Capability1), ProvidedScanningCapabilityQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	find providedScanningCapability(DroneType, Capability2)
      		new PositivePatternCall(body, new FlatTuple(var_DroneType, var_Capability2), ProvidedScanningCapabilityQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	Capability1 != Capability2
      		new Inequality(body, var_Capability1, var_Capability2);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "A drone type must have one scanning capability at most.");
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
