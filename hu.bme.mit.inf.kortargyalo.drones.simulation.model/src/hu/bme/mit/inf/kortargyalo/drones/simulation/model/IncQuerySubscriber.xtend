package hu.bme.mit.inf.kortargyalo.drones.simulation.model

import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllRoleFilledMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CollisionWithObjectMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CrashMatcher
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.LeftSceneMatcher
import org.eclipse.incquery.runtime.api.IncQueryEngine
import org.eclipse.incquery.runtime.emf.EMFScope
import org.eclipse.emf.common.notify.Notifier

class IncQuerySubscriber {
	def subscribe(Notifier resource){
		val IncQueryEngine engine = IncQueryEngine.on(new EMFScope(resource)) 
		
		val allRoleFilled = AllRoleFilledMatcher.on(engine)
		val collision = CollisionWithObjectMatcher.on(engine)
		val crash = CrashMatcher.on(engine)
		val left = LeftSceneMatcher.on(engine)
	
	
	}
	
}