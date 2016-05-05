package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.compiler

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Statement
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable

class DroneScriptCompiler extends XbaseCompiler {
	
	protected override internalCanCompileToJavaExpression(XExpression obj, ITreeAppendable appendable) {
		switch (obj) {
			Statement: false
			default: super.internalCanCompileToJavaExpression(obj, appendable)
		}
	}
	
	protected override doInternalToJavaStatement(XExpression obj, ITreeAppendable appendable, boolean isReferenced) {
		switch (obj) {
			Statement: statementToJavaStatement(obj, appendable)
			default: super.doInternalToJavaStatement(obj, appendable, isReferenced)
		}
	}
	
	private dispatch def statementToJavaStatement(Statement obj, ITreeAppendable appendable) {
		
	}
}