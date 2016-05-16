package hu.bme.mit.inf.kortargyalo.drones.structure.queries.util;

import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Capability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.CooperativeAction;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.RequiredCapability;
import hu.bme.mit.inf.kortargyalo.drones.structure.dronesStructure.Role;
import hu.bme.mit.inf.kortargyalo.drones.structure.queries.NonpositiveRequiredCapabilityMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.inf.kortargyalo.drones.structure.queries.nonpositiveRequiredCapability pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NonpositiveRequiredCapabilityProcessor implements IMatchProcessor<NonpositiveRequiredCapabilityMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pRequiredCapability the value of pattern parameter RequiredCapability in the currently processed match
   * @param pCapability the value of pattern parameter Capability in the currently processed match
   * @param pAction the value of pattern parameter Action in the currently processed match
   * @param pRole the value of pattern parameter Role in the currently processed match
   * 
   */
  public abstract void process(final RequiredCapability pRequiredCapability, final Capability pCapability, final CooperativeAction pAction, final Role pRole);
  
  @Override
  public void process(final NonpositiveRequiredCapabilityMatch match) {
    process(match.getRequiredCapability(), match.getCapability(), match.getAction(), match.getRole());
  }
}
