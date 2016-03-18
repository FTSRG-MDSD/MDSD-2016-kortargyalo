package hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hu.bme.mit.inf.kortargyalo.drones.behavior.xtext.services.DroneScriptGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDroneScriptParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'scenario'", "'signal'", "','", "'script'", "'{'", "'}'", "'wait'", "'timeout'", "'on'", "'move'", "'to'", "'send'", "'cooperate'", "'charge'", "'scan'", "'map'", "'-'", "'.'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(DroneScriptGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDronesBehavior"
    // InternalDroneScript.g:53:1: entryRuleDronesBehavior : ruleDronesBehavior EOF ;
    public final void entryRuleDronesBehavior() throws RecognitionException {
        try {
            // InternalDroneScript.g:54:1: ( ruleDronesBehavior EOF )
            // InternalDroneScript.g:55:1: ruleDronesBehavior EOF
            {
             before(grammarAccess.getDronesBehaviorRule()); 
            pushFollow(FOLLOW_1);
            ruleDronesBehavior();

            state._fsp--;

             after(grammarAccess.getDronesBehaviorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDronesBehavior"


    // $ANTLR start "ruleDronesBehavior"
    // InternalDroneScript.g:62:1: ruleDronesBehavior : ( ( rule__DronesBehavior__Group__0 ) ) ;
    public final void ruleDronesBehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:66:2: ( ( ( rule__DronesBehavior__Group__0 ) ) )
            // InternalDroneScript.g:67:2: ( ( rule__DronesBehavior__Group__0 ) )
            {
            // InternalDroneScript.g:67:2: ( ( rule__DronesBehavior__Group__0 ) )
            // InternalDroneScript.g:68:3: ( rule__DronesBehavior__Group__0 )
            {
             before(grammarAccess.getDronesBehaviorAccess().getGroup()); 
            // InternalDroneScript.g:69:3: ( rule__DronesBehavior__Group__0 )
            // InternalDroneScript.g:69:4: rule__DronesBehavior__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DronesBehavior__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDronesBehaviorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDronesBehavior"


    // $ANTLR start "entryRuleSignal"
    // InternalDroneScript.g:78:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // InternalDroneScript.g:79:1: ( ruleSignal EOF )
            // InternalDroneScript.g:80:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalDroneScript.g:87:1: ruleSignal : ( ( rule__Signal__NameAssignment ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:91:2: ( ( ( rule__Signal__NameAssignment ) ) )
            // InternalDroneScript.g:92:2: ( ( rule__Signal__NameAssignment ) )
            {
            // InternalDroneScript.g:92:2: ( ( rule__Signal__NameAssignment ) )
            // InternalDroneScript.g:93:3: ( rule__Signal__NameAssignment )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment()); 
            // InternalDroneScript.g:94:3: ( rule__Signal__NameAssignment )
            // InternalDroneScript.g:94:4: rule__Signal__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Signal__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleScript"
    // InternalDroneScript.g:103:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalDroneScript.g:104:1: ( ruleScript EOF )
            // InternalDroneScript.g:105:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_1);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalDroneScript.g:112:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:116:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalDroneScript.g:117:2: ( ( rule__Script__Group__0 ) )
            {
            // InternalDroneScript.g:117:2: ( ( rule__Script__Group__0 ) )
            // InternalDroneScript.g:118:3: ( rule__Script__Group__0 )
            {
             before(grammarAccess.getScriptAccess().getGroup()); 
            // InternalDroneScript.g:119:3: ( rule__Script__Group__0 )
            // InternalDroneScript.g:119:4: rule__Script__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleStatement"
    // InternalDroneScript.g:128:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalDroneScript.g:129:1: ( ruleStatement EOF )
            // InternalDroneScript.g:130:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalDroneScript.g:137:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:141:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalDroneScript.g:142:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalDroneScript.g:142:2: ( ( rule__Statement__Alternatives ) )
            // InternalDroneScript.g:143:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalDroneScript.g:144:3: ( rule__Statement__Alternatives )
            // InternalDroneScript.g:144:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleSequence"
    // InternalDroneScript.g:153:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // InternalDroneScript.g:154:1: ( ruleSequence EOF )
            // InternalDroneScript.g:155:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_1);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // InternalDroneScript.g:162:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:166:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // InternalDroneScript.g:167:2: ( ( rule__Sequence__Group__0 ) )
            {
            // InternalDroneScript.g:167:2: ( ( rule__Sequence__Group__0 ) )
            // InternalDroneScript.g:168:3: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // InternalDroneScript.g:169:3: ( rule__Sequence__Group__0 )
            // InternalDroneScript.g:169:4: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "entryRuleSimpleWait"
    // InternalDroneScript.g:178:1: entryRuleSimpleWait : ruleSimpleWait EOF ;
    public final void entryRuleSimpleWait() throws RecognitionException {
        try {
            // InternalDroneScript.g:179:1: ( ruleSimpleWait EOF )
            // InternalDroneScript.g:180:1: ruleSimpleWait EOF
            {
             before(grammarAccess.getSimpleWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleWait();

            state._fsp--;

             after(grammarAccess.getSimpleWaitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleWait"


    // $ANTLR start "ruleSimpleWait"
    // InternalDroneScript.g:187:1: ruleSimpleWait : ( ( rule__SimpleWait__Group__0 ) ) ;
    public final void ruleSimpleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:191:2: ( ( ( rule__SimpleWait__Group__0 ) ) )
            // InternalDroneScript.g:192:2: ( ( rule__SimpleWait__Group__0 ) )
            {
            // InternalDroneScript.g:192:2: ( ( rule__SimpleWait__Group__0 ) )
            // InternalDroneScript.g:193:3: ( rule__SimpleWait__Group__0 )
            {
             before(grammarAccess.getSimpleWaitAccess().getGroup()); 
            // InternalDroneScript.g:194:3: ( rule__SimpleWait__Group__0 )
            // InternalDroneScript.g:194:4: rule__SimpleWait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleWait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleWaitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleWait"


    // $ANTLR start "entryRuleComplexWait"
    // InternalDroneScript.g:203:1: entryRuleComplexWait : ruleComplexWait EOF ;
    public final void entryRuleComplexWait() throws RecognitionException {
        try {
            // InternalDroneScript.g:204:1: ( ruleComplexWait EOF )
            // InternalDroneScript.g:205:1: ruleComplexWait EOF
            {
             before(grammarAccess.getComplexWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleComplexWait();

            state._fsp--;

             after(grammarAccess.getComplexWaitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexWait"


    // $ANTLR start "ruleComplexWait"
    // InternalDroneScript.g:212:1: ruleComplexWait : ( ( rule__ComplexWait__Group__0 ) ) ;
    public final void ruleComplexWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:216:2: ( ( ( rule__ComplexWait__Group__0 ) ) )
            // InternalDroneScript.g:217:2: ( ( rule__ComplexWait__Group__0 ) )
            {
            // InternalDroneScript.g:217:2: ( ( rule__ComplexWait__Group__0 ) )
            // InternalDroneScript.g:218:3: ( rule__ComplexWait__Group__0 )
            {
             before(grammarAccess.getComplexWaitAccess().getGroup()); 
            // InternalDroneScript.g:219:3: ( rule__ComplexWait__Group__0 )
            // InternalDroneScript.g:219:4: rule__ComplexWait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComplexWaitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexWait"


    // $ANTLR start "entryRuleReaction"
    // InternalDroneScript.g:228:1: entryRuleReaction : ruleReaction EOF ;
    public final void entryRuleReaction() throws RecognitionException {
        try {
            // InternalDroneScript.g:229:1: ( ruleReaction EOF )
            // InternalDroneScript.g:230:1: ruleReaction EOF
            {
             before(grammarAccess.getReactionRule()); 
            pushFollow(FOLLOW_1);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getReactionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReaction"


    // $ANTLR start "ruleReaction"
    // InternalDroneScript.g:237:1: ruleReaction : ( ( rule__Reaction__Group__0 ) ) ;
    public final void ruleReaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:241:2: ( ( ( rule__Reaction__Group__0 ) ) )
            // InternalDroneScript.g:242:2: ( ( rule__Reaction__Group__0 ) )
            {
            // InternalDroneScript.g:242:2: ( ( rule__Reaction__Group__0 ) )
            // InternalDroneScript.g:243:3: ( rule__Reaction__Group__0 )
            {
             before(grammarAccess.getReactionAccess().getGroup()); 
            // InternalDroneScript.g:244:3: ( rule__Reaction__Group__0 )
            // InternalDroneScript.g:244:4: rule__Reaction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReactionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReaction"


    // $ANTLR start "entryRuleMove"
    // InternalDroneScript.g:253:1: entryRuleMove : ruleMove EOF ;
    public final void entryRuleMove() throws RecognitionException {
        try {
            // InternalDroneScript.g:254:1: ( ruleMove EOF )
            // InternalDroneScript.g:255:1: ruleMove EOF
            {
             before(grammarAccess.getMoveRule()); 
            pushFollow(FOLLOW_1);
            ruleMove();

            state._fsp--;

             after(grammarAccess.getMoveRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMove"


    // $ANTLR start "ruleMove"
    // InternalDroneScript.g:262:1: ruleMove : ( ( rule__Move__Group__0 ) ) ;
    public final void ruleMove() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:266:2: ( ( ( rule__Move__Group__0 ) ) )
            // InternalDroneScript.g:267:2: ( ( rule__Move__Group__0 ) )
            {
            // InternalDroneScript.g:267:2: ( ( rule__Move__Group__0 ) )
            // InternalDroneScript.g:268:3: ( rule__Move__Group__0 )
            {
             before(grammarAccess.getMoveAccess().getGroup()); 
            // InternalDroneScript.g:269:3: ( rule__Move__Group__0 )
            // InternalDroneScript.g:269:4: rule__Move__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMove"


    // $ANTLR start "entryRuleSendSignal"
    // InternalDroneScript.g:278:1: entryRuleSendSignal : ruleSendSignal EOF ;
    public final void entryRuleSendSignal() throws RecognitionException {
        try {
            // InternalDroneScript.g:279:1: ( ruleSendSignal EOF )
            // InternalDroneScript.g:280:1: ruleSendSignal EOF
            {
             before(grammarAccess.getSendSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleSendSignal();

            state._fsp--;

             after(grammarAccess.getSendSignalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSendSignal"


    // $ANTLR start "ruleSendSignal"
    // InternalDroneScript.g:287:1: ruleSendSignal : ( ( rule__SendSignal__Group__0 ) ) ;
    public final void ruleSendSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:291:2: ( ( ( rule__SendSignal__Group__0 ) ) )
            // InternalDroneScript.g:292:2: ( ( rule__SendSignal__Group__0 ) )
            {
            // InternalDroneScript.g:292:2: ( ( rule__SendSignal__Group__0 ) )
            // InternalDroneScript.g:293:3: ( rule__SendSignal__Group__0 )
            {
             before(grammarAccess.getSendSignalAccess().getGroup()); 
            // InternalDroneScript.g:294:3: ( rule__SendSignal__Group__0 )
            // InternalDroneScript.g:294:4: rule__SendSignal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SendSignal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSendSignalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSendSignal"


    // $ANTLR start "entryRuleCooperate"
    // InternalDroneScript.g:303:1: entryRuleCooperate : ruleCooperate EOF ;
    public final void entryRuleCooperate() throws RecognitionException {
        try {
            // InternalDroneScript.g:304:1: ( ruleCooperate EOF )
            // InternalDroneScript.g:305:1: ruleCooperate EOF
            {
             before(grammarAccess.getCooperateRule()); 
            pushFollow(FOLLOW_1);
            ruleCooperate();

            state._fsp--;

             after(grammarAccess.getCooperateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCooperate"


    // $ANTLR start "ruleCooperate"
    // InternalDroneScript.g:312:1: ruleCooperate : ( ( rule__Cooperate__Group__0 ) ) ;
    public final void ruleCooperate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:316:2: ( ( ( rule__Cooperate__Group__0 ) ) )
            // InternalDroneScript.g:317:2: ( ( rule__Cooperate__Group__0 ) )
            {
            // InternalDroneScript.g:317:2: ( ( rule__Cooperate__Group__0 ) )
            // InternalDroneScript.g:318:3: ( rule__Cooperate__Group__0 )
            {
             before(grammarAccess.getCooperateAccess().getGroup()); 
            // InternalDroneScript.g:319:3: ( rule__Cooperate__Group__0 )
            // InternalDroneScript.g:319:4: rule__Cooperate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cooperate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCooperateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCooperate"


    // $ANTLR start "entryRuleCharge"
    // InternalDroneScript.g:328:1: entryRuleCharge : ruleCharge EOF ;
    public final void entryRuleCharge() throws RecognitionException {
        try {
            // InternalDroneScript.g:329:1: ( ruleCharge EOF )
            // InternalDroneScript.g:330:1: ruleCharge EOF
            {
             before(grammarAccess.getChargeRule()); 
            pushFollow(FOLLOW_1);
            ruleCharge();

            state._fsp--;

             after(grammarAccess.getChargeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCharge"


    // $ANTLR start "ruleCharge"
    // InternalDroneScript.g:337:1: ruleCharge : ( ( rule__Charge__Group__0 ) ) ;
    public final void ruleCharge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:341:2: ( ( ( rule__Charge__Group__0 ) ) )
            // InternalDroneScript.g:342:2: ( ( rule__Charge__Group__0 ) )
            {
            // InternalDroneScript.g:342:2: ( ( rule__Charge__Group__0 ) )
            // InternalDroneScript.g:343:3: ( rule__Charge__Group__0 )
            {
             before(grammarAccess.getChargeAccess().getGroup()); 
            // InternalDroneScript.g:344:3: ( rule__Charge__Group__0 )
            // InternalDroneScript.g:344:4: rule__Charge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Charge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChargeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCharge"


    // $ANTLR start "entryRuleScan"
    // InternalDroneScript.g:353:1: entryRuleScan : ruleScan EOF ;
    public final void entryRuleScan() throws RecognitionException {
        try {
            // InternalDroneScript.g:354:1: ( ruleScan EOF )
            // InternalDroneScript.g:355:1: ruleScan EOF
            {
             before(grammarAccess.getScanRule()); 
            pushFollow(FOLLOW_1);
            ruleScan();

            state._fsp--;

             after(grammarAccess.getScanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScan"


    // $ANTLR start "ruleScan"
    // InternalDroneScript.g:362:1: ruleScan : ( ( rule__Scan__Group__0 ) ) ;
    public final void ruleScan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:366:2: ( ( ( rule__Scan__Group__0 ) ) )
            // InternalDroneScript.g:367:2: ( ( rule__Scan__Group__0 ) )
            {
            // InternalDroneScript.g:367:2: ( ( rule__Scan__Group__0 ) )
            // InternalDroneScript.g:368:3: ( rule__Scan__Group__0 )
            {
             before(grammarAccess.getScanAccess().getGroup()); 
            // InternalDroneScript.g:369:3: ( rule__Scan__Group__0 )
            // InternalDroneScript.g:369:4: rule__Scan__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scan__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScanAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScan"


    // $ANTLR start "entryRuleSendMap"
    // InternalDroneScript.g:378:1: entryRuleSendMap : ruleSendMap EOF ;
    public final void entryRuleSendMap() throws RecognitionException {
        try {
            // InternalDroneScript.g:379:1: ( ruleSendMap EOF )
            // InternalDroneScript.g:380:1: ruleSendMap EOF
            {
             before(grammarAccess.getSendMapRule()); 
            pushFollow(FOLLOW_1);
            ruleSendMap();

            state._fsp--;

             after(grammarAccess.getSendMapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSendMap"


    // $ANTLR start "ruleSendMap"
    // InternalDroneScript.g:387:1: ruleSendMap : ( ( rule__SendMap__Group__0 ) ) ;
    public final void ruleSendMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:391:2: ( ( ( rule__SendMap__Group__0 ) ) )
            // InternalDroneScript.g:392:2: ( ( rule__SendMap__Group__0 ) )
            {
            // InternalDroneScript.g:392:2: ( ( rule__SendMap__Group__0 ) )
            // InternalDroneScript.g:393:3: ( rule__SendMap__Group__0 )
            {
             before(grammarAccess.getSendMapAccess().getGroup()); 
            // InternalDroneScript.g:394:3: ( rule__SendMap__Group__0 )
            // InternalDroneScript.g:394:4: rule__SendMap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SendMap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSendMapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSendMap"


    // $ANTLR start "entryRulePosition"
    // InternalDroneScript.g:403:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalDroneScript.g:404:1: ( rulePosition EOF )
            // InternalDroneScript.g:405:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalDroneScript.g:412:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:416:2: ( ( ( rule__Position__Group__0 ) ) )
            // InternalDroneScript.g:417:2: ( ( rule__Position__Group__0 ) )
            {
            // InternalDroneScript.g:417:2: ( ( rule__Position__Group__0 ) )
            // InternalDroneScript.g:418:3: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // InternalDroneScript.g:419:3: ( rule__Position__Group__0 )
            // InternalDroneScript.g:419:4: rule__Position__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleDOUBLE"
    // InternalDroneScript.g:428:1: entryRuleDOUBLE : ruleDOUBLE EOF ;
    public final void entryRuleDOUBLE() throws RecognitionException {
        try {
            // InternalDroneScript.g:429:1: ( ruleDOUBLE EOF )
            // InternalDroneScript.g:430:1: ruleDOUBLE EOF
            {
             before(grammarAccess.getDOUBLERule()); 
            pushFollow(FOLLOW_1);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getDOUBLERule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDOUBLE"


    // $ANTLR start "ruleDOUBLE"
    // InternalDroneScript.g:437:1: ruleDOUBLE : ( ( rule__DOUBLE__Group__0 ) ) ;
    public final void ruleDOUBLE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:441:2: ( ( ( rule__DOUBLE__Group__0 ) ) )
            // InternalDroneScript.g:442:2: ( ( rule__DOUBLE__Group__0 ) )
            {
            // InternalDroneScript.g:442:2: ( ( rule__DOUBLE__Group__0 ) )
            // InternalDroneScript.g:443:3: ( rule__DOUBLE__Group__0 )
            {
             before(grammarAccess.getDOUBLEAccess().getGroup()); 
            // InternalDroneScript.g:444:3: ( rule__DOUBLE__Group__0 )
            // InternalDroneScript.g:444:4: rule__DOUBLE__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDOUBLEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDOUBLE"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDroneScript.g:453:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalDroneScript.g:457:1: ( ruleQualifiedName EOF )
            // InternalDroneScript.g:458:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDroneScript.g:468:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:473:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalDroneScript.g:474:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalDroneScript.g:474:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalDroneScript.g:475:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalDroneScript.g:476:3: ( rule__QualifiedName__Group__0 )
            // InternalDroneScript.g:476:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__DronesBehavior__Alternatives_2"
    // InternalDroneScript.g:485:1: rule__DronesBehavior__Alternatives_2 : ( ( ( rule__DronesBehavior__Group_2_0__0 ) ) | ( ( rule__DronesBehavior__ScriptsAssignment_2_1 ) ) );
    public final void rule__DronesBehavior__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:489:1: ( ( ( rule__DronesBehavior__Group_2_0__0 ) ) | ( ( rule__DronesBehavior__ScriptsAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalDroneScript.g:490:2: ( ( rule__DronesBehavior__Group_2_0__0 ) )
                    {
                    // InternalDroneScript.g:490:2: ( ( rule__DronesBehavior__Group_2_0__0 ) )
                    // InternalDroneScript.g:491:3: ( rule__DronesBehavior__Group_2_0__0 )
                    {
                     before(grammarAccess.getDronesBehaviorAccess().getGroup_2_0()); 
                    // InternalDroneScript.g:492:3: ( rule__DronesBehavior__Group_2_0__0 )
                    // InternalDroneScript.g:492:4: rule__DronesBehavior__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DronesBehavior__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDronesBehaviorAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDroneScript.g:496:2: ( ( rule__DronesBehavior__ScriptsAssignment_2_1 ) )
                    {
                    // InternalDroneScript.g:496:2: ( ( rule__DronesBehavior__ScriptsAssignment_2_1 ) )
                    // InternalDroneScript.g:497:3: ( rule__DronesBehavior__ScriptsAssignment_2_1 )
                    {
                     before(grammarAccess.getDronesBehaviorAccess().getScriptsAssignment_2_1()); 
                    // InternalDroneScript.g:498:3: ( rule__DronesBehavior__ScriptsAssignment_2_1 )
                    // InternalDroneScript.g:498:4: rule__DronesBehavior__ScriptsAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DronesBehavior__ScriptsAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDronesBehaviorAccess().getScriptsAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Alternatives_2"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalDroneScript.g:506:1: rule__Statement__Alternatives : ( ( ruleSequence ) | ( ruleSimpleWait ) | ( ruleComplexWait ) | ( ruleMove ) | ( ruleSendSignal ) | ( ruleCooperate ) | ( ruleCharge ) | ( ruleScan ) | ( ruleSendMap ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:510:1: ( ( ruleSequence ) | ( ruleSimpleWait ) | ( ruleComplexWait ) | ( ruleMove ) | ( ruleSendSignal ) | ( ruleCooperate ) | ( ruleCharge ) | ( ruleScan ) | ( ruleSendMap ) )
            int alt2=9;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalDroneScript.g:511:2: ( ruleSequence )
                    {
                    // InternalDroneScript.g:511:2: ( ruleSequence )
                    // InternalDroneScript.g:512:3: ruleSequence
                    {
                     before(grammarAccess.getStatementAccess().getSequenceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSequence();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSequenceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDroneScript.g:517:2: ( ruleSimpleWait )
                    {
                    // InternalDroneScript.g:517:2: ( ruleSimpleWait )
                    // InternalDroneScript.g:518:3: ruleSimpleWait
                    {
                     before(grammarAccess.getStatementAccess().getSimpleWaitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleWait();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSimpleWaitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDroneScript.g:523:2: ( ruleComplexWait )
                    {
                    // InternalDroneScript.g:523:2: ( ruleComplexWait )
                    // InternalDroneScript.g:524:3: ruleComplexWait
                    {
                     before(grammarAccess.getStatementAccess().getComplexWaitParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComplexWait();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getComplexWaitParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDroneScript.g:529:2: ( ruleMove )
                    {
                    // InternalDroneScript.g:529:2: ( ruleMove )
                    // InternalDroneScript.g:530:3: ruleMove
                    {
                     before(grammarAccess.getStatementAccess().getMoveParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMove();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getMoveParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDroneScript.g:535:2: ( ruleSendSignal )
                    {
                    // InternalDroneScript.g:535:2: ( ruleSendSignal )
                    // InternalDroneScript.g:536:3: ruleSendSignal
                    {
                     before(grammarAccess.getStatementAccess().getSendSignalParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleSendSignal();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSendSignalParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDroneScript.g:541:2: ( ruleCooperate )
                    {
                    // InternalDroneScript.g:541:2: ( ruleCooperate )
                    // InternalDroneScript.g:542:3: ruleCooperate
                    {
                     before(grammarAccess.getStatementAccess().getCooperateParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleCooperate();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getCooperateParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDroneScript.g:547:2: ( ruleCharge )
                    {
                    // InternalDroneScript.g:547:2: ( ruleCharge )
                    // InternalDroneScript.g:548:3: ruleCharge
                    {
                     before(grammarAccess.getStatementAccess().getChargeParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleCharge();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getChargeParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDroneScript.g:553:2: ( ruleScan )
                    {
                    // InternalDroneScript.g:553:2: ( ruleScan )
                    // InternalDroneScript.g:554:3: ruleScan
                    {
                     before(grammarAccess.getStatementAccess().getScanParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleScan();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getScanParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDroneScript.g:559:2: ( ruleSendMap )
                    {
                    // InternalDroneScript.g:559:2: ( ruleSendMap )
                    // InternalDroneScript.g:560:3: ruleSendMap
                    {
                     before(grammarAccess.getStatementAccess().getSendMapParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruleSendMap();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSendMapParserRuleCall_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__DronesBehavior__Group__0"
    // InternalDroneScript.g:569:1: rule__DronesBehavior__Group__0 : rule__DronesBehavior__Group__0__Impl rule__DronesBehavior__Group__1 ;
    public final void rule__DronesBehavior__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:573:1: ( rule__DronesBehavior__Group__0__Impl rule__DronesBehavior__Group__1 )
            // InternalDroneScript.g:574:2: rule__DronesBehavior__Group__0__Impl rule__DronesBehavior__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DronesBehavior__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DronesBehavior__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group__0"


    // $ANTLR start "rule__DronesBehavior__Group__0__Impl"
    // InternalDroneScript.g:581:1: rule__DronesBehavior__Group__0__Impl : ( 'scenario' ) ;
    public final void rule__DronesBehavior__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:585:1: ( ( 'scenario' ) )
            // InternalDroneScript.g:586:1: ( 'scenario' )
            {
            // InternalDroneScript.g:586:1: ( 'scenario' )
            // InternalDroneScript.g:587:2: 'scenario'
            {
             before(grammarAccess.getDronesBehaviorAccess().getScenarioKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDronesBehaviorAccess().getScenarioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group__0__Impl"


    // $ANTLR start "rule__DronesBehavior__Group__1"
    // InternalDroneScript.g:596:1: rule__DronesBehavior__Group__1 : rule__DronesBehavior__Group__1__Impl rule__DronesBehavior__Group__2 ;
    public final void rule__DronesBehavior__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:600:1: ( rule__DronesBehavior__Group__1__Impl rule__DronesBehavior__Group__2 )
            // InternalDroneScript.g:601:2: rule__DronesBehavior__Group__1__Impl rule__DronesBehavior__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DronesBehavior__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DronesBehavior__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group__1"


    // $ANTLR start "rule__DronesBehavior__Group__1__Impl"
    // InternalDroneScript.g:608:1: rule__DronesBehavior__Group__1__Impl : ( ( rule__DronesBehavior__ScenarioAssignment_1 ) ) ;
    public final void rule__DronesBehavior__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:612:1: ( ( ( rule__DronesBehavior__ScenarioAssignment_1 ) ) )
            // InternalDroneScript.g:613:1: ( ( rule__DronesBehavior__ScenarioAssignment_1 ) )
            {
            // InternalDroneScript.g:613:1: ( ( rule__DronesBehavior__ScenarioAssignment_1 ) )
            // InternalDroneScript.g:614:2: ( rule__DronesBehavior__ScenarioAssignment_1 )
            {
             before(grammarAccess.getDronesBehaviorAccess().getScenarioAssignment_1()); 
            // InternalDroneScript.g:615:2: ( rule__DronesBehavior__ScenarioAssignment_1 )
            // InternalDroneScript.g:615:3: rule__DronesBehavior__ScenarioAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DronesBehavior__ScenarioAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDronesBehaviorAccess().getScenarioAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group__1__Impl"


    // $ANTLR start "rule__DronesBehavior__Group__2"
    // InternalDroneScript.g:623:1: rule__DronesBehavior__Group__2 : rule__DronesBehavior__Group__2__Impl ;
    public final void rule__DronesBehavior__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:627:1: ( rule__DronesBehavior__Group__2__Impl )
            // InternalDroneScript.g:628:2: rule__DronesBehavior__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DronesBehavior__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group__2"


    // $ANTLR start "rule__DronesBehavior__Group__2__Impl"
    // InternalDroneScript.g:634:1: rule__DronesBehavior__Group__2__Impl : ( ( rule__DronesBehavior__Alternatives_2 )* ) ;
    public final void rule__DronesBehavior__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:638:1: ( ( ( rule__DronesBehavior__Alternatives_2 )* ) )
            // InternalDroneScript.g:639:1: ( ( rule__DronesBehavior__Alternatives_2 )* )
            {
            // InternalDroneScript.g:639:1: ( ( rule__DronesBehavior__Alternatives_2 )* )
            // InternalDroneScript.g:640:2: ( rule__DronesBehavior__Alternatives_2 )*
            {
             before(grammarAccess.getDronesBehaviorAccess().getAlternatives_2()); 
            // InternalDroneScript.g:641:2: ( rule__DronesBehavior__Alternatives_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDroneScript.g:641:3: rule__DronesBehavior__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__DronesBehavior__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDronesBehaviorAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group__2__Impl"


    // $ANTLR start "rule__DronesBehavior__Group_2_0__0"
    // InternalDroneScript.g:650:1: rule__DronesBehavior__Group_2_0__0 : rule__DronesBehavior__Group_2_0__0__Impl rule__DronesBehavior__Group_2_0__1 ;
    public final void rule__DronesBehavior__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:654:1: ( rule__DronesBehavior__Group_2_0__0__Impl rule__DronesBehavior__Group_2_0__1 )
            // InternalDroneScript.g:655:2: rule__DronesBehavior__Group_2_0__0__Impl rule__DronesBehavior__Group_2_0__1
            {
            pushFollow(FOLLOW_3);
            rule__DronesBehavior__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DronesBehavior__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group_2_0__0"


    // $ANTLR start "rule__DronesBehavior__Group_2_0__0__Impl"
    // InternalDroneScript.g:662:1: rule__DronesBehavior__Group_2_0__0__Impl : ( 'signal' ) ;
    public final void rule__DronesBehavior__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:666:1: ( ( 'signal' ) )
            // InternalDroneScript.g:667:1: ( 'signal' )
            {
            // InternalDroneScript.g:667:1: ( 'signal' )
            // InternalDroneScript.g:668:2: 'signal'
            {
             before(grammarAccess.getDronesBehaviorAccess().getSignalKeyword_2_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDronesBehaviorAccess().getSignalKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group_2_0__0__Impl"


    // $ANTLR start "rule__DronesBehavior__Group_2_0__1"
    // InternalDroneScript.g:677:1: rule__DronesBehavior__Group_2_0__1 : rule__DronesBehavior__Group_2_0__1__Impl rule__DronesBehavior__Group_2_0__2 ;
    public final void rule__DronesBehavior__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:681:1: ( rule__DronesBehavior__Group_2_0__1__Impl rule__DronesBehavior__Group_2_0__2 )
            // InternalDroneScript.g:682:2: rule__DronesBehavior__Group_2_0__1__Impl rule__DronesBehavior__Group_2_0__2
            {
            pushFollow(FOLLOW_6);
            rule__DronesBehavior__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DronesBehavior__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group_2_0__1"


    // $ANTLR start "rule__DronesBehavior__Group_2_0__1__Impl"
    // InternalDroneScript.g:689:1: rule__DronesBehavior__Group_2_0__1__Impl : ( ( rule__DronesBehavior__SignalsAssignment_2_0_1 ) ) ;
    public final void rule__DronesBehavior__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:693:1: ( ( ( rule__DronesBehavior__SignalsAssignment_2_0_1 ) ) )
            // InternalDroneScript.g:694:1: ( ( rule__DronesBehavior__SignalsAssignment_2_0_1 ) )
            {
            // InternalDroneScript.g:694:1: ( ( rule__DronesBehavior__SignalsAssignment_2_0_1 ) )
            // InternalDroneScript.g:695:2: ( rule__DronesBehavior__SignalsAssignment_2_0_1 )
            {
             before(grammarAccess.getDronesBehaviorAccess().getSignalsAssignment_2_0_1()); 
            // InternalDroneScript.g:696:2: ( rule__DronesBehavior__SignalsAssignment_2_0_1 )
            // InternalDroneScript.g:696:3: rule__DronesBehavior__SignalsAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DronesBehavior__SignalsAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDronesBehaviorAccess().getSignalsAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group_2_0__1__Impl"


    // $ANTLR start "rule__DronesBehavior__Group_2_0__2"
    // InternalDroneScript.g:704:1: rule__DronesBehavior__Group_2_0__2 : rule__DronesBehavior__Group_2_0__2__Impl ;
    public final void rule__DronesBehavior__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:708:1: ( rule__DronesBehavior__Group_2_0__2__Impl )
            // InternalDroneScript.g:709:2: rule__DronesBehavior__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DronesBehavior__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group_2_0__2"


    // $ANTLR start "rule__DronesBehavior__Group_2_0__2__Impl"
    // InternalDroneScript.g:715:1: rule__DronesBehavior__Group_2_0__2__Impl : ( ( rule__DronesBehavior__Group_2_0_2__0 )* ) ;
    public final void rule__DronesBehavior__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:719:1: ( ( ( rule__DronesBehavior__Group_2_0_2__0 )* ) )
            // InternalDroneScript.g:720:1: ( ( rule__DronesBehavior__Group_2_0_2__0 )* )
            {
            // InternalDroneScript.g:720:1: ( ( rule__DronesBehavior__Group_2_0_2__0 )* )
            // InternalDroneScript.g:721:2: ( rule__DronesBehavior__Group_2_0_2__0 )*
            {
             before(grammarAccess.getDronesBehaviorAccess().getGroup_2_0_2()); 
            // InternalDroneScript.g:722:2: ( rule__DronesBehavior__Group_2_0_2__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==13) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDroneScript.g:722:3: rule__DronesBehavior__Group_2_0_2__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__DronesBehavior__Group_2_0_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDronesBehaviorAccess().getGroup_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group_2_0__2__Impl"


    // $ANTLR start "rule__DronesBehavior__Group_2_0_2__0"
    // InternalDroneScript.g:731:1: rule__DronesBehavior__Group_2_0_2__0 : rule__DronesBehavior__Group_2_0_2__0__Impl rule__DronesBehavior__Group_2_0_2__1 ;
    public final void rule__DronesBehavior__Group_2_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:735:1: ( rule__DronesBehavior__Group_2_0_2__0__Impl rule__DronesBehavior__Group_2_0_2__1 )
            // InternalDroneScript.g:736:2: rule__DronesBehavior__Group_2_0_2__0__Impl rule__DronesBehavior__Group_2_0_2__1
            {
            pushFollow(FOLLOW_3);
            rule__DronesBehavior__Group_2_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DronesBehavior__Group_2_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group_2_0_2__0"


    // $ANTLR start "rule__DronesBehavior__Group_2_0_2__0__Impl"
    // InternalDroneScript.g:743:1: rule__DronesBehavior__Group_2_0_2__0__Impl : ( ',' ) ;
    public final void rule__DronesBehavior__Group_2_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:747:1: ( ( ',' ) )
            // InternalDroneScript.g:748:1: ( ',' )
            {
            // InternalDroneScript.g:748:1: ( ',' )
            // InternalDroneScript.g:749:2: ','
            {
             before(grammarAccess.getDronesBehaviorAccess().getCommaKeyword_2_0_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDronesBehaviorAccess().getCommaKeyword_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group_2_0_2__0__Impl"


    // $ANTLR start "rule__DronesBehavior__Group_2_0_2__1"
    // InternalDroneScript.g:758:1: rule__DronesBehavior__Group_2_0_2__1 : rule__DronesBehavior__Group_2_0_2__1__Impl ;
    public final void rule__DronesBehavior__Group_2_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:762:1: ( rule__DronesBehavior__Group_2_0_2__1__Impl )
            // InternalDroneScript.g:763:2: rule__DronesBehavior__Group_2_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DronesBehavior__Group_2_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group_2_0_2__1"


    // $ANTLR start "rule__DronesBehavior__Group_2_0_2__1__Impl"
    // InternalDroneScript.g:769:1: rule__DronesBehavior__Group_2_0_2__1__Impl : ( ( rule__DronesBehavior__SignalsAssignment_2_0_2_1 ) ) ;
    public final void rule__DronesBehavior__Group_2_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:773:1: ( ( ( rule__DronesBehavior__SignalsAssignment_2_0_2_1 ) ) )
            // InternalDroneScript.g:774:1: ( ( rule__DronesBehavior__SignalsAssignment_2_0_2_1 ) )
            {
            // InternalDroneScript.g:774:1: ( ( rule__DronesBehavior__SignalsAssignment_2_0_2_1 ) )
            // InternalDroneScript.g:775:2: ( rule__DronesBehavior__SignalsAssignment_2_0_2_1 )
            {
             before(grammarAccess.getDronesBehaviorAccess().getSignalsAssignment_2_0_2_1()); 
            // InternalDroneScript.g:776:2: ( rule__DronesBehavior__SignalsAssignment_2_0_2_1 )
            // InternalDroneScript.g:776:3: rule__DronesBehavior__SignalsAssignment_2_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DronesBehavior__SignalsAssignment_2_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDronesBehaviorAccess().getSignalsAssignment_2_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__Group_2_0_2__1__Impl"


    // $ANTLR start "rule__Script__Group__0"
    // InternalDroneScript.g:785:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:789:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalDroneScript.g:790:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Script__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // InternalDroneScript.g:797:1: rule__Script__Group__0__Impl : ( 'script' ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:801:1: ( ( 'script' ) )
            // InternalDroneScript.g:802:1: ( 'script' )
            {
            // InternalDroneScript.g:802:1: ( 'script' )
            // InternalDroneScript.g:803:2: 'script'
            {
             before(grammarAccess.getScriptAccess().getScriptKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getScriptAccess().getScriptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // InternalDroneScript.g:812:1: rule__Script__Group__1 : rule__Script__Group__1__Impl rule__Script__Group__2 ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:816:1: ( rule__Script__Group__1__Impl rule__Script__Group__2 )
            // InternalDroneScript.g:817:2: rule__Script__Group__1__Impl rule__Script__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Script__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Script__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // InternalDroneScript.g:824:1: rule__Script__Group__1__Impl : ( ( rule__Script__DroneAssignment_1 ) ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:828:1: ( ( ( rule__Script__DroneAssignment_1 ) ) )
            // InternalDroneScript.g:829:1: ( ( rule__Script__DroneAssignment_1 ) )
            {
            // InternalDroneScript.g:829:1: ( ( rule__Script__DroneAssignment_1 ) )
            // InternalDroneScript.g:830:2: ( rule__Script__DroneAssignment_1 )
            {
             before(grammarAccess.getScriptAccess().getDroneAssignment_1()); 
            // InternalDroneScript.g:831:2: ( rule__Script__DroneAssignment_1 )
            // InternalDroneScript.g:831:3: rule__Script__DroneAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Script__DroneAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getDroneAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__Script__Group__2"
    // InternalDroneScript.g:839:1: rule__Script__Group__2 : rule__Script__Group__2__Impl ;
    public final void rule__Script__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:843:1: ( rule__Script__Group__2__Impl )
            // InternalDroneScript.g:844:2: rule__Script__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Script__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2"


    // $ANTLR start "rule__Script__Group__2__Impl"
    // InternalDroneScript.g:850:1: rule__Script__Group__2__Impl : ( ( rule__Script__StatementAssignment_2 ) ) ;
    public final void rule__Script__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:854:1: ( ( ( rule__Script__StatementAssignment_2 ) ) )
            // InternalDroneScript.g:855:1: ( ( rule__Script__StatementAssignment_2 ) )
            {
            // InternalDroneScript.g:855:1: ( ( rule__Script__StatementAssignment_2 ) )
            // InternalDroneScript.g:856:2: ( rule__Script__StatementAssignment_2 )
            {
             before(grammarAccess.getScriptAccess().getStatementAssignment_2()); 
            // InternalDroneScript.g:857:2: ( rule__Script__StatementAssignment_2 )
            // InternalDroneScript.g:857:3: rule__Script__StatementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Script__StatementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getScriptAccess().getStatementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // InternalDroneScript.g:866:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:870:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // InternalDroneScript.g:871:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // InternalDroneScript.g:878:1: rule__Sequence__Group__0__Impl : ( () ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:882:1: ( ( () ) )
            // InternalDroneScript.g:883:1: ( () )
            {
            // InternalDroneScript.g:883:1: ( () )
            // InternalDroneScript.g:884:2: ()
            {
             before(grammarAccess.getSequenceAccess().getSequenceAction_0()); 
            // InternalDroneScript.g:885:2: ()
            // InternalDroneScript.g:885:3: 
            {
            }

             after(grammarAccess.getSequenceAccess().getSequenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // InternalDroneScript.g:893:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:897:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // InternalDroneScript.g:898:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // InternalDroneScript.g:905:1: rule__Sequence__Group__1__Impl : ( '{' ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:909:1: ( ( '{' ) )
            // InternalDroneScript.g:910:1: ( '{' )
            {
            // InternalDroneScript.g:910:1: ( '{' )
            // InternalDroneScript.g:911:2: '{'
            {
             before(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // InternalDroneScript.g:920:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:924:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // InternalDroneScript.g:925:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // InternalDroneScript.g:932:1: rule__Sequence__Group__2__Impl : ( ( rule__Sequence__StatementsAssignment_2 )* ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:936:1: ( ( ( rule__Sequence__StatementsAssignment_2 )* ) )
            // InternalDroneScript.g:937:1: ( ( rule__Sequence__StatementsAssignment_2 )* )
            {
            // InternalDroneScript.g:937:1: ( ( rule__Sequence__StatementsAssignment_2 )* )
            // InternalDroneScript.g:938:2: ( rule__Sequence__StatementsAssignment_2 )*
            {
             before(grammarAccess.getSequenceAccess().getStatementsAssignment_2()); 
            // InternalDroneScript.g:939:2: ( rule__Sequence__StatementsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15||LA5_0==17||LA5_0==20||(LA5_0>=22 && LA5_0<=25)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDroneScript.g:939:3: rule__Sequence__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Sequence__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSequenceAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__3"
    // InternalDroneScript.g:947:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:951:1: ( rule__Sequence__Group__3__Impl )
            // InternalDroneScript.g:952:2: rule__Sequence__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sequence__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3"


    // $ANTLR start "rule__Sequence__Group__3__Impl"
    // InternalDroneScript.g:958:1: rule__Sequence__Group__3__Impl : ( '}' ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:962:1: ( ( '}' ) )
            // InternalDroneScript.g:963:1: ( '}' )
            {
            // InternalDroneScript.g:963:1: ( '}' )
            // InternalDroneScript.g:964:2: '}'
            {
             before(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSequenceAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3__Impl"


    // $ANTLR start "rule__SimpleWait__Group__0"
    // InternalDroneScript.g:974:1: rule__SimpleWait__Group__0 : rule__SimpleWait__Group__0__Impl rule__SimpleWait__Group__1 ;
    public final void rule__SimpleWait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:978:1: ( rule__SimpleWait__Group__0__Impl rule__SimpleWait__Group__1 )
            // InternalDroneScript.g:979:2: rule__SimpleWait__Group__0__Impl rule__SimpleWait__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SimpleWait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleWait__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__Group__0"


    // $ANTLR start "rule__SimpleWait__Group__0__Impl"
    // InternalDroneScript.g:986:1: rule__SimpleWait__Group__0__Impl : ( 'wait' ) ;
    public final void rule__SimpleWait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:990:1: ( ( 'wait' ) )
            // InternalDroneScript.g:991:1: ( 'wait' )
            {
            // InternalDroneScript.g:991:1: ( 'wait' )
            // InternalDroneScript.g:992:2: 'wait'
            {
             before(grammarAccess.getSimpleWaitAccess().getWaitKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSimpleWaitAccess().getWaitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__Group__0__Impl"


    // $ANTLR start "rule__SimpleWait__Group__1"
    // InternalDroneScript.g:1001:1: rule__SimpleWait__Group__1 : rule__SimpleWait__Group__1__Impl rule__SimpleWait__Group__2 ;
    public final void rule__SimpleWait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1005:1: ( rule__SimpleWait__Group__1__Impl rule__SimpleWait__Group__2 )
            // InternalDroneScript.g:1006:2: rule__SimpleWait__Group__1__Impl rule__SimpleWait__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SimpleWait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleWait__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__Group__1"


    // $ANTLR start "rule__SimpleWait__Group__1__Impl"
    // InternalDroneScript.g:1013:1: rule__SimpleWait__Group__1__Impl : ( ( rule__SimpleWait__SignalAssignment_1 ) ) ;
    public final void rule__SimpleWait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1017:1: ( ( ( rule__SimpleWait__SignalAssignment_1 ) ) )
            // InternalDroneScript.g:1018:1: ( ( rule__SimpleWait__SignalAssignment_1 ) )
            {
            // InternalDroneScript.g:1018:1: ( ( rule__SimpleWait__SignalAssignment_1 ) )
            // InternalDroneScript.g:1019:2: ( rule__SimpleWait__SignalAssignment_1 )
            {
             before(grammarAccess.getSimpleWaitAccess().getSignalAssignment_1()); 
            // InternalDroneScript.g:1020:2: ( rule__SimpleWait__SignalAssignment_1 )
            // InternalDroneScript.g:1020:3: rule__SimpleWait__SignalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleWait__SignalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleWaitAccess().getSignalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__Group__1__Impl"


    // $ANTLR start "rule__SimpleWait__Group__2"
    // InternalDroneScript.g:1028:1: rule__SimpleWait__Group__2 : rule__SimpleWait__Group__2__Impl ;
    public final void rule__SimpleWait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1032:1: ( rule__SimpleWait__Group__2__Impl )
            // InternalDroneScript.g:1033:2: rule__SimpleWait__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleWait__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__Group__2"


    // $ANTLR start "rule__SimpleWait__Group__2__Impl"
    // InternalDroneScript.g:1039:1: rule__SimpleWait__Group__2__Impl : ( ( rule__SimpleWait__Group_2__0 )? ) ;
    public final void rule__SimpleWait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1043:1: ( ( ( rule__SimpleWait__Group_2__0 )? ) )
            // InternalDroneScript.g:1044:1: ( ( rule__SimpleWait__Group_2__0 )? )
            {
            // InternalDroneScript.g:1044:1: ( ( rule__SimpleWait__Group_2__0 )? )
            // InternalDroneScript.g:1045:2: ( rule__SimpleWait__Group_2__0 )?
            {
             before(grammarAccess.getSimpleWaitAccess().getGroup_2()); 
            // InternalDroneScript.g:1046:2: ( rule__SimpleWait__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDroneScript.g:1046:3: rule__SimpleWait__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleWait__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleWaitAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__Group__2__Impl"


    // $ANTLR start "rule__SimpleWait__Group_2__0"
    // InternalDroneScript.g:1055:1: rule__SimpleWait__Group_2__0 : rule__SimpleWait__Group_2__0__Impl rule__SimpleWait__Group_2__1 ;
    public final void rule__SimpleWait__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1059:1: ( rule__SimpleWait__Group_2__0__Impl rule__SimpleWait__Group_2__1 )
            // InternalDroneScript.g:1060:2: rule__SimpleWait__Group_2__0__Impl rule__SimpleWait__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__SimpleWait__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleWait__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__Group_2__0"


    // $ANTLR start "rule__SimpleWait__Group_2__0__Impl"
    // InternalDroneScript.g:1067:1: rule__SimpleWait__Group_2__0__Impl : ( 'timeout' ) ;
    public final void rule__SimpleWait__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1071:1: ( ( 'timeout' ) )
            // InternalDroneScript.g:1072:1: ( 'timeout' )
            {
            // InternalDroneScript.g:1072:1: ( 'timeout' )
            // InternalDroneScript.g:1073:2: 'timeout'
            {
             before(grammarAccess.getSimpleWaitAccess().getTimeoutKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSimpleWaitAccess().getTimeoutKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__Group_2__0__Impl"


    // $ANTLR start "rule__SimpleWait__Group_2__1"
    // InternalDroneScript.g:1082:1: rule__SimpleWait__Group_2__1 : rule__SimpleWait__Group_2__1__Impl ;
    public final void rule__SimpleWait__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1086:1: ( rule__SimpleWait__Group_2__1__Impl )
            // InternalDroneScript.g:1087:2: rule__SimpleWait__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleWait__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__Group_2__1"


    // $ANTLR start "rule__SimpleWait__Group_2__1__Impl"
    // InternalDroneScript.g:1093:1: rule__SimpleWait__Group_2__1__Impl : ( ( rule__SimpleWait__TimeoutAssignment_2_1 ) ) ;
    public final void rule__SimpleWait__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1097:1: ( ( ( rule__SimpleWait__TimeoutAssignment_2_1 ) ) )
            // InternalDroneScript.g:1098:1: ( ( rule__SimpleWait__TimeoutAssignment_2_1 ) )
            {
            // InternalDroneScript.g:1098:1: ( ( rule__SimpleWait__TimeoutAssignment_2_1 ) )
            // InternalDroneScript.g:1099:2: ( rule__SimpleWait__TimeoutAssignment_2_1 )
            {
             before(grammarAccess.getSimpleWaitAccess().getTimeoutAssignment_2_1()); 
            // InternalDroneScript.g:1100:2: ( rule__SimpleWait__TimeoutAssignment_2_1 )
            // InternalDroneScript.g:1100:3: rule__SimpleWait__TimeoutAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleWait__TimeoutAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleWaitAccess().getTimeoutAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__Group_2__1__Impl"


    // $ANTLR start "rule__ComplexWait__Group__0"
    // InternalDroneScript.g:1109:1: rule__ComplexWait__Group__0 : rule__ComplexWait__Group__0__Impl rule__ComplexWait__Group__1 ;
    public final void rule__ComplexWait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1113:1: ( rule__ComplexWait__Group__0__Impl rule__ComplexWait__Group__1 )
            // InternalDroneScript.g:1114:2: rule__ComplexWait__Group__0__Impl rule__ComplexWait__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__ComplexWait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__0"


    // $ANTLR start "rule__ComplexWait__Group__0__Impl"
    // InternalDroneScript.g:1121:1: rule__ComplexWait__Group__0__Impl : ( () ) ;
    public final void rule__ComplexWait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1125:1: ( ( () ) )
            // InternalDroneScript.g:1126:1: ( () )
            {
            // InternalDroneScript.g:1126:1: ( () )
            // InternalDroneScript.g:1127:2: ()
            {
             before(grammarAccess.getComplexWaitAccess().getComplexWaitAction_0()); 
            // InternalDroneScript.g:1128:2: ()
            // InternalDroneScript.g:1128:3: 
            {
            }

             after(grammarAccess.getComplexWaitAccess().getComplexWaitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__0__Impl"


    // $ANTLR start "rule__ComplexWait__Group__1"
    // InternalDroneScript.g:1136:1: rule__ComplexWait__Group__1 : rule__ComplexWait__Group__1__Impl rule__ComplexWait__Group__2 ;
    public final void rule__ComplexWait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1140:1: ( rule__ComplexWait__Group__1__Impl rule__ComplexWait__Group__2 )
            // InternalDroneScript.g:1141:2: rule__ComplexWait__Group__1__Impl rule__ComplexWait__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ComplexWait__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__1"


    // $ANTLR start "rule__ComplexWait__Group__1__Impl"
    // InternalDroneScript.g:1148:1: rule__ComplexWait__Group__1__Impl : ( 'wait' ) ;
    public final void rule__ComplexWait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1152:1: ( ( 'wait' ) )
            // InternalDroneScript.g:1153:1: ( 'wait' )
            {
            // InternalDroneScript.g:1153:1: ( 'wait' )
            // InternalDroneScript.g:1154:2: 'wait'
            {
             before(grammarAccess.getComplexWaitAccess().getWaitKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComplexWaitAccess().getWaitKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__1__Impl"


    // $ANTLR start "rule__ComplexWait__Group__2"
    // InternalDroneScript.g:1163:1: rule__ComplexWait__Group__2 : rule__ComplexWait__Group__2__Impl rule__ComplexWait__Group__3 ;
    public final void rule__ComplexWait__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1167:1: ( rule__ComplexWait__Group__2__Impl rule__ComplexWait__Group__3 )
            // InternalDroneScript.g:1168:2: rule__ComplexWait__Group__2__Impl rule__ComplexWait__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ComplexWait__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__2"


    // $ANTLR start "rule__ComplexWait__Group__2__Impl"
    // InternalDroneScript.g:1175:1: rule__ComplexWait__Group__2__Impl : ( ( rule__ComplexWait__Group_2__0 )? ) ;
    public final void rule__ComplexWait__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1179:1: ( ( ( rule__ComplexWait__Group_2__0 )? ) )
            // InternalDroneScript.g:1180:1: ( ( rule__ComplexWait__Group_2__0 )? )
            {
            // InternalDroneScript.g:1180:1: ( ( rule__ComplexWait__Group_2__0 )? )
            // InternalDroneScript.g:1181:2: ( rule__ComplexWait__Group_2__0 )?
            {
             before(grammarAccess.getComplexWaitAccess().getGroup_2()); 
            // InternalDroneScript.g:1182:2: ( rule__ComplexWait__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDroneScript.g:1182:3: rule__ComplexWait__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexWait__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexWaitAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__2__Impl"


    // $ANTLR start "rule__ComplexWait__Group__3"
    // InternalDroneScript.g:1190:1: rule__ComplexWait__Group__3 : rule__ComplexWait__Group__3__Impl rule__ComplexWait__Group__4 ;
    public final void rule__ComplexWait__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1194:1: ( rule__ComplexWait__Group__3__Impl rule__ComplexWait__Group__4 )
            // InternalDroneScript.g:1195:2: rule__ComplexWait__Group__3__Impl rule__ComplexWait__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__ComplexWait__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__3"


    // $ANTLR start "rule__ComplexWait__Group__3__Impl"
    // InternalDroneScript.g:1202:1: rule__ComplexWait__Group__3__Impl : ( '{' ) ;
    public final void rule__ComplexWait__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1206:1: ( ( '{' ) )
            // InternalDroneScript.g:1207:1: ( '{' )
            {
            // InternalDroneScript.g:1207:1: ( '{' )
            // InternalDroneScript.g:1208:2: '{'
            {
             before(grammarAccess.getComplexWaitAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getComplexWaitAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__3__Impl"


    // $ANTLR start "rule__ComplexWait__Group__4"
    // InternalDroneScript.g:1217:1: rule__ComplexWait__Group__4 : rule__ComplexWait__Group__4__Impl rule__ComplexWait__Group__5 ;
    public final void rule__ComplexWait__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1221:1: ( rule__ComplexWait__Group__4__Impl rule__ComplexWait__Group__5 )
            // InternalDroneScript.g:1222:2: rule__ComplexWait__Group__4__Impl rule__ComplexWait__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__ComplexWait__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__4"


    // $ANTLR start "rule__ComplexWait__Group__4__Impl"
    // InternalDroneScript.g:1229:1: rule__ComplexWait__Group__4__Impl : ( ( rule__ComplexWait__ReactionsAssignment_4 )* ) ;
    public final void rule__ComplexWait__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1233:1: ( ( ( rule__ComplexWait__ReactionsAssignment_4 )* ) )
            // InternalDroneScript.g:1234:1: ( ( rule__ComplexWait__ReactionsAssignment_4 )* )
            {
            // InternalDroneScript.g:1234:1: ( ( rule__ComplexWait__ReactionsAssignment_4 )* )
            // InternalDroneScript.g:1235:2: ( rule__ComplexWait__ReactionsAssignment_4 )*
            {
             before(grammarAccess.getComplexWaitAccess().getReactionsAssignment_4()); 
            // InternalDroneScript.g:1236:2: ( rule__ComplexWait__ReactionsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==19) ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1==RULE_ID) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalDroneScript.g:1236:3: rule__ComplexWait__ReactionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ComplexWait__ReactionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getComplexWaitAccess().getReactionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__4__Impl"


    // $ANTLR start "rule__ComplexWait__Group__5"
    // InternalDroneScript.g:1244:1: rule__ComplexWait__Group__5 : rule__ComplexWait__Group__5__Impl rule__ComplexWait__Group__6 ;
    public final void rule__ComplexWait__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1248:1: ( rule__ComplexWait__Group__5__Impl rule__ComplexWait__Group__6 )
            // InternalDroneScript.g:1249:2: rule__ComplexWait__Group__5__Impl rule__ComplexWait__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__ComplexWait__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__5"


    // $ANTLR start "rule__ComplexWait__Group__5__Impl"
    // InternalDroneScript.g:1256:1: rule__ComplexWait__Group__5__Impl : ( ( rule__ComplexWait__Group_5__0 )? ) ;
    public final void rule__ComplexWait__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1260:1: ( ( ( rule__ComplexWait__Group_5__0 )? ) )
            // InternalDroneScript.g:1261:1: ( ( rule__ComplexWait__Group_5__0 )? )
            {
            // InternalDroneScript.g:1261:1: ( ( rule__ComplexWait__Group_5__0 )? )
            // InternalDroneScript.g:1262:2: ( rule__ComplexWait__Group_5__0 )?
            {
             before(grammarAccess.getComplexWaitAccess().getGroup_5()); 
            // InternalDroneScript.g:1263:2: ( rule__ComplexWait__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDroneScript.g:1263:3: rule__ComplexWait__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexWait__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComplexWaitAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__5__Impl"


    // $ANTLR start "rule__ComplexWait__Group__6"
    // InternalDroneScript.g:1271:1: rule__ComplexWait__Group__6 : rule__ComplexWait__Group__6__Impl ;
    public final void rule__ComplexWait__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1275:1: ( rule__ComplexWait__Group__6__Impl )
            // InternalDroneScript.g:1276:2: rule__ComplexWait__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__6"


    // $ANTLR start "rule__ComplexWait__Group__6__Impl"
    // InternalDroneScript.g:1282:1: rule__ComplexWait__Group__6__Impl : ( '}' ) ;
    public final void rule__ComplexWait__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1286:1: ( ( '}' ) )
            // InternalDroneScript.g:1287:1: ( '}' )
            {
            // InternalDroneScript.g:1287:1: ( '}' )
            // InternalDroneScript.g:1288:2: '}'
            {
             before(grammarAccess.getComplexWaitAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getComplexWaitAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group__6__Impl"


    // $ANTLR start "rule__ComplexWait__Group_2__0"
    // InternalDroneScript.g:1298:1: rule__ComplexWait__Group_2__0 : rule__ComplexWait__Group_2__0__Impl rule__ComplexWait__Group_2__1 ;
    public final void rule__ComplexWait__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1302:1: ( rule__ComplexWait__Group_2__0__Impl rule__ComplexWait__Group_2__1 )
            // InternalDroneScript.g:1303:2: rule__ComplexWait__Group_2__0__Impl rule__ComplexWait__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__ComplexWait__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group_2__0"


    // $ANTLR start "rule__ComplexWait__Group_2__0__Impl"
    // InternalDroneScript.g:1310:1: rule__ComplexWait__Group_2__0__Impl : ( 'timeout' ) ;
    public final void rule__ComplexWait__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1314:1: ( ( 'timeout' ) )
            // InternalDroneScript.g:1315:1: ( 'timeout' )
            {
            // InternalDroneScript.g:1315:1: ( 'timeout' )
            // InternalDroneScript.g:1316:2: 'timeout'
            {
             before(grammarAccess.getComplexWaitAccess().getTimeoutKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComplexWaitAccess().getTimeoutKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group_2__0__Impl"


    // $ANTLR start "rule__ComplexWait__Group_2__1"
    // InternalDroneScript.g:1325:1: rule__ComplexWait__Group_2__1 : rule__ComplexWait__Group_2__1__Impl ;
    public final void rule__ComplexWait__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1329:1: ( rule__ComplexWait__Group_2__1__Impl )
            // InternalDroneScript.g:1330:2: rule__ComplexWait__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group_2__1"


    // $ANTLR start "rule__ComplexWait__Group_2__1__Impl"
    // InternalDroneScript.g:1336:1: rule__ComplexWait__Group_2__1__Impl : ( ( rule__ComplexWait__TimeoutAssignment_2_1 ) ) ;
    public final void rule__ComplexWait__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1340:1: ( ( ( rule__ComplexWait__TimeoutAssignment_2_1 ) ) )
            // InternalDroneScript.g:1341:1: ( ( rule__ComplexWait__TimeoutAssignment_2_1 ) )
            {
            // InternalDroneScript.g:1341:1: ( ( rule__ComplexWait__TimeoutAssignment_2_1 ) )
            // InternalDroneScript.g:1342:2: ( rule__ComplexWait__TimeoutAssignment_2_1 )
            {
             before(grammarAccess.getComplexWaitAccess().getTimeoutAssignment_2_1()); 
            // InternalDroneScript.g:1343:2: ( rule__ComplexWait__TimeoutAssignment_2_1 )
            // InternalDroneScript.g:1343:3: rule__ComplexWait__TimeoutAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexWait__TimeoutAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComplexWaitAccess().getTimeoutAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group_2__1__Impl"


    // $ANTLR start "rule__ComplexWait__Group_5__0"
    // InternalDroneScript.g:1352:1: rule__ComplexWait__Group_5__0 : rule__ComplexWait__Group_5__0__Impl rule__ComplexWait__Group_5__1 ;
    public final void rule__ComplexWait__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1356:1: ( rule__ComplexWait__Group_5__0__Impl rule__ComplexWait__Group_5__1 )
            // InternalDroneScript.g:1357:2: rule__ComplexWait__Group_5__0__Impl rule__ComplexWait__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__ComplexWait__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group_5__0"


    // $ANTLR start "rule__ComplexWait__Group_5__0__Impl"
    // InternalDroneScript.g:1364:1: rule__ComplexWait__Group_5__0__Impl : ( 'on' ) ;
    public final void rule__ComplexWait__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1368:1: ( ( 'on' ) )
            // InternalDroneScript.g:1369:1: ( 'on' )
            {
            // InternalDroneScript.g:1369:1: ( 'on' )
            // InternalDroneScript.g:1370:2: 'on'
            {
             before(grammarAccess.getComplexWaitAccess().getOnKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComplexWaitAccess().getOnKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group_5__0__Impl"


    // $ANTLR start "rule__ComplexWait__Group_5__1"
    // InternalDroneScript.g:1379:1: rule__ComplexWait__Group_5__1 : rule__ComplexWait__Group_5__1__Impl rule__ComplexWait__Group_5__2 ;
    public final void rule__ComplexWait__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1383:1: ( rule__ComplexWait__Group_5__1__Impl rule__ComplexWait__Group_5__2 )
            // InternalDroneScript.g:1384:2: rule__ComplexWait__Group_5__1__Impl rule__ComplexWait__Group_5__2
            {
            pushFollow(FOLLOW_17);
            rule__ComplexWait__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group_5__1"


    // $ANTLR start "rule__ComplexWait__Group_5__1__Impl"
    // InternalDroneScript.g:1391:1: rule__ComplexWait__Group_5__1__Impl : ( 'timeout' ) ;
    public final void rule__ComplexWait__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1395:1: ( ( 'timeout' ) )
            // InternalDroneScript.g:1396:1: ( 'timeout' )
            {
            // InternalDroneScript.g:1396:1: ( 'timeout' )
            // InternalDroneScript.g:1397:2: 'timeout'
            {
             before(grammarAccess.getComplexWaitAccess().getTimeoutKeyword_5_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComplexWaitAccess().getTimeoutKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group_5__1__Impl"


    // $ANTLR start "rule__ComplexWait__Group_5__2"
    // InternalDroneScript.g:1406:1: rule__ComplexWait__Group_5__2 : rule__ComplexWait__Group_5__2__Impl ;
    public final void rule__ComplexWait__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1410:1: ( rule__ComplexWait__Group_5__2__Impl )
            // InternalDroneScript.g:1411:2: rule__ComplexWait__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexWait__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group_5__2"


    // $ANTLR start "rule__ComplexWait__Group_5__2__Impl"
    // InternalDroneScript.g:1417:1: rule__ComplexWait__Group_5__2__Impl : ( ( rule__ComplexWait__OnTimeoutAssignment_5_2 ) ) ;
    public final void rule__ComplexWait__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1421:1: ( ( ( rule__ComplexWait__OnTimeoutAssignment_5_2 ) ) )
            // InternalDroneScript.g:1422:1: ( ( rule__ComplexWait__OnTimeoutAssignment_5_2 ) )
            {
            // InternalDroneScript.g:1422:1: ( ( rule__ComplexWait__OnTimeoutAssignment_5_2 ) )
            // InternalDroneScript.g:1423:2: ( rule__ComplexWait__OnTimeoutAssignment_5_2 )
            {
             before(grammarAccess.getComplexWaitAccess().getOnTimeoutAssignment_5_2()); 
            // InternalDroneScript.g:1424:2: ( rule__ComplexWait__OnTimeoutAssignment_5_2 )
            // InternalDroneScript.g:1424:3: rule__ComplexWait__OnTimeoutAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__ComplexWait__OnTimeoutAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getComplexWaitAccess().getOnTimeoutAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__Group_5__2__Impl"


    // $ANTLR start "rule__Reaction__Group__0"
    // InternalDroneScript.g:1433:1: rule__Reaction__Group__0 : rule__Reaction__Group__0__Impl rule__Reaction__Group__1 ;
    public final void rule__Reaction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1437:1: ( rule__Reaction__Group__0__Impl rule__Reaction__Group__1 )
            // InternalDroneScript.g:1438:2: rule__Reaction__Group__0__Impl rule__Reaction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Reaction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reaction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__0"


    // $ANTLR start "rule__Reaction__Group__0__Impl"
    // InternalDroneScript.g:1445:1: rule__Reaction__Group__0__Impl : ( 'on' ) ;
    public final void rule__Reaction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1449:1: ( ( 'on' ) )
            // InternalDroneScript.g:1450:1: ( 'on' )
            {
            // InternalDroneScript.g:1450:1: ( 'on' )
            // InternalDroneScript.g:1451:2: 'on'
            {
             before(grammarAccess.getReactionAccess().getOnKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getReactionAccess().getOnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__0__Impl"


    // $ANTLR start "rule__Reaction__Group__1"
    // InternalDroneScript.g:1460:1: rule__Reaction__Group__1 : rule__Reaction__Group__1__Impl rule__Reaction__Group__2 ;
    public final void rule__Reaction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1464:1: ( rule__Reaction__Group__1__Impl rule__Reaction__Group__2 )
            // InternalDroneScript.g:1465:2: rule__Reaction__Group__1__Impl rule__Reaction__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Reaction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reaction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__1"


    // $ANTLR start "rule__Reaction__Group__1__Impl"
    // InternalDroneScript.g:1472:1: rule__Reaction__Group__1__Impl : ( ( rule__Reaction__SignalAssignment_1 ) ) ;
    public final void rule__Reaction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1476:1: ( ( ( rule__Reaction__SignalAssignment_1 ) ) )
            // InternalDroneScript.g:1477:1: ( ( rule__Reaction__SignalAssignment_1 ) )
            {
            // InternalDroneScript.g:1477:1: ( ( rule__Reaction__SignalAssignment_1 ) )
            // InternalDroneScript.g:1478:2: ( rule__Reaction__SignalAssignment_1 )
            {
             before(grammarAccess.getReactionAccess().getSignalAssignment_1()); 
            // InternalDroneScript.g:1479:2: ( rule__Reaction__SignalAssignment_1 )
            // InternalDroneScript.g:1479:3: rule__Reaction__SignalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__SignalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReactionAccess().getSignalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__1__Impl"


    // $ANTLR start "rule__Reaction__Group__2"
    // InternalDroneScript.g:1487:1: rule__Reaction__Group__2 : rule__Reaction__Group__2__Impl ;
    public final void rule__Reaction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1491:1: ( rule__Reaction__Group__2__Impl )
            // InternalDroneScript.g:1492:2: rule__Reaction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__2"


    // $ANTLR start "rule__Reaction__Group__2__Impl"
    // InternalDroneScript.g:1498:1: rule__Reaction__Group__2__Impl : ( ( rule__Reaction__StatementAssignment_2 ) ) ;
    public final void rule__Reaction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1502:1: ( ( ( rule__Reaction__StatementAssignment_2 ) ) )
            // InternalDroneScript.g:1503:1: ( ( rule__Reaction__StatementAssignment_2 ) )
            {
            // InternalDroneScript.g:1503:1: ( ( rule__Reaction__StatementAssignment_2 ) )
            // InternalDroneScript.g:1504:2: ( rule__Reaction__StatementAssignment_2 )
            {
             before(grammarAccess.getReactionAccess().getStatementAssignment_2()); 
            // InternalDroneScript.g:1505:2: ( rule__Reaction__StatementAssignment_2 )
            // InternalDroneScript.g:1505:3: rule__Reaction__StatementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Reaction__StatementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReactionAccess().getStatementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__Group__2__Impl"


    // $ANTLR start "rule__Move__Group__0"
    // InternalDroneScript.g:1514:1: rule__Move__Group__0 : rule__Move__Group__0__Impl rule__Move__Group__1 ;
    public final void rule__Move__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1518:1: ( rule__Move__Group__0__Impl rule__Move__Group__1 )
            // InternalDroneScript.g:1519:2: rule__Move__Group__0__Impl rule__Move__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Move__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0"


    // $ANTLR start "rule__Move__Group__0__Impl"
    // InternalDroneScript.g:1526:1: rule__Move__Group__0__Impl : ( 'move' ) ;
    public final void rule__Move__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1530:1: ( ( 'move' ) )
            // InternalDroneScript.g:1531:1: ( 'move' )
            {
            // InternalDroneScript.g:1531:1: ( 'move' )
            // InternalDroneScript.g:1532:2: 'move'
            {
             before(grammarAccess.getMoveAccess().getMoveKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getMoveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__0__Impl"


    // $ANTLR start "rule__Move__Group__1"
    // InternalDroneScript.g:1541:1: rule__Move__Group__1 : rule__Move__Group__1__Impl rule__Move__Group__2 ;
    public final void rule__Move__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1545:1: ( rule__Move__Group__1__Impl rule__Move__Group__2 )
            // InternalDroneScript.g:1546:2: rule__Move__Group__1__Impl rule__Move__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Move__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Move__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1"


    // $ANTLR start "rule__Move__Group__1__Impl"
    // InternalDroneScript.g:1553:1: rule__Move__Group__1__Impl : ( 'to' ) ;
    public final void rule__Move__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1557:1: ( ( 'to' ) )
            // InternalDroneScript.g:1558:1: ( 'to' )
            {
            // InternalDroneScript.g:1558:1: ( 'to' )
            // InternalDroneScript.g:1559:2: 'to'
            {
             before(grammarAccess.getMoveAccess().getToKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMoveAccess().getToKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__1__Impl"


    // $ANTLR start "rule__Move__Group__2"
    // InternalDroneScript.g:1568:1: rule__Move__Group__2 : rule__Move__Group__2__Impl ;
    public final void rule__Move__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1572:1: ( rule__Move__Group__2__Impl )
            // InternalDroneScript.g:1573:2: rule__Move__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Move__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2"


    // $ANTLR start "rule__Move__Group__2__Impl"
    // InternalDroneScript.g:1579:1: rule__Move__Group__2__Impl : ( ( rule__Move__DestinationAssignment_2 ) ) ;
    public final void rule__Move__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1583:1: ( ( ( rule__Move__DestinationAssignment_2 ) ) )
            // InternalDroneScript.g:1584:1: ( ( rule__Move__DestinationAssignment_2 ) )
            {
            // InternalDroneScript.g:1584:1: ( ( rule__Move__DestinationAssignment_2 ) )
            // InternalDroneScript.g:1585:2: ( rule__Move__DestinationAssignment_2 )
            {
             before(grammarAccess.getMoveAccess().getDestinationAssignment_2()); 
            // InternalDroneScript.g:1586:2: ( rule__Move__DestinationAssignment_2 )
            // InternalDroneScript.g:1586:3: rule__Move__DestinationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Move__DestinationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMoveAccess().getDestinationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__Group__2__Impl"


    // $ANTLR start "rule__SendSignal__Group__0"
    // InternalDroneScript.g:1595:1: rule__SendSignal__Group__0 : rule__SendSignal__Group__0__Impl rule__SendSignal__Group__1 ;
    public final void rule__SendSignal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1599:1: ( rule__SendSignal__Group__0__Impl rule__SendSignal__Group__1 )
            // InternalDroneScript.g:1600:2: rule__SendSignal__Group__0__Impl rule__SendSignal__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SendSignal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendSignal__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendSignal__Group__0"


    // $ANTLR start "rule__SendSignal__Group__0__Impl"
    // InternalDroneScript.g:1607:1: rule__SendSignal__Group__0__Impl : ( 'send' ) ;
    public final void rule__SendSignal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1611:1: ( ( 'send' ) )
            // InternalDroneScript.g:1612:1: ( 'send' )
            {
            // InternalDroneScript.g:1612:1: ( 'send' )
            // InternalDroneScript.g:1613:2: 'send'
            {
             before(grammarAccess.getSendSignalAccess().getSendKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSendSignalAccess().getSendKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendSignal__Group__0__Impl"


    // $ANTLR start "rule__SendSignal__Group__1"
    // InternalDroneScript.g:1622:1: rule__SendSignal__Group__1 : rule__SendSignal__Group__1__Impl rule__SendSignal__Group__2 ;
    public final void rule__SendSignal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1626:1: ( rule__SendSignal__Group__1__Impl rule__SendSignal__Group__2 )
            // InternalDroneScript.g:1627:2: rule__SendSignal__Group__1__Impl rule__SendSignal__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SendSignal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendSignal__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendSignal__Group__1"


    // $ANTLR start "rule__SendSignal__Group__1__Impl"
    // InternalDroneScript.g:1634:1: rule__SendSignal__Group__1__Impl : ( ( rule__SendSignal__SignalAssignment_1 ) ) ;
    public final void rule__SendSignal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1638:1: ( ( ( rule__SendSignal__SignalAssignment_1 ) ) )
            // InternalDroneScript.g:1639:1: ( ( rule__SendSignal__SignalAssignment_1 ) )
            {
            // InternalDroneScript.g:1639:1: ( ( rule__SendSignal__SignalAssignment_1 ) )
            // InternalDroneScript.g:1640:2: ( rule__SendSignal__SignalAssignment_1 )
            {
             before(grammarAccess.getSendSignalAccess().getSignalAssignment_1()); 
            // InternalDroneScript.g:1641:2: ( rule__SendSignal__SignalAssignment_1 )
            // InternalDroneScript.g:1641:3: rule__SendSignal__SignalAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SendSignal__SignalAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSendSignalAccess().getSignalAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendSignal__Group__1__Impl"


    // $ANTLR start "rule__SendSignal__Group__2"
    // InternalDroneScript.g:1649:1: rule__SendSignal__Group__2 : rule__SendSignal__Group__2__Impl rule__SendSignal__Group__3 ;
    public final void rule__SendSignal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1653:1: ( rule__SendSignal__Group__2__Impl rule__SendSignal__Group__3 )
            // InternalDroneScript.g:1654:2: rule__SendSignal__Group__2__Impl rule__SendSignal__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__SendSignal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendSignal__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendSignal__Group__2"


    // $ANTLR start "rule__SendSignal__Group__2__Impl"
    // InternalDroneScript.g:1661:1: rule__SendSignal__Group__2__Impl : ( 'to' ) ;
    public final void rule__SendSignal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1665:1: ( ( 'to' ) )
            // InternalDroneScript.g:1666:1: ( 'to' )
            {
            // InternalDroneScript.g:1666:1: ( 'to' )
            // InternalDroneScript.g:1667:2: 'to'
            {
             before(grammarAccess.getSendSignalAccess().getToKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSendSignalAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendSignal__Group__2__Impl"


    // $ANTLR start "rule__SendSignal__Group__3"
    // InternalDroneScript.g:1676:1: rule__SendSignal__Group__3 : rule__SendSignal__Group__3__Impl ;
    public final void rule__SendSignal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1680:1: ( rule__SendSignal__Group__3__Impl )
            // InternalDroneScript.g:1681:2: rule__SendSignal__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SendSignal__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendSignal__Group__3"


    // $ANTLR start "rule__SendSignal__Group__3__Impl"
    // InternalDroneScript.g:1687:1: rule__SendSignal__Group__3__Impl : ( ( rule__SendSignal__RecipentAssignment_3 ) ) ;
    public final void rule__SendSignal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1691:1: ( ( ( rule__SendSignal__RecipentAssignment_3 ) ) )
            // InternalDroneScript.g:1692:1: ( ( rule__SendSignal__RecipentAssignment_3 ) )
            {
            // InternalDroneScript.g:1692:1: ( ( rule__SendSignal__RecipentAssignment_3 ) )
            // InternalDroneScript.g:1693:2: ( rule__SendSignal__RecipentAssignment_3 )
            {
             before(grammarAccess.getSendSignalAccess().getRecipentAssignment_3()); 
            // InternalDroneScript.g:1694:2: ( rule__SendSignal__RecipentAssignment_3 )
            // InternalDroneScript.g:1694:3: rule__SendSignal__RecipentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SendSignal__RecipentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSendSignalAccess().getRecipentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendSignal__Group__3__Impl"


    // $ANTLR start "rule__Cooperate__Group__0"
    // InternalDroneScript.g:1703:1: rule__Cooperate__Group__0 : rule__Cooperate__Group__0__Impl rule__Cooperate__Group__1 ;
    public final void rule__Cooperate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1707:1: ( rule__Cooperate__Group__0__Impl rule__Cooperate__Group__1 )
            // InternalDroneScript.g:1708:2: rule__Cooperate__Group__0__Impl rule__Cooperate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Cooperate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cooperate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooperate__Group__0"


    // $ANTLR start "rule__Cooperate__Group__0__Impl"
    // InternalDroneScript.g:1715:1: rule__Cooperate__Group__0__Impl : ( 'cooperate' ) ;
    public final void rule__Cooperate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1719:1: ( ( 'cooperate' ) )
            // InternalDroneScript.g:1720:1: ( 'cooperate' )
            {
            // InternalDroneScript.g:1720:1: ( 'cooperate' )
            // InternalDroneScript.g:1721:2: 'cooperate'
            {
             before(grammarAccess.getCooperateAccess().getCooperateKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCooperateAccess().getCooperateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooperate__Group__0__Impl"


    // $ANTLR start "rule__Cooperate__Group__1"
    // InternalDroneScript.g:1730:1: rule__Cooperate__Group__1 : rule__Cooperate__Group__1__Impl ;
    public final void rule__Cooperate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1734:1: ( rule__Cooperate__Group__1__Impl )
            // InternalDroneScript.g:1735:2: rule__Cooperate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cooperate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooperate__Group__1"


    // $ANTLR start "rule__Cooperate__Group__1__Impl"
    // InternalDroneScript.g:1741:1: rule__Cooperate__Group__1__Impl : ( ( rule__Cooperate__RoleAssignment_1 ) ) ;
    public final void rule__Cooperate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1745:1: ( ( ( rule__Cooperate__RoleAssignment_1 ) ) )
            // InternalDroneScript.g:1746:1: ( ( rule__Cooperate__RoleAssignment_1 ) )
            {
            // InternalDroneScript.g:1746:1: ( ( rule__Cooperate__RoleAssignment_1 ) )
            // InternalDroneScript.g:1747:2: ( rule__Cooperate__RoleAssignment_1 )
            {
             before(grammarAccess.getCooperateAccess().getRoleAssignment_1()); 
            // InternalDroneScript.g:1748:2: ( rule__Cooperate__RoleAssignment_1 )
            // InternalDroneScript.g:1748:3: rule__Cooperate__RoleAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cooperate__RoleAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCooperateAccess().getRoleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooperate__Group__1__Impl"


    // $ANTLR start "rule__Charge__Group__0"
    // InternalDroneScript.g:1757:1: rule__Charge__Group__0 : rule__Charge__Group__0__Impl rule__Charge__Group__1 ;
    public final void rule__Charge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1761:1: ( rule__Charge__Group__0__Impl rule__Charge__Group__1 )
            // InternalDroneScript.g:1762:2: rule__Charge__Group__0__Impl rule__Charge__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Charge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Charge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charge__Group__0"


    // $ANTLR start "rule__Charge__Group__0__Impl"
    // InternalDroneScript.g:1769:1: rule__Charge__Group__0__Impl : ( () ) ;
    public final void rule__Charge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1773:1: ( ( () ) )
            // InternalDroneScript.g:1774:1: ( () )
            {
            // InternalDroneScript.g:1774:1: ( () )
            // InternalDroneScript.g:1775:2: ()
            {
             before(grammarAccess.getChargeAccess().getChargeAction_0()); 
            // InternalDroneScript.g:1776:2: ()
            // InternalDroneScript.g:1776:3: 
            {
            }

             after(grammarAccess.getChargeAccess().getChargeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charge__Group__0__Impl"


    // $ANTLR start "rule__Charge__Group__1"
    // InternalDroneScript.g:1784:1: rule__Charge__Group__1 : rule__Charge__Group__1__Impl ;
    public final void rule__Charge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1788:1: ( rule__Charge__Group__1__Impl )
            // InternalDroneScript.g:1789:2: rule__Charge__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Charge__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charge__Group__1"


    // $ANTLR start "rule__Charge__Group__1__Impl"
    // InternalDroneScript.g:1795:1: rule__Charge__Group__1__Impl : ( 'charge' ) ;
    public final void rule__Charge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1799:1: ( ( 'charge' ) )
            // InternalDroneScript.g:1800:1: ( 'charge' )
            {
            // InternalDroneScript.g:1800:1: ( 'charge' )
            // InternalDroneScript.g:1801:2: 'charge'
            {
             before(grammarAccess.getChargeAccess().getChargeKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getChargeAccess().getChargeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Charge__Group__1__Impl"


    // $ANTLR start "rule__Scan__Group__0"
    // InternalDroneScript.g:1811:1: rule__Scan__Group__0 : rule__Scan__Group__0__Impl rule__Scan__Group__1 ;
    public final void rule__Scan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1815:1: ( rule__Scan__Group__0__Impl rule__Scan__Group__1 )
            // InternalDroneScript.g:1816:2: rule__Scan__Group__0__Impl rule__Scan__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Scan__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scan__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__Group__0"


    // $ANTLR start "rule__Scan__Group__0__Impl"
    // InternalDroneScript.g:1823:1: rule__Scan__Group__0__Impl : ( () ) ;
    public final void rule__Scan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1827:1: ( ( () ) )
            // InternalDroneScript.g:1828:1: ( () )
            {
            // InternalDroneScript.g:1828:1: ( () )
            // InternalDroneScript.g:1829:2: ()
            {
             before(grammarAccess.getScanAccess().getScanAction_0()); 
            // InternalDroneScript.g:1830:2: ()
            // InternalDroneScript.g:1830:3: 
            {
            }

             after(grammarAccess.getScanAccess().getScanAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__Group__0__Impl"


    // $ANTLR start "rule__Scan__Group__1"
    // InternalDroneScript.g:1838:1: rule__Scan__Group__1 : rule__Scan__Group__1__Impl ;
    public final void rule__Scan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1842:1: ( rule__Scan__Group__1__Impl )
            // InternalDroneScript.g:1843:2: rule__Scan__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scan__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__Group__1"


    // $ANTLR start "rule__Scan__Group__1__Impl"
    // InternalDroneScript.g:1849:1: rule__Scan__Group__1__Impl : ( 'scan' ) ;
    public final void rule__Scan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1853:1: ( ( 'scan' ) )
            // InternalDroneScript.g:1854:1: ( 'scan' )
            {
            // InternalDroneScript.g:1854:1: ( 'scan' )
            // InternalDroneScript.g:1855:2: 'scan'
            {
             before(grammarAccess.getScanAccess().getScanKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getScanAccess().getScanKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scan__Group__1__Impl"


    // $ANTLR start "rule__SendMap__Group__0"
    // InternalDroneScript.g:1865:1: rule__SendMap__Group__0 : rule__SendMap__Group__0__Impl rule__SendMap__Group__1 ;
    public final void rule__SendMap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1869:1: ( rule__SendMap__Group__0__Impl rule__SendMap__Group__1 )
            // InternalDroneScript.g:1870:2: rule__SendMap__Group__0__Impl rule__SendMap__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__SendMap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendMap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMap__Group__0"


    // $ANTLR start "rule__SendMap__Group__0__Impl"
    // InternalDroneScript.g:1877:1: rule__SendMap__Group__0__Impl : ( 'send' ) ;
    public final void rule__SendMap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1881:1: ( ( 'send' ) )
            // InternalDroneScript.g:1882:1: ( 'send' )
            {
            // InternalDroneScript.g:1882:1: ( 'send' )
            // InternalDroneScript.g:1883:2: 'send'
            {
             before(grammarAccess.getSendMapAccess().getSendKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSendMapAccess().getSendKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMap__Group__0__Impl"


    // $ANTLR start "rule__SendMap__Group__1"
    // InternalDroneScript.g:1892:1: rule__SendMap__Group__1 : rule__SendMap__Group__1__Impl rule__SendMap__Group__2 ;
    public final void rule__SendMap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1896:1: ( rule__SendMap__Group__1__Impl rule__SendMap__Group__2 )
            // InternalDroneScript.g:1897:2: rule__SendMap__Group__1__Impl rule__SendMap__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__SendMap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendMap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMap__Group__1"


    // $ANTLR start "rule__SendMap__Group__1__Impl"
    // InternalDroneScript.g:1904:1: rule__SendMap__Group__1__Impl : ( 'map' ) ;
    public final void rule__SendMap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1908:1: ( ( 'map' ) )
            // InternalDroneScript.g:1909:1: ( 'map' )
            {
            // InternalDroneScript.g:1909:1: ( 'map' )
            // InternalDroneScript.g:1910:2: 'map'
            {
             before(grammarAccess.getSendMapAccess().getMapKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSendMapAccess().getMapKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMap__Group__1__Impl"


    // $ANTLR start "rule__SendMap__Group__2"
    // InternalDroneScript.g:1919:1: rule__SendMap__Group__2 : rule__SendMap__Group__2__Impl rule__SendMap__Group__3 ;
    public final void rule__SendMap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1923:1: ( rule__SendMap__Group__2__Impl rule__SendMap__Group__3 )
            // InternalDroneScript.g:1924:2: rule__SendMap__Group__2__Impl rule__SendMap__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__SendMap__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendMap__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMap__Group__2"


    // $ANTLR start "rule__SendMap__Group__2__Impl"
    // InternalDroneScript.g:1931:1: rule__SendMap__Group__2__Impl : ( 'to' ) ;
    public final void rule__SendMap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1935:1: ( ( 'to' ) )
            // InternalDroneScript.g:1936:1: ( 'to' )
            {
            // InternalDroneScript.g:1936:1: ( 'to' )
            // InternalDroneScript.g:1937:2: 'to'
            {
             before(grammarAccess.getSendMapAccess().getToKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSendMapAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMap__Group__2__Impl"


    // $ANTLR start "rule__SendMap__Group__3"
    // InternalDroneScript.g:1946:1: rule__SendMap__Group__3 : rule__SendMap__Group__3__Impl ;
    public final void rule__SendMap__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1950:1: ( rule__SendMap__Group__3__Impl )
            // InternalDroneScript.g:1951:2: rule__SendMap__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SendMap__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMap__Group__3"


    // $ANTLR start "rule__SendMap__Group__3__Impl"
    // InternalDroneScript.g:1957:1: rule__SendMap__Group__3__Impl : ( ( rule__SendMap__RecipentAssignment_3 ) ) ;
    public final void rule__SendMap__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1961:1: ( ( ( rule__SendMap__RecipentAssignment_3 ) ) )
            // InternalDroneScript.g:1962:1: ( ( rule__SendMap__RecipentAssignment_3 ) )
            {
            // InternalDroneScript.g:1962:1: ( ( rule__SendMap__RecipentAssignment_3 ) )
            // InternalDroneScript.g:1963:2: ( rule__SendMap__RecipentAssignment_3 )
            {
             before(grammarAccess.getSendMapAccess().getRecipentAssignment_3()); 
            // InternalDroneScript.g:1964:2: ( rule__SendMap__RecipentAssignment_3 )
            // InternalDroneScript.g:1964:3: rule__SendMap__RecipentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SendMap__RecipentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSendMapAccess().getRecipentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMap__Group__3__Impl"


    // $ANTLR start "rule__Position__Group__0"
    // InternalDroneScript.g:1973:1: rule__Position__Group__0 : rule__Position__Group__0__Impl rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1977:1: ( rule__Position__Group__0__Impl rule__Position__Group__1 )
            // InternalDroneScript.g:1978:2: rule__Position__Group__0__Impl rule__Position__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Position__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0"


    // $ANTLR start "rule__Position__Group__0__Impl"
    // InternalDroneScript.g:1985:1: rule__Position__Group__0__Impl : ( ( rule__Position__XAssignment_0 ) ) ;
    public final void rule__Position__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:1989:1: ( ( ( rule__Position__XAssignment_0 ) ) )
            // InternalDroneScript.g:1990:1: ( ( rule__Position__XAssignment_0 ) )
            {
            // InternalDroneScript.g:1990:1: ( ( rule__Position__XAssignment_0 ) )
            // InternalDroneScript.g:1991:2: ( rule__Position__XAssignment_0 )
            {
             before(grammarAccess.getPositionAccess().getXAssignment_0()); 
            // InternalDroneScript.g:1992:2: ( rule__Position__XAssignment_0 )
            // InternalDroneScript.g:1992:3: rule__Position__XAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Position__XAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getXAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__0__Impl"


    // $ANTLR start "rule__Position__Group__1"
    // InternalDroneScript.g:2000:1: rule__Position__Group__1 : rule__Position__Group__1__Impl rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2004:1: ( rule__Position__Group__1__Impl rule__Position__Group__2 )
            // InternalDroneScript.g:2005:2: rule__Position__Group__1__Impl rule__Position__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Position__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1"


    // $ANTLR start "rule__Position__Group__1__Impl"
    // InternalDroneScript.g:2012:1: rule__Position__Group__1__Impl : ( ',' ) ;
    public final void rule__Position__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2016:1: ( ( ',' ) )
            // InternalDroneScript.g:2017:1: ( ',' )
            {
            // InternalDroneScript.g:2017:1: ( ',' )
            // InternalDroneScript.g:2018:2: ','
            {
             before(grammarAccess.getPositionAccess().getCommaKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__1__Impl"


    // $ANTLR start "rule__Position__Group__2"
    // InternalDroneScript.g:2027:1: rule__Position__Group__2 : rule__Position__Group__2__Impl rule__Position__Group__3 ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2031:1: ( rule__Position__Group__2__Impl rule__Position__Group__3 )
            // InternalDroneScript.g:2032:2: rule__Position__Group__2__Impl rule__Position__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Position__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2"


    // $ANTLR start "rule__Position__Group__2__Impl"
    // InternalDroneScript.g:2039:1: rule__Position__Group__2__Impl : ( ( rule__Position__YAssignment_2 ) ) ;
    public final void rule__Position__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2043:1: ( ( ( rule__Position__YAssignment_2 ) ) )
            // InternalDroneScript.g:2044:1: ( ( rule__Position__YAssignment_2 ) )
            {
            // InternalDroneScript.g:2044:1: ( ( rule__Position__YAssignment_2 ) )
            // InternalDroneScript.g:2045:2: ( rule__Position__YAssignment_2 )
            {
             before(grammarAccess.getPositionAccess().getYAssignment_2()); 
            // InternalDroneScript.g:2046:2: ( rule__Position__YAssignment_2 )
            // InternalDroneScript.g:2046:3: rule__Position__YAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Position__YAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getYAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__2__Impl"


    // $ANTLR start "rule__Position__Group__3"
    // InternalDroneScript.g:2054:1: rule__Position__Group__3 : rule__Position__Group__3__Impl rule__Position__Group__4 ;
    public final void rule__Position__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2058:1: ( rule__Position__Group__3__Impl rule__Position__Group__4 )
            // InternalDroneScript.g:2059:2: rule__Position__Group__3__Impl rule__Position__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Position__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Position__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3"


    // $ANTLR start "rule__Position__Group__3__Impl"
    // InternalDroneScript.g:2066:1: rule__Position__Group__3__Impl : ( ',' ) ;
    public final void rule__Position__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2070:1: ( ( ',' ) )
            // InternalDroneScript.g:2071:1: ( ',' )
            {
            // InternalDroneScript.g:2071:1: ( ',' )
            // InternalDroneScript.g:2072:2: ','
            {
             before(grammarAccess.getPositionAccess().getCommaKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPositionAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__3__Impl"


    // $ANTLR start "rule__Position__Group__4"
    // InternalDroneScript.g:2081:1: rule__Position__Group__4 : rule__Position__Group__4__Impl ;
    public final void rule__Position__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2085:1: ( rule__Position__Group__4__Impl )
            // InternalDroneScript.g:2086:2: rule__Position__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Position__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__4"


    // $ANTLR start "rule__Position__Group__4__Impl"
    // InternalDroneScript.g:2092:1: rule__Position__Group__4__Impl : ( ( rule__Position__ZAssignment_4 ) ) ;
    public final void rule__Position__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2096:1: ( ( ( rule__Position__ZAssignment_4 ) ) )
            // InternalDroneScript.g:2097:1: ( ( rule__Position__ZAssignment_4 ) )
            {
            // InternalDroneScript.g:2097:1: ( ( rule__Position__ZAssignment_4 ) )
            // InternalDroneScript.g:2098:2: ( rule__Position__ZAssignment_4 )
            {
             before(grammarAccess.getPositionAccess().getZAssignment_4()); 
            // InternalDroneScript.g:2099:2: ( rule__Position__ZAssignment_4 )
            // InternalDroneScript.g:2099:3: rule__Position__ZAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Position__ZAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getZAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Group__4__Impl"


    // $ANTLR start "rule__DOUBLE__Group__0"
    // InternalDroneScript.g:2108:1: rule__DOUBLE__Group__0 : rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 ;
    public final void rule__DOUBLE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2112:1: ( rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1 )
            // InternalDroneScript.g:2113:2: rule__DOUBLE__Group__0__Impl rule__DOUBLE__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DOUBLE__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__0"


    // $ANTLR start "rule__DOUBLE__Group__0__Impl"
    // InternalDroneScript.g:2120:1: rule__DOUBLE__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__DOUBLE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2124:1: ( ( ( '-' )? ) )
            // InternalDroneScript.g:2125:1: ( ( '-' )? )
            {
            // InternalDroneScript.g:2125:1: ( ( '-' )? )
            // InternalDroneScript.g:2126:2: ( '-' )?
            {
             before(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 
            // InternalDroneScript.g:2127:2: ( '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDroneScript.g:2127:3: '-'
                    {
                    match(input,27,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group__1"
    // InternalDroneScript.g:2135:1: rule__DOUBLE__Group__1 : rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 ;
    public final void rule__DOUBLE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2139:1: ( rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2 )
            // InternalDroneScript.g:2140:2: rule__DOUBLE__Group__1__Impl rule__DOUBLE__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__DOUBLE__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__1"


    // $ANTLR start "rule__DOUBLE__Group__1__Impl"
    // InternalDroneScript.g:2147:1: rule__DOUBLE__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2151:1: ( ( RULE_INT ) )
            // InternalDroneScript.g:2152:1: ( RULE_INT )
            {
            // InternalDroneScript.g:2152:1: ( RULE_INT )
            // InternalDroneScript.g:2153:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__1__Impl"


    // $ANTLR start "rule__DOUBLE__Group__2"
    // InternalDroneScript.g:2162:1: rule__DOUBLE__Group__2 : rule__DOUBLE__Group__2__Impl ;
    public final void rule__DOUBLE__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2166:1: ( rule__DOUBLE__Group__2__Impl )
            // InternalDroneScript.g:2167:2: rule__DOUBLE__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__2"


    // $ANTLR start "rule__DOUBLE__Group__2__Impl"
    // InternalDroneScript.g:2173:1: rule__DOUBLE__Group__2__Impl : ( ( rule__DOUBLE__Group_2__0 )? ) ;
    public final void rule__DOUBLE__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2177:1: ( ( ( rule__DOUBLE__Group_2__0 )? ) )
            // InternalDroneScript.g:2178:1: ( ( rule__DOUBLE__Group_2__0 )? )
            {
            // InternalDroneScript.g:2178:1: ( ( rule__DOUBLE__Group_2__0 )? )
            // InternalDroneScript.g:2179:2: ( rule__DOUBLE__Group_2__0 )?
            {
             before(grammarAccess.getDOUBLEAccess().getGroup_2()); 
            // InternalDroneScript.g:2180:2: ( rule__DOUBLE__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDroneScript.g:2180:3: rule__DOUBLE__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DOUBLE__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDOUBLEAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group__2__Impl"


    // $ANTLR start "rule__DOUBLE__Group_2__0"
    // InternalDroneScript.g:2189:1: rule__DOUBLE__Group_2__0 : rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 ;
    public final void rule__DOUBLE__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2193:1: ( rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1 )
            // InternalDroneScript.g:2194:2: rule__DOUBLE__Group_2__0__Impl rule__DOUBLE__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__DOUBLE__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_2__0"


    // $ANTLR start "rule__DOUBLE__Group_2__0__Impl"
    // InternalDroneScript.g:2201:1: rule__DOUBLE__Group_2__0__Impl : ( '.' ) ;
    public final void rule__DOUBLE__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2205:1: ( ( '.' ) )
            // InternalDroneScript.g:2206:1: ( '.' )
            {
            // InternalDroneScript.g:2206:1: ( '.' )
            // InternalDroneScript.g:2207:2: '.'
            {
             before(grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_2__0__Impl"


    // $ANTLR start "rule__DOUBLE__Group_2__1"
    // InternalDroneScript.g:2216:1: rule__DOUBLE__Group_2__1 : rule__DOUBLE__Group_2__1__Impl ;
    public final void rule__DOUBLE__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2220:1: ( rule__DOUBLE__Group_2__1__Impl )
            // InternalDroneScript.g:2221:2: rule__DOUBLE__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DOUBLE__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_2__1"


    // $ANTLR start "rule__DOUBLE__Group_2__1__Impl"
    // InternalDroneScript.g:2227:1: rule__DOUBLE__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__DOUBLE__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2231:1: ( ( RULE_INT ) )
            // InternalDroneScript.g:2232:1: ( RULE_INT )
            {
            // InternalDroneScript.g:2232:1: ( RULE_INT )
            // InternalDroneScript.g:2233:2: RULE_INT
            {
             before(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getDOUBLEAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DOUBLE__Group_2__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalDroneScript.g:2243:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2247:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDroneScript.g:2248:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalDroneScript.g:2255:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2259:1: ( ( RULE_ID ) )
            // InternalDroneScript.g:2260:1: ( RULE_ID )
            {
            // InternalDroneScript.g:2260:1: ( RULE_ID )
            // InternalDroneScript.g:2261:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalDroneScript.g:2270:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2274:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDroneScript.g:2275:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalDroneScript.g:2281:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2285:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalDroneScript.g:2286:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalDroneScript.g:2286:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalDroneScript.g:2287:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalDroneScript.g:2288:2: ( rule__QualifiedName__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalDroneScript.g:2288:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalDroneScript.g:2297:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2301:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalDroneScript.g:2302:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalDroneScript.g:2309:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2313:1: ( ( '.' ) )
            // InternalDroneScript.g:2314:1: ( '.' )
            {
            // InternalDroneScript.g:2314:1: ( '.' )
            // InternalDroneScript.g:2315:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalDroneScript.g:2324:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2328:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalDroneScript.g:2329:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalDroneScript.g:2335:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2339:1: ( ( RULE_ID ) )
            // InternalDroneScript.g:2340:1: ( RULE_ID )
            {
            // InternalDroneScript.g:2340:1: ( RULE_ID )
            // InternalDroneScript.g:2341:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__DronesBehavior__ScenarioAssignment_1"
    // InternalDroneScript.g:2351:1: rule__DronesBehavior__ScenarioAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DronesBehavior__ScenarioAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2355:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:2356:2: ( ( ruleQualifiedName ) )
            {
            // InternalDroneScript.g:2356:2: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:2357:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getDronesBehaviorAccess().getScenarioScenarioCrossReference_1_0()); 
            // InternalDroneScript.g:2358:3: ( ruleQualifiedName )
            // InternalDroneScript.g:2359:4: ruleQualifiedName
            {
             before(grammarAccess.getDronesBehaviorAccess().getScenarioScenarioQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getDronesBehaviorAccess().getScenarioScenarioQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDronesBehaviorAccess().getScenarioScenarioCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__ScenarioAssignment_1"


    // $ANTLR start "rule__DronesBehavior__SignalsAssignment_2_0_1"
    // InternalDroneScript.g:2370:1: rule__DronesBehavior__SignalsAssignment_2_0_1 : ( ruleSignal ) ;
    public final void rule__DronesBehavior__SignalsAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2374:1: ( ( ruleSignal ) )
            // InternalDroneScript.g:2375:2: ( ruleSignal )
            {
            // InternalDroneScript.g:2375:2: ( ruleSignal )
            // InternalDroneScript.g:2376:3: ruleSignal
            {
             before(grammarAccess.getDronesBehaviorAccess().getSignalsSignalParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getDronesBehaviorAccess().getSignalsSignalParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__SignalsAssignment_2_0_1"


    // $ANTLR start "rule__DronesBehavior__SignalsAssignment_2_0_2_1"
    // InternalDroneScript.g:2385:1: rule__DronesBehavior__SignalsAssignment_2_0_2_1 : ( ruleSignal ) ;
    public final void rule__DronesBehavior__SignalsAssignment_2_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2389:1: ( ( ruleSignal ) )
            // InternalDroneScript.g:2390:2: ( ruleSignal )
            {
            // InternalDroneScript.g:2390:2: ( ruleSignal )
            // InternalDroneScript.g:2391:3: ruleSignal
            {
             before(grammarAccess.getDronesBehaviorAccess().getSignalsSignalParserRuleCall_2_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getDronesBehaviorAccess().getSignalsSignalParserRuleCall_2_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__SignalsAssignment_2_0_2_1"


    // $ANTLR start "rule__DronesBehavior__ScriptsAssignment_2_1"
    // InternalDroneScript.g:2400:1: rule__DronesBehavior__ScriptsAssignment_2_1 : ( ruleScript ) ;
    public final void rule__DronesBehavior__ScriptsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2404:1: ( ( ruleScript ) )
            // InternalDroneScript.g:2405:2: ( ruleScript )
            {
            // InternalDroneScript.g:2405:2: ( ruleScript )
            // InternalDroneScript.g:2406:3: ruleScript
            {
             before(grammarAccess.getDronesBehaviorAccess().getScriptsScriptParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getDronesBehaviorAccess().getScriptsScriptParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DronesBehavior__ScriptsAssignment_2_1"


    // $ANTLR start "rule__Signal__NameAssignment"
    // InternalDroneScript.g:2415:1: rule__Signal__NameAssignment : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2419:1: ( ( RULE_ID ) )
            // InternalDroneScript.g:2420:2: ( RULE_ID )
            {
            // InternalDroneScript.g:2420:2: ( RULE_ID )
            // InternalDroneScript.g:2421:3: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Signal__NameAssignment"


    // $ANTLR start "rule__Script__DroneAssignment_1"
    // InternalDroneScript.g:2430:1: rule__Script__DroneAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Script__DroneAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2434:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:2435:2: ( ( ruleQualifiedName ) )
            {
            // InternalDroneScript.g:2435:2: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:2436:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getScriptAccess().getDroneDroneCrossReference_1_0()); 
            // InternalDroneScript.g:2437:3: ( ruleQualifiedName )
            // InternalDroneScript.g:2438:4: ruleQualifiedName
            {
             before(grammarAccess.getScriptAccess().getDroneDroneQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getDroneDroneQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getScriptAccess().getDroneDroneCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__DroneAssignment_1"


    // $ANTLR start "rule__Script__StatementAssignment_2"
    // InternalDroneScript.g:2449:1: rule__Script__StatementAssignment_2 : ( ruleSequence ) ;
    public final void rule__Script__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2453:1: ( ( ruleSequence ) )
            // InternalDroneScript.g:2454:2: ( ruleSequence )
            {
            // InternalDroneScript.g:2454:2: ( ruleSequence )
            // InternalDroneScript.g:2455:3: ruleSequence
            {
             before(grammarAccess.getScriptAccess().getStatementSequenceParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getStatementSequenceParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__StatementAssignment_2"


    // $ANTLR start "rule__Sequence__StatementsAssignment_2"
    // InternalDroneScript.g:2464:1: rule__Sequence__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__Sequence__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2468:1: ( ( ruleStatement ) )
            // InternalDroneScript.g:2469:2: ( ruleStatement )
            {
            // InternalDroneScript.g:2469:2: ( ruleStatement )
            // InternalDroneScript.g:2470:3: ruleStatement
            {
             before(grammarAccess.getSequenceAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getStatementsStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__StatementsAssignment_2"


    // $ANTLR start "rule__SimpleWait__SignalAssignment_1"
    // InternalDroneScript.g:2479:1: rule__SimpleWait__SignalAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SimpleWait__SignalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2483:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:2484:2: ( ( ruleQualifiedName ) )
            {
            // InternalDroneScript.g:2484:2: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:2485:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSimpleWaitAccess().getSignalSignalCrossReference_1_0()); 
            // InternalDroneScript.g:2486:3: ( ruleQualifiedName )
            // InternalDroneScript.g:2487:4: ruleQualifiedName
            {
             before(grammarAccess.getSimpleWaitAccess().getSignalSignalQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSimpleWaitAccess().getSignalSignalQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSimpleWaitAccess().getSignalSignalCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__SignalAssignment_1"


    // $ANTLR start "rule__SimpleWait__TimeoutAssignment_2_1"
    // InternalDroneScript.g:2498:1: rule__SimpleWait__TimeoutAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__SimpleWait__TimeoutAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2502:1: ( ( RULE_INT ) )
            // InternalDroneScript.g:2503:2: ( RULE_INT )
            {
            // InternalDroneScript.g:2503:2: ( RULE_INT )
            // InternalDroneScript.g:2504:3: RULE_INT
            {
             before(grammarAccess.getSimpleWaitAccess().getTimeoutINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getSimpleWaitAccess().getTimeoutINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleWait__TimeoutAssignment_2_1"


    // $ANTLR start "rule__ComplexWait__TimeoutAssignment_2_1"
    // InternalDroneScript.g:2513:1: rule__ComplexWait__TimeoutAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__ComplexWait__TimeoutAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2517:1: ( ( RULE_INT ) )
            // InternalDroneScript.g:2518:2: ( RULE_INT )
            {
            // InternalDroneScript.g:2518:2: ( RULE_INT )
            // InternalDroneScript.g:2519:3: RULE_INT
            {
             before(grammarAccess.getComplexWaitAccess().getTimeoutINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getComplexWaitAccess().getTimeoutINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__TimeoutAssignment_2_1"


    // $ANTLR start "rule__ComplexWait__ReactionsAssignment_4"
    // InternalDroneScript.g:2528:1: rule__ComplexWait__ReactionsAssignment_4 : ( ruleReaction ) ;
    public final void rule__ComplexWait__ReactionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2532:1: ( ( ruleReaction ) )
            // InternalDroneScript.g:2533:2: ( ruleReaction )
            {
            // InternalDroneScript.g:2533:2: ( ruleReaction )
            // InternalDroneScript.g:2534:3: ruleReaction
            {
             before(grammarAccess.getComplexWaitAccess().getReactionsReactionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleReaction();

            state._fsp--;

             after(grammarAccess.getComplexWaitAccess().getReactionsReactionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__ReactionsAssignment_4"


    // $ANTLR start "rule__ComplexWait__OnTimeoutAssignment_5_2"
    // InternalDroneScript.g:2543:1: rule__ComplexWait__OnTimeoutAssignment_5_2 : ( ruleStatement ) ;
    public final void rule__ComplexWait__OnTimeoutAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2547:1: ( ( ruleStatement ) )
            // InternalDroneScript.g:2548:2: ( ruleStatement )
            {
            // InternalDroneScript.g:2548:2: ( ruleStatement )
            // InternalDroneScript.g:2549:3: ruleStatement
            {
             before(grammarAccess.getComplexWaitAccess().getOnTimeoutStatementParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getComplexWaitAccess().getOnTimeoutStatementParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexWait__OnTimeoutAssignment_5_2"


    // $ANTLR start "rule__Reaction__SignalAssignment_1"
    // InternalDroneScript.g:2558:1: rule__Reaction__SignalAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Reaction__SignalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2562:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:2563:2: ( ( ruleQualifiedName ) )
            {
            // InternalDroneScript.g:2563:2: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:2564:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getReactionAccess().getSignalSignalCrossReference_1_0()); 
            // InternalDroneScript.g:2565:3: ( ruleQualifiedName )
            // InternalDroneScript.g:2566:4: ruleQualifiedName
            {
             before(grammarAccess.getReactionAccess().getSignalSignalQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getReactionAccess().getSignalSignalQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReactionAccess().getSignalSignalCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__SignalAssignment_1"


    // $ANTLR start "rule__Reaction__StatementAssignment_2"
    // InternalDroneScript.g:2577:1: rule__Reaction__StatementAssignment_2 : ( ruleStatement ) ;
    public final void rule__Reaction__StatementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2581:1: ( ( ruleStatement ) )
            // InternalDroneScript.g:2582:2: ( ruleStatement )
            {
            // InternalDroneScript.g:2582:2: ( ruleStatement )
            // InternalDroneScript.g:2583:3: ruleStatement
            {
             before(grammarAccess.getReactionAccess().getStatementStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getReactionAccess().getStatementStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reaction__StatementAssignment_2"


    // $ANTLR start "rule__Move__DestinationAssignment_2"
    // InternalDroneScript.g:2592:1: rule__Move__DestinationAssignment_2 : ( rulePosition ) ;
    public final void rule__Move__DestinationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2596:1: ( ( rulePosition ) )
            // InternalDroneScript.g:2597:2: ( rulePosition )
            {
            // InternalDroneScript.g:2597:2: ( rulePosition )
            // InternalDroneScript.g:2598:3: rulePosition
            {
             before(grammarAccess.getMoveAccess().getDestinationPositionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getMoveAccess().getDestinationPositionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Move__DestinationAssignment_2"


    // $ANTLR start "rule__SendSignal__SignalAssignment_1"
    // InternalDroneScript.g:2607:1: rule__SendSignal__SignalAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SendSignal__SignalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2611:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:2612:2: ( ( ruleQualifiedName ) )
            {
            // InternalDroneScript.g:2612:2: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:2613:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSendSignalAccess().getSignalSignalCrossReference_1_0()); 
            // InternalDroneScript.g:2614:3: ( ruleQualifiedName )
            // InternalDroneScript.g:2615:4: ruleQualifiedName
            {
             before(grammarAccess.getSendSignalAccess().getSignalSignalQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSendSignalAccess().getSignalSignalQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSendSignalAccess().getSignalSignalCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendSignal__SignalAssignment_1"


    // $ANTLR start "rule__SendSignal__RecipentAssignment_3"
    // InternalDroneScript.g:2626:1: rule__SendSignal__RecipentAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SendSignal__RecipentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2630:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:2631:2: ( ( ruleQualifiedName ) )
            {
            // InternalDroneScript.g:2631:2: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:2632:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSendSignalAccess().getRecipentDroneCrossReference_3_0()); 
            // InternalDroneScript.g:2633:3: ( ruleQualifiedName )
            // InternalDroneScript.g:2634:4: ruleQualifiedName
            {
             before(grammarAccess.getSendSignalAccess().getRecipentDroneQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSendSignalAccess().getRecipentDroneQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSendSignalAccess().getRecipentDroneCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendSignal__RecipentAssignment_3"


    // $ANTLR start "rule__Cooperate__RoleAssignment_1"
    // InternalDroneScript.g:2645:1: rule__Cooperate__RoleAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Cooperate__RoleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2649:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:2650:2: ( ( ruleQualifiedName ) )
            {
            // InternalDroneScript.g:2650:2: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:2651:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCooperateAccess().getRoleRoleCrossReference_1_0()); 
            // InternalDroneScript.g:2652:3: ( ruleQualifiedName )
            // InternalDroneScript.g:2653:4: ruleQualifiedName
            {
             before(grammarAccess.getCooperateAccess().getRoleRoleQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCooperateAccess().getRoleRoleQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCooperateAccess().getRoleRoleCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cooperate__RoleAssignment_1"


    // $ANTLR start "rule__SendMap__RecipentAssignment_3"
    // InternalDroneScript.g:2664:1: rule__SendMap__RecipentAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SendMap__RecipentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2668:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDroneScript.g:2669:2: ( ( ruleQualifiedName ) )
            {
            // InternalDroneScript.g:2669:2: ( ( ruleQualifiedName ) )
            // InternalDroneScript.g:2670:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getSendMapAccess().getRecipentDroneCrossReference_3_0()); 
            // InternalDroneScript.g:2671:3: ( ruleQualifiedName )
            // InternalDroneScript.g:2672:4: ruleQualifiedName
            {
             before(grammarAccess.getSendMapAccess().getRecipentDroneQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getSendMapAccess().getRecipentDroneQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getSendMapAccess().getRecipentDroneCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendMap__RecipentAssignment_3"


    // $ANTLR start "rule__Position__XAssignment_0"
    // InternalDroneScript.g:2683:1: rule__Position__XAssignment_0 : ( ruleDOUBLE ) ;
    public final void rule__Position__XAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2687:1: ( ( ruleDOUBLE ) )
            // InternalDroneScript.g:2688:2: ( ruleDOUBLE )
            {
            // InternalDroneScript.g:2688:2: ( ruleDOUBLE )
            // InternalDroneScript.g:2689:3: ruleDOUBLE
            {
             before(grammarAccess.getPositionAccess().getXDOUBLEParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getXDOUBLEParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__XAssignment_0"


    // $ANTLR start "rule__Position__YAssignment_2"
    // InternalDroneScript.g:2698:1: rule__Position__YAssignment_2 : ( ruleDOUBLE ) ;
    public final void rule__Position__YAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2702:1: ( ( ruleDOUBLE ) )
            // InternalDroneScript.g:2703:2: ( ruleDOUBLE )
            {
            // InternalDroneScript.g:2703:2: ( ruleDOUBLE )
            // InternalDroneScript.g:2704:3: ruleDOUBLE
            {
             before(grammarAccess.getPositionAccess().getYDOUBLEParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getYDOUBLEParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__YAssignment_2"


    // $ANTLR start "rule__Position__ZAssignment_4"
    // InternalDroneScript.g:2713:1: rule__Position__ZAssignment_4 : ( ruleDOUBLE ) ;
    public final void rule__Position__ZAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDroneScript.g:2717:1: ( ( ruleDOUBLE ) )
            // InternalDroneScript.g:2718:2: ( ruleDOUBLE )
            {
            // InternalDroneScript.g:2718:2: ( ruleDOUBLE )
            // InternalDroneScript.g:2719:3: ruleDOUBLE
            {
             before(grammarAccess.getPositionAccess().getZDOUBLEParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDOUBLE();

            state._fsp--;

             after(grammarAccess.getPositionAccess().getZDOUBLEParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__ZAssignment_4"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\14\uffff";
    static final String dfa_2s = "\1\17\1\uffff\1\5\1\uffff\1\5\7\uffff";
    static final String dfa_3s = "\1\31\1\uffff\1\22\1\uffff\1\32\7\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\4\1\uffff\1\6\1\7\1\10\1\3\1\2\1\11\1\5";
    static final String dfa_5s = "\14\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\2\uffff\1\3\1\uffff\1\4\1\5\1\6\1\7",
            "",
            "\1\11\11\uffff\1\10\2\uffff\1\10",
            "",
            "\1\13\24\uffff\1\12",
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

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "506:1: rule__Statement__Alternatives : ( ( ruleSequence ) | ( ruleSimpleWait ) | ( ruleComplexWait ) | ( ruleMove ) | ( ruleSendSignal ) | ( ruleCooperate ) | ( ruleCharge ) | ( ruleScan ) | ( ruleSendMap ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003D38000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003D28002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003D28000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000002L});

}