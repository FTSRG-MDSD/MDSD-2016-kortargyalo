package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ScanningCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.ProvidedScanningCapabilityWithCostMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.structure.queries.providedScanningCapabilityWithCost pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ProvidedScanningCapabilityWithCostProcessor implements IMatchProcessor<ProvidedScanningCapabilityWithCostMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pProvidedCapability the value of pattern parameter ProvidedCapability in the currently processed match
   * @param pCapability the value of pattern parameter Capability in the currently processed match
   * @param pDroneType the value of pattern parameter DroneType in the currently processed match
   * 
   */
  public abstract void process(final ProvidedCapability pProvidedCapability, final ScanningCapability pCapability, final DroneType pDroneType);
  
  @Override
  public void process(final ProvidedScanningCapabilityWithCostMatch match) {
    process(match.getProvidedCapability(), match.getCapability(), match.getDroneType());
  }
}
