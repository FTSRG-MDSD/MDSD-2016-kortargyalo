package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.DuplicateNameMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.DuplicateNameMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.InRelatedScopeQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.incquery.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.incquery.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate DuplicateNameMatcher in a type-safe way.
 * 
 * @see DuplicateNameMatcher
 * @see DuplicateNameMatch
 * 
 */
@SuppressWarnings("all")
public final class DuplicateNameQuerySpecification extends BaseGeneratedEMFQuerySpecification<DuplicateNameMatcher> {
  private DuplicateNameQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static DuplicateNameQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected DuplicateNameMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return DuplicateNameMatcher.on(engine);
  }
  
  @Override
  public DuplicateNameMatch newEmptyMatch() {
    return DuplicateNameMatch.newEmptyMatch();
  }
  
  @Override
  public DuplicateNameMatch newMatch(final Object... parameters) {
    return DuplicateNameMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement) parameters[0], (java.lang.String) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static DuplicateNameQuerySpecification INSTANCE = make();
    
    public static DuplicateNameQuerySpecification make() {
      return new DuplicateNameQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static DuplicateNameQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.duplicateName";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("NamedElement","Name");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("NamedElement", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.NamedElement"),new PParameter("Name", "java.lang.String"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_NamedElement = body.getOrCreateVariableByName("NamedElement");
      		PVariable var_Name = body.getOrCreateVariableByName("Name");
      		PVariable var_Other = body.getOrCreateVariableByName("Other");
      		new TypeConstraint(body, new FlatTuple(var_NamedElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "NamedElement")));
      		new TypeConstraint(body, new FlatTuple(var_Name), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EString")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_NamedElement, "NamedElement"),
      		   new ExportedParameter(body, var_Name, "Name")
      		));
      		// 	find inRelatedScope(NamedElement, Other)
      		new PositivePatternCall(body, new FlatTuple(var_NamedElement, var_Other), InRelatedScopeQuerySpecification.instance().getInternalQueryRepresentation());
      		// 	NamedElement.name(NamedElement, Name)
      		new TypeConstraint(body, new FlatTuple(var_NamedElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "NamedElement")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_NamedElement, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "NamedElement", "name")));
      		new Equality(body, var__virtual_0_, var_Name);
      		// 	NamedElement.name(Other, Name)
      		new TypeConstraint(body, new FlatTuple(var_Other), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "NamedElement")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_Other, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "NamedElement", "name")));
      		new Equality(body, var__virtual_1_, var_Name);
      		// 	NamedElement != Other
      		new Inequality(body, var_NamedElement, var_Other);
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Duplicate name $Name$.");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "NamedElement"
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
