package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.entities

import desmoj.core.simulator.SimProcess
import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance
import co.paralleluniverse.fibers.SuspendExecution

abstract class DroneSimProcess extends SimProcess {
	
	val DronesSimModel dronesOwner
	
	val DroneInstance droneInstance
	
	new(DronesSimModel owner, DroneInstance droneInstance, boolean showInTrace) {
		super(owner, droneInstance.drone.name, showInTrace)
		dronesOwner = owner
		this.droneInstance = droneInstance
	}
	
	override lifeCycle() throws SuspendExecution {
		runScript()
	}
	
	protected def abstract void runScript() throws SuspendExecution;
	
	def getPosition() {
		droneInstance.position
	}
	
	def getCurrentBattery() {
		droneInstance.currentBattery
	}
	
	def getBatteryPercentage() {
		droneInstance.currentBattery / droneInstance.drone.dronetype.maxBatteryCapacity
	}
	
	def getObservations() {
		droneInstance.observations
	}
	
	protected final def _moveTo(double x, double y, double z) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")		
	}
	
	protected final def void _charge() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")		
	}
	
	protected final def void _scan() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")		
	}
	
	protected final def void _sendSignal(String signal, String recipent) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")	
	}
	
	protected final def void _sendMap(String drone) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")	
	}
	
	protected final def int _wait(int timeout, String... signals) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")	
	}
	
	protected final def int _cooperate(String task, String role) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")	
	}
}