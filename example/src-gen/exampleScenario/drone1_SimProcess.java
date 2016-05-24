package exampleScenario;

import org.eclipse.xtext.xbase.lib.InputOutput;

import co.paralleluniverse.fibers.SuspendExecution;
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DroneSimProcess;
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel;

@SuppressWarnings("all")
public class drone1_SimProcess extends DroneSimProcess {
  public drone1_SimProcess(final DronesSimModel owner, final DroneInstance droneInstance, final boolean showInTrace) {
    super(owner, droneInstance, showInTrace);
  }
  
  protected void runScript() throws SuspendExecution {
    _moveTo(560.0, 120.0, 900.0);
    boolean quad2Ready = false;
    while ((!quad2Ready)) {
      {
        _scan();
        _sendSignal("start", "drone2");
        {
          int waitResult = _wait(120, "ready");
          switch (waitResult) {
            case -1:
              InputOutput.<String>println("I AM SERIOUSLY FUBAR");
              break;
            case 0:
              quad2Ready = true;
              break;
            default:
              throw new IllegalStateException("Unexpected wait result " + waitResult);
          }
        }
      }
    }
    _sendMap("drone2");
    _cooperate("build", "role1");
    _moveTo(150.0, 7.5, 50.0);
  }
}
