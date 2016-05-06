package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllRoleFilledMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CrashMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.LeftSceneMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.AllRoleFilledQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.CrashQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.LeftSceneQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in dronesSimulationQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file dronesSimulationQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries, the group contains the definition of the following patterns: <ul>
 * <li>roleFilled</li>
 * <li>notAllRoleFilled</li>
 * <li>allRoleFilled</li>
 * <li>crash</li>
 * <li>leftScene</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class DronesSimulationQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static DronesSimulationQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new DronesSimulationQueries();
    }
    return INSTANCE;
  }
  
  private static DronesSimulationQueries INSTANCE;
  
  private DronesSimulationQueries() throws IncQueryException {
    querySpecifications.add(AllRoleFilledQuerySpecification.instance());
    querySpecifications.add(CrashQuerySpecification.instance());
    querySpecifications.add(LeftSceneQuerySpecification.instance());
  }
  
  public AllRoleFilledQuerySpecification getAllRoleFilled() throws IncQueryException {
    return AllRoleFilledQuerySpecification.instance();
  }
  
  public AllRoleFilledMatcher getAllRoleFilled(final IncQueryEngine engine) throws IncQueryException {
    return AllRoleFilledMatcher.on(engine);
  }
  
  public CrashQuerySpecification getCrash() throws IncQueryException {
    return CrashQuerySpecification.instance();
  }
  
  public CrashMatcher getCrash(final IncQueryEngine engine) throws IncQueryException {
    return CrashMatcher.on(engine);
  }
  
  public LeftSceneQuerySpecification getLeftScene() throws IncQueryException {
    return LeftSceneQuerySpecification.instance();
  }
  
  public LeftSceneMatcher getLeftScene(final IncQueryEngine engine) throws IncQueryException {
    return LeftSceneMatcher.on(engine);
  }
}
