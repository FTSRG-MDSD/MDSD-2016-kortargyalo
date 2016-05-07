package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.compiler

import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Charge
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.ComplexWait
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Cooperate
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Move
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.Scan
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendMap
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SendSignal
import hu.bme.mit.inf.kortargyalo.drones.behavior.dronesBehavior.SimpleWait
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

	private dispatch def statementToJavaStatement(Move obj, ITreeAppendable it) {
		val dest = obj.destination
		newLine.trace(obj, true).append('''_moveTo(«dest.x», «dest.y», «dest.z»);''')
	}

	private dispatch def statementToJavaStatement(Charge obj, ITreeAppendable it) {
		newLine.trace(obj, true).append('''_charge();''')
	}

	private dispatch def statementToJavaStatement(Scan obj, ITreeAppendable it) {
		newLine.trace(obj, true).append('''_scan();''')
	}

	private dispatch def statementToJavaStatement(SendSignal obj, ITreeAppendable it) {
		newLine.trace(obj, true).append('''_sendSignal("«obj.signal.name»", "«obj.recipent.name»");''')
	}

	private dispatch def statementToJavaStatement(SendMap obj, ITreeAppendable it) {
		newLine.trace(obj, true).append('''_sendMap("«obj.recipent.name»");''')
	}

	private dispatch def statementToJavaStatement(SimpleWait obj, ITreeAppendable it) {
		newLine.trace(obj, true).append('''_wait(«obj.timeout», "«obj.signal.name»");''')
	}

	private dispatch def statementToJavaStatement(ComplexWait obj, ITreeAppendable it) {
		newLine.append("{").increaseIndentation
		openScope
		
		val varName = declareSyntheticVariable(obj, "waitResult")
		newLine.append('''int «varName» = ''').trace(obj, true) => [
			append('''_wait(«obj.timeout»''')
			append('''«FOR reaction : obj.reactions BEFORE ", " SEPARATOR ", "»"«reaction.signal.name»"«ENDFOR»''')
			append(")")
		]
		append(";")
		
		val hasReactions = obj.reactions.size > 0
		val hasOnTimeout = obj.onTimeout != null
		if (hasReactions || hasOnTimeout) {
			newLine.append('''switch («varName») {''').increaseIndentation
			
			if (hasOnTimeout) {
				compileReactionCase(-1, obj.onTimeout)
			}
			
			for (var int i = 0; i < obj.reactions.size; i++) {
				compileReactionCase(i, obj.reactions.get(i).statement)
			}
			
			newLine.append("default:").increaseIndentation
			newLine.trace(obj, true) => [
				append("throw new ")
				append(IllegalStateException)
				append('''("Unexpected wait result " + «varName»);''')
			]
			decreaseIndentation
			
			decreaseIndentation.newLine.append("}")
		}
		
		closeScope
		decreaseIndentation.newLine.append("}")
	}

	private def compileReactionCase(ITreeAppendable it, int i, XExpression body) {
		newLine.append('''case «i»:''').increaseIndentation
		openPseudoScope
		internalToJavaStatement(body, it, false)
		closeScope
		if (!isEarlyExit(body)) {
			newLine.append("break;")
		}
		decreaseIndentation
	}

	private dispatch def statementToJavaStatement(Cooperate obj, ITreeAppendable it) {
		newLine.trace(obj, true).append('''_cooperate("«obj.task.name»", "«obj.role.name»");''')
	}
}
