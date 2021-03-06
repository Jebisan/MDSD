/*
 * generated by Xtext 2.16.0
 */
package xtext.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import xtext.pycom.PycomPackage.Literals
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import xtext.pycom.ModuleType
import xtext.pycom.Library
import xtext.pycom.Board
import xtext.pycom.Function
import xtext.pycom.Import
import org.eclipse.emf.common.util.EList
import java.util.ArrayList

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class PycomScopeProvider extends AbstractPycomScopeProvider {

	override getScope(EObject context, EReference reference) {
		//Scope rule for server-functions to access library functions
		if(context instanceof Function && reference == Literals.FUNCTION__FUNCTION_NAME) {
			val board = (context as Function).board
			var candidates = new ArrayList<Import>()
			for (library : board.library) {
				for (import : library.imports) {
					candidates.add(import)
				}
			}		
			return Scopes.scopeFor(candidates);
		}
		
	return super.getScope(context, reference)
	}
}
