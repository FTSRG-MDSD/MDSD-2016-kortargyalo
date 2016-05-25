package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util;

import com.google.common.collect.Sets;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllDronesAreInactiveMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllDronesAreInactiveMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.DroneIsActiveQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.DroneIsInactiveQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.incquery.runtime.matchers.psystem.IValueProvider;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate AllDronesAreInactiveMatcher in a type-safe way.
 * 
 * @see AllDronesAreInactiveMatcher
 * @see AllDronesAreInactiveMatch
 * 
 */
@SuppressWarnings("all")
public final class AllDronesAreInactiveQuerySpecification extends BaseGeneratedEMFQuerySpecification<AllDronesAreInactiveMatcher> {
  private AllDronesAreInactiveQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static AllDronesAreInactiveQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected AllDronesAreInactiveMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return AllDronesAreInactiveMatcher.on(engine);
  }
  
  @Override
  public AllDronesAreInactiveMatch newEmptyMatch() {
    return AllDronesAreInactiveMatch.newEmptyMatch();
  }
  
  @Override
  public AllDronesAreInactiveMatch newMatch(final Object... parameters) {
    return AllDronesAreInactiveMatch.newMatch();
  }
  
  private static class LazyHolder {
    private final static AllDronesAreInactiveQuerySpecification INSTANCE = make();
    
    public static AllDronesAreInactiveQuerySpecification make() {
      return new AllDronesAreInactiveQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static AllDronesAreInactiveQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.allDronesAreInactive";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList();
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList();
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      	{
      		PBody body = new PBody(this);
      		PVariable var_N = body.getOrCreateVariableByName("N");
      		PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      		PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
      		body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
      		));
      		// 	count find droneIsInactive(_) == N
      		PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      		new PatternMatchCounter(body, new FlatTuple(var___0_), DroneIsInactiveQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_0_);
      		new Equality(body, var__virtual_0_, var_N);
      		// 	check(N >= 1)
      		new ExpressionEvaluation(body, new IExpressionEvaluator() {
      		                            
      		                            @Override
      		                            public String getShortDescription() {
      		                                return "Expression evaluation from pattern allDronesAreInactive";
      		                            }
      		
      		                            @Override
      		                            public Iterable<String> getInputParameterNames() {
      		                                return Arrays.asList("N");
      		                            }
      		
      		                            @Override
      		                            public Object evaluateExpression(IValueProvider provider) throws Exception {
      		                                    java.lang.Integer N = (java.lang.Integer) provider.getValue("N");
      		                                    return evaluateExpression_1_1(N);
      		                                }
      		
      		                        },  null); // 	neg find droneIsActive(_)
      		new NegativePatternCall(body, new FlatTuple(var___1_), DroneIsActiveQuerySpecification.instance().getInternalQueryRepresentation());
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
  
  private static boolean evaluateExpression_1_1(final Integer N) {
    return ((N).intValue() >= 1);
  }
}
