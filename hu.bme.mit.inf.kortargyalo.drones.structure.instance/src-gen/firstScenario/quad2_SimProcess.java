package firstScenario;

import co.paralleluniverse.fibers.SuspendExecution;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneSimProcess;
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel;

@SuppressWarnings("all")
public class quad2_SimProcess extends DroneSimProcess {
  public quad2_SimProcess(final DronesSimModel owner, final DroneInstance droneInstance, final boolean showInTrace) {
    super(owner, droneInstance, showInTrace);
  }
  
  protected void runScript() throws SuspendExecution {
    _moveTo(890.0, 100.0, 700.0);
    _wait(0, "letsBuild");
    _sendSignal("readyToBuild", "quad1");
    _cooperate("buildBridge1", "lifter");
    _moveTo(30.0, 30.0, 40.0);
    _charge();
    _moveTo(0.0, 0.0, 0.0);
  }
}
