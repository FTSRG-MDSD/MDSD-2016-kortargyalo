package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.ExternalEvent
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel
import java.util.concurrent.TimeUnit

class SimulationFailedEvent extends ExternalEvent {
	
	String reason = "Unknown reason"
	String prevention = "Prevent the error"
	
	new(DronesSimModel owner, boolean showInTrace) {
		super(owner, "simulation failed", showInTrace)
	}
	
	override eventRoutine() throws SuspendExecution {
		val description = "Simulation failed"
		val currTime = model.experiment.simClock.time.getTimeTruncated(TimeUnit.SECONDS)
		println('''!!! «currTime» «name»: «description»''')
		println("!!! reason: " + reason)
		println("!!! prevention: " + prevention)
		sendWarning(description, "Event : " + name, reason, prevention)
		(model as DronesSimModel).stop
	}
	
	def simulationFailed(String reason, String prevention) {
		this.reason = reason
		this.prevention = prevention
		schedule
	}
}