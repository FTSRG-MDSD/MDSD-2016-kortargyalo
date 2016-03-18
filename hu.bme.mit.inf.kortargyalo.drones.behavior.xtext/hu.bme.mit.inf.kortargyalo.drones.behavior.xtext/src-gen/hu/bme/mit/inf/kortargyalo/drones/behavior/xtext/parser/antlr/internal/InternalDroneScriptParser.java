package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.services.DroneScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDroneScriptParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scenario'", "'signal'", "','", "'script'", "'{'", "'}'", "'wait'", "'timeout'", "'on'", "'move'", "'to'", "'send'", "'cooperate'", "'charge'", "'scan'", "'map'", "'-'", "'.'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDroneScriptParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDroneScriptParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDroneScriptParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDroneScript.g"; }



     	private DroneScriptGrammarAccess grammarAccess;

        public InternalDroneScriptParser(TokenStream input, DroneScriptGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DronesBehavior";
       	}

       	@Override
       	protected DroneScriptGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDronesBehavior"
    // InternalDroneScript.g:64:1: entryRuleDronesBehavior returns [EObject current=null] : iv_ruleDronesBehavior= ruleDronesBehavior EOF ;
    public final EObject entryRuleDronesBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDronesBehavior = null;


        try {
            // InternalDroneScript.g:64:55: (iv_ruleDronesBehavior= ruleDronesBehavior EOF )
            // InternalDroneScript.g:65:2: iv_ruleDronesBehavior= ruleDronesBehavior EOF
            {
             newCompositeNode(grammarAccess.getDronesBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDronesBehavior=ruleDronesBehavior();

            state._fsp--;

             current =iv_ruleDronesBehavior; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDronesBehavior"


    // $ANTLR start "ruleDronesBehavior"
    // InternalDroneScript.g:71:1: ruleDronesBehavior returns [EObject current=null] : (otherlv_0= 'scenario' ( ( ruleQualifiedName ) ) ( (otherlv_2= 'signal' ( (lv_signals_3_0= ruleSignal ) ) (otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) ) )* ) | ( (lv_scripts_6_0= ruleScript ) ) )* ) ;
    public final EObject ruleDronesBehavior() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_signals_3_0 = null;

        EObject lv_signals_5_0 = null;

        EObject lv_scripts_6_0 = null;



        	enterRule();

        try {
            // InternalDroneScript.g:77:2: ( (otherlv_0= 'scenario' ( ( ruleQualifiedName ) ) ( (otherlv_2= 'signal' ( (lv_signals_3_0= ruleSignal ) ) (otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) ) )* ) | ( (lv_scripts_6_0= ruleScript ) ) )* ) )
            // InternalDroneScript.g:78:2: (otherlv_0= 'scenario' ( ( ruleQualifiedName ) ) ( (otherlv_2= 'signal' ( (lv_signals_3_0= ruleSignal ) ) (otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) ) )* ) | ( (lv_scripts_6_0= ruleScript ) ) )* )
            {
            // InternalDroneScript.g:78:2: (otherlv_0= 'scenario' ( ( ruleQualifiedName ) ) ( (otherlv_2= 'signal' ( (lv_signals_3_0= ruleSignal ) ) (otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) ) )* ) | ( (lv_scripts_6_0= ruleScript ) ) )* )
            // InternalDroneScript.g:79:3: otherlv_0= 'scenario' ( ( ruleQualifiedName ) ) ( (otherlv_2= 'signal' ( (lv_signals_3_0= ruleSignal ) ) (otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) ) )* ) | ( (lv_scripts_6_0= ruleScript ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDronesBehaviorAccess().getScenarioKeyword_0());
            		
            // InternalDroneScript.g:83:3: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:84:4: ( ruleQualifiedName )
            {
            // InternalDroneScript.g:84:4: ( ruleQualifiedName )
            // InternalDroneScript.g:85:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDronesBehaviorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDronesBehaviorAccess().getScenarioScenarioCrossReference_1_0());
            				
            pushFollow(FOLLOW_4);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneScript.g:99:3: ( (otherlv_2= 'signal' ( (lv_signals_3_0= ruleSignal ) ) (otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) ) )* ) | ( (lv_scripts_6_0= ruleScript ) ) )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }
                else if ( (LA2_0==14) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalDroneScript.g:100:4: (otherlv_2= 'signal' ( (lv_signals_3_0= ruleSignal ) ) (otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) ) )* )
            	    {
            	    // InternalDroneScript.g:100:4: (otherlv_2= 'signal' ( (lv_signals_3_0= ruleSignal ) ) (otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) ) )* )
            	    // InternalDroneScript.g:101:5: otherlv_2= 'signal' ( (lv_signals_3_0= ruleSignal ) ) (otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) ) )*
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    					newLeafNode(otherlv_2, grammarAccess.getDronesBehaviorAccess().getSignalKeyword_2_0_0());
            	    				
            	    // InternalDroneScript.g:105:5: ( (lv_signals_3_0= ruleSignal ) )
            	    // InternalDroneScript.g:106:6: (lv_signals_3_0= ruleSignal )
            	    {
            	    // InternalDroneScript.g:106:6: (lv_signals_3_0= ruleSignal )
            	    // InternalDroneScript.g:107:7: lv_signals_3_0= ruleSignal
            	    {

            	    							newCompositeNode(grammarAccess.getDronesBehaviorAccess().getSignalsSignalParserRuleCall_2_0_1_0());
            	    						
            	    pushFollow(FOLLOW_5);
            	    lv_signals_3_0=ruleSignal();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDronesBehaviorRule());
            	    							}
            	    							add(
            	    								current,
            	    								"signals",
            	    								lv_signals_3_0,
            	    								"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Signal");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalDroneScript.g:124:5: (otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==13) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalDroneScript.g:125:6: otherlv_4= ',' ( (lv_signals_5_0= ruleSignal ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,13,FOLLOW_3); 

            	    	    						newLeafNode(otherlv_4, grammarAccess.getDronesBehaviorAccess().getCommaKeyword_2_0_2_0());
            	    	    					
            	    	    // InternalDroneScript.g:129:6: ( (lv_signals_5_0= ruleSignal ) )
            	    	    // InternalDroneScript.g:130:7: (lv_signals_5_0= ruleSignal )
            	    	    {
            	    	    // InternalDroneScript.g:130:7: (lv_signals_5_0= ruleSignal )
            	    	    // InternalDroneScript.g:131:8: lv_signals_5_0= ruleSignal
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getDronesBehaviorAccess().getSignalsSignalParserRuleCall_2_0_2_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_signals_5_0=ruleSignal();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getDronesBehaviorRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"signals",
            	    	    									lv_signals_5_0,
            	    	    									"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Signal");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalDroneScript.g:151:4: ( (lv_scripts_6_0= ruleScript ) )
            	    {
            	    // InternalDroneScript.g:151:4: ( (lv_scripts_6_0= ruleScript ) )
            	    // InternalDroneScript.g:152:5: (lv_scripts_6_0= ruleScript )
            	    {
            	    // InternalDroneScript.g:152:5: (lv_scripts_6_0= ruleScript )
            	    // InternalDroneScript.g:153:6: lv_scripts_6_0= ruleScript
            	    {

            	    						newCompositeNode(grammarAccess.getDronesBehaviorAccess().getScriptsScriptParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_scripts_6_0=ruleScript();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDronesBehaviorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"scripts",
            	    							lv_scripts_6_0,
            	    							"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Script");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDronesBehavior"


    // $ANTLR start "entryRuleSignal"
    // InternalDroneScript.g:175:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // InternalDroneScript.g:175:47: (iv_ruleSignal= ruleSignal EOF )
            // InternalDroneScript.g:176:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalDroneScript.g:182:1: ruleSignal returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalDroneScript.g:188:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalDroneScript.g:189:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalDroneScript.g:189:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalDroneScript.g:190:3: (lv_name_0_0= RULE_ID )
            {
            // InternalDroneScript.g:190:3: (lv_name_0_0= RULE_ID )
            // InternalDroneScript.g:191:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSignalRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleScript"
    // InternalDroneScript.g:210:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalDroneScript.g:210:47: (iv_ruleScript= ruleScript EOF )
            // InternalDroneScript.g:211:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalDroneScript.g:217:1: ruleScript returns [EObject current=null] : (otherlv_0= 'script' ( ( ruleQualifiedName ) ) ( (lv_statement_2_0= ruleSequence ) ) ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalDroneScript.g:223:2: ( (otherlv_0= 'script' ( ( ruleQualifiedName ) ) ( (lv_statement_2_0= ruleSequence ) ) ) )
            // InternalDroneScript.g:224:2: (otherlv_0= 'script' ( ( ruleQualifiedName ) ) ( (lv_statement_2_0= ruleSequence ) ) )
            {
            // InternalDroneScript.g:224:2: (otherlv_0= 'script' ( ( ruleQualifiedName ) ) ( (lv_statement_2_0= ruleSequence ) ) )
            // InternalDroneScript.g:225:3: otherlv_0= 'script' ( ( ruleQualifiedName ) ) ( (lv_statement_2_0= ruleSequence ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getScriptAccess().getScriptKeyword_0());
            		
            // InternalDroneScript.g:229:3: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:230:4: ( ruleQualifiedName )
            {
            // InternalDroneScript.g:230:4: ( ruleQualifiedName )
            // InternalDroneScript.g:231:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getScriptRule());
            					}
            				

            					newCompositeNode(grammarAccess.getScriptAccess().getDroneDroneCrossReference_1_0());
            				
            pushFollow(FOLLOW_6);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneScript.g:245:3: ( (lv_statement_2_0= ruleSequence ) )
            // InternalDroneScript.g:246:4: (lv_statement_2_0= ruleSequence )
            {
            // InternalDroneScript.g:246:4: (lv_statement_2_0= ruleSequence )
            // InternalDroneScript.g:247:5: lv_statement_2_0= ruleSequence
            {

            					newCompositeNode(grammarAccess.getScriptAccess().getStatementSequenceParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_2_0=ruleSequence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScriptRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_2_0,
            						"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Sequence");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleStatement"
    // InternalDroneScript.g:268:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalDroneScript.g:268:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalDroneScript.g:269:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDroneScript.g:275:1: ruleStatement returns [EObject current=null] : (this_Sequence_0= ruleSequence | this_SimpleWait_1= ruleSimpleWait | this_ComplexWait_2= ruleComplexWait | this_Move_3= ruleMove | this_SendSignal_4= ruleSendSignal | this_Cooperate_5= ruleCooperate | this_Charge_6= ruleCharge | this_Scan_7= ruleScan | this_SendMap_8= ruleSendMap ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_Sequence_0 = null;

        EObject this_SimpleWait_1 = null;

        EObject this_ComplexWait_2 = null;

        EObject this_Move_3 = null;

        EObject this_SendSignal_4 = null;

        EObject this_Cooperate_5 = null;

        EObject this_Charge_6 = null;

        EObject this_Scan_7 = null;

        EObject this_SendMap_8 = null;



        	enterRule();

        try {
            // InternalDroneScript.g:281:2: ( (this_Sequence_0= ruleSequence | this_SimpleWait_1= ruleSimpleWait | this_ComplexWait_2= ruleComplexWait | this_Move_3= ruleMove | this_SendSignal_4= ruleSendSignal | this_Cooperate_5= ruleCooperate | this_Charge_6= ruleCharge | this_Scan_7= ruleScan | this_SendMap_8= ruleSendMap ) )
            // InternalDroneScript.g:282:2: (this_Sequence_0= ruleSequence | this_SimpleWait_1= ruleSimpleWait | this_ComplexWait_2= ruleComplexWait | this_Move_3= ruleMove | this_SendSignal_4= ruleSendSignal | this_Cooperate_5= ruleCooperate | this_Charge_6= ruleCharge | this_Scan_7= ruleScan | this_SendMap_8= ruleSendMap )
            {
            // InternalDroneScript.g:282:2: (this_Sequence_0= ruleSequence | this_SimpleWait_1= ruleSimpleWait | this_ComplexWait_2= ruleComplexWait | this_Move_3= ruleMove | this_SendSignal_4= ruleSendSignal | this_Cooperate_5= ruleCooperate | this_Charge_6= ruleCharge | this_Scan_7= ruleScan | this_SendMap_8= ruleSendMap )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalDroneScript.g:283:3: this_Sequence_0= ruleSequence
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSequenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sequence_0=ruleSequence();

                    state._fsp--;


                    			current = this_Sequence_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDroneScript.g:292:3: this_SimpleWait_1= ruleSimpleWait
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSimpleWaitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleWait_1=ruleSimpleWait();

                    state._fsp--;


                    			current = this_SimpleWait_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDroneScript.g:301:3: this_ComplexWait_2= ruleComplexWait
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getComplexWaitParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexWait_2=ruleComplexWait();

                    state._fsp--;


                    			current = this_ComplexWait_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDroneScript.g:310:3: this_Move_3= ruleMove
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getMoveParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Move_3=ruleMove();

                    state._fsp--;


                    			current = this_Move_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDroneScript.g:319:3: this_SendSignal_4= ruleSendSignal
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSendSignalParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendSignal_4=ruleSendSignal();

                    state._fsp--;


                    			current = this_SendSignal_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDroneScript.g:328:3: this_Cooperate_5= ruleCooperate
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getCooperateParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Cooperate_5=ruleCooperate();

                    state._fsp--;


                    			current = this_Cooperate_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDroneScript.g:337:3: this_Charge_6= ruleCharge
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getChargeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Charge_6=ruleCharge();

                    state._fsp--;


                    			current = this_Charge_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDroneScript.g:346:3: this_Scan_7= ruleScan
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getScanParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Scan_7=ruleScan();

                    state._fsp--;


                    			current = this_Scan_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDroneScript.g:355:3: this_SendMap_8= ruleSendMap
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSendMapParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_SendMap_8=ruleSendMap();

                    state._fsp--;


                    			current = this_SendMap_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSequence"
    // InternalDroneScript.g:367:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // InternalDroneScript.g:367:49: (iv_ruleSequence= ruleSequence EOF )
            // InternalDroneScript.g:368:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalDroneScript.g:374:1: ruleSequence returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalDroneScript.g:380:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' ) )
            // InternalDroneScript.g:381:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            {
            // InternalDroneScript.g:381:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}' )
            // InternalDroneScript.g:382:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleStatement ) )* otherlv_3= '}'
            {
            // InternalDroneScript.g:382:3: ()
            // InternalDroneScript.g:383:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSequenceAccess().getSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalDroneScript.g:393:3: ( (lv_statements_2_0= ruleStatement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15||LA4_0==17||LA4_0==20||(LA4_0>=22 && LA4_0<=25)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDroneScript.g:394:4: (lv_statements_2_0= ruleStatement )
            	    {
            	    // InternalDroneScript.g:394:4: (lv_statements_2_0= ruleStatement )
            	    // InternalDroneScript.g:395:5: lv_statements_2_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getSequenceAccess().getStatementsStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleSimpleWait"
    // InternalDroneScript.g:420:1: entryRuleSimpleWait returns [EObject current=null] : iv_ruleSimpleWait= ruleSimpleWait EOF ;
    public final EObject entryRuleSimpleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleWait = null;


        try {
            // InternalDroneScript.g:420:51: (iv_ruleSimpleWait= ruleSimpleWait EOF )
            // InternalDroneScript.g:421:2: iv_ruleSimpleWait= ruleSimpleWait EOF
            {
             newCompositeNode(grammarAccess.getSimpleWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleWait=ruleSimpleWait();

            state._fsp--;

             current =iv_ruleSimpleWait; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleWait"


    // $ANTLR start "ruleSimpleWait"
    // InternalDroneScript.g:427:1: ruleSimpleWait returns [EObject current=null] : (otherlv_0= 'wait' ( ( ruleQualifiedName ) ) (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )? ) ;
    public final EObject ruleSimpleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_timeout_3_0=null;


        	enterRule();

        try {
            // InternalDroneScript.g:433:2: ( (otherlv_0= 'wait' ( ( ruleQualifiedName ) ) (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )? ) )
            // InternalDroneScript.g:434:2: (otherlv_0= 'wait' ( ( ruleQualifiedName ) ) (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )? )
            {
            // InternalDroneScript.g:434:2: (otherlv_0= 'wait' ( ( ruleQualifiedName ) ) (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )? )
            // InternalDroneScript.g:435:3: otherlv_0= 'wait' ( ( ruleQualifiedName ) ) (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleWaitAccess().getWaitKeyword_0());
            		
            // InternalDroneScript.g:439:3: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:440:4: ( ruleQualifiedName )
            {
            // InternalDroneScript.g:440:4: ( ruleQualifiedName )
            // InternalDroneScript.g:441:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleWaitRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleWaitAccess().getSignalSignalCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneScript.g:455:3: (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDroneScript.g:456:4: otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getSimpleWaitAccess().getTimeoutKeyword_2_0());
                    			
                    // InternalDroneScript.g:460:4: ( (lv_timeout_3_0= RULE_INT ) )
                    // InternalDroneScript.g:461:5: (lv_timeout_3_0= RULE_INT )
                    {
                    // InternalDroneScript.g:461:5: (lv_timeout_3_0= RULE_INT )
                    // InternalDroneScript.g:462:6: lv_timeout_3_0= RULE_INT
                    {
                    lv_timeout_3_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_timeout_3_0, grammarAccess.getSimpleWaitAccess().getTimeoutINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSimpleWaitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"timeout",
                    							lv_timeout_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleWait"


    // $ANTLR start "entryRuleComplexWait"
    // InternalDroneScript.g:483:1: entryRuleComplexWait returns [EObject current=null] : iv_ruleComplexWait= ruleComplexWait EOF ;
    public final EObject entryRuleComplexWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexWait = null;


        try {
            // InternalDroneScript.g:483:52: (iv_ruleComplexWait= ruleComplexWait EOF )
            // InternalDroneScript.g:484:2: iv_ruleComplexWait= ruleComplexWait EOF
            {
             newCompositeNode(grammarAccess.getComplexWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexWait=ruleComplexWait();

            state._fsp--;

             current =iv_ruleComplexWait; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComplexWait"


    // $ANTLR start "ruleComplexWait"
    // InternalDroneScript.g:490:1: ruleComplexWait returns [EObject current=null] : ( () otherlv_1= 'wait' (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )? otherlv_4= '{' ( (lv_reactions_5_0= ruleReaction ) )* (otherlv_6= 'on' otherlv_7= 'timeout' ( (lv_onTimeout_8_0= ruleStatement ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleComplexWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_timeout_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_reactions_5_0 = null;

        EObject lv_onTimeout_8_0 = null;



        	enterRule();

        try {
            // InternalDroneScript.g:496:2: ( ( () otherlv_1= 'wait' (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )? otherlv_4= '{' ( (lv_reactions_5_0= ruleReaction ) )* (otherlv_6= 'on' otherlv_7= 'timeout' ( (lv_onTimeout_8_0= ruleStatement ) ) )? otherlv_9= '}' ) )
            // InternalDroneScript.g:497:2: ( () otherlv_1= 'wait' (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )? otherlv_4= '{' ( (lv_reactions_5_0= ruleReaction ) )* (otherlv_6= 'on' otherlv_7= 'timeout' ( (lv_onTimeout_8_0= ruleStatement ) ) )? otherlv_9= '}' )
            {
            // InternalDroneScript.g:497:2: ( () otherlv_1= 'wait' (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )? otherlv_4= '{' ( (lv_reactions_5_0= ruleReaction ) )* (otherlv_6= 'on' otherlv_7= 'timeout' ( (lv_onTimeout_8_0= ruleStatement ) ) )? otherlv_9= '}' )
            // InternalDroneScript.g:498:3: () otherlv_1= 'wait' (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )? otherlv_4= '{' ( (lv_reactions_5_0= ruleReaction ) )* (otherlv_6= 'on' otherlv_7= 'timeout' ( (lv_onTimeout_8_0= ruleStatement ) ) )? otherlv_9= '}'
            {
            // InternalDroneScript.g:498:3: ()
            // InternalDroneScript.g:499:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComplexWaitAccess().getComplexWaitAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getComplexWaitAccess().getWaitKeyword_1());
            		
            // InternalDroneScript.g:509:3: (otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDroneScript.g:510:4: otherlv_2= 'timeout' ( (lv_timeout_3_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getComplexWaitAccess().getTimeoutKeyword_2_0());
                    			
                    // InternalDroneScript.g:514:4: ( (lv_timeout_3_0= RULE_INT ) )
                    // InternalDroneScript.g:515:5: (lv_timeout_3_0= RULE_INT )
                    {
                    // InternalDroneScript.g:515:5: (lv_timeout_3_0= RULE_INT )
                    // InternalDroneScript.g:516:6: lv_timeout_3_0= RULE_INT
                    {
                    lv_timeout_3_0=(Token)match(input,RULE_INT,FOLLOW_6); 

                    						newLeafNode(lv_timeout_3_0, grammarAccess.getComplexWaitAccess().getTimeoutINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComplexWaitRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"timeout",
                    							lv_timeout_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getComplexWaitAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDroneScript.g:537:3: ( (lv_reactions_5_0= ruleReaction ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1==RULE_ID) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalDroneScript.g:538:4: (lv_reactions_5_0= ruleReaction )
            	    {
            	    // InternalDroneScript.g:538:4: (lv_reactions_5_0= ruleReaction )
            	    // InternalDroneScript.g:539:5: lv_reactions_5_0= ruleReaction
            	    {

            	    					newCompositeNode(grammarAccess.getComplexWaitAccess().getReactionsReactionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_reactions_5_0=ruleReaction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComplexWaitRule());
            	    					}
            	    					add(
            	    						current,
            	    						"reactions",
            	    						lv_reactions_5_0,
            	    						"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Reaction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDroneScript.g:556:3: (otherlv_6= 'on' otherlv_7= 'timeout' ( (lv_onTimeout_8_0= ruleStatement ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDroneScript.g:557:4: otherlv_6= 'on' otherlv_7= 'timeout' ( (lv_onTimeout_8_0= ruleStatement ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_6, grammarAccess.getComplexWaitAccess().getOnKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getComplexWaitAccess().getTimeoutKeyword_5_1());
                    			
                    // InternalDroneScript.g:565:4: ( (lv_onTimeout_8_0= ruleStatement ) )
                    // InternalDroneScript.g:566:5: (lv_onTimeout_8_0= ruleStatement )
                    {
                    // InternalDroneScript.g:566:5: (lv_onTimeout_8_0= ruleStatement )
                    // InternalDroneScript.g:567:6: lv_onTimeout_8_0= ruleStatement
                    {

                    						newCompositeNode(grammarAccess.getComplexWaitAccess().getOnTimeoutStatementParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_onTimeout_8_0=ruleStatement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexWaitRule());
                    						}
                    						set(
                    							current,
                    							"onTimeout",
                    							lv_onTimeout_8_0,
                    							"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Statement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getComplexWaitAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComplexWait"


    // $ANTLR start "entryRuleReaction"
    // InternalDroneScript.g:593:1: entryRuleReaction returns [EObject current=null] : iv_ruleReaction= ruleReaction EOF ;
    public final EObject entryRuleReaction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReaction = null;


        try {
            // InternalDroneScript.g:593:49: (iv_ruleReaction= ruleReaction EOF )
            // InternalDroneScript.g:594:2: iv_ruleReaction= ruleReaction EOF
            {
             newCompositeNode(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReaction=ruleReaction();

            state._fsp--;

             current =iv_ruleReaction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalDroneScript.g:600:1: ruleReaction returns [EObject current=null] : (otherlv_0= 'on' ( ( ruleQualifiedName ) ) ( (lv_statement_2_0= ruleStatement ) ) ) ;
    public final EObject ruleReaction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalDroneScript.g:606:2: ( (otherlv_0= 'on' ( ( ruleQualifiedName ) ) ( (lv_statement_2_0= ruleStatement ) ) ) )
            // InternalDroneScript.g:607:2: (otherlv_0= 'on' ( ( ruleQualifiedName ) ) ( (lv_statement_2_0= ruleStatement ) ) )
            {
            // InternalDroneScript.g:607:2: (otherlv_0= 'on' ( ( ruleQualifiedName ) ) ( (lv_statement_2_0= ruleStatement ) ) )
            // InternalDroneScript.g:608:3: otherlv_0= 'on' ( ( ruleQualifiedName ) ) ( (lv_statement_2_0= ruleStatement ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReactionAccess().getOnKeyword_0());
            		
            // InternalDroneScript.g:612:3: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:613:4: ( ruleQualifiedName )
            {
            // InternalDroneScript.g:613:4: ( ruleQualifiedName )
            // InternalDroneScript.g:614:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReactionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getReactionAccess().getSignalSignalCrossReference_1_0());
            				
            pushFollow(FOLLOW_13);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDroneScript.g:628:3: ( (lv_statement_2_0= ruleStatement ) )
            // InternalDroneScript.g:629:4: (lv_statement_2_0= ruleStatement )
            {
            // InternalDroneScript.g:629:4: (lv_statement_2_0= ruleStatement )
            // InternalDroneScript.g:630:5: lv_statement_2_0= ruleStatement
            {

            					newCompositeNode(grammarAccess.getReactionAccess().getStatementStatementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_2_0=ruleStatement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReactionRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_2_0,
            						"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Statement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleMove"
    // InternalDroneScript.g:651:1: entryRuleMove returns [EObject current=null] : iv_ruleMove= ruleMove EOF ;
    public final EObject entryRuleMove() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMove = null;


        try {
            // InternalDroneScript.g:651:45: (iv_ruleMove= ruleMove EOF )
            // InternalDroneScript.g:652:2: iv_ruleMove= ruleMove EOF
            {
             newCompositeNode(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMove=ruleMove();

            state._fsp--;

             current =iv_ruleMove; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalDroneScript.g:658:1: ruleMove returns [EObject current=null] : (otherlv_0= 'move' otherlv_1= 'to' ( (lv_destination_2_0= rulePosition ) ) ) ;
    public final EObject ruleMove() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_destination_2_0 = null;



        	enterRule();

        try {
            // InternalDroneScript.g:664:2: ( (otherlv_0= 'move' otherlv_1= 'to' ( (lv_destination_2_0= rulePosition ) ) ) )
            // InternalDroneScript.g:665:2: (otherlv_0= 'move' otherlv_1= 'to' ( (lv_destination_2_0= rulePosition ) ) )
            {
            // InternalDroneScript.g:665:2: (otherlv_0= 'move' otherlv_1= 'to' ( (lv_destination_2_0= rulePosition ) ) )
            // InternalDroneScript.g:666:3: otherlv_0= 'move' otherlv_1= 'to' ( (lv_destination_2_0= rulePosition ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMoveAccess().getMoveKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getMoveAccess().getToKeyword_1());
            		
            // InternalDroneScript.g:674:3: ( (lv_destination_2_0= rulePosition ) )
            // InternalDroneScript.g:675:4: (lv_destination_2_0= rulePosition )
            {
            // InternalDroneScript.g:675:4: (lv_destination_2_0= rulePosition )
            // InternalDroneScript.g:676:5: lv_destination_2_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getMoveAccess().getDestinationPositionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_destination_2_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoveRule());
            					}
            					set(
            						current,
            						"destination",
            						lv_destination_2_0,
            						"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleSendSignal"
    // InternalDroneScript.g:697:1: entryRuleSendSignal returns [EObject current=null] : iv_ruleSendSignal= ruleSendSignal EOF ;
    public final EObject entryRuleSendSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendSignal = null;


        try {
            // InternalDroneScript.g:697:51: (iv_ruleSendSignal= ruleSendSignal EOF )
            // InternalDroneScript.g:698:2: iv_ruleSendSignal= ruleSendSignal EOF
            {
             newCompositeNode(grammarAccess.getSendSignalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendSignal=ruleSendSignal();

            state._fsp--;

             current =iv_ruleSendSignal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendSignal"


    // $ANTLR start "ruleSendSignal"
    // InternalDroneScript.g:704:1: ruleSendSignal returns [EObject current=null] : (otherlv_0= 'send' ( ( ruleQualifiedName ) ) otherlv_2= 'to' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSendSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDroneScript.g:710:2: ( (otherlv_0= 'send' ( ( ruleQualifiedName ) ) otherlv_2= 'to' ( ( ruleQualifiedName ) ) ) )
            // InternalDroneScript.g:711:2: (otherlv_0= 'send' ( ( ruleQualifiedName ) ) otherlv_2= 'to' ( ( ruleQualifiedName ) ) )
            {
            // InternalDroneScript.g:711:2: (otherlv_0= 'send' ( ( ruleQualifiedName ) ) otherlv_2= 'to' ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:712:3: otherlv_0= 'send' ( ( ruleQualifiedName ) ) otherlv_2= 'to' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSendSignalAccess().getSendKeyword_0());
            		
            // InternalDroneScript.g:716:3: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:717:4: ( ruleQualifiedName )
            {
            // InternalDroneScript.g:717:4: ( ruleQualifiedName )
            // InternalDroneScript.g:718:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendSignalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSendSignalAccess().getSignalSignalCrossReference_1_0());
            				
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSendSignalAccess().getToKeyword_2());
            		
            // InternalDroneScript.g:736:3: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:737:4: ( ruleQualifiedName )
            {
            // InternalDroneScript.g:737:4: ( ruleQualifiedName )
            // InternalDroneScript.g:738:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendSignalRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSendSignalAccess().getRecipentDroneCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendSignal"


    // $ANTLR start "entryRuleCooperate"
    // InternalDroneScript.g:756:1: entryRuleCooperate returns [EObject current=null] : iv_ruleCooperate= ruleCooperate EOF ;
    public final EObject entryRuleCooperate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCooperate = null;


        try {
            // InternalDroneScript.g:756:50: (iv_ruleCooperate= ruleCooperate EOF )
            // InternalDroneScript.g:757:2: iv_ruleCooperate= ruleCooperate EOF
            {
             newCompositeNode(grammarAccess.getCooperateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCooperate=ruleCooperate();

            state._fsp--;

             current =iv_ruleCooperate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCooperate"


    // $ANTLR start "ruleCooperate"
    // InternalDroneScript.g:763:1: ruleCooperate returns [EObject current=null] : (otherlv_0= 'cooperate' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleCooperate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalDroneScript.g:769:2: ( (otherlv_0= 'cooperate' ( ( ruleQualifiedName ) ) ) )
            // InternalDroneScript.g:770:2: (otherlv_0= 'cooperate' ( ( ruleQualifiedName ) ) )
            {
            // InternalDroneScript.g:770:2: (otherlv_0= 'cooperate' ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:771:3: otherlv_0= 'cooperate' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCooperateAccess().getCooperateKeyword_0());
            		
            // InternalDroneScript.g:775:3: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:776:4: ( ruleQualifiedName )
            {
            // InternalDroneScript.g:776:4: ( ruleQualifiedName )
            // InternalDroneScript.g:777:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCooperateRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCooperateAccess().getRoleRoleCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCooperate"


    // $ANTLR start "entryRuleCharge"
    // InternalDroneScript.g:795:1: entryRuleCharge returns [EObject current=null] : iv_ruleCharge= ruleCharge EOF ;
    public final EObject entryRuleCharge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCharge = null;


        try {
            // InternalDroneScript.g:795:47: (iv_ruleCharge= ruleCharge EOF )
            // InternalDroneScript.g:796:2: iv_ruleCharge= ruleCharge EOF
            {
             newCompositeNode(grammarAccess.getChargeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCharge=ruleCharge();

            state._fsp--;

             current =iv_ruleCharge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCharge"


    // $ANTLR start "ruleCharge"
    // InternalDroneScript.g:802:1: ruleCharge returns [EObject current=null] : ( () otherlv_1= 'charge' ) ;
    public final EObject ruleCharge() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDroneScript.g:808:2: ( ( () otherlv_1= 'charge' ) )
            // InternalDroneScript.g:809:2: ( () otherlv_1= 'charge' )
            {
            // InternalDroneScript.g:809:2: ( () otherlv_1= 'charge' )
            // InternalDroneScript.g:810:3: () otherlv_1= 'charge'
            {
            // InternalDroneScript.g:810:3: ()
            // InternalDroneScript.g:811:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChargeAccess().getChargeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getChargeAccess().getChargeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCharge"


    // $ANTLR start "entryRuleScan"
    // InternalDroneScript.g:825:1: entryRuleScan returns [EObject current=null] : iv_ruleScan= ruleScan EOF ;
    public final EObject entryRuleScan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScan = null;


        try {
            // InternalDroneScript.g:825:45: (iv_ruleScan= ruleScan EOF )
            // InternalDroneScript.g:826:2: iv_ruleScan= ruleScan EOF
            {
             newCompositeNode(grammarAccess.getScanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScan=ruleScan();

            state._fsp--;

             current =iv_ruleScan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScan"


    // $ANTLR start "ruleScan"
    // InternalDroneScript.g:832:1: ruleScan returns [EObject current=null] : ( () otherlv_1= 'scan' ) ;
    public final EObject ruleScan() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDroneScript.g:838:2: ( ( () otherlv_1= 'scan' ) )
            // InternalDroneScript.g:839:2: ( () otherlv_1= 'scan' )
            {
            // InternalDroneScript.g:839:2: ( () otherlv_1= 'scan' )
            // InternalDroneScript.g:840:3: () otherlv_1= 'scan'
            {
            // InternalDroneScript.g:840:3: ()
            // InternalDroneScript.g:841:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getScanAccess().getScanAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getScanAccess().getScanKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScan"


    // $ANTLR start "entryRuleSendMap"
    // InternalDroneScript.g:855:1: entryRuleSendMap returns [EObject current=null] : iv_ruleSendMap= ruleSendMap EOF ;
    public final EObject entryRuleSendMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSendMap = null;


        try {
            // InternalDroneScript.g:855:48: (iv_ruleSendMap= ruleSendMap EOF )
            // InternalDroneScript.g:856:2: iv_ruleSendMap= ruleSendMap EOF
            {
             newCompositeNode(grammarAccess.getSendMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSendMap=ruleSendMap();

            state._fsp--;

             current =iv_ruleSendMap; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSendMap"


    // $ANTLR start "ruleSendMap"
    // InternalDroneScript.g:862:1: ruleSendMap returns [EObject current=null] : (otherlv_0= 'send' otherlv_1= 'map' otherlv_2= 'to' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSendMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDroneScript.g:868:2: ( (otherlv_0= 'send' otherlv_1= 'map' otherlv_2= 'to' ( ( ruleQualifiedName ) ) ) )
            // InternalDroneScript.g:869:2: (otherlv_0= 'send' otherlv_1= 'map' otherlv_2= 'to' ( ( ruleQualifiedName ) ) )
            {
            // InternalDroneScript.g:869:2: (otherlv_0= 'send' otherlv_1= 'map' otherlv_2= 'to' ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:870:3: otherlv_0= 'send' otherlv_1= 'map' otherlv_2= 'to' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getSendMapAccess().getSendKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getSendMapAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSendMapAccess().getToKeyword_2());
            		
            // InternalDroneScript.g:882:3: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:883:4: ( ruleQualifiedName )
            {
            // InternalDroneScript.g:883:4: ( ruleQualifiedName )
            // InternalDroneScript.g:884:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSendMapRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSendMapAccess().getRecipentDroneCrossReference_3_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSendMap"


    // $ANTLR start "entryRulePosition"
    // InternalDroneScript.g:902:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalDroneScript.g:902:49: (iv_rulePosition= rulePosition EOF )
            // InternalDroneScript.g:903:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalDroneScript.g:909:1: rulePosition returns [EObject current=null] : ( ( (lv_x_0_0= ruleDOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDOUBLE ) ) ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_x_0_0 = null;

        AntlrDatatypeRuleToken lv_y_2_0 = null;

        AntlrDatatypeRuleToken lv_z_4_0 = null;



        	enterRule();

        try {
            // InternalDroneScript.g:915:2: ( ( ( (lv_x_0_0= ruleDOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDOUBLE ) ) ) )
            // InternalDroneScript.g:916:2: ( ( (lv_x_0_0= ruleDOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDOUBLE ) ) )
            {
            // InternalDroneScript.g:916:2: ( ( (lv_x_0_0= ruleDOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDOUBLE ) ) )
            // InternalDroneScript.g:917:3: ( (lv_x_0_0= ruleDOUBLE ) ) otherlv_1= ',' ( (lv_y_2_0= ruleDOUBLE ) ) otherlv_3= ',' ( (lv_z_4_0= ruleDOUBLE ) )
            {
            // InternalDroneScript.g:917:3: ( (lv_x_0_0= ruleDOUBLE ) )
            // InternalDroneScript.g:918:4: (lv_x_0_0= ruleDOUBLE )
            {
            // InternalDroneScript.g:918:4: (lv_x_0_0= ruleDOUBLE )
            // InternalDroneScript.g:919:5: lv_x_0_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getXDOUBLEParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_x_0_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_0_0,
            						"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getCommaKeyword_1());
            		
            // InternalDroneScript.g:940:3: ( (lv_y_2_0= ruleDOUBLE ) )
            // InternalDroneScript.g:941:4: (lv_y_2_0= ruleDOUBLE )
            {
            // InternalDroneScript.g:941:4: (lv_y_2_0= ruleDOUBLE )
            // InternalDroneScript.g:942:5: lv_y_2_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getYDOUBLEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_y_2_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_2_0,
            						"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getPositionAccess().getCommaKeyword_3());
            		
            // InternalDroneScript.g:963:3: ( (lv_z_4_0= ruleDOUBLE ) )
            // InternalDroneScript.g:964:4: (lv_z_4_0= ruleDOUBLE )
            {
            // InternalDroneScript.g:964:4: (lv_z_4_0= ruleDOUBLE )
            // InternalDroneScript.g:965:5: lv_z_4_0= ruleDOUBLE
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getZDOUBLEParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_z_4_0=ruleDOUBLE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_4_0,
            						"hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.DroneScript.DOUBLE");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalDroneScript.g:986:1: entryRuleDOUBLE returns [String current=null] : iv_ruleDOUBLE= ruleDOUBLE EOF ;
    public final String entryRuleDOUBLE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOUBLE = null;


        try {
            // InternalDroneScript.g:986:46: (iv_ruleDOUBLE= ruleDOUBLE EOF )
            // InternalDroneScript.g:987:2: iv_ruleDOUBLE= ruleDOUBLE EOF
            {
             newCompositeNode(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOUBLE=ruleDOUBLE();

            state._fsp--;

             current =iv_ruleDOUBLE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalDroneScript.g:993:1: ruleDOUBLE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleDOUBLE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;


        	enterRule();

        try {
            // InternalDroneScript.g:999:2: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // InternalDroneScript.g:1000:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // InternalDroneScript.g:1000:2: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // InternalDroneScript.g:1001:3: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // InternalDroneScript.g:1001:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDroneScript.g:1002:4: kw= '-'
                    {
                    kw=(Token)match(input,27,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1());
            		
            // InternalDroneScript.g:1015:3: (kw= '.' this_INT_3= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDroneScript.g:1016:4: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,28,FOLLOW_9); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_3);
                    			

                    				newLeafNode(this_INT_3, grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDroneScript.g:1033:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalDroneScript.g:1035:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalDroneScript.g:1036:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDroneScript.g:1045:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalDroneScript.g:1052:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalDroneScript.g:1053:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalDroneScript.g:1053:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalDroneScript.g:1054:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalDroneScript.g:1061:3: (kw= '.' this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDroneScript.g:1062:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,28,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\17\1\uffff\1\4\1\uffff\1\4\7\uffff";
    static final String dfa_3s = "\1\31\1\uffff\1\22\1\uffff\1\32\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\uffff\1\6\1\7\1\10\1\2\1\3\1\5\1\11";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\2\uffff\1\3\1\uffff\1\4\1\5\1\6\1\7",
            "",
            "\1\10\12\uffff\1\11\2\uffff\1\11",
            "",
            "\1\12\25\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "282:2: (this_Sequence_0= ruleSequence | this_SimpleWait_1= ruleSimpleWait | this_ComplexWait_2= ruleComplexWait | this_Move_3= ruleMove | this_SendSignal_4= ruleSendSignal | this_Cooperate_5= ruleCooperate | this_Charge_6= ruleCharge | this_Scan_7= ruleScan | this_SendMap_8= ruleSendMap )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000003D38000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003D28000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000002L});

}