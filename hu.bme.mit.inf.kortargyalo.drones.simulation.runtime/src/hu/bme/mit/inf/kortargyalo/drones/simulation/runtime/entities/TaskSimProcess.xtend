package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities

import co.paralleluniverse.fibers.SuspendExecution
import desmoj.core.simulator.InterruptCode
import desmoj.core.simulator.TimeSpan
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskInstance
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.TaskState
import hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.events.TaskReadyToStartEvent
import java.util.concurrent.TimeUnit
import org.eclipse.xtend.lib.annotations.Accessors

class TaskSimProcess extends LogSimProcess {
	
	val DronesSimModel dronesOwner
	@Accessors(PUBLIC_GETTER) val TaskInstance taskInstance
	val TaskReadyToStartEvent readyToStartEvent
	
	new(DronesSimModel owner, TaskInstance taskInstance, boolean showInTrace) {
		super(owner, taskInstance.task.name, showInTrace)
		dronesOwner = owner
		this.taskInstance = taskInstance
		readyToStartEvent = new TaskReadyToStartEvent(this, false)
	}
	
	override lifeCycle() throws SuspendExecution {
		val action = taskInstance.task.actionToPerform
		val name = taskInstance.task.name
		
		taskInstance.state = TaskState.WAITING
		hold(new TimeSpan(action.startTimeout, TimeUnit.SECONDS))
		log('''Waiting for cooperating drones on task «name»''')
		
		if (!interrupted) {
			val rolesNotFilled = taskInstance.roleInstances.filter[allocatedDrone == null]
			error("Cooperation initiation has timed out",
				'''Roles «FOR role : rolesNotFilled SEPARATOR ", "»«role.role.name»«ENDFOR» of task «name» are not allocated''',
				"Allocated some drones to the unallocated roles")
			// TODO Does this work?
			model.experiment.finish
		} else if (!InterruptCode.equals(interruptCode, dronesOwner.readyToStartInterrupt)) {
			throw new RuntimeException("Unexpected interrupt " + interruptCode.name)
		}
		clearInterruptCode
		
		log('''Cooperation on task «name» started''')
		taskInstance.state = TaskState.IN_PROGRESS
		hold(new TimeSpan(action.duration, TimeUnit.SECONDS))
		if (interrupted) {
			throw new RuntimeException("Unexpected interrupt " + interruptCode.name)
		}
		
		log('''Cooperation on task «name» done''')
		taskInstance.state = TaskState.DONE
		for (role : taskInstance.roleInstances) {
			dronesOwner.getDroneProcess(role.allocatedDrone.drone.name).interrupt(dronesOwner.taskDoneInterrupt)
		}
	}
	
	def readyToStart() {
		readyToStartEvent.signalReady
	}
}