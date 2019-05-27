/*
 * generated by Xtext 2.16.0
 */
package xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import xtext.parser.antlr.internal.InternalPycomParser;
import xtext.services.PycomGrammarAccess;

public class PycomParser extends AbstractAntlrParser {

	@Inject
	private PycomGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPycomParser createParser(XtextTokenStream stream) {
		return new InternalPycomParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "System";
	}

	public PycomGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PycomGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
