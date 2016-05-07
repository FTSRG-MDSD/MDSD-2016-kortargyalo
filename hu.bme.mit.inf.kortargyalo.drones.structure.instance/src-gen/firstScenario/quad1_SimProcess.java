package firstScenario;

import co.paralleluniverse.fibers.SuspendExecution;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneSimProcess;
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class quad1_SimProcess extends DroneSimProcess {
  public quad1_SimProcess(final DronesSimModel owner, final DroneInstance droneInstance, final boolean showInTrace) {
    super(owner, droneInstance, showInTrace);
  }
  
  protected void runScript() throws SuspendExecution {
    _moveTo(890.0, 20.0, 700.0);
    _scan();
    boolean accepted = false;
    accepted = true;
    while ((!accepted)) {
      {
        _sendSignal("letsBuild", "quad2");
        {
          int waitResult = _wait(120, "readyToBuild");
          switch (waitResult) {
            case 0:
              accepted = true;
              break;
            default:
              throw new IllegalStateException("Unexpected wait result " + waitResult);
          }
        }
      }
    }
    InputOutput.<String>println("Hello");
    _sendMap("quad2");
    _cooperate("buildBridge1", "coordinator");
    _moveTo(50.0, 0.0, 0.0);
  }
}
