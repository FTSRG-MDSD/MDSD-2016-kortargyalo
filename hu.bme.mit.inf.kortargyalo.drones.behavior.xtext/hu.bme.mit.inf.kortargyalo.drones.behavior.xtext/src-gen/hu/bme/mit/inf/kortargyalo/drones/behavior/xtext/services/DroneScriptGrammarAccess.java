/*
 * generated by Xtext 2.9.1
 */
package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class DroneScriptGrammarAccess extends AbstractGrammarElementFinder {
	
	public class DronesBehaviorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.DronesBehavior");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScenarioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cScenarioAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cScenarioScenarioCrossReference_1_0 = (CrossReference)cScenarioAssignment_1.eContents().get(0);
		private final RuleCall cScenarioScenarioQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cScenarioScenarioCrossReference_1_0.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cSignalKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cSignalsAssignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final RuleCall cSignalsSignalParserRuleCall_2_0_1_0 = (RuleCall)cSignalsAssignment_2_0_1.eContents().get(0);
		private final Group cGroup_2_0_2 = (Group)cGroup_2_0.eContents().get(2);
		private final Keyword cCommaKeyword_2_0_2_0 = (Keyword)cGroup_2_0_2.eContents().get(0);
		private final Assignment cSignalsAssignment_2_0_2_1 = (Assignment)cGroup_2_0_2.eContents().get(1);
		private final RuleCall cSignalsSignalParserRuleCall_2_0_2_1_0 = (RuleCall)cSignalsAssignment_2_0_2_1.eContents().get(0);
		private final Assignment cScriptsAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cScriptsScriptParserRuleCall_2_1_0 = (RuleCall)cScriptsAssignment_2_1.eContents().get(0);
		
		//DronesBehavior:
		//	"scenario" scenario=[Scenario|QualifiedName] ("signal" signals+=Signal ("," signals+=Signal)* | scripts+=Script)*;
		@Override public ParserRule getRule() { return rule; }
		
		//"scenario" scenario=[Scenario|QualifiedName] ("signal" signals+=Signal ("," signals+=Signal)* | scripts+=Script)*
		public Group getGroup() { return cGroup; }
		
		//"scenario"
		public Keyword getScenarioKeyword_0() { return cScenarioKeyword_0; }
		
		//scenario=[Scenario|QualifiedName]
		public Assignment getScenarioAssignment_1() { return cScenarioAssignment_1; }
		
		//[Scenario|QualifiedName]
		public CrossReference getScenarioScenarioCrossReference_1_0() { return cScenarioScenarioCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getScenarioScenarioQualifiedNameParserRuleCall_1_0_1() { return cScenarioScenarioQualifiedNameParserRuleCall_1_0_1; }
		
		//("signal" signals+=Signal ("," signals+=Signal)* | scripts+=Script)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//"signal" signals+=Signal ("," signals+=Signal)*
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//"signal"
		public Keyword getSignalKeyword_2_0_0() { return cSignalKeyword_2_0_0; }
		
		//signals+=Signal
		public Assignment getSignalsAssignment_2_0_1() { return cSignalsAssignment_2_0_1; }
		
		//Signal
		public RuleCall getSignalsSignalParserRuleCall_2_0_1_0() { return cSignalsSignalParserRuleCall_2_0_1_0; }
		
		//("," signals+=Signal)*
		public Group getGroup_2_0_2() { return cGroup_2_0_2; }
		
		//","
		public Keyword getCommaKeyword_2_0_2_0() { return cCommaKeyword_2_0_2_0; }
		
		//signals+=Signal
		public Assignment getSignalsAssignment_2_0_2_1() { return cSignalsAssignment_2_0_2_1; }
		
		//Signal
		public RuleCall getSignalsSignalParserRuleCall_2_0_2_1_0() { return cSignalsSignalParserRuleCall_2_0_2_1_0; }
		
		//scripts+=Script
		public Assignment getScriptsAssignment_2_1() { return cScriptsAssignment_2_1; }
		
		//Script
		public RuleCall getScriptsScriptParserRuleCall_2_1_0() { return cScriptsScriptParserRuleCall_2_1_0; }
	}
	public class SignalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Signal");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Signal:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class ScriptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Script");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScriptKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDroneAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDroneDroneCrossReference_1_0 = (CrossReference)cDroneAssignment_1.eContents().get(0);
		private final RuleCall cDroneDroneQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cDroneDroneCrossReference_1_0.eContents().get(1);
		private final Assignment cStatementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatementSequenceParserRuleCall_2_0 = (RuleCall)cStatementAssignment_2.eContents().get(0);
		
		//Script:
		//	"script" drone=[Drone|QualifiedName] statement=Sequence;
		@Override public ParserRule getRule() { return rule; }
		
		//"script" drone=[Drone|QualifiedName] statement=Sequence
		public Group getGroup() { return cGroup; }
		
		//"script"
		public Keyword getScriptKeyword_0() { return cScriptKeyword_0; }
		
		//drone=[Drone|QualifiedName]
		public Assignment getDroneAssignment_1() { return cDroneAssignment_1; }
		
		//[Drone|QualifiedName]
		public CrossReference getDroneDroneCrossReference_1_0() { return cDroneDroneCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getDroneDroneQualifiedNameParserRuleCall_1_0_1() { return cDroneDroneQualifiedNameParserRuleCall_1_0_1; }
		
		//statement=Sequence
		public Assignment getStatementAssignment_2() { return cStatementAssignment_2; }
		
		//Sequence
		public RuleCall getStatementSequenceParserRuleCall_2_0() { return cStatementSequenceParserRuleCall_2_0; }
	}
	public class StatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Statement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSequenceParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSimpleWaitParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cComplexWaitParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cMoveParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cSendSignalParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cCooperateParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cChargeParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cScanParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cSendMapParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		
		//Statement:
		//	Sequence | SimpleWait | ComplexWait | Move | SendSignal | Cooperate | Charge | Scan | SendMap;
		@Override public ParserRule getRule() { return rule; }
		
		//Sequence | SimpleWait | ComplexWait | Move | SendSignal | Cooperate | Charge | Scan | SendMap
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Sequence
		public RuleCall getSequenceParserRuleCall_0() { return cSequenceParserRuleCall_0; }
		
		//SimpleWait
		public RuleCall getSimpleWaitParserRuleCall_1() { return cSimpleWaitParserRuleCall_1; }
		
		//ComplexWait
		public RuleCall getComplexWaitParserRuleCall_2() { return cComplexWaitParserRuleCall_2; }
		
		//Move
		public RuleCall getMoveParserRuleCall_3() { return cMoveParserRuleCall_3; }
		
		//SendSignal
		public RuleCall getSendSignalParserRuleCall_4() { return cSendSignalParserRuleCall_4; }
		
		//Cooperate
		public RuleCall getCooperateParserRuleCall_5() { return cCooperateParserRuleCall_5; }
		
		//Charge
		public RuleCall getChargeParserRuleCall_6() { return cChargeParserRuleCall_6; }
		
		//Scan
		public RuleCall getScanParserRuleCall_7() { return cScanParserRuleCall_7; }
		
		//SendMap
		public RuleCall getSendMapParserRuleCall_8() { return cSendMapParserRuleCall_8; }
	}
	public class SequenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Sequence");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSequenceAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStatementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatementsStatementParserRuleCall_2_0 = (RuleCall)cStatementsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Sequence:
		//	{Sequence} "{" statements+=Statement* "}";
		@Override public ParserRule getRule() { return rule; }
		
		//{Sequence} "{" statements+=Statement* "}"
		public Group getGroup() { return cGroup; }
		
		//{Sequence}
		public Action getSequenceAction_0() { return cSequenceAction_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//statements+=Statement*
		public Assignment getStatementsAssignment_2() { return cStatementsAssignment_2; }
		
		//Statement
		public RuleCall getStatementsStatementParserRuleCall_2_0() { return cStatementsStatementParserRuleCall_2_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class SimpleWaitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.SimpleWait");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWaitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSignalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSignalSignalCrossReference_1_0 = (CrossReference)cSignalAssignment_1.eContents().get(0);
		private final RuleCall cSignalSignalQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cSignalSignalCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cTimeoutKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTimeoutAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTimeoutINTTerminalRuleCall_2_1_0 = (RuleCall)cTimeoutAssignment_2_1.eContents().get(0);
		
		//SimpleWait:
		//	"wait" signal=[Signal|QualifiedName] ("timeout" timeout=INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"wait" signal=[Signal|QualifiedName] ("timeout" timeout=INT)?
		public Group getGroup() { return cGroup; }
		
		//"wait"
		public Keyword getWaitKeyword_0() { return cWaitKeyword_0; }
		
		//signal=[Signal|QualifiedName]
		public Assignment getSignalAssignment_1() { return cSignalAssignment_1; }
		
		//[Signal|QualifiedName]
		public CrossReference getSignalSignalCrossReference_1_0() { return cSignalSignalCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getSignalSignalQualifiedNameParserRuleCall_1_0_1() { return cSignalSignalQualifiedNameParserRuleCall_1_0_1; }
		
		//("timeout" timeout=INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//"timeout"
		public Keyword getTimeoutKeyword_2_0() { return cTimeoutKeyword_2_0; }
		
		//timeout=INT
		public Assignment getTimeoutAssignment_2_1() { return cTimeoutAssignment_2_1; }
		
		//INT
		public RuleCall getTimeoutINTTerminalRuleCall_2_1_0() { return cTimeoutINTTerminalRuleCall_2_1_0; }
	}
	public class ComplexWaitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.ComplexWait");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cComplexWaitAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cWaitKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cTimeoutKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTimeoutAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTimeoutINTTerminalRuleCall_2_1_0 = (RuleCall)cTimeoutAssignment_2_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cReactionsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cReactionsReactionParserRuleCall_4_0 = (RuleCall)cReactionsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cOnKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cTimeoutKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cOnTimeoutAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cOnTimeoutStatementParserRuleCall_5_2_0 = (RuleCall)cOnTimeoutAssignment_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ComplexWait:
		//	{ComplexWait} "wait" ("timeout" timeout=INT)? "{"
		//	reactions+=Reaction* ("on" "timeout" onTimeout=Statement)?
		//	"}";
		@Override public ParserRule getRule() { return rule; }
		
		//{ComplexWait} "wait" ("timeout" timeout=INT)? "{" reactions+=Reaction* ("on" "timeout" onTimeout=Statement)? "}"
		public Group getGroup() { return cGroup; }
		
		//{ComplexWait}
		public Action getComplexWaitAction_0() { return cComplexWaitAction_0; }
		
		//"wait"
		public Keyword getWaitKeyword_1() { return cWaitKeyword_1; }
		
		//("timeout" timeout=INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//"timeout"
		public Keyword getTimeoutKeyword_2_0() { return cTimeoutKeyword_2_0; }
		
		//timeout=INT
		public Assignment getTimeoutAssignment_2_1() { return cTimeoutAssignment_2_1; }
		
		//INT
		public RuleCall getTimeoutINTTerminalRuleCall_2_1_0() { return cTimeoutINTTerminalRuleCall_2_1_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//reactions+=Reaction*
		public Assignment getReactionsAssignment_4() { return cReactionsAssignment_4; }
		
		//Reaction
		public RuleCall getReactionsReactionParserRuleCall_4_0() { return cReactionsReactionParserRuleCall_4_0; }
		
		//("on" "timeout" onTimeout=Statement)?
		public Group getGroup_5() { return cGroup_5; }
		
		//"on"
		public Keyword getOnKeyword_5_0() { return cOnKeyword_5_0; }
		
		//"timeout"
		public Keyword getTimeoutKeyword_5_1() { return cTimeoutKeyword_5_1; }
		
		//onTimeout=Statement
		public Assignment getOnTimeoutAssignment_5_2() { return cOnTimeoutAssignment_5_2; }
		
		//Statement
		public RuleCall getOnTimeoutStatementParserRuleCall_5_2_0() { return cOnTimeoutStatementParserRuleCall_5_2_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class ReactionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Reaction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cOnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSignalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSignalSignalCrossReference_1_0 = (CrossReference)cSignalAssignment_1.eContents().get(0);
		private final RuleCall cSignalSignalQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cSignalSignalCrossReference_1_0.eContents().get(1);
		private final Assignment cStatementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatementStatementParserRuleCall_2_0 = (RuleCall)cStatementAssignment_2.eContents().get(0);
		
		//Reaction:
		//	"on" signal=[Signal|QualifiedName] statement=Statement;
		@Override public ParserRule getRule() { return rule; }
		
		//"on" signal=[Signal|QualifiedName] statement=Statement
		public Group getGroup() { return cGroup; }
		
		//"on"
		public Keyword getOnKeyword_0() { return cOnKeyword_0; }
		
		//signal=[Signal|QualifiedName]
		public Assignment getSignalAssignment_1() { return cSignalAssignment_1; }
		
		//[Signal|QualifiedName]
		public CrossReference getSignalSignalCrossReference_1_0() { return cSignalSignalCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getSignalSignalQualifiedNameParserRuleCall_1_0_1() { return cSignalSignalQualifiedNameParserRuleCall_1_0_1; }
		
		//statement=Statement
		public Assignment getStatementAssignment_2() { return cStatementAssignment_2; }
		
		//Statement
		public RuleCall getStatementStatementParserRuleCall_2_0() { return cStatementStatementParserRuleCall_2_0; }
	}
	public class MoveElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Move");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMoveKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cToKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cDestinationAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDestinationPositionParserRuleCall_2_0 = (RuleCall)cDestinationAssignment_2.eContents().get(0);
		
		//Move:
		//	"move" "to" destination=Position;
		@Override public ParserRule getRule() { return rule; }
		
		//"move" "to" destination=Position
		public Group getGroup() { return cGroup; }
		
		//"move"
		public Keyword getMoveKeyword_0() { return cMoveKeyword_0; }
		
		//"to"
		public Keyword getToKeyword_1() { return cToKeyword_1; }
		
		//destination=Position
		public Assignment getDestinationAssignment_2() { return cDestinationAssignment_2; }
		
		//Position
		public RuleCall getDestinationPositionParserRuleCall_2_0() { return cDestinationPositionParserRuleCall_2_0; }
	}
	public class SendSignalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.SendSignal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSendKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSignalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSignalSignalCrossReference_1_0 = (CrossReference)cSignalAssignment_1.eContents().get(0);
		private final RuleCall cSignalSignalQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cSignalSignalCrossReference_1_0.eContents().get(1);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRecipentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRecipentDroneCrossReference_3_0 = (CrossReference)cRecipentAssignment_3.eContents().get(0);
		private final RuleCall cRecipentDroneQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cRecipentDroneCrossReference_3_0.eContents().get(1);
		
		//SendSignal:
		//	"send" signal=[Signal|QualifiedName] "to" recipent=[Drone|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//"send" signal=[Signal|QualifiedName] "to" recipent=[Drone|QualifiedName]
		public Group getGroup() { return cGroup; }
		
		//"send"
		public Keyword getSendKeyword_0() { return cSendKeyword_0; }
		
		//signal=[Signal|QualifiedName]
		public Assignment getSignalAssignment_1() { return cSignalAssignment_1; }
		
		//[Signal|QualifiedName]
		public CrossReference getSignalSignalCrossReference_1_0() { return cSignalSignalCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getSignalSignalQualifiedNameParserRuleCall_1_0_1() { return cSignalSignalQualifiedNameParserRuleCall_1_0_1; }
		
		//"to"
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//recipent=[Drone|QualifiedName]
		public Assignment getRecipentAssignment_3() { return cRecipentAssignment_3; }
		
		//[Drone|QualifiedName]
		public CrossReference getRecipentDroneCrossReference_3_0() { return cRecipentDroneCrossReference_3_0; }
		
		//QualifiedName
		public RuleCall getRecipentDroneQualifiedNameParserRuleCall_3_0_1() { return cRecipentDroneQualifiedNameParserRuleCall_3_0_1; }
	}
	public class CooperateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Cooperate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCooperateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRoleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRoleRoleCrossReference_1_0 = (CrossReference)cRoleAssignment_1.eContents().get(0);
		private final RuleCall cRoleRoleQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cRoleRoleCrossReference_1_0.eContents().get(1);
		
		//Cooperate:
		//	"cooperate" role=[Role|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//"cooperate" role=[Role|QualifiedName]
		public Group getGroup() { return cGroup; }
		
		//"cooperate"
		public Keyword getCooperateKeyword_0() { return cCooperateKeyword_0; }
		
		//role=[Role|QualifiedName]
		public Assignment getRoleAssignment_1() { return cRoleAssignment_1; }
		
		//[Role|QualifiedName]
		public CrossReference getRoleRoleCrossReference_1_0() { return cRoleRoleCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getRoleRoleQualifiedNameParserRuleCall_1_0_1() { return cRoleRoleQualifiedNameParserRuleCall_1_0_1; }
	}
	public class ChargeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Charge");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cChargeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cChargeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Charge:
		//	{Charge} "charge";
		@Override public ParserRule getRule() { return rule; }
		
		//{Charge} "charge"
		public Group getGroup() { return cGroup; }
		
		//{Charge}
		public Action getChargeAction_0() { return cChargeAction_0; }
		
		//"charge"
		public Keyword getChargeKeyword_1() { return cChargeKeyword_1; }
	}
	public class ScanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Scan");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cScanAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cScanKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Scan:
		//	{Scan} "scan";
		@Override public ParserRule getRule() { return rule; }
		
		//{Scan} "scan"
		public Group getGroup() { return cGroup; }
		
		//{Scan}
		public Action getScanAction_0() { return cScanAction_0; }
		
		//"scan"
		public Keyword getScanKeyword_1() { return cScanKeyword_1; }
	}
	public class SendMapElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.SendMap");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSendKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cMapKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cToKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRecipentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRecipentDroneCrossReference_3_0 = (CrossReference)cRecipentAssignment_3.eContents().get(0);
		private final RuleCall cRecipentDroneQualifiedNameParserRuleCall_3_0_1 = (RuleCall)cRecipentDroneCrossReference_3_0.eContents().get(1);
		
		//SendMap:
		//	"send" "map" "to" recipent=[Drone|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//"send" "map" "to" recipent=[Drone|QualifiedName]
		public Group getGroup() { return cGroup; }
		
		//"send"
		public Keyword getSendKeyword_0() { return cSendKeyword_0; }
		
		//"map"
		public Keyword getMapKeyword_1() { return cMapKeyword_1; }
		
		//"to"
		public Keyword getToKeyword_2() { return cToKeyword_2; }
		
		//recipent=[Drone|QualifiedName]
		public Assignment getRecipentAssignment_3() { return cRecipentAssignment_3; }
		
		//[Drone|QualifiedName]
		public CrossReference getRecipentDroneCrossReference_3_0() { return cRecipentDroneCrossReference_3_0; }
		
		//QualifiedName
		public RuleCall getRecipentDroneQualifiedNameParserRuleCall_3_0_1() { return cRecipentDroneQualifiedNameParserRuleCall_3_0_1; }
	}
	public class PositionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Position");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cXAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cXDOUBLEParserRuleCall_0_0 = (RuleCall)cXAssignment_0.eContents().get(0);
		private final Keyword cCommaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cYAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cYDOUBLEParserRuleCall_2_0 = (RuleCall)cYAssignment_2.eContents().get(0);
		private final Keyword cCommaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cZAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cZDOUBLEParserRuleCall_4_0 = (RuleCall)cZAssignment_4.eContents().get(0);
		
		//Position:
		//	x=DOUBLE "," y=DOUBLE "," z=DOUBLE;
		@Override public ParserRule getRule() { return rule; }
		
		//x=DOUBLE "," y=DOUBLE "," z=DOUBLE
		public Group getGroup() { return cGroup; }
		
		//x=DOUBLE
		public Assignment getXAssignment_0() { return cXAssignment_0; }
		
		//DOUBLE
		public RuleCall getXDOUBLEParserRuleCall_0_0() { return cXDOUBLEParserRuleCall_0_0; }
		
		//","
		public Keyword getCommaKeyword_1() { return cCommaKeyword_1; }
		
		//y=DOUBLE
		public Assignment getYAssignment_2() { return cYAssignment_2; }
		
		//DOUBLE
		public RuleCall getYDOUBLEParserRuleCall_2_0() { return cYDOUBLEParserRuleCall_2_0; }
		
		//","
		public Keyword getCommaKeyword_3() { return cCommaKeyword_3; }
		
		//z=DOUBLE
		public Assignment getZAssignment_4() { return cZAssignment_4; }
		
		//DOUBLE
		public RuleCall getZDOUBLEParserRuleCall_4_0() { return cZDOUBLEParserRuleCall_4_0; }
	}
	public class DOUBLEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.DOUBLE");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFullStopKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//DOUBLE ecore::EDouble:
		//	"-"? INT ("." INT)?
		@Override public ParserRule getRule() { return rule; }
		
		//"-"? INT ("." INT)?
		public Group getGroup() { return cGroup; }
		
		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//("." INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//"."
		public Keyword getFullStopKeyword_2_0() { return cFullStopKeyword_2_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_1() { return cINTTerminalRuleCall_2_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName hidden():
		//	ID ("." ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ("." ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final DronesBehaviorElements pDronesBehavior;
	private final SignalElements pSignal;
	private final ScriptElements pScript;
	private final StatementElements pStatement;
	private final SequenceElements pSequence;
	private final SimpleWaitElements pSimpleWait;
	private final ComplexWaitElements pComplexWait;
	private final ReactionElements pReaction;
	private final MoveElements pMove;
	private final SendSignalElements pSendSignal;
	private final CooperateElements pCooperate;
	private final ChargeElements pCharge;
	private final ScanElements pScan;
	private final SendMapElements pSendMap;
	private final PositionElements pPosition;
	private final DOUBLEElements pDOUBLE;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DroneScriptGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDronesBehavior = new DronesBehaviorElements();
		this.pSignal = new SignalElements();
		this.pScript = new ScriptElements();
		this.pStatement = new StatementElements();
		this.pSequence = new SequenceElements();
		this.pSimpleWait = new SimpleWaitElements();
		this.pComplexWait = new ComplexWaitElements();
		this.pReaction = new ReactionElements();
		this.pMove = new MoveElements();
		this.pSendSignal = new SendSignalElements();
		this.pCooperate = new CooperateElements();
		this.pCharge = new ChargeElements();
		this.pScan = new ScanElements();
		this.pSendMap = new SendMapElements();
		this.pPosition = new PositionElements();
		this.pDOUBLE = new DOUBLEElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//DronesBehavior:
	//	"scenario" scenario=[Scenario|QualifiedName] ("signal" signals+=Signal ("," signals+=Signal)* | scripts+=Script)*;
	public DronesBehaviorElements getDronesBehaviorAccess() {
		return pDronesBehavior;
	}
	
	public ParserRule getDronesBehaviorRule() {
		return getDronesBehaviorAccess().getRule();
	}
	
	//Signal:
	//	name=ID;
	public SignalElements getSignalAccess() {
		return pSignal;
	}
	
	public ParserRule getSignalRule() {
		return getSignalAccess().getRule();
	}
	
	//Script:
	//	"script" drone=[Drone|QualifiedName] statement=Sequence;
	public ScriptElements getScriptAccess() {
		return pScript;
	}
	
	public ParserRule getScriptRule() {
		return getScriptAccess().getRule();
	}
	
	//Statement:
	//	Sequence | SimpleWait | ComplexWait | Move | SendSignal | Cooperate | Charge | Scan | SendMap;
	public StatementElements getStatementAccess() {
		return pStatement;
	}
	
	public ParserRule getStatementRule() {
		return getStatementAccess().getRule();
	}
	
	//Sequence:
	//	{Sequence} "{" statements+=Statement* "}";
	public SequenceElements getSequenceAccess() {
		return pSequence;
	}
	
	public ParserRule getSequenceRule() {
		return getSequenceAccess().getRule();
	}
	
	//SimpleWait:
	//	"wait" signal=[Signal|QualifiedName] ("timeout" timeout=INT)?;
	public SimpleWaitElements getSimpleWaitAccess() {
		return pSimpleWait;
	}
	
	public ParserRule getSimpleWaitRule() {
		return getSimpleWaitAccess().getRule();
	}
	
	//ComplexWait:
	//	{ComplexWait} "wait" ("timeout" timeout=INT)? "{"
	//	reactions+=Reaction* ("on" "timeout" onTimeout=Statement)?
	//	"}";
	public ComplexWaitElements getComplexWaitAccess() {
		return pComplexWait;
	}
	
	public ParserRule getComplexWaitRule() {
		return getComplexWaitAccess().getRule();
	}
	
	//Reaction:
	//	"on" signal=[Signal|QualifiedName] statement=Statement;
	public ReactionElements getReactionAccess() {
		return pReaction;
	}
	
	public ParserRule getReactionRule() {
		return getReactionAccess().getRule();
	}
	
	//Move:
	//	"move" "to" destination=Position;
	public MoveElements getMoveAccess() {
		return pMove;
	}
	
	public ParserRule getMoveRule() {
		return getMoveAccess().getRule();
	}
	
	//SendSignal:
	//	"send" signal=[Signal|QualifiedName] "to" recipent=[Drone|QualifiedName];
	public SendSignalElements getSendSignalAccess() {
		return pSendSignal;
	}
	
	public ParserRule getSendSignalRule() {
		return getSendSignalAccess().getRule();
	}
	
	//Cooperate:
	//	"cooperate" role=[Role|QualifiedName];
	public CooperateElements getCooperateAccess() {
		return pCooperate;
	}
	
	public ParserRule getCooperateRule() {
		return getCooperateAccess().getRule();
	}
	
	//Charge:
	//	{Charge} "charge";
	public ChargeElements getChargeAccess() {
		return pCharge;
	}
	
	public ParserRule getChargeRule() {
		return getChargeAccess().getRule();
	}
	
	//Scan:
	//	{Scan} "scan";
	public ScanElements getScanAccess() {
		return pScan;
	}
	
	public ParserRule getScanRule() {
		return getScanAccess().getRule();
	}
	
	//SendMap:
	//	"send" "map" "to" recipent=[Drone|QualifiedName];
	public SendMapElements getSendMapAccess() {
		return pSendMap;
	}
	
	public ParserRule getSendMapRule() {
		return getSendMapAccess().getRule();
	}
	
	//Position:
	//	x=DOUBLE "," y=DOUBLE "," z=DOUBLE;
	public PositionElements getPositionAccess() {
		return pPosition;
	}
	
	public ParserRule getPositionRule() {
		return getPositionAccess().getRule();
	}
	
	//DOUBLE ecore::EDouble:
	//	"-"? INT ("." INT)?
	public DOUBLEElements getDOUBLEAccess() {
		return pDOUBLE;
	}
	
	public ParserRule getDOUBLERule() {
		return getDOUBLEAccess().getRule();
	}
	
	//QualifiedName hidden():
	//	ID ("." ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
