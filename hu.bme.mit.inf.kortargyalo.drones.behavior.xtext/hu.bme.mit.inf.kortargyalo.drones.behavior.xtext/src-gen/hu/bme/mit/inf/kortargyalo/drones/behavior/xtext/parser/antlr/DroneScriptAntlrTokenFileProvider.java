/*
 * generated by Xtext 2.9.2
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DroneScriptAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("hu/bme/mit/inf/kortargyalo/drones/behavior/xtext/parser/antlr/internal/InternalDroneScript.tokens");
	}
}
