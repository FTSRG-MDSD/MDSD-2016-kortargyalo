package exampleScenario;

import co.paralleluniverse.fibers.SuspendExecution;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneSimProcess;
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel;

@SuppressWarnings("all")
public class drone2_SimProcess extends DroneSimProcess {
  public drone2_SimProcess(final DronesSimModel owner, final DroneInstance droneInstance, final boolean showInTrace) {
    super(owner, droneInstance, showInTrace);
  }
  
  protected void runScript() throws SuspendExecution {
    _moveTo(750.0, 120.0, 900.0);
    _wait(0, "start");
    _sendSignal("ready", "drone1");
    _cooperate("build", "role2");
    _moveTo(70.0, 7.5, 50.0);
    _charge();
  }
}
