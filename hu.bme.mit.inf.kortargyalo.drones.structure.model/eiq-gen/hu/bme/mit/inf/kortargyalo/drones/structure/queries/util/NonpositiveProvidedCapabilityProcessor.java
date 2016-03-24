package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.DroneType;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.ProvidedCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveProvidedCapabilityMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveProvidedCapability pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NonpositiveProvidedCapabilityProcessor implements IMatchProcessor<NonpositiveProvidedCapabilityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pProvidedCapability the value of pattern parameter ProvidedCapability in the currently processed match
   * @param pCapability the value of pattern parameter Capability in the currently processed match
   * @param pDroneType the value of pattern parameter DroneType in the currently processed match
   * 
   */
  public abstract void process(final ProvidedCapability pProvidedCapability, final Capability pCapability, final DroneType pDroneType);
  
  @Override
  public void process(final NonpositiveProvidedCapabilityMatch match) {
    process(match.getProvidedCapability(), match.getCapability(), match.getDroneType());
  }
}
