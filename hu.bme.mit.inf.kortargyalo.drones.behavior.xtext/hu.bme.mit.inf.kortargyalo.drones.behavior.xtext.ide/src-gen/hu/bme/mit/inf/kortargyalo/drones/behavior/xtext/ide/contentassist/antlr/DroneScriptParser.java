/*
 * generated by Xtext 2.9.1
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.ide.contentassist.antlr.internal.InternalDroneScriptParser;
import hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.services.DroneScriptGrammarAccess;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class DroneScriptParser extends AbstractContentAssistParser {

	@Inject
	private DroneScriptGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDroneScriptParser createParser() {
		InternalDroneScriptParser result = new InternalDroneScriptParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDronesBehaviorAccess().getAlternatives_2(), "rule__DronesBehavior__Alternatives_2");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getDronesBehaviorAccess().getGroup(), "rule__DronesBehavior__Group__0");
					put(grammarAccess.getDronesBehaviorAccess().getGroup_2_0(), "rule__DronesBehavior__Group_2_0__0");
					put(grammarAccess.getDronesBehaviorAccess().getGroup_2_0_2(), "rule__DronesBehavior__Group_2_0_2__0");
					put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
					put(grammarAccess.getSequenceAccess().getGroup(), "rule__Sequence__Group__0");
					put(grammarAccess.getSimpleWaitAccess().getGroup(), "rule__SimpleWait__Group__0");
					put(grammarAccess.getSimpleWaitAccess().getGroup_3(), "rule__SimpleWait__Group_3__0");
					put(grammarAccess.getComplexWaitAccess().getGroup(), "rule__ComplexWait__Group__0");
					put(grammarAccess.getComplexWaitAccess().getGroup_2(), "rule__ComplexWait__Group_2__0");
					put(grammarAccess.getComplexWaitAccess().getGroup_5(), "rule__ComplexWait__Group_5__0");
					put(grammarAccess.getReactionAccess().getGroup(), "rule__Reaction__Group__0");
					put(grammarAccess.getMoveAccess().getGroup(), "rule__Move__Group__0");
					put(grammarAccess.getSendSignalAccess().getGroup(), "rule__SendSignal__Group__0");
					put(grammarAccess.getCooperateAccess().getGroup(), "rule__Cooperate__Group__0");
					put(grammarAccess.getChargeAccess().getGroup(), "rule__Charge__Group__0");
					put(grammarAccess.getScanAccess().getGroup(), "rule__Scan__Group__0");
					put(grammarAccess.getSendMapAccess().getGroup(), "rule__SendMap__Group__0");
					put(grammarAccess.getPositionAccess().getGroup(), "rule__Position__Group__0");
					put(grammarAccess.getDOUBLEAccess().getGroup(), "rule__DOUBLE__Group__0");
					put(grammarAccess.getDOUBLEAccess().getGroup_2(), "rule__DOUBLE__Group_2__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
					put(grammarAccess.getDronesBehaviorAccess().getScenarioAssignment_1(), "rule__DronesBehavior__ScenarioAssignment_1");
					put(grammarAccess.getDronesBehaviorAccess().getSignalsAssignment_2_0_1(), "rule__DronesBehavior__SignalsAssignment_2_0_1");
					put(grammarAccess.getDronesBehaviorAccess().getSignalsAssignment_2_0_2_1(), "rule__DronesBehavior__SignalsAssignment_2_0_2_1");
					put(grammarAccess.getDronesBehaviorAccess().getScriptsAssignment_2_1(), "rule__DronesBehavior__ScriptsAssignment_2_1");
					put(grammarAccess.getSignalAccess().getNameAssignment(), "rule__Signal__NameAssignment");
					put(grammarAccess.getScriptAccess().getDroneAssignment_2(), "rule__Script__DroneAssignment_2");
					put(grammarAccess.getScriptAccess().getStatementAssignment_3(), "rule__Script__StatementAssignment_3");
					put(grammarAccess.getSequenceAccess().getStatementsAssignment_2(), "rule__Sequence__StatementsAssignment_2");
					put(grammarAccess.getSimpleWaitAccess().getSignalAssignment_2(), "rule__SimpleWait__SignalAssignment_2");
					put(grammarAccess.getSimpleWaitAccess().getTimeoutAssignment_3_1(), "rule__SimpleWait__TimeoutAssignment_3_1");
					put(grammarAccess.getComplexWaitAccess().getTimeoutAssignment_2_1(), "rule__ComplexWait__TimeoutAssignment_2_1");
					put(grammarAccess.getComplexWaitAccess().getReactionsAssignment_4(), "rule__ComplexWait__ReactionsAssignment_4");
					put(grammarAccess.getComplexWaitAccess().getOnTimeoutAssignment_5_2(), "rule__ComplexWait__OnTimeoutAssignment_5_2");
					put(grammarAccess.getReactionAccess().getSignalAssignment_1(), "rule__Reaction__SignalAssignment_1");
					put(grammarAccess.getReactionAccess().getStatementAssignment_2(), "rule__Reaction__StatementAssignment_2");
					put(grammarAccess.getMoveAccess().getDestinationAssignment_2(), "rule__Move__DestinationAssignment_2");
					put(grammarAccess.getSendSignalAccess().getSignalAssignment_1(), "rule__SendSignal__SignalAssignment_1");
					put(grammarAccess.getSendSignalAccess().getRecipentAssignment_3(), "rule__SendSignal__RecipentAssignment_3");
					put(grammarAccess.getCooperateAccess().getTaskAssignment_2(), "rule__Cooperate__TaskAssignment_2");
					put(grammarAccess.getCooperateAccess().getRoleAssignment_4(), "rule__Cooperate__RoleAssignment_4");
					put(grammarAccess.getSendMapAccess().getRecipentAssignment_3(), "rule__SendMap__RecipentAssignment_3");
					put(grammarAccess.getPositionAccess().getXAssignment_0(), "rule__Position__XAssignment_0");
					put(grammarAccess.getPositionAccess().getYAssignment_2(), "rule__Position__YAssignment_2");
					put(grammarAccess.getPositionAccess().getZAssignment_4(), "rule__Position__ZAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalDroneScriptParser typedParser = (InternalDroneScriptParser) parser;
			typedParser.entryRuleDronesBehavior();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DroneScriptGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DroneScriptGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
