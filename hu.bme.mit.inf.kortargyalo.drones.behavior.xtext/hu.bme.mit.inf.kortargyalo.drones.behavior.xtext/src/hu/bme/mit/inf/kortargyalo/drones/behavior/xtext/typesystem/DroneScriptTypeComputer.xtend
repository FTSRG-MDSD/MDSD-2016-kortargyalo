package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.typesystem

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Statement
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.typesystem.computation.ITypeComputationState
import org.eclipse.xtext.xbase.typesystem.computation.XbaseTypeComputer

class DroneScriptTypeComputer extends XbaseTypeComputer {
	
	override computeTypes(XExpression expression, ITypeComputationState state) {
		switch (expression) {
			Statement: computeStatementTypes(expression, state)
			default: super.computeTypes(expression, state)
		}
	}
	
	protected dispatch def computeStatementTypes(ComplexWait obj, ITypeComputationState state) {
		val waitState = state.withExpectation(getPrimitiveVoid(state))
		waitState.withinScope(obj)
		for (reaction : obj.reactions) {
			waitState.computeTypes(reaction.statement)
		}
		if (obj.onTimeout != null) {
			waitState.computeTypes(obj.onTimeout)
		}
		state.acceptActualType(getPrimitiveVoid(state))
	}
	
	protected dispatch def computeStatementTypes(Statement obj, ITypeComputationState state) {
		state.acceptActualType(getPrimitiveVoid(state))
	}
}