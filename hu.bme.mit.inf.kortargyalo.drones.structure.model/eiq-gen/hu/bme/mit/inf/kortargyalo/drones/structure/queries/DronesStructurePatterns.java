package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.queries.DuplicateNameMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.MovementCapabilityMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NotOneMovementCapabilityProvidedMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.DuplicateNameQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.MovementCapabilityQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NotOneMovementCapabilityProvidedQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in dronesStructurePatterns.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file dronesStructurePatterns.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.inf.kortargyalo.drones.structure.queries, the group contains the definition of the following patterns: <ul>
 * <li>providedMovementCapability</li>
 * <li>notOneMovementCapabilityProvided</li>
 * <li>movementCapability</li>
 * <li>duplicateName</li>
 * <li>nameScope</li>
 * <li>childScope</li>
 * <li>relatedScope</li>
 * <li>inRelatedScope</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class DronesStructurePatterns extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static DronesStructurePatterns instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new DronesStructurePatterns();
    }
    return INSTANCE;
  }
  
  private static DronesStructurePatterns INSTANCE;
  
  private DronesStructurePatterns() throws IncQueryException {
    querySpecifications.add(NotOneMovementCapabilityProvidedQuerySpecification.instance());
    querySpecifications.add(MovementCapabilityQuerySpecification.instance());
    querySpecifications.add(DuplicateNameQuerySpecification.instance());
  }
  
  public NotOneMovementCapabilityProvidedQuerySpecification getNotOneMovementCapabilityProvided() throws IncQueryException {
    return NotOneMovementCapabilityProvidedQuerySpecification.instance();
  }
  
  public NotOneMovementCapabilityProvidedMatcher getNotOneMovementCapabilityProvided(final IncQueryEngine engine) throws IncQueryException {
    return NotOneMovementCapabilityProvidedMatcher.on(engine);
  }
  
  public MovementCapabilityQuerySpecification getMovementCapability() throws IncQueryException {
    return MovementCapabilityQuerySpecification.instance();
  }
  
  public MovementCapabilityMatcher getMovementCapability(final IncQueryEngine engine) throws IncQueryException {
    return MovementCapabilityMatcher.on(engine);
  }
  
  public DuplicateNameQuerySpecification getDuplicateName() throws IncQueryException {
    return DuplicateNameQuerySpecification.instance();
  }
  
  public DuplicateNameMatcher getDuplicateName(final IncQueryEngine engine) throws IncQueryException {
    return DuplicateNameMatcher.on(engine);
  }
}
