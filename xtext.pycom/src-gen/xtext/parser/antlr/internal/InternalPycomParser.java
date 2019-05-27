package xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xtext.services.PycomGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPycomParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Library'", "'{'", "'}'", "'import'", "'('", "','", "')'", "'from'", "'Server'", "'.'", "'Board'", "'uses'", "'if'", "'Sensor'", "':'", "'Actuator'", "'Communication'", "'WiFi'", "'Bluetooth'", "'SigFox'", "'&&'", "'||'", "'true'", "'false'", "'<'", "'<='", "'=='", "'>='", "'>'", "'!='"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPycomParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPycomParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPycomParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPycom.g"; }



     	private PycomGrammarAccess grammarAccess;

        public InternalPycomParser(TokenStream input, PycomGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected PycomGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalPycom.g:64:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalPycom.g:64:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalPycom.g:65:2: iv_ruleSystem= ruleSystem EOF
            {
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
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
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalPycom.g:71:1: ruleSystem returns [EObject current=null] : ( ( (lv_libraries_0_0= ruleLibrary ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_boards_2_0= ruleBoard ) )* ( (lv_servers_3_0= ruleServer ) )* ) ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        EObject lv_libraries_0_0 = null;

        EObject lv_imports_1_0 = null;

        EObject lv_boards_2_0 = null;

        EObject lv_servers_3_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:77:2: ( ( ( (lv_libraries_0_0= ruleLibrary ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_boards_2_0= ruleBoard ) )* ( (lv_servers_3_0= ruleServer ) )* ) )
            // InternalPycom.g:78:2: ( ( (lv_libraries_0_0= ruleLibrary ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_boards_2_0= ruleBoard ) )* ( (lv_servers_3_0= ruleServer ) )* )
            {
            // InternalPycom.g:78:2: ( ( (lv_libraries_0_0= ruleLibrary ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_boards_2_0= ruleBoard ) )* ( (lv_servers_3_0= ruleServer ) )* )
            // InternalPycom.g:79:3: ( (lv_libraries_0_0= ruleLibrary ) )* ( (lv_imports_1_0= ruleImport ) )* ( (lv_boards_2_0= ruleBoard ) )* ( (lv_servers_3_0= ruleServer ) )*
            {
            // InternalPycom.g:79:3: ( (lv_libraries_0_0= ruleLibrary ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPycom.g:80:4: (lv_libraries_0_0= ruleLibrary )
            	    {
            	    // InternalPycom.g:80:4: (lv_libraries_0_0= ruleLibrary )
            	    // InternalPycom.g:81:5: lv_libraries_0_0= ruleLibrary
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getLibrariesLibraryParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_libraries_0_0=ruleLibrary();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"libraries",
            	    						lv_libraries_0_0,
            	    						"xtext.Pycom.Library");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPycom.g:98:3: ( (lv_imports_1_0= ruleImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPycom.g:99:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalPycom.g:99:4: (lv_imports_1_0= ruleImport )
            	    // InternalPycom.g:100:5: lv_imports_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"xtext.Pycom.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalPycom.g:117:3: ( (lv_boards_2_0= ruleBoard ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPycom.g:118:4: (lv_boards_2_0= ruleBoard )
            	    {
            	    // InternalPycom.g:118:4: (lv_boards_2_0= ruleBoard )
            	    // InternalPycom.g:119:5: lv_boards_2_0= ruleBoard
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getBoardsBoardParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_boards_2_0=ruleBoard();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"boards",
            	    						lv_boards_2_0,
            	    						"xtext.Pycom.Board");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalPycom.g:136:3: ( (lv_servers_3_0= ruleServer ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPycom.g:137:4: (lv_servers_3_0= ruleServer )
            	    {
            	    // InternalPycom.g:137:4: (lv_servers_3_0= ruleServer )
            	    // InternalPycom.g:138:5: lv_servers_3_0= ruleServer
            	    {

            	    					newCompositeNode(grammarAccess.getSystemAccess().getServersServerParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_servers_3_0=ruleServer();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getSystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"servers",
            	    						lv_servers_3_0,
            	    						"xtext.Pycom.Server");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleLibrary"
    // InternalPycom.g:159:1: entryRuleLibrary returns [EObject current=null] : iv_ruleLibrary= ruleLibrary EOF ;
    public final EObject entryRuleLibrary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrary = null;


        try {
            // InternalPycom.g:159:48: (iv_ruleLibrary= ruleLibrary EOF )
            // InternalPycom.g:160:2: iv_ruleLibrary= ruleLibrary EOF
            {
             newCompositeNode(grammarAccess.getLibraryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrary=ruleLibrary();

            state._fsp--;

             current =iv_ruleLibrary; 
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
    // $ANTLR end "entryRuleLibrary"


    // $ANTLR start "ruleLibrary"
    // InternalPycom.g:166:1: ruleLibrary returns [EObject current=null] : (otherlv_0= 'Library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' ) ;
    public final EObject ruleLibrary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_imports_3_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:172:2: ( (otherlv_0= 'Library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' ) )
            // InternalPycom.g:173:2: (otherlv_0= 'Library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )
            {
            // InternalPycom.g:173:2: (otherlv_0= 'Library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}' )
            // InternalPycom.g:174:3: otherlv_0= 'Library' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_imports_3_0= ruleImport ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getLibraryAccess().getLibraryKeyword_0());
            		
            // InternalPycom.g:178:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPycom.g:179:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPycom.g:179:4: (lv_name_1_0= RULE_ID )
            // InternalPycom.g:180:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLibraryAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibraryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getLibraryAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalPycom.g:200:3: ( (lv_imports_3_0= ruleImport ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalPycom.g:201:4: (lv_imports_3_0= ruleImport )
            	    {
            	    // InternalPycom.g:201:4: (lv_imports_3_0= ruleImport )
            	    // InternalPycom.g:202:5: lv_imports_3_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getLibraryAccess().getImportsImportParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_imports_3_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLibraryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"xtext.Pycom.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLibraryAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLibrary"


    // $ANTLR start "entryRuleImport"
    // InternalPycom.g:227:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalPycom.g:227:47: (iv_ruleImport= ruleImport EOF )
            // InternalPycom.g:228:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalPycom.g:234:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= ruleParameterType ) )? (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterType ) ) )* otherlv_6= ')' otherlv_7= 'from' ( (lv_path_8_0= RULE_STRING ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_path_8_0=null;
        EObject lv_parameter_3_0 = null;

        EObject lv_parameter_5_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:240:2: ( (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= ruleParameterType ) )? (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterType ) ) )* otherlv_6= ')' otherlv_7= 'from' ( (lv_path_8_0= RULE_STRING ) ) ) )
            // InternalPycom.g:241:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= ruleParameterType ) )? (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterType ) ) )* otherlv_6= ')' otherlv_7= 'from' ( (lv_path_8_0= RULE_STRING ) ) )
            {
            // InternalPycom.g:241:2: (otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= ruleParameterType ) )? (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterType ) ) )* otherlv_6= ')' otherlv_7= 'from' ( (lv_path_8_0= RULE_STRING ) ) )
            // InternalPycom.g:242:3: otherlv_0= 'import' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_parameter_3_0= ruleParameterType ) )? (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterType ) ) )* otherlv_6= ')' otherlv_7= 'from' ( (lv_path_8_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalPycom.g:246:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPycom.g:247:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPycom.g:247:4: (lv_name_1_0= RULE_ID )
            // InternalPycom.g:248:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getImportAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPycom.g:268:3: ( (lv_parameter_3_0= ruleParameterType ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_INT)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPycom.g:269:4: (lv_parameter_3_0= ruleParameterType )
                    {
                    // InternalPycom.g:269:4: (lv_parameter_3_0= ruleParameterType )
                    // InternalPycom.g:270:5: lv_parameter_3_0= ruleParameterType
                    {

                    					newCompositeNode(grammarAccess.getImportAccess().getParameterParameterTypeParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_parameter_3_0=ruleParameterType();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getImportRule());
                    					}
                    					add(
                    						current,
                    						"parameter",
                    						lv_parameter_3_0,
                    						"xtext.Pycom.ParameterType");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPycom.g:287:3: (otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterType ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPycom.g:288:4: otherlv_4= ',' ( (lv_parameter_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getImportAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalPycom.g:292:4: ( (lv_parameter_5_0= ruleParameterType ) )
            	    // InternalPycom.g:293:5: (lv_parameter_5_0= ruleParameterType )
            	    {
            	    // InternalPycom.g:293:5: (lv_parameter_5_0= ruleParameterType )
            	    // InternalPycom.g:294:6: lv_parameter_5_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getImportAccess().getParameterParameterTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_parameter_5_0=ruleParameterType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getImportRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameter",
            	    							lv_parameter_5_0,
            	    							"xtext.Pycom.ParameterType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_6, grammarAccess.getImportAccess().getRightParenthesisKeyword_5());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getImportAccess().getFromKeyword_6());
            		
            // InternalPycom.g:320:3: ( (lv_path_8_0= RULE_STRING ) )
            // InternalPycom.g:321:4: (lv_path_8_0= RULE_STRING )
            {
            // InternalPycom.g:321:4: (lv_path_8_0= RULE_STRING )
            // InternalPycom.g:322:5: lv_path_8_0= RULE_STRING
            {
            lv_path_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_path_8_0, grammarAccess.getImportAccess().getPathSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_8_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleParameterType"
    // InternalPycom.g:342:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalPycom.g:342:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalPycom.g:343:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalPycom.g:349:1: ruleParameterType returns [EObject current=null] : ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_text_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        Token lv_number_0_0=null;
        Token lv_text_1_0=null;


        	enterRule();

        try {
            // InternalPycom.g:355:2: ( ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_text_1_0= RULE_STRING ) ) ) )
            // InternalPycom.g:356:2: ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_text_1_0= RULE_STRING ) ) )
            {
            // InternalPycom.g:356:2: ( ( (lv_number_0_0= RULE_INT ) ) | ( (lv_text_1_0= RULE_STRING ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalPycom.g:357:3: ( (lv_number_0_0= RULE_INT ) )
                    {
                    // InternalPycom.g:357:3: ( (lv_number_0_0= RULE_INT ) )
                    // InternalPycom.g:358:4: (lv_number_0_0= RULE_INT )
                    {
                    // InternalPycom.g:358:4: (lv_number_0_0= RULE_INT )
                    // InternalPycom.g:359:5: lv_number_0_0= RULE_INT
                    {
                    lv_number_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_number_0_0, grammarAccess.getParameterTypeAccess().getNumberINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"number",
                    						lv_number_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPycom.g:376:3: ( (lv_text_1_0= RULE_STRING ) )
                    {
                    // InternalPycom.g:376:3: ( (lv_text_1_0= RULE_STRING ) )
                    // InternalPycom.g:377:4: (lv_text_1_0= RULE_STRING )
                    {
                    // InternalPycom.g:377:4: (lv_text_1_0= RULE_STRING )
                    // InternalPycom.g:378:5: lv_text_1_0= RULE_STRING
                    {
                    lv_text_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_text_1_0, grammarAccess.getParameterTypeAccess().getTextSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterTypeRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"text",
                    						lv_text_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


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
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleServer"
    // InternalPycom.g:398:1: entryRuleServer returns [EObject current=null] : iv_ruleServer= ruleServer EOF ;
    public final EObject entryRuleServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServer = null;


        try {
            // InternalPycom.g:398:47: (iv_ruleServer= ruleServer EOF )
            // InternalPycom.g:399:2: iv_ruleServer= ruleServer EOF
            {
             newCompositeNode(grammarAccess.getServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServer=ruleServer();

            state._fsp--;

             current =iv_ruleServer; 
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
    // $ANTLR end "entryRuleServer"


    // $ANTLR start "ruleServer"
    // InternalPycom.g:405:1: ruleServer returns [EObject current=null] : (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_conn_3_0= ruleConnection ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_exps_6_0= ruleConditionalAction ) )* otherlv_7= '}' ) ;
    public final EObject ruleServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_conn_3_0 = null;

        EObject lv_exps_6_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:411:2: ( (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_conn_3_0= ruleConnection ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_exps_6_0= ruleConditionalAction ) )* otherlv_7= '}' ) )
            // InternalPycom.g:412:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_conn_3_0= ruleConnection ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_exps_6_0= ruleConditionalAction ) )* otherlv_7= '}' )
            {
            // InternalPycom.g:412:2: (otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_conn_3_0= ruleConnection ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_exps_6_0= ruleConditionalAction ) )* otherlv_7= '}' )
            // InternalPycom.g:413:3: otherlv_0= 'Server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_conn_3_0= ruleConnection ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_exps_6_0= ruleConditionalAction ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getServerAccess().getServerKeyword_0());
            		
            // InternalPycom.g:417:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPycom.g:418:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPycom.g:418:4: (lv_name_1_0= RULE_ID )
            // InternalPycom.g:419:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getServerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getServerAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPycom.g:439:3: ( (lv_conn_3_0= ruleConnection ) )
            // InternalPycom.g:440:4: (lv_conn_3_0= ruleConnection )
            {
            // InternalPycom.g:440:4: (lv_conn_3_0= ruleConnection )
            // InternalPycom.g:441:5: lv_conn_3_0= ruleConnection
            {

            					newCompositeNode(grammarAccess.getServerAccess().getConnConnectionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_conn_3_0=ruleConnection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServerRule());
            					}
            					set(
            						current,
            						"conn",
            						lv_conn_3_0,
            						"xtext.Pycom.Connection");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getServerAccess().getRightParenthesisKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_5, grammarAccess.getServerAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalPycom.g:466:3: ( (lv_exps_6_0= ruleConditionalAction ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPycom.g:467:4: (lv_exps_6_0= ruleConditionalAction )
            	    {
            	    // InternalPycom.g:467:4: (lv_exps_6_0= ruleConditionalAction )
            	    // InternalPycom.g:468:5: lv_exps_6_0= ruleConditionalAction
            	    {

            	    					newCompositeNode(grammarAccess.getServerAccess().getExpsConditionalActionParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_exps_6_0=ruleConditionalAction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getServerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"exps",
            	    						lv_exps_6_0,
            	    						"xtext.Pycom.ConditionalAction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getServerAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleServer"


    // $ANTLR start "entryRuleConnection"
    // InternalPycom.g:493:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalPycom.g:493:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalPycom.g:494:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
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
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalPycom.g:500:1: ruleConnection returns [EObject current=null] : ( ( (lv_host_0_0= ruleHost ) ) otherlv_1= ',' ( (lv_portnumber_2_0= RULE_INT ) ) ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_portnumber_2_0=null;
        EObject lv_host_0_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:506:2: ( ( ( (lv_host_0_0= ruleHost ) ) otherlv_1= ',' ( (lv_portnumber_2_0= RULE_INT ) ) ) )
            // InternalPycom.g:507:2: ( ( (lv_host_0_0= ruleHost ) ) otherlv_1= ',' ( (lv_portnumber_2_0= RULE_INT ) ) )
            {
            // InternalPycom.g:507:2: ( ( (lv_host_0_0= ruleHost ) ) otherlv_1= ',' ( (lv_portnumber_2_0= RULE_INT ) ) )
            // InternalPycom.g:508:3: ( (lv_host_0_0= ruleHost ) ) otherlv_1= ',' ( (lv_portnumber_2_0= RULE_INT ) )
            {
            // InternalPycom.g:508:3: ( (lv_host_0_0= ruleHost ) )
            // InternalPycom.g:509:4: (lv_host_0_0= ruleHost )
            {
            // InternalPycom.g:509:4: (lv_host_0_0= ruleHost )
            // InternalPycom.g:510:5: lv_host_0_0= ruleHost
            {

            					newCompositeNode(grammarAccess.getConnectionAccess().getHostHostParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_host_0_0=ruleHost();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConnectionRule());
            					}
            					set(
            						current,
            						"host",
            						lv_host_0_0,
            						"xtext.Pycom.Host");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getConnectionAccess().getCommaKeyword_1());
            		
            // InternalPycom.g:531:3: ( (lv_portnumber_2_0= RULE_INT ) )
            // InternalPycom.g:532:4: (lv_portnumber_2_0= RULE_INT )
            {
            // InternalPycom.g:532:4: (lv_portnumber_2_0= RULE_INT )
            // InternalPycom.g:533:5: lv_portnumber_2_0= RULE_INT
            {
            lv_portnumber_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_portnumber_2_0, grammarAccess.getConnectionAccess().getPortnumberINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConnectionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"portnumber",
            						lv_portnumber_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleHost"
    // InternalPycom.g:553:1: entryRuleHost returns [EObject current=null] : iv_ruleHost= ruleHost EOF ;
    public final EObject entryRuleHost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHost = null;


        try {
            // InternalPycom.g:553:45: (iv_ruleHost= ruleHost EOF )
            // InternalPycom.g:554:2: iv_ruleHost= ruleHost EOF
            {
             newCompositeNode(grammarAccess.getHostRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHost=ruleHost();

            state._fsp--;

             current =iv_ruleHost; 
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
    // $ANTLR end "entryRuleHost"


    // $ANTLR start "ruleHost"
    // InternalPycom.g:560:1: ruleHost returns [EObject current=null] : ( ( (lv_ipAdr_0_0= ruleIpaddress ) ) | ( (lv_website_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleHost() throws RecognitionException {
        EObject current = null;

        Token lv_website_1_0=null;
        AntlrDatatypeRuleToken lv_ipAdr_0_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:566:2: ( ( ( (lv_ipAdr_0_0= ruleIpaddress ) ) | ( (lv_website_1_0= RULE_STRING ) ) ) )
            // InternalPycom.g:567:2: ( ( (lv_ipAdr_0_0= ruleIpaddress ) ) | ( (lv_website_1_0= RULE_STRING ) ) )
            {
            // InternalPycom.g:567:2: ( ( (lv_ipAdr_0_0= ruleIpaddress ) ) | ( (lv_website_1_0= RULE_STRING ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPycom.g:568:3: ( (lv_ipAdr_0_0= ruleIpaddress ) )
                    {
                    // InternalPycom.g:568:3: ( (lv_ipAdr_0_0= ruleIpaddress ) )
                    // InternalPycom.g:569:4: (lv_ipAdr_0_0= ruleIpaddress )
                    {
                    // InternalPycom.g:569:4: (lv_ipAdr_0_0= ruleIpaddress )
                    // InternalPycom.g:570:5: lv_ipAdr_0_0= ruleIpaddress
                    {

                    					newCompositeNode(grammarAccess.getHostAccess().getIpAdrIpaddressParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_ipAdr_0_0=ruleIpaddress();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getHostRule());
                    					}
                    					set(
                    						current,
                    						"ipAdr",
                    						lv_ipAdr_0_0,
                    						"xtext.Pycom.Ipaddress");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPycom.g:588:3: ( (lv_website_1_0= RULE_STRING ) )
                    {
                    // InternalPycom.g:588:3: ( (lv_website_1_0= RULE_STRING ) )
                    // InternalPycom.g:589:4: (lv_website_1_0= RULE_STRING )
                    {
                    // InternalPycom.g:589:4: (lv_website_1_0= RULE_STRING )
                    // InternalPycom.g:590:5: lv_website_1_0= RULE_STRING
                    {
                    lv_website_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_website_1_0, grammarAccess.getHostAccess().getWebsiteSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getHostRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"website",
                    						lv_website_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


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
    // $ANTLR end "ruleHost"


    // $ANTLR start "entryRuleIpaddress"
    // InternalPycom.g:610:1: entryRuleIpaddress returns [String current=null] : iv_ruleIpaddress= ruleIpaddress EOF ;
    public final String entryRuleIpaddress() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIpaddress = null;


        try {
            // InternalPycom.g:610:49: (iv_ruleIpaddress= ruleIpaddress EOF )
            // InternalPycom.g:611:2: iv_ruleIpaddress= ruleIpaddress EOF
            {
             newCompositeNode(grammarAccess.getIpaddressRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIpaddress=ruleIpaddress();

            state._fsp--;

             current =iv_ruleIpaddress.getText(); 
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
    // $ANTLR end "entryRuleIpaddress"


    // $ANTLR start "ruleIpaddress"
    // InternalPycom.g:617:1: ruleIpaddress returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleIpaddress() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;
        Token this_INT_4=null;
        Token this_INT_6=null;


        	enterRule();

        try {
            // InternalPycom.g:623:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT ) )
            // InternalPycom.g:624:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT )
            {
            // InternalPycom.g:624:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT )
            // InternalPycom.g:625:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT kw= '.' this_INT_4= RULE_INT kw= '.' this_INT_6= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getIpaddressAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,20,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIpaddressAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getIpaddressAccess().getINTTerminalRuleCall_2());
            		
            kw=(Token)match(input,20,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIpaddressAccess().getFullStopKeyword_3());
            		
            this_INT_4=(Token)match(input,RULE_INT,FOLLOW_20); 

            			current.merge(this_INT_4);
            		

            			newLeafNode(this_INT_4, grammarAccess.getIpaddressAccess().getINTTerminalRuleCall_4());
            		
            kw=(Token)match(input,20,FOLLOW_19); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getIpaddressAccess().getFullStopKeyword_5());
            		
            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_6);
            		

            			newLeafNode(this_INT_6, grammarAccess.getIpaddressAccess().getINTTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleIpaddress"


    // $ANTLR start "entryRuleBoard"
    // InternalPycom.g:672:1: entryRuleBoard returns [EObject current=null] : iv_ruleBoard= ruleBoard EOF ;
    public final EObject entryRuleBoard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoard = null;


        try {
            // InternalPycom.g:672:46: (iv_ruleBoard= ruleBoard EOF )
            // InternalPycom.g:673:2: iv_ruleBoard= ruleBoard EOF
            {
             newCompositeNode(grammarAccess.getBoardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoard=ruleBoard();

            state._fsp--;

             current =iv_ruleBoard; 
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
    // $ANTLR end "entryRuleBoard"


    // $ANTLR start "ruleBoard"
    // InternalPycom.g:679:1: ruleBoard returns [EObject current=null] : (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_boardType_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_communicationRate_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) )? (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '{' ( (lv_boardMembers_12_0= ruleBoardMember ) )* otherlv_13= '}' ) ;
    public final EObject ruleBoard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_boardType_3_0=null;
        Token otherlv_4=null;
        Token lv_communicationRate_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_boardMembers_12_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:685:2: ( (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_boardType_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_communicationRate_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) )? (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '{' ( (lv_boardMembers_12_0= ruleBoardMember ) )* otherlv_13= '}' ) )
            // InternalPycom.g:686:2: (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_boardType_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_communicationRate_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) )? (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '{' ( (lv_boardMembers_12_0= ruleBoardMember ) )* otherlv_13= '}' )
            {
            // InternalPycom.g:686:2: (otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_boardType_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_communicationRate_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) )? (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '{' ( (lv_boardMembers_12_0= ruleBoardMember ) )* otherlv_13= '}' )
            // InternalPycom.g:687:3: otherlv_0= 'Board' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_boardType_3_0= RULE_ID ) ) otherlv_4= ',' ( (lv_communicationRate_5_0= RULE_INT ) ) otherlv_6= ')' (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) )? (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )? otherlv_11= '{' ( (lv_boardMembers_12_0= ruleBoardMember ) )* otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getBoardAccess().getBoardKeyword_0());
            		
            // InternalPycom.g:691:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPycom.g:692:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPycom.g:692:4: (lv_name_1_0= RULE_ID )
            // InternalPycom.g:693:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getBoardAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getBoardAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPycom.g:713:3: ( (lv_boardType_3_0= RULE_ID ) )
            // InternalPycom.g:714:4: (lv_boardType_3_0= RULE_ID )
            {
            // InternalPycom.g:714:4: (lv_boardType_3_0= RULE_ID )
            // InternalPycom.g:715:5: lv_boardType_3_0= RULE_ID
            {
            lv_boardType_3_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(lv_boardType_3_0, grammarAccess.getBoardAccess().getBoardTypeIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"boardType",
            						lv_boardType_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getBoardAccess().getCommaKeyword_4());
            		
            // InternalPycom.g:735:3: ( (lv_communicationRate_5_0= RULE_INT ) )
            // InternalPycom.g:736:4: (lv_communicationRate_5_0= RULE_INT )
            {
            // InternalPycom.g:736:4: (lv_communicationRate_5_0= RULE_INT )
            // InternalPycom.g:737:5: lv_communicationRate_5_0= RULE_INT
            {
            lv_communicationRate_5_0=(Token)match(input,RULE_INT,FOLLOW_16); 

            					newLeafNode(lv_communicationRate_5_0, grammarAccess.getBoardAccess().getCommunicationRateINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBoardRule());
            					}
            					setWithLastConsumed(
            						current,
            						"communicationRate",
            						lv_communicationRate_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,17,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getBoardAccess().getRightParenthesisKeyword_6());
            		
            // InternalPycom.g:757:3: (otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) )? (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalPycom.g:758:4: otherlv_7= 'uses' ( (otherlv_8= RULE_ID ) )? (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_22); 

                    				newLeafNode(otherlv_7, grammarAccess.getBoardAccess().getUsesKeyword_7_0());
                    			
                    // InternalPycom.g:762:4: ( (otherlv_8= RULE_ID ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalPycom.g:763:5: (otherlv_8= RULE_ID )
                            {
                            // InternalPycom.g:763:5: (otherlv_8= RULE_ID )
                            // InternalPycom.g:764:6: otherlv_8= RULE_ID
                            {

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBoardRule());
                            						}
                            					
                            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_23); 

                            						newLeafNode(otherlv_8, grammarAccess.getBoardAccess().getLibraryLibraryCrossReference_7_1_0());
                            					

                            }


                            }
                            break;

                    }

                    // InternalPycom.g:775:4: (otherlv_9= ',' ( (otherlv_10= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==16) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPycom.g:776:5: otherlv_9= ',' ( (otherlv_10= RULE_ID ) )
                    	    {
                    	    otherlv_9=(Token)match(input,16,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getBoardAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalPycom.g:780:5: ( (otherlv_10= RULE_ID ) )
                    	    // InternalPycom.g:781:6: (otherlv_10= RULE_ID )
                    	    {
                    	    // InternalPycom.g:781:6: (otherlv_10= RULE_ID )
                    	    // InternalPycom.g:782:7: otherlv_10= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getBoardRule());
                    	    							}
                    	    						
                    	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_23); 

                    	    							newLeafNode(otherlv_10, grammarAccess.getBoardAccess().getLibraryLibraryCrossReference_7_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getBoardAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalPycom.g:799:3: ( (lv_boardMembers_12_0= ruleBoardMember ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24||(LA14_0>=26 && LA14_0<=27)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPycom.g:800:4: (lv_boardMembers_12_0= ruleBoardMember )
            	    {
            	    // InternalPycom.g:800:4: (lv_boardMembers_12_0= ruleBoardMember )
            	    // InternalPycom.g:801:5: lv_boardMembers_12_0= ruleBoardMember
            	    {

            	    					newCompositeNode(grammarAccess.getBoardAccess().getBoardMembersBoardMemberParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_boardMembers_12_0=ruleBoardMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBoardRule());
            	    					}
            	    					add(
            	    						current,
            	    						"boardMembers",
            	    						lv_boardMembers_12_0,
            	    						"xtext.Pycom.BoardMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getBoardAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleBoard"


    // $ANTLR start "entryRuleBoardMember"
    // InternalPycom.g:826:1: entryRuleBoardMember returns [EObject current=null] : iv_ruleBoardMember= ruleBoardMember EOF ;
    public final EObject entryRuleBoardMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoardMember = null;


        try {
            // InternalPycom.g:826:52: (iv_ruleBoardMember= ruleBoardMember EOF )
            // InternalPycom.g:827:2: iv_ruleBoardMember= ruleBoardMember EOF
            {
             newCompositeNode(grammarAccess.getBoardMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoardMember=ruleBoardMember();

            state._fsp--;

             current =iv_ruleBoardMember; 
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
    // $ANTLR end "entryRuleBoardMember"


    // $ANTLR start "ruleBoardMember"
    // InternalPycom.g:833:1: ruleBoardMember returns [EObject current=null] : ( ( (lv_boardMember_0_0= ruleSensor ) ) | this_Actuator_1= ruleActuator | this_Communication_2= ruleCommunication ) ;
    public final EObject ruleBoardMember() throws RecognitionException {
        EObject current = null;

        EObject lv_boardMember_0_0 = null;

        EObject this_Actuator_1 = null;

        EObject this_Communication_2 = null;



        	enterRule();

        try {
            // InternalPycom.g:839:2: ( ( ( (lv_boardMember_0_0= ruleSensor ) ) | this_Actuator_1= ruleActuator | this_Communication_2= ruleCommunication ) )
            // InternalPycom.g:840:2: ( ( (lv_boardMember_0_0= ruleSensor ) ) | this_Actuator_1= ruleActuator | this_Communication_2= ruleCommunication )
            {
            // InternalPycom.g:840:2: ( ( (lv_boardMember_0_0= ruleSensor ) ) | this_Actuator_1= ruleActuator | this_Communication_2= ruleCommunication )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt15=1;
                }
                break;
            case 26:
                {
                alt15=2;
                }
                break;
            case 27:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalPycom.g:841:3: ( (lv_boardMember_0_0= ruleSensor ) )
                    {
                    // InternalPycom.g:841:3: ( (lv_boardMember_0_0= ruleSensor ) )
                    // InternalPycom.g:842:4: (lv_boardMember_0_0= ruleSensor )
                    {
                    // InternalPycom.g:842:4: (lv_boardMember_0_0= ruleSensor )
                    // InternalPycom.g:843:5: lv_boardMember_0_0= ruleSensor
                    {

                    					newCompositeNode(grammarAccess.getBoardMemberAccess().getBoardMemberSensorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_boardMember_0_0=ruleSensor();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getBoardMemberRule());
                    					}
                    					set(
                    						current,
                    						"boardMember",
                    						lv_boardMember_0_0,
                    						"xtext.Pycom.Sensor");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPycom.g:861:3: this_Actuator_1= ruleActuator
                    {

                    			newCompositeNode(grammarAccess.getBoardMemberAccess().getActuatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;


                    			current = this_Actuator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPycom.g:870:3: this_Communication_2= ruleCommunication
                    {

                    			newCompositeNode(grammarAccess.getBoardMemberAccess().getCommunicationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Communication_2=ruleCommunication();

                    state._fsp--;


                    			current = this_Communication_2;
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
    // $ANTLR end "ruleBoardMember"


    // $ANTLR start "entryRuleConditionalAction"
    // InternalPycom.g:882:1: entryRuleConditionalAction returns [EObject current=null] : iv_ruleConditionalAction= ruleConditionalAction EOF ;
    public final EObject entryRuleConditionalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionalAction = null;


        try {
            // InternalPycom.g:882:58: (iv_ruleConditionalAction= ruleConditionalAction EOF )
            // InternalPycom.g:883:2: iv_ruleConditionalAction= ruleConditionalAction EOF
            {
             newCompositeNode(grammarAccess.getConditionalActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditionalAction=ruleConditionalAction();

            state._fsp--;

             current =iv_ruleConditionalAction; 
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
    // $ANTLR end "entryRuleConditionalAction"


    // $ANTLR start "ruleConditionalAction"
    // InternalPycom.g:889:1: ruleConditionalAction returns [EObject current=null] : ( ( (lv_type_0_0= 'if' ) ) otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ExpMembers_5_0= ruleExpMember ) )* otherlv_6= '}' ) ;
    public final EObject ruleConditionalAction() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_condition_2_0 = null;

        EObject lv_ExpMembers_5_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:895:2: ( ( ( (lv_type_0_0= 'if' ) ) otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ExpMembers_5_0= ruleExpMember ) )* otherlv_6= '}' ) )
            // InternalPycom.g:896:2: ( ( (lv_type_0_0= 'if' ) ) otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ExpMembers_5_0= ruleExpMember ) )* otherlv_6= '}' )
            {
            // InternalPycom.g:896:2: ( ( (lv_type_0_0= 'if' ) ) otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ExpMembers_5_0= ruleExpMember ) )* otherlv_6= '}' )
            // InternalPycom.g:897:3: ( (lv_type_0_0= 'if' ) ) otherlv_1= '(' ( (lv_condition_2_0= ruleCondition ) ) otherlv_3= ')' otherlv_4= '{' ( (lv_ExpMembers_5_0= ruleExpMember ) )* otherlv_6= '}'
            {
            // InternalPycom.g:897:3: ( (lv_type_0_0= 'if' ) )
            // InternalPycom.g:898:4: (lv_type_0_0= 'if' )
            {
            // InternalPycom.g:898:4: (lv_type_0_0= 'if' )
            // InternalPycom.g:899:5: lv_type_0_0= 'if'
            {
            lv_type_0_0=(Token)match(input,23,FOLLOW_10); 

            					newLeafNode(lv_type_0_0, grammarAccess.getConditionalActionAccess().getTypeIfKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionalActionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "if");
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalActionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPycom.g:915:3: ( (lv_condition_2_0= ruleCondition ) )
            // InternalPycom.g:916:4: (lv_condition_2_0= ruleCondition )
            {
            // InternalPycom.g:916:4: (lv_condition_2_0= ruleCondition )
            // InternalPycom.g:917:5: lv_condition_2_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getConditionalActionAccess().getConditionConditionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
            lv_condition_2_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalActionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"xtext.Pycom.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getConditionalActionAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_4, grammarAccess.getConditionalActionAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalPycom.g:942:3: ( (lv_ExpMembers_5_0= ruleExpMember ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPycom.g:943:4: (lv_ExpMembers_5_0= ruleExpMember )
            	    {
            	    // InternalPycom.g:943:4: (lv_ExpMembers_5_0= ruleExpMember )
            	    // InternalPycom.g:944:5: lv_ExpMembers_5_0= ruleExpMember
            	    {

            	    					newCompositeNode(grammarAccess.getConditionalActionAccess().getExpMembersExpMemberParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_ExpMembers_5_0=ruleExpMember();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConditionalActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"ExpMembers",
            	    						lv_ExpMembers_5_0,
            	    						"xtext.Pycom.ExpMember");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getConditionalActionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleConditionalAction"


    // $ANTLR start "entryRuleExpMember"
    // InternalPycom.g:969:1: entryRuleExpMember returns [EObject current=null] : iv_ruleExpMember= ruleExpMember EOF ;
    public final EObject entryRuleExpMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpMember = null;


        try {
            // InternalPycom.g:969:50: (iv_ruleExpMember= ruleExpMember EOF )
            // InternalPycom.g:970:2: iv_ruleExpMember= ruleExpMember EOF
            {
             newCompositeNode(grammarAccess.getExpMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpMember=ruleExpMember();

            state._fsp--;

             current =iv_ruleExpMember; 
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
    // $ANTLR end "entryRuleExpMember"


    // $ANTLR start "ruleExpMember"
    // InternalPycom.g:976:1: ruleExpMember returns [EObject current=null] : (this_Function_0= ruleFunction | this_ConditionalAction_1= ruleConditionalAction ) ;
    public final EObject ruleExpMember() throws RecognitionException {
        EObject current = null;

        EObject this_Function_0 = null;

        EObject this_ConditionalAction_1 = null;



        	enterRule();

        try {
            // InternalPycom.g:982:2: ( (this_Function_0= ruleFunction | this_ConditionalAction_1= ruleConditionalAction ) )
            // InternalPycom.g:983:2: (this_Function_0= ruleFunction | this_ConditionalAction_1= ruleConditionalAction )
            {
            // InternalPycom.g:983:2: (this_Function_0= ruleFunction | this_ConditionalAction_1= ruleConditionalAction )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==23) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalPycom.g:984:3: this_Function_0= ruleFunction
                    {

                    			newCompositeNode(grammarAccess.getExpMemberAccess().getFunctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Function_0=ruleFunction();

                    state._fsp--;


                    			current = this_Function_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPycom.g:993:3: this_ConditionalAction_1= ruleConditionalAction
                    {

                    			newCompositeNode(grammarAccess.getExpMemberAccess().getConditionalActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConditionalAction_1=ruleConditionalAction();

                    state._fsp--;


                    			current = this_ConditionalAction_1;
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
    // $ANTLR end "ruleExpMember"


    // $ANTLR start "entryRuleSensor"
    // InternalPycom.g:1005:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalPycom.g:1005:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalPycom.g:1006:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalPycom.g:1012:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_typeName_1_0= ruleModuleType ) ) otherlv_2= ':' ( (lv_sensorName_3_0= ruleModuleName ) ) (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )? ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_sensorName_3_0 = null;

        EObject lv_pins_5_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:1018:2: ( (otherlv_0= 'Sensor' ( (lv_typeName_1_0= ruleModuleType ) ) otherlv_2= ':' ( (lv_sensorName_3_0= ruleModuleName ) ) (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )? ) )
            // InternalPycom.g:1019:2: (otherlv_0= 'Sensor' ( (lv_typeName_1_0= ruleModuleType ) ) otherlv_2= ':' ( (lv_sensorName_3_0= ruleModuleName ) ) (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )? )
            {
            // InternalPycom.g:1019:2: (otherlv_0= 'Sensor' ( (lv_typeName_1_0= ruleModuleType ) ) otherlv_2= ':' ( (lv_sensorName_3_0= ruleModuleName ) ) (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )? )
            // InternalPycom.g:1020:3: otherlv_0= 'Sensor' ( (lv_typeName_1_0= ruleModuleType ) ) otherlv_2= ':' ( (lv_sensorName_3_0= ruleModuleName ) ) (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalPycom.g:1024:3: ( (lv_typeName_1_0= ruleModuleType ) )
            // InternalPycom.g:1025:4: (lv_typeName_1_0= ruleModuleType )
            {
            // InternalPycom.g:1025:4: (lv_typeName_1_0= ruleModuleType )
            // InternalPycom.g:1026:5: lv_typeName_1_0= ruleModuleType
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getTypeNameModuleTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_typeName_1_0=ruleModuleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_1_0,
            						"xtext.Pycom.ModuleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getColonKeyword_2());
            		
            // InternalPycom.g:1047:3: ( (lv_sensorName_3_0= ruleModuleName ) )
            // InternalPycom.g:1048:4: (lv_sensorName_3_0= ruleModuleName )
            {
            // InternalPycom.g:1048:4: (lv_sensorName_3_0= ruleModuleName )
            // InternalPycom.g:1049:5: lv_sensorName_3_0= ruleModuleName
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensorNameModuleNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_sensorName_3_0=ruleModuleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"sensorName",
            						lv_sensorName_3_0,
            						"xtext.Pycom.ModuleName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPycom.g:1066:3: (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPycom.g:1067:4: otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalPycom.g:1071:4: ( (lv_pins_5_0= rulePin ) )
                    // InternalPycom.g:1072:5: (lv_pins_5_0= rulePin )
                    {
                    // InternalPycom.g:1072:5: (lv_pins_5_0= rulePin )
                    // InternalPycom.g:1073:6: lv_pins_5_0= rulePin
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getPinsPinParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_pins_5_0=rulePin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"pins",
                    							lv_pins_5_0,
                    							"xtext.Pycom.Pin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getRightParenthesisKeyword_4_2());
                    			

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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalPycom.g:1099:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalPycom.g:1099:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalPycom.g:1100:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
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
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalPycom.g:1106:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_typeName_1_0= ruleModuleType ) ) otherlv_2= ':' ( (lv_actuatorName_3_0= ruleModuleName ) ) (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )? ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_typeName_1_0 = null;

        EObject lv_actuatorName_3_0 = null;

        EObject lv_pins_5_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:1112:2: ( (otherlv_0= 'Actuator' ( (lv_typeName_1_0= ruleModuleType ) ) otherlv_2= ':' ( (lv_actuatorName_3_0= ruleModuleName ) ) (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )? ) )
            // InternalPycom.g:1113:2: (otherlv_0= 'Actuator' ( (lv_typeName_1_0= ruleModuleType ) ) otherlv_2= ':' ( (lv_actuatorName_3_0= ruleModuleName ) ) (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )? )
            {
            // InternalPycom.g:1113:2: (otherlv_0= 'Actuator' ( (lv_typeName_1_0= ruleModuleType ) ) otherlv_2= ':' ( (lv_actuatorName_3_0= ruleModuleName ) ) (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )? )
            // InternalPycom.g:1114:3: otherlv_0= 'Actuator' ( (lv_typeName_1_0= ruleModuleType ) ) otherlv_2= ':' ( (lv_actuatorName_3_0= ruleModuleName ) ) (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalPycom.g:1118:3: ( (lv_typeName_1_0= ruleModuleType ) )
            // InternalPycom.g:1119:4: (lv_typeName_1_0= ruleModuleType )
            {
            // InternalPycom.g:1119:4: (lv_typeName_1_0= ruleModuleType )
            // InternalPycom.g:1120:5: lv_typeName_1_0= ruleModuleType
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getTypeNameModuleTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_typeName_1_0=ruleModuleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"typeName",
            						lv_typeName_1_0,
            						"xtext.Pycom.ModuleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getColonKeyword_2());
            		
            // InternalPycom.g:1141:3: ( (lv_actuatorName_3_0= ruleModuleName ) )
            // InternalPycom.g:1142:4: (lv_actuatorName_3_0= ruleModuleName )
            {
            // InternalPycom.g:1142:4: (lv_actuatorName_3_0= ruleModuleName )
            // InternalPycom.g:1143:5: lv_actuatorName_3_0= ruleModuleName
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getActuatorNameModuleNameParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_actuatorName_3_0=ruleModuleName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"actuatorName",
            						lv_actuatorName_3_0,
            						"xtext.Pycom.ModuleName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPycom.g:1160:3: (otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalPycom.g:1161:4: otherlv_4= '(' ( (lv_pins_5_0= rulePin ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getLeftParenthesisKeyword_4_0());
                    			
                    // InternalPycom.g:1165:4: ( (lv_pins_5_0= rulePin ) )
                    // InternalPycom.g:1166:5: (lv_pins_5_0= rulePin )
                    {
                    // InternalPycom.g:1166:5: (lv_pins_5_0= rulePin )
                    // InternalPycom.g:1167:6: lv_pins_5_0= rulePin
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getPinsPinParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_pins_5_0=rulePin();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"pins",
                    							lv_pins_5_0,
                    							"xtext.Pycom.Pin");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getRightParenthesisKeyword_4_2());
                    			

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
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleModuleType"
    // InternalPycom.g:1193:1: entryRuleModuleType returns [EObject current=null] : iv_ruleModuleType= ruleModuleType EOF ;
    public final EObject entryRuleModuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleType = null;


        try {
            // InternalPycom.g:1193:51: (iv_ruleModuleType= ruleModuleType EOF )
            // InternalPycom.g:1194:2: iv_ruleModuleType= ruleModuleType EOF
            {
             newCompositeNode(grammarAccess.getModuleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleType=ruleModuleType();

            state._fsp--;

             current =iv_ruleModuleType; 
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
    // $ANTLR end "entryRuleModuleType"


    // $ANTLR start "ruleModuleType"
    // InternalPycom.g:1200:1: ruleModuleType returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleModuleType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPycom.g:1206:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPycom.g:1207:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPycom.g:1207:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPycom.g:1208:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPycom.g:1208:3: (lv_name_0_0= RULE_ID )
            // InternalPycom.g:1209:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getModuleTypeAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getModuleTypeRule());
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
    // $ANTLR end "ruleModuleType"


    // $ANTLR start "entryRuleModuleName"
    // InternalPycom.g:1228:1: entryRuleModuleName returns [EObject current=null] : iv_ruleModuleName= ruleModuleName EOF ;
    public final EObject entryRuleModuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleName = null;


        try {
            // InternalPycom.g:1228:51: (iv_ruleModuleName= ruleModuleName EOF )
            // InternalPycom.g:1229:2: iv_ruleModuleName= ruleModuleName EOF
            {
             newCompositeNode(grammarAccess.getModuleNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModuleName=ruleModuleName();

            state._fsp--;

             current =iv_ruleModuleName; 
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
    // $ANTLR end "entryRuleModuleName"


    // $ANTLR start "ruleModuleName"
    // InternalPycom.g:1235:1: ruleModuleName returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleModuleName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPycom.g:1241:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPycom.g:1242:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPycom.g:1242:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPycom.g:1243:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPycom.g:1243:3: (lv_name_0_0= RULE_ID )
            // InternalPycom.g:1244:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getModuleNameAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getModuleNameRule());
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
    // $ANTLR end "ruleModuleName"


    // $ANTLR start "entryRuleCommunication"
    // InternalPycom.g:1263:1: entryRuleCommunication returns [EObject current=null] : iv_ruleCommunication= ruleCommunication EOF ;
    public final EObject entryRuleCommunication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunication = null;


        try {
            // InternalPycom.g:1263:54: (iv_ruleCommunication= ruleCommunication EOF )
            // InternalPycom.g:1264:2: iv_ruleCommunication= ruleCommunication EOF
            {
             newCompositeNode(grammarAccess.getCommunicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunication=ruleCommunication();

            state._fsp--;

             current =iv_ruleCommunication; 
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
    // $ANTLR end "entryRuleCommunication"


    // $ANTLR start "ruleCommunication"
    // InternalPycom.g:1270:1: ruleCommunication returns [EObject current=null] : (otherlv_0= 'Communication' otherlv_1= ':' ( (lv_type_2_0= ruleCommunicationType ) ) ) ;
    public final EObject ruleCommunication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:1276:2: ( (otherlv_0= 'Communication' otherlv_1= ':' ( (lv_type_2_0= ruleCommunicationType ) ) ) )
            // InternalPycom.g:1277:2: (otherlv_0= 'Communication' otherlv_1= ':' ( (lv_type_2_0= ruleCommunicationType ) ) )
            {
            // InternalPycom.g:1277:2: (otherlv_0= 'Communication' otherlv_1= ':' ( (lv_type_2_0= ruleCommunicationType ) ) )
            // InternalPycom.g:1278:3: otherlv_0= 'Communication' otherlv_1= ':' ( (lv_type_2_0= ruleCommunicationType ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getCommunicationAccess().getCommunicationKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getCommunicationAccess().getColonKeyword_1());
            		
            // InternalPycom.g:1286:3: ( (lv_type_2_0= ruleCommunicationType ) )
            // InternalPycom.g:1287:4: (lv_type_2_0= ruleCommunicationType )
            {
            // InternalPycom.g:1287:4: (lv_type_2_0= ruleCommunicationType )
            // InternalPycom.g:1288:5: lv_type_2_0= ruleCommunicationType
            {

            					newCompositeNode(grammarAccess.getCommunicationAccess().getTypeCommunicationTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleCommunicationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCommunicationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"xtext.Pycom.CommunicationType");
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
    // $ANTLR end "ruleCommunication"


    // $ANTLR start "entryRuleCommunicationType"
    // InternalPycom.g:1309:1: entryRuleCommunicationType returns [EObject current=null] : iv_ruleCommunicationType= ruleCommunicationType EOF ;
    public final EObject entryRuleCommunicationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommunicationType = null;


        try {
            // InternalPycom.g:1309:58: (iv_ruleCommunicationType= ruleCommunicationType EOF )
            // InternalPycom.g:1310:2: iv_ruleCommunicationType= ruleCommunicationType EOF
            {
             newCompositeNode(grammarAccess.getCommunicationTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommunicationType=ruleCommunicationType();

            state._fsp--;

             current =iv_ruleCommunicationType; 
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
    // $ANTLR end "entryRuleCommunicationType"


    // $ANTLR start "ruleCommunicationType"
    // InternalPycom.g:1316:1: ruleCommunicationType returns [EObject current=null] : ( ( ( (lv_name_0_0= 'WiFi' ) ) otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ')' ) | ( (lv_name_6_0= 'Bluetooth' ) ) | ( (lv_name_7_0= 'SigFox' ) ) ) ;
    public final EObject ruleCommunicationType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_ssid_2_0=null;
        Token otherlv_3=null;
        Token lv_password_4_0=null;
        Token otherlv_5=null;
        Token lv_name_6_0=null;
        Token lv_name_7_0=null;


        	enterRule();

        try {
            // InternalPycom.g:1322:2: ( ( ( ( (lv_name_0_0= 'WiFi' ) ) otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ')' ) | ( (lv_name_6_0= 'Bluetooth' ) ) | ( (lv_name_7_0= 'SigFox' ) ) ) )
            // InternalPycom.g:1323:2: ( ( ( (lv_name_0_0= 'WiFi' ) ) otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ')' ) | ( (lv_name_6_0= 'Bluetooth' ) ) | ( (lv_name_7_0= 'SigFox' ) ) )
            {
            // InternalPycom.g:1323:2: ( ( ( (lv_name_0_0= 'WiFi' ) ) otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ')' ) | ( (lv_name_6_0= 'Bluetooth' ) ) | ( (lv_name_7_0= 'SigFox' ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt20=1;
                }
                break;
            case 29:
                {
                alt20=2;
                }
                break;
            case 30:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPycom.g:1324:3: ( ( (lv_name_0_0= 'WiFi' ) ) otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ')' )
                    {
                    // InternalPycom.g:1324:3: ( ( (lv_name_0_0= 'WiFi' ) ) otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ')' )
                    // InternalPycom.g:1325:4: ( (lv_name_0_0= 'WiFi' ) ) otherlv_1= '(' ( (lv_ssid_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_password_4_0= RULE_STRING ) ) otherlv_5= ')'
                    {
                    // InternalPycom.g:1325:4: ( (lv_name_0_0= 'WiFi' ) )
                    // InternalPycom.g:1326:5: (lv_name_0_0= 'WiFi' )
                    {
                    // InternalPycom.g:1326:5: (lv_name_0_0= 'WiFi' )
                    // InternalPycom.g:1327:6: lv_name_0_0= 'WiFi'
                    {
                    lv_name_0_0=(Token)match(input,28,FOLLOW_10); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getCommunicationTypeAccess().getNameWiFiKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommunicationTypeRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_0_0, "WiFi");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_1, grammarAccess.getCommunicationTypeAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalPycom.g:1343:4: ( (lv_ssid_2_0= RULE_STRING ) )
                    // InternalPycom.g:1344:5: (lv_ssid_2_0= RULE_STRING )
                    {
                    // InternalPycom.g:1344:5: (lv_ssid_2_0= RULE_STRING )
                    // InternalPycom.g:1345:6: lv_ssid_2_0= RULE_STRING
                    {
                    lv_ssid_2_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

                    						newLeafNode(lv_ssid_2_0, grammarAccess.getCommunicationTypeAccess().getSsidSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommunicationTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ssid",
                    							lv_ssid_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,16,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommunicationTypeAccess().getCommaKeyword_0_3());
                    			
                    // InternalPycom.g:1365:4: ( (lv_password_4_0= RULE_STRING ) )
                    // InternalPycom.g:1366:5: (lv_password_4_0= RULE_STRING )
                    {
                    // InternalPycom.g:1366:5: (lv_password_4_0= RULE_STRING )
                    // InternalPycom.g:1367:6: lv_password_4_0= RULE_STRING
                    {
                    lv_password_4_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_password_4_0, grammarAccess.getCommunicationTypeAccess().getPasswordSTRINGTerminalRuleCall_0_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommunicationTypeRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"password",
                    							lv_password_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommunicationTypeAccess().getRightParenthesisKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPycom.g:1389:3: ( (lv_name_6_0= 'Bluetooth' ) )
                    {
                    // InternalPycom.g:1389:3: ( (lv_name_6_0= 'Bluetooth' ) )
                    // InternalPycom.g:1390:4: (lv_name_6_0= 'Bluetooth' )
                    {
                    // InternalPycom.g:1390:4: (lv_name_6_0= 'Bluetooth' )
                    // InternalPycom.g:1391:5: lv_name_6_0= 'Bluetooth'
                    {
                    lv_name_6_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_name_6_0, grammarAccess.getCommunicationTypeAccess().getNameBluetoothKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCommunicationTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_6_0, "Bluetooth");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPycom.g:1404:3: ( (lv_name_7_0= 'SigFox' ) )
                    {
                    // InternalPycom.g:1404:3: ( (lv_name_7_0= 'SigFox' ) )
                    // InternalPycom.g:1405:4: (lv_name_7_0= 'SigFox' )
                    {
                    // InternalPycom.g:1405:4: (lv_name_7_0= 'SigFox' )
                    // InternalPycom.g:1406:5: lv_name_7_0= 'SigFox'
                    {
                    lv_name_7_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_name_7_0, grammarAccess.getCommunicationTypeAccess().getNameSigFoxKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getCommunicationTypeRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_7_0, "SigFox");
                    				

                    }


                    }


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
    // $ANTLR end "ruleCommunicationType"


    // $ANTLR start "entryRulePin"
    // InternalPycom.g:1422:1: entryRulePin returns [EObject current=null] : iv_rulePin= rulePin EOF ;
    public final EObject entryRulePin() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePin = null;


        try {
            // InternalPycom.g:1422:44: (iv_rulePin= rulePin EOF )
            // InternalPycom.g:1423:2: iv_rulePin= rulePin EOF
            {
             newCompositeNode(grammarAccess.getPinRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePin=rulePin();

            state._fsp--;

             current =iv_rulePin; 
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
    // $ANTLR end "entryRulePin"


    // $ANTLR start "rulePin"
    // InternalPycom.g:1429:1: rulePin returns [EObject current=null] : ( ( (lv_power_0_0= rulePinName ) ) otherlv_1= ',' ( (lv_input_2_0= rulePinName ) ) ) ;
    public final EObject rulePin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_power_0_0 = null;

        EObject lv_input_2_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:1435:2: ( ( ( (lv_power_0_0= rulePinName ) ) otherlv_1= ',' ( (lv_input_2_0= rulePinName ) ) ) )
            // InternalPycom.g:1436:2: ( ( (lv_power_0_0= rulePinName ) ) otherlv_1= ',' ( (lv_input_2_0= rulePinName ) ) )
            {
            // InternalPycom.g:1436:2: ( ( (lv_power_0_0= rulePinName ) ) otherlv_1= ',' ( (lv_input_2_0= rulePinName ) ) )
            // InternalPycom.g:1437:3: ( (lv_power_0_0= rulePinName ) ) otherlv_1= ',' ( (lv_input_2_0= rulePinName ) )
            {
            // InternalPycom.g:1437:3: ( (lv_power_0_0= rulePinName ) )
            // InternalPycom.g:1438:4: (lv_power_0_0= rulePinName )
            {
            // InternalPycom.g:1438:4: (lv_power_0_0= rulePinName )
            // InternalPycom.g:1439:5: lv_power_0_0= rulePinName
            {

            					newCompositeNode(grammarAccess.getPinAccess().getPowerPinNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
            lv_power_0_0=rulePinName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPinRule());
            					}
            					set(
            						current,
            						"power",
            						lv_power_0_0,
            						"xtext.Pycom.PinName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getPinAccess().getCommaKeyword_1());
            		
            // InternalPycom.g:1460:3: ( (lv_input_2_0= rulePinName ) )
            // InternalPycom.g:1461:4: (lv_input_2_0= rulePinName )
            {
            // InternalPycom.g:1461:4: (lv_input_2_0= rulePinName )
            // InternalPycom.g:1462:5: lv_input_2_0= rulePinName
            {

            					newCompositeNode(grammarAccess.getPinAccess().getInputPinNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_input_2_0=rulePinName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPinRule());
            					}
            					set(
            						current,
            						"input",
            						lv_input_2_0,
            						"xtext.Pycom.PinName");
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
    // $ANTLR end "rulePin"


    // $ANTLR start "entryRulePinName"
    // InternalPycom.g:1483:1: entryRulePinName returns [EObject current=null] : iv_rulePinName= rulePinName EOF ;
    public final EObject entryRulePinName() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePinName = null;


        try {
            // InternalPycom.g:1483:48: (iv_rulePinName= rulePinName EOF )
            // InternalPycom.g:1484:2: iv_rulePinName= rulePinName EOF
            {
             newCompositeNode(grammarAccess.getPinNameRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePinName=rulePinName();

            state._fsp--;

             current =iv_rulePinName; 
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
    // $ANTLR end "entryRulePinName"


    // $ANTLR start "rulePinName"
    // InternalPycom.g:1490:1: rulePinName returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject rulePinName() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPycom.g:1496:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalPycom.g:1497:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalPycom.g:1497:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalPycom.g:1498:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalPycom.g:1498:3: (lv_name_0_0= RULE_STRING )
            // InternalPycom.g:1499:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getPinNameAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPinNameRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "rulePinName"


    // $ANTLR start "entryRuleCondition"
    // InternalPycom.g:1518:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalPycom.g:1518:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalPycom.g:1519:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalPycom.g:1525:1: ruleCondition returns [EObject current=null] : ( ( (lv_logicEx_0_0= ruleLogicExp ) ) | ( ( (lv_logicEx_1_0= ruleLogicExp ) ) ( (lv_operator_2_0= '&&' ) ) ( (lv_nestedCondition_3_0= ruleCondition ) ) ) | ( ( (lv_logicEx_4_0= ruleLogicExp ) ) ( (lv_operator_5_0= '||' ) ) ( (lv_nestedCondition_6_0= ruleCondition ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_0=null;
        Token lv_operator_5_0=null;
        EObject lv_logicEx_0_0 = null;

        EObject lv_logicEx_1_0 = null;

        EObject lv_nestedCondition_3_0 = null;

        EObject lv_logicEx_4_0 = null;

        EObject lv_nestedCondition_6_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:1531:2: ( ( ( (lv_logicEx_0_0= ruleLogicExp ) ) | ( ( (lv_logicEx_1_0= ruleLogicExp ) ) ( (lv_operator_2_0= '&&' ) ) ( (lv_nestedCondition_3_0= ruleCondition ) ) ) | ( ( (lv_logicEx_4_0= ruleLogicExp ) ) ( (lv_operator_5_0= '||' ) ) ( (lv_nestedCondition_6_0= ruleCondition ) ) ) ) )
            // InternalPycom.g:1532:2: ( ( (lv_logicEx_0_0= ruleLogicExp ) ) | ( ( (lv_logicEx_1_0= ruleLogicExp ) ) ( (lv_operator_2_0= '&&' ) ) ( (lv_nestedCondition_3_0= ruleCondition ) ) ) | ( ( (lv_logicEx_4_0= ruleLogicExp ) ) ( (lv_operator_5_0= '||' ) ) ( (lv_nestedCondition_6_0= ruleCondition ) ) ) )
            {
            // InternalPycom.g:1532:2: ( ( (lv_logicEx_0_0= ruleLogicExp ) ) | ( ( (lv_logicEx_1_0= ruleLogicExp ) ) ( (lv_operator_2_0= '&&' ) ) ( (lv_nestedCondition_3_0= ruleCondition ) ) ) | ( ( (lv_logicEx_4_0= ruleLogicExp ) ) ( (lv_operator_5_0= '||' ) ) ( (lv_nestedCondition_6_0= ruleCondition ) ) ) )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalPycom.g:1533:3: ( (lv_logicEx_0_0= ruleLogicExp ) )
                    {
                    // InternalPycom.g:1533:3: ( (lv_logicEx_0_0= ruleLogicExp ) )
                    // InternalPycom.g:1534:4: (lv_logicEx_0_0= ruleLogicExp )
                    {
                    // InternalPycom.g:1534:4: (lv_logicEx_0_0= ruleLogicExp )
                    // InternalPycom.g:1535:5: lv_logicEx_0_0= ruleLogicExp
                    {

                    					newCompositeNode(grammarAccess.getConditionAccess().getLogicExLogicExpParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_logicEx_0_0=ruleLogicExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionRule());
                    					}
                    					set(
                    						current,
                    						"logicEx",
                    						lv_logicEx_0_0,
                    						"xtext.Pycom.LogicExp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPycom.g:1553:3: ( ( (lv_logicEx_1_0= ruleLogicExp ) ) ( (lv_operator_2_0= '&&' ) ) ( (lv_nestedCondition_3_0= ruleCondition ) ) )
                    {
                    // InternalPycom.g:1553:3: ( ( (lv_logicEx_1_0= ruleLogicExp ) ) ( (lv_operator_2_0= '&&' ) ) ( (lv_nestedCondition_3_0= ruleCondition ) ) )
                    // InternalPycom.g:1554:4: ( (lv_logicEx_1_0= ruleLogicExp ) ) ( (lv_operator_2_0= '&&' ) ) ( (lv_nestedCondition_3_0= ruleCondition ) )
                    {
                    // InternalPycom.g:1554:4: ( (lv_logicEx_1_0= ruleLogicExp ) )
                    // InternalPycom.g:1555:5: (lv_logicEx_1_0= ruleLogicExp )
                    {
                    // InternalPycom.g:1555:5: (lv_logicEx_1_0= ruleLogicExp )
                    // InternalPycom.g:1556:6: lv_logicEx_1_0= ruleLogicExp
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getLogicExLogicExpParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_logicEx_1_0=ruleLogicExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"logicEx",
                    							lv_logicEx_1_0,
                    							"xtext.Pycom.LogicExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPycom.g:1573:4: ( (lv_operator_2_0= '&&' ) )
                    // InternalPycom.g:1574:5: (lv_operator_2_0= '&&' )
                    {
                    // InternalPycom.g:1574:5: (lv_operator_2_0= '&&' )
                    // InternalPycom.g:1575:6: lv_operator_2_0= '&&'
                    {
                    lv_operator_2_0=(Token)match(input,31,FOLLOW_25); 

                    						newLeafNode(lv_operator_2_0, grammarAccess.getConditionAccess().getOperatorAmpersandAmpersandKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_2_0, "&&");
                    					

                    }


                    }

                    // InternalPycom.g:1587:4: ( (lv_nestedCondition_3_0= ruleCondition ) )
                    // InternalPycom.g:1588:5: (lv_nestedCondition_3_0= ruleCondition )
                    {
                    // InternalPycom.g:1588:5: (lv_nestedCondition_3_0= ruleCondition )
                    // InternalPycom.g:1589:6: lv_nestedCondition_3_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getNestedConditionConditionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_nestedCondition_3_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"nestedCondition",
                    							lv_nestedCondition_3_0,
                    							"xtext.Pycom.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPycom.g:1608:3: ( ( (lv_logicEx_4_0= ruleLogicExp ) ) ( (lv_operator_5_0= '||' ) ) ( (lv_nestedCondition_6_0= ruleCondition ) ) )
                    {
                    // InternalPycom.g:1608:3: ( ( (lv_logicEx_4_0= ruleLogicExp ) ) ( (lv_operator_5_0= '||' ) ) ( (lv_nestedCondition_6_0= ruleCondition ) ) )
                    // InternalPycom.g:1609:4: ( (lv_logicEx_4_0= ruleLogicExp ) ) ( (lv_operator_5_0= '||' ) ) ( (lv_nestedCondition_6_0= ruleCondition ) )
                    {
                    // InternalPycom.g:1609:4: ( (lv_logicEx_4_0= ruleLogicExp ) )
                    // InternalPycom.g:1610:5: (lv_logicEx_4_0= ruleLogicExp )
                    {
                    // InternalPycom.g:1610:5: (lv_logicEx_4_0= ruleLogicExp )
                    // InternalPycom.g:1611:6: lv_logicEx_4_0= ruleLogicExp
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getLogicExLogicExpParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_logicEx_4_0=ruleLogicExp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"logicEx",
                    							lv_logicEx_4_0,
                    							"xtext.Pycom.LogicExp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalPycom.g:1628:4: ( (lv_operator_5_0= '||' ) )
                    // InternalPycom.g:1629:5: (lv_operator_5_0= '||' )
                    {
                    // InternalPycom.g:1629:5: (lv_operator_5_0= '||' )
                    // InternalPycom.g:1630:6: lv_operator_5_0= '||'
                    {
                    lv_operator_5_0=(Token)match(input,32,FOLLOW_25); 

                    						newLeafNode(lv_operator_5_0, grammarAccess.getConditionAccess().getOperatorVerticalLineVerticalLineKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConditionRule());
                    						}
                    						setWithLastConsumed(current, "operator", lv_operator_5_0, "||");
                    					

                    }


                    }

                    // InternalPycom.g:1642:4: ( (lv_nestedCondition_6_0= ruleCondition ) )
                    // InternalPycom.g:1643:5: (lv_nestedCondition_6_0= ruleCondition )
                    {
                    // InternalPycom.g:1643:5: (lv_nestedCondition_6_0= ruleCondition )
                    // InternalPycom.g:1644:6: lv_nestedCondition_6_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getNestedConditionConditionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_nestedCondition_6_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"nestedCondition",
                    							lv_nestedCondition_6_0,
                    							"xtext.Pycom.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleLogicExp"
    // InternalPycom.g:1666:1: entryRuleLogicExp returns [EObject current=null] : iv_ruleLogicExp= ruleLogicExp EOF ;
    public final EObject entryRuleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicExp = null;


        try {
            // InternalPycom.g:1666:49: (iv_ruleLogicExp= ruleLogicExp EOF )
            // InternalPycom.g:1667:2: iv_ruleLogicExp= ruleLogicExp EOF
            {
             newCompositeNode(grammarAccess.getLogicExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicExp=ruleLogicExp();

            state._fsp--;

             current =iv_ruleLogicExp; 
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
    // $ANTLR end "entryRuleLogicExp"


    // $ANTLR start "ruleLogicExp"
    // InternalPycom.g:1673:1: ruleLogicExp returns [EObject current=null] : ( ( (lv_boolVal_0_0= ruleBoolean ) ) | ( (lv_compExp_1_0= ruleComparisonExp ) ) ) ;
    public final EObject ruleLogicExp() throws RecognitionException {
        EObject current = null;

        EObject lv_boolVal_0_0 = null;

        EObject lv_compExp_1_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:1679:2: ( ( ( (lv_boolVal_0_0= ruleBoolean ) ) | ( (lv_compExp_1_0= ruleComparisonExp ) ) ) )
            // InternalPycom.g:1680:2: ( ( (lv_boolVal_0_0= ruleBoolean ) ) | ( (lv_compExp_1_0= ruleComparisonExp ) ) )
            {
            // InternalPycom.g:1680:2: ( ( (lv_boolVal_0_0= ruleBoolean ) ) | ( (lv_compExp_1_0= ruleComparisonExp ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=33 && LA22_0<=34)) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ID||LA22_0==RULE_INT) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalPycom.g:1681:3: ( (lv_boolVal_0_0= ruleBoolean ) )
                    {
                    // InternalPycom.g:1681:3: ( (lv_boolVal_0_0= ruleBoolean ) )
                    // InternalPycom.g:1682:4: (lv_boolVal_0_0= ruleBoolean )
                    {
                    // InternalPycom.g:1682:4: (lv_boolVal_0_0= ruleBoolean )
                    // InternalPycom.g:1683:5: lv_boolVal_0_0= ruleBoolean
                    {

                    					newCompositeNode(grammarAccess.getLogicExpAccess().getBoolValBooleanParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_boolVal_0_0=ruleBoolean();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLogicExpRule());
                    					}
                    					set(
                    						current,
                    						"boolVal",
                    						lv_boolVal_0_0,
                    						"xtext.Pycom.Boolean");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPycom.g:1701:3: ( (lv_compExp_1_0= ruleComparisonExp ) )
                    {
                    // InternalPycom.g:1701:3: ( (lv_compExp_1_0= ruleComparisonExp ) )
                    // InternalPycom.g:1702:4: (lv_compExp_1_0= ruleComparisonExp )
                    {
                    // InternalPycom.g:1702:4: (lv_compExp_1_0= ruleComparisonExp )
                    // InternalPycom.g:1703:5: lv_compExp_1_0= ruleComparisonExp
                    {

                    					newCompositeNode(grammarAccess.getLogicExpAccess().getCompExpComparisonExpParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_compExp_1_0=ruleComparisonExp();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLogicExpRule());
                    					}
                    					set(
                    						current,
                    						"compExp",
                    						lv_compExp_1_0,
                    						"xtext.Pycom.ComparisonExp");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleLogicExp"


    // $ANTLR start "entryRuleBoolean"
    // InternalPycom.g:1724:1: entryRuleBoolean returns [EObject current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final EObject entryRuleBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoolean = null;


        try {
            // InternalPycom.g:1724:48: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalPycom.g:1725:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean; 
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
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalPycom.g:1731:1: ruleBoolean returns [EObject current=null] : ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) ;
    public final EObject ruleBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPycom.g:1737:2: ( ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) ) )
            // InternalPycom.g:1738:2: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            {
            // InternalPycom.g:1738:2: ( ( (lv_value_0_0= 'true' ) ) | ( (lv_value_1_0= 'false' ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            else if ( (LA23_0==34) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPycom.g:1739:3: ( (lv_value_0_0= 'true' ) )
                    {
                    // InternalPycom.g:1739:3: ( (lv_value_0_0= 'true' ) )
                    // InternalPycom.g:1740:4: (lv_value_0_0= 'true' )
                    {
                    // InternalPycom.g:1740:4: (lv_value_0_0= 'true' )
                    // InternalPycom.g:1741:5: lv_value_0_0= 'true'
                    {
                    lv_value_0_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_value_0_0, grammarAccess.getBooleanAccess().getValueTrueKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPycom.g:1754:3: ( (lv_value_1_0= 'false' ) )
                    {
                    // InternalPycom.g:1754:3: ( (lv_value_1_0= 'false' ) )
                    // InternalPycom.g:1755:4: (lv_value_1_0= 'false' )
                    {
                    // InternalPycom.g:1755:4: (lv_value_1_0= 'false' )
                    // InternalPycom.g:1756:5: lv_value_1_0= 'false'
                    {
                    lv_value_1_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getBooleanAccess().getValueFalseKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_1_0, "false");
                    				

                    }


                    }


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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleComparisonExp"
    // InternalPycom.g:1772:1: entryRuleComparisonExp returns [EObject current=null] : iv_ruleComparisonExp= ruleComparisonExp EOF ;
    public final EObject entryRuleComparisonExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonExp = null;


        try {
            // InternalPycom.g:1772:54: (iv_ruleComparisonExp= ruleComparisonExp EOF )
            // InternalPycom.g:1773:2: iv_ruleComparisonExp= ruleComparisonExp EOF
            {
             newCompositeNode(grammarAccess.getComparisonExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonExp=ruleComparisonExp();

            state._fsp--;

             current =iv_ruleComparisonExp; 
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
    // $ANTLR end "entryRuleComparisonExp"


    // $ANTLR start "ruleComparisonExp"
    // InternalPycom.g:1779:1: ruleComparisonExp returns [EObject current=null] : ( ( (lv_left_0_0= ruleExpression ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) ) ) ;
    public final EObject ruleComparisonExp() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:1785:2: ( ( ( (lv_left_0_0= ruleExpression ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) ) ) )
            // InternalPycom.g:1786:2: ( ( (lv_left_0_0= ruleExpression ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) ) )
            {
            // InternalPycom.g:1786:2: ( ( (lv_left_0_0= ruleExpression ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) ) )
            // InternalPycom.g:1787:3: ( (lv_left_0_0= ruleExpression ) ) ( (lv_op_1_0= ruleOperator ) ) ( (lv_right_2_0= ruleExpression ) )
            {
            // InternalPycom.g:1787:3: ( (lv_left_0_0= ruleExpression ) )
            // InternalPycom.g:1788:4: (lv_left_0_0= ruleExpression )
            {
            // InternalPycom.g:1788:4: (lv_left_0_0= ruleExpression )
            // InternalPycom.g:1789:5: lv_left_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getComparisonExpAccess().getLeftExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
            lv_left_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonExpRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"xtext.Pycom.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPycom.g:1806:3: ( (lv_op_1_0= ruleOperator ) )
            // InternalPycom.g:1807:4: (lv_op_1_0= ruleOperator )
            {
            // InternalPycom.g:1807:4: (lv_op_1_0= ruleOperator )
            // InternalPycom.g:1808:5: lv_op_1_0= ruleOperator
            {

            					newCompositeNode(grammarAccess.getComparisonExpAccess().getOpOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_op_1_0=ruleOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonExpRule());
            					}
            					set(
            						current,
            						"op",
            						lv_op_1_0,
            						"xtext.Pycom.Operator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPycom.g:1825:3: ( (lv_right_2_0= ruleExpression ) )
            // InternalPycom.g:1826:4: (lv_right_2_0= ruleExpression )
            {
            // InternalPycom.g:1826:4: (lv_right_2_0= ruleExpression )
            // InternalPycom.g:1827:5: lv_right_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getComparisonExpAccess().getRightExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComparisonExpRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"xtext.Pycom.Expression");
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
    // $ANTLR end "ruleComparisonExp"


    // $ANTLR start "entryRuleExpression"
    // InternalPycom.g:1848:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPycom.g:1848:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPycom.g:1849:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalPycom.g:1855:1: ruleExpression returns [EObject current=null] : ( ( (lv_outputValue_0_0= RULE_INT ) ) | ( (lv_outputfunction_1_0= ruleFunction ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token lv_outputValue_0_0=null;
        EObject lv_outputfunction_1_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:1861:2: ( ( ( (lv_outputValue_0_0= RULE_INT ) ) | ( (lv_outputfunction_1_0= ruleFunction ) ) ) )
            // InternalPycom.g:1862:2: ( ( (lv_outputValue_0_0= RULE_INT ) ) | ( (lv_outputfunction_1_0= ruleFunction ) ) )
            {
            // InternalPycom.g:1862:2: ( ( (lv_outputValue_0_0= RULE_INT ) ) | ( (lv_outputfunction_1_0= ruleFunction ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            else if ( (LA24_0==RULE_ID) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalPycom.g:1863:3: ( (lv_outputValue_0_0= RULE_INT ) )
                    {
                    // InternalPycom.g:1863:3: ( (lv_outputValue_0_0= RULE_INT ) )
                    // InternalPycom.g:1864:4: (lv_outputValue_0_0= RULE_INT )
                    {
                    // InternalPycom.g:1864:4: (lv_outputValue_0_0= RULE_INT )
                    // InternalPycom.g:1865:5: lv_outputValue_0_0= RULE_INT
                    {
                    lv_outputValue_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_outputValue_0_0, grammarAccess.getExpressionAccess().getOutputValueINTTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExpressionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"outputValue",
                    						lv_outputValue_0_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPycom.g:1882:3: ( (lv_outputfunction_1_0= ruleFunction ) )
                    {
                    // InternalPycom.g:1882:3: ( (lv_outputfunction_1_0= ruleFunction ) )
                    // InternalPycom.g:1883:4: (lv_outputfunction_1_0= ruleFunction )
                    {
                    // InternalPycom.g:1883:4: (lv_outputfunction_1_0= ruleFunction )
                    // InternalPycom.g:1884:5: lv_outputfunction_1_0= ruleFunction
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getOutputfunctionFunctionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_outputfunction_1_0=ruleFunction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"outputfunction",
                    						lv_outputfunction_1_0,
                    						"xtext.Pycom.Function");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOperator"
    // InternalPycom.g:1905:1: entryRuleOperator returns [String current=null] : iv_ruleOperator= ruleOperator EOF ;
    public final String entryRuleOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOperator = null;


        try {
            // InternalPycom.g:1905:48: (iv_ruleOperator= ruleOperator EOF )
            // InternalPycom.g:1906:2: iv_ruleOperator= ruleOperator EOF
            {
             newCompositeNode(grammarAccess.getOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperator=ruleOperator();

            state._fsp--;

             current =iv_ruleOperator.getText(); 
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
    // $ANTLR end "entryRuleOperator"


    // $ANTLR start "ruleOperator"
    // InternalPycom.g:1912:1: ruleOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPycom.g:1918:2: ( (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' | kw= '!=' ) )
            // InternalPycom.g:1919:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' | kw= '!=' )
            {
            // InternalPycom.g:1919:2: (kw= '<' | kw= '<=' | kw= '==' | kw= '>=' | kw= '>' | kw= '!=' )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt25=1;
                }
                break;
            case 36:
                {
                alt25=2;
                }
                break;
            case 37:
                {
                alt25=3;
                }
                break;
            case 38:
                {
                alt25=4;
                }
                break;
            case 39:
                {
                alt25=5;
                }
                break;
            case 40:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalPycom.g:1920:3: kw= '<'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPycom.g:1926:3: kw= '<='
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getLessThanSignEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPycom.g:1932:3: kw= '=='
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getEqualsSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPycom.g:1938:3: kw= '>='
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPycom.g:1944:3: kw= '>'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPycom.g:1950:3: kw= '!='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOperatorAccess().getExclamationMarkEqualsSignKeyword_5());
                    		

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "entryRuleFunction"
    // InternalPycom.g:1959:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalPycom.g:1959:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalPycom.g:1960:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalPycom.g:1966:1: ruleFunction returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_pins_4_0= rulePin ) )? otherlv_5= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_pins_4_0 = null;



        	enterRule();

        try {
            // InternalPycom.g:1972:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_pins_4_0= rulePin ) )? otherlv_5= ')' ) )
            // InternalPycom.g:1973:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_pins_4_0= rulePin ) )? otherlv_5= ')' )
            {
            // InternalPycom.g:1973:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_pins_4_0= rulePin ) )? otherlv_5= ')' )
            // InternalPycom.g:1974:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (otherlv_2= RULE_ID ) ) otherlv_3= '(' ( (lv_pins_4_0= rulePin ) )? otherlv_5= ')'
            {
            // InternalPycom.g:1974:3: ( (otherlv_0= RULE_ID ) )
            // InternalPycom.g:1975:4: (otherlv_0= RULE_ID )
            {
            // InternalPycom.g:1975:4: (otherlv_0= RULE_ID )
            // InternalPycom.g:1976:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getBoardBoardCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFullStopKeyword_1());
            		
            // InternalPycom.g:1991:3: ( (otherlv_2= RULE_ID ) )
            // InternalPycom.g:1992:4: (otherlv_2= RULE_ID )
            {
            // InternalPycom.g:1992:4: (otherlv_2= RULE_ID )
            // InternalPycom.g:1993:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFunctionRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getFunctionNameImportCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_33); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3());
            		
            // InternalPycom.g:2008:3: ( (lv_pins_4_0= rulePin ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalPycom.g:2009:4: (lv_pins_4_0= rulePin )
                    {
                    // InternalPycom.g:2009:4: (lv_pins_4_0= rulePin )
                    // InternalPycom.g:2010:5: lv_pins_4_0= rulePin
                    {

                    					newCompositeNode(grammarAccess.getFunctionAccess().getPinsPinParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_pins_4_0=rulePin();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFunctionRule());
                    					}
                    					add(
                    						current,
                    						"pins",
                    						lv_pins_4_0,
                    						"xtext.Pycom.Pin");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleFunction"

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\1\uffff\2\6\14\uffff\1\6\12\uffff\1\6\3\uffff";
    static final String dfa_3s = "\1\4\2\21\1\43\1\24\3\uffff\7\4\1\21\1\24\1\17\1\4\1\5\1\17\1\20\1\43\2\5\1\20\2\21\1\5\1\21";
    static final String dfa_4s = "\1\42\2\40\1\50\1\24\3\uffff\6\6\1\4\1\40\1\24\1\17\1\4\1\21\1\17\1\20\1\50\1\21\1\5\1\20\1\40\1\21\1\5\1\21";
    static final String dfa_5s = "\5\uffff\1\2\1\1\1\3\26\uffff";
    static final String dfa_6s = "\36\uffff}>";
    static final String[] dfa_7s = {
            "\1\4\1\uffff\1\3\32\uffff\1\1\1\2",
            "\1\6\15\uffff\1\5\1\7",
            "\1\6\15\uffff\1\5\1\7",
            "\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\16",
            "",
            "",
            "",
            "\1\20\1\uffff\1\17",
            "\1\20\1\uffff\1\17",
            "\1\20\1\uffff\1\17",
            "\1\20\1\uffff\1\17",
            "\1\20\1\uffff\1\17",
            "\1\20\1\uffff\1\17",
            "\1\21",
            "\1\6\15\uffff\1\5\1\7",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25\13\uffff\1\26",
            "\1\27",
            "\1\30",
            "\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\31\13\uffff\1\32",
            "\1\33",
            "\1\34",
            "\1\6\15\uffff\1\5\1\7",
            "\1\26",
            "\1\35",
            "\1\32"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1532:2: ( ( (lv_logicEx_0_0= ruleLogicExp ) ) | ( ( (lv_logicEx_1_0= ruleLogicExp ) ) ( (lv_operator_2_0= '&&' ) ) ( (lv_nestedCondition_3_0= ruleCondition ) ) ) | ( ( (lv_logicEx_4_0= ruleLogicExp ) ) ( (lv_operator_5_0= '||' ) ) ( (lv_nestedCondition_6_0= ruleCondition ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000284802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000284002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000802000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000011010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000D002000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000600000050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600802050L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000001F800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000020020L});

}