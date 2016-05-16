package hu.bme.mit.inf.kortargyalo.drones.structure.queries;

import hu.bme.mit.inf.kortargyalo.drones.structure.queries.DuplicateNameMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.DurationTooShortMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.MoreThanOneScanningCapabilitiesMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.MovementCapabilityMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NegativeCostProvidedCapabilityMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NegativeEnergyConsumptionMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveBatteryCapacityMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveDimensionMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveProvidedCapabilityMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveRequiredCapabilityMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveStartTimeoutMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveWeightMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NotOneMovementCapabilityProvidedMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.ProvidedScanningCapabilityWithCostMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.ScanningCapabilityMatcher;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.DuplicateNameQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.DurationTooShortQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.MoreThanOneScanningCapabilitiesQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.MovementCapabilityQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NegativeCostProvidedCapabilityQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NegativeEnergyConsumptionQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveBatteryCapacityQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveDimensionQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveProvidedCapabilityQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveRequiredCapabilityQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveStartTimeoutQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NonpositiveWeightQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.NotOneMovementCapabilityProvidedQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.ProvidedScanningCapabilityWithCostQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.util.ScanningCapabilityQuerySpecification;
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
 * <li>providedScanningCapability</li>
 * <li>notOneMovementCapabilityProvided</li>
 * <li>moreThanOneScanningCapabilities</li>
 * <li>movementCapability</li>
 * <li>scanningCapability</li>
 * <li>duplicateName</li>
 * <li>nameScope</li>
 * <li>childScope</li>
 * <li>relatedScope</li>
 * <li>inRelatedScope</li>
 * <li>nonpositiveDimension</li>
 * <li>nonpositiveWeight</li>
 * <li>nonpositiveBatteryCapacity</li>
 * <li>negativeEnergyConsumption</li>
 * <li>nonpositiveProvidedCapability</li>
 * <li>negativeCostProvidedCapability</li>
 * <li>nonpositiveRequiredCapability</li>
 * <li>providedScanningCapabilityWithCost</li>
 * <li>nonpositiveStartTimeout</li>
 * <li>durationTooShort</li>
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
    querySpecifications.add(MoreThanOneScanningCapabilitiesQuerySpecification.instance());
    querySpecifications.add(MovementCapabilityQuerySpecification.instance());
    querySpecifications.add(ScanningCapabilityQuerySpecification.instance());
    querySpecifications.add(DuplicateNameQuerySpecification.instance());
    querySpecifications.add(NonpositiveDimensionQuerySpecification.instance());
    querySpecifications.add(NonpositiveWeightQuerySpecification.instance());
    querySpecifications.add(NonpositiveBatteryCapacityQuerySpecification.instance());
    querySpecifications.add(NegativeEnergyConsumptionQuerySpecification.instance());
    querySpecifications.add(NonpositiveProvidedCapabilityQuerySpecification.instance());
    querySpecifications.add(NegativeCostProvidedCapabilityQuerySpecification.instance());
    querySpecifications.add(NonpositiveRequiredCapabilityQuerySpecification.instance());
    querySpecifications.add(ProvidedScanningCapabilityWithCostQuerySpecification.instance());
    querySpecifications.add(NonpositiveStartTimeoutQuerySpecification.instance());
    querySpecifications.add(DurationTooShortQuerySpecification.instance());
  }
  
  public NotOneMovementCapabilityProvidedQuerySpecification getNotOneMovementCapabilityProvided() throws IncQueryException {
    return NotOneMovementCapabilityProvidedQuerySpecification.instance();
  }
  
  public NotOneMovementCapabilityProvidedMatcher getNotOneMovementCapabilityProvided(final IncQueryEngine engine) throws IncQueryException {
    return NotOneMovementCapabilityProvidedMatcher.on(engine);
  }
  
  public MoreThanOneScanningCapabilitiesQuerySpecification getMoreThanOneScanningCapabilities() throws IncQueryException {
    return MoreThanOneScanningCapabilitiesQuerySpecification.instance();
  }
  
  public MoreThanOneScanningCapabilitiesMatcher getMoreThanOneScanningCapabilities(final IncQueryEngine engine) throws IncQueryException {
    return MoreThanOneScanningCapabilitiesMatcher.on(engine);
  }
  
  public MovementCapabilityQuerySpecification getMovementCapability() throws IncQueryException {
    return MovementCapabilityQuerySpecification.instance();
  }
  
  public MovementCapabilityMatcher getMovementCapability(final IncQueryEngine engine) throws IncQueryException {
    return MovementCapabilityMatcher.on(engine);
  }
  
  public ScanningCapabilityQuerySpecification getScanningCapability() throws IncQueryException {
    return ScanningCapabilityQuerySpecification.instance();
  }
  
  public ScanningCapabilityMatcher getScanningCapability(final IncQueryEngine engine) throws IncQueryException {
    return ScanningCapabilityMatcher.on(engine);
  }
  
  public DuplicateNameQuerySpecification getDuplicateName() throws IncQueryException {
    return DuplicateNameQuerySpecification.instance();
  }
  
  public DuplicateNameMatcher getDuplicateName(final IncQueryEngine engine) throws IncQueryException {
    return DuplicateNameMatcher.on(engine);
  }
  
  public NonpositiveDimensionQuerySpecification getNonpositiveDimension() throws IncQueryException {
    return NonpositiveDimensionQuerySpecification.instance();
  }
  
  public NonpositiveDimensionMatcher getNonpositiveDimension(final IncQueryEngine engine) throws IncQueryException {
    return NonpositiveDimensionMatcher.on(engine);
  }
  
  public NonpositiveWeightQuerySpecification getNonpositiveWeight() throws IncQueryException {
    return NonpositiveWeightQuerySpecification.instance();
  }
  
  public NonpositiveWeightMatcher getNonpositiveWeight(final IncQueryEngine engine) throws IncQueryException {
    return NonpositiveWeightMatcher.on(engine);
  }
  
  public NonpositiveBatteryCapacityQuerySpecification getNonpositiveBatteryCapacity() throws IncQueryException {
    return NonpositiveBatteryCapacityQuerySpecification.instance();
  }
  
  public NonpositiveBatteryCapacityMatcher getNonpositiveBatteryCapacity(final IncQueryEngine engine) throws IncQueryException {
    return NonpositiveBatteryCapacityMatcher.on(engine);
  }
  
  public NegativeEnergyConsumptionQuerySpecification getNegativeEnergyConsumption() throws IncQueryException {
    return NegativeEnergyConsumptionQuerySpecification.instance();
  }
  
  public NegativeEnergyConsumptionMatcher getNegativeEnergyConsumption(final IncQueryEngine engine) throws IncQueryException {
    return NegativeEnergyConsumptionMatcher.on(engine);
  }
  
  public NonpositiveProvidedCapabilityQuerySpecification getNonpositiveProvidedCapability() throws IncQueryException {
    return NonpositiveProvidedCapabilityQuerySpecification.instance();
  }
  
  public NonpositiveProvidedCapabilityMatcher getNonpositiveProvidedCapability(final IncQueryEngine engine) throws IncQueryException {
    return NonpositiveProvidedCapabilityMatcher.on(engine);
  }
  
  public NegativeCostProvidedCapabilityQuerySpecification getNegativeCostProvidedCapability() throws IncQueryException {
    return NegativeCostProvidedCapabilityQuerySpecification.instance();
  }
  
  public NegativeCostProvidedCapabilityMatcher getNegativeCostProvidedCapability(final IncQueryEngine engine) throws IncQueryException {
    return NegativeCostProvidedCapabilityMatcher.on(engine);
  }
  
  public NonpositiveRequiredCapabilityQuerySpecification getNonpositiveRequiredCapability() throws IncQueryException {
    return NonpositiveRequiredCapabilityQuerySpecification.instance();
  }
  
  public NonpositiveRequiredCapabilityMatcher getNonpositiveRequiredCapability(final IncQueryEngine engine) throws IncQueryException {
    return NonpositiveRequiredCapabilityMatcher.on(engine);
  }
  
  public ProvidedScanningCapabilityWithCostQuerySpecification getProvidedScanningCapabilityWithCost() throws IncQueryException {
    return ProvidedScanningCapabilityWithCostQuerySpecification.instance();
  }
  
  public ProvidedScanningCapabilityWithCostMatcher getProvidedScanningCapabilityWithCost(final IncQueryEngine engine) throws IncQueryException {
    return ProvidedScanningCapabilityWithCostMatcher.on(engine);
  }
  
  public NonpositiveStartTimeoutQuerySpecification getNonpositiveStartTimeout() throws IncQueryException {
    return NonpositiveStartTimeoutQuerySpecification.instance();
  }
  
  public NonpositiveStartTimeoutMatcher getNonpositiveStartTimeout(final IncQueryEngine engine) throws IncQueryException {
    return NonpositiveStartTimeoutMatcher.on(engine);
  }
  
  public DurationTooShortQuerySpecification getDurationTooShort() throws IncQueryException {
    return DurationTooShortQuerySpecification.instance();
  }
  
  public DurationTooShortMatcher getDurationTooShort(final IncQueryEngine engine) throws IncQueryException {
    return DurationTooShortMatcher.on(engine);
  }
}
