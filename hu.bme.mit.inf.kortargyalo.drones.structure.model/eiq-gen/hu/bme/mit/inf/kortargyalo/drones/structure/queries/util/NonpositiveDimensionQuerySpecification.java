package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveDimensionMatch;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveDimensionMatcher;
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
 * A pattern-specific query specification that can instantiate NonpositiveDimensionMatcher in a type-safe way.
 * 
 * @see NonpositiveDimensionMatcher
 * @see NonpositiveDimensionMatch
 * 
 */
@SuppressWarnings("all")
public final class NonpositiveDimensionQuerySpecification extends BaseGeneratedEMFQuerySpecification<NonpositiveDimensionMatcher> {
  private NonpositiveDimensionQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NonpositiveDimensionQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NonpositiveDimensionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NonpositiveDimensionMatcher.on(engine);
  }
  
  @Override
  public NonpositiveDimensionMatch newEmptyMatch() {
    return NonpositiveDimensionMatch.newEmptyMatch();
  }
  
  @Override
  public NonpositiveDimensionMatch newMatch(final Object... parameters) {
    return NonpositiveDimensionMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link NonpositiveDimensionQuerySpecification} to be created 
   * 	<b>not</b> at the class load time of the outer class, 
   * 	but rather at the first call to {@link NonpositiveDimensionQuerySpecification#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static NonpositiveDimensionQuerySpecification INSTANCE = new NonpositiveDimensionQuerySpecification();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternalSneaky();
      return null;					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NonpositiveDimensionQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveDimension";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("Dimension");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("Dimension", "hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Dimension"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_Dimension = body.getOrCreateVariableByName("Dimension");
      		PVariable var_Width = body.getOrCreateVariableByName("Width");
      		PVariable var_Depth = body.getOrCreateVariableByName("Depth");
      		PVariable var_Height = body.getOrCreateVariableByName("Height");
      		new TypeConstraint(body, new FlatTuple(var_Dimension), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension")));
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		   new ExportedParameter(body, var_Dimension, "Dimension")
      		));
      		// 	Dimension.width(Dimension, Width)
      		new TypeConstraint(body, new FlatTuple(var_Dimension), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension")));
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new TypeConstraint(body, new FlatTuple(var_Dimension, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "width")));
      		new Equality(body, var__virtual_0_, var_Width);
      		// 	Dimension.depth(Dimension, Depth)
      		new TypeConstraint(body, new FlatTuple(var_Dimension), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension")));
      		PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      		new TypeConstraint(body, new FlatTuple(var_Dimension, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "depth")));
      		new Equality(body, var__virtual_1_, var_Depth);
      		// 	Dimension.height(Dimension, Height)
      		new TypeConstraint(body, new FlatTuple(var_Dimension), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension")));
      		PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      		new TypeConstraint(body, new FlatTuple(var_Dimension, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://inf.mit.bme.hu/kortargyalo/dronesStructure", "Dimension", "height")));
      		new Equality(body, var__virtual_2_, var_Height);
      		// 	check(Width <= 0 || Depth <= 0 || Height <= 0)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern nonpositiveDimension";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("Depth", "Height", "Width");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Double Depth = (java.lang.Double) provider.getValue("Depth");
      		                                    java.lang.Double Height = (java.lang.Double) provider.getValue("Height");
      		                                    java.lang.Double Width = (java.lang.Double) provider.getValue("Width");
      		                                    return evaluateExpression_1_1(Depth, Height, Width);
      		                                }
      		
      		                        },  null); 
      		bodies.add(body);
      	}
      	                {
      		PAnnotation annotation = new PAnnotation("Constraint");
      		annotation.addAttribute("severity", "error");
      		annotation.addAttribute("message", "Dimensions must be positive.");
      		annotation.addAttribute("key", Arrays.asList(new Object[] {
      		                "Dimension"
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
  
  private static boolean evaluateExpression_1_1(final Double Depth, final Double Height, final Double Width) {
    return ((((Width).doubleValue() <= 0) || ((Depth).doubleValue() <= 0)) || ((Height).doubleValue() <= 0));
  }
}
