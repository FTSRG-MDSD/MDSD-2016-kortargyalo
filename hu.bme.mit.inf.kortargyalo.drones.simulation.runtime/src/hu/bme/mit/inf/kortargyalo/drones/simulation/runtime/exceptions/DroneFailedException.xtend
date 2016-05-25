package hu.bme.mit.inf.kortargyalo.drones.simulation.runtime.exceptions

import java.lang.RuntimeException
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtend.lib.annotations.Accessors

@FinalFieldsConstructor
@Accessors(PUBLIC_GETTER)
class DroneFailedException extends RuntimeException {
	
	val String reason
	val String prevention
	
	override getMessage() {
		reason
	}
	
}