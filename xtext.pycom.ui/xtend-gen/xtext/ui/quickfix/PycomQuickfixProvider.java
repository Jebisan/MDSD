/**
 * generated by Xtext 2.16.0
 */
package xtext.ui.quickfix;

import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import xtext.validation.PycomValidator;

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
@SuppressWarnings("all")
public class PycomQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(PycomValidator.INVALID_TYPENAME)
  public void capitalizeName(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      final String firstLetter = xtextDocument.get((issue.getOffset()).intValue(), 1);
      xtextDocument.replace((issue.getOffset()).intValue(), 1, firstLetter.toUpperCase());
    };
    acceptor.accept(issue, "Capitalize name", "Capitalize the name.", "upcase.png", _function);
  }
  
  @Fix(PycomValidator.INVALID_NAME)
  public void uncapitalizeName(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      final String firstLetter = xtextDocument.get((issue.getOffset()).intValue(), 1);
      xtextDocument.replace((issue.getOffset()).intValue(), 1, firstLetter.toLowerCase());
    };
    acceptor.accept(issue, "Uncapitalize name", "Uncapitalize the name.", "lowcase.png", _function);
  }
  
  @Fix(PycomValidator.INVALID_PORTNUMBER)
  public void validPortnumber(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      context.getXtextDocument().replace((issue.getOffset()).intValue(), (issue.getLength()).intValue(), "5000");
    };
    acceptor.accept(issue, "Use port 5000", "Use port 5000.", "", _function);
  }
  
  @Fix(PycomValidator.INVALID_RATE)
  public void validRate(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      xtextDocument.replace((issue.getOffset()).intValue(), 1, "1");
    };
    acceptor.accept(issue, "Set rate to every second", "The rate should be larger than 0 seconds.", "", _function);
    final IModification _function_1 = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      xtextDocument.replace((issue.getOffset()).intValue(), 1, "60");
    };
    acceptor.accept(issue, "Set rate to every minute", "The rate should be larger than 0 seconds.", "", _function_1);
    final IModification _function_2 = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      xtextDocument.replace((issue.getOffset()).intValue(), 1, "3600");
    };
    acceptor.accept(issue, "Set rate to every hour", "The rate should be larger than 0 seconds.", "", _function_2);
  }
}