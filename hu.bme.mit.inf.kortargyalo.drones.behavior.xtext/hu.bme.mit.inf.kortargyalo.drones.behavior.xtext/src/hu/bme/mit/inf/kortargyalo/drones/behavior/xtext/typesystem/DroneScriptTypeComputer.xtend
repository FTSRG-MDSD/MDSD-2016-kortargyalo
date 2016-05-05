package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.typesystem

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Statement
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer
import org.eclipse.xtext.xbase.XExpression

class DroneScriptTypeComputer extends XbaseTypeComputer {
	
	dispatch def computeTypes(XExpression expression, ITypeComputationState state) {
		switch (expression) {
			Statement: state.acceptActualType(getPrimitiveVoid(state))
			default: super.computeTypes(expression, state)
		}
	}
	
}