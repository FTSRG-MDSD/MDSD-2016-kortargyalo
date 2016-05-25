package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.ExternalEvent
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.DronesSimModel
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities.TaskSimProcess

class TaskReadyToStartEvent extends ExternalEvent {
	
	val TaskSimProcess task
	val DronesSimModel dronesOwner
	
	new(TaskSimProcess task, boolean showInTrace) {
		super(task.model, task.taskInstance.task.name + " ready to start", showInTrace)
		this.task = task
		dronesOwner = task.model as DronesSimModel
	}
	
	override eventRoutine() throws SuspendExecution {
		task.interrupt(dronesOwner.readyToStartInterrupt)
	}
	
	def signalReady() {
		schedule()
	}
}