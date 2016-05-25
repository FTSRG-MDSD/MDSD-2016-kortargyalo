package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities

import desmoj.core.simulator.Model
import desmoj.core.simulator.SimProcess
import java.util.concurrent.TimeUnit

package abstract class LogSimProcess extends SimProcess {
	
	new(Model owner, String name, boolean showInTrace) {
		super(owner, name, showInTrace)
	}
	
	protected def log(String s) {
		val currTime = model.experiment.simClock.time.getTimeTruncated(TimeUnit.SECONDS)
		println('''«currTime» «name»: «s»''')
		sendTraceNote(s)
	}
	
	protected def error(String description, String reason, String prevention) {
		val currTime = model.experiment.simClock.time.getTimeTruncated(TimeUnit.SECONDS)
		println('''!!! «currTime» «name»: «description»''')
		println("!!! reason: " + reason)
		println("!!! prevention: " + prevention)
		sendWarning(description, "SimProcess : " + name, reason, prevention)
	}
}