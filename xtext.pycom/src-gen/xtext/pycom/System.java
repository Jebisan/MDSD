/**
 * generated by Xtext 2.16.0
 */
package xtext.pycom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.pycom.System#getLibraries <em>Libraries</em>}</li>
 *   <li>{@link xtext.pycom.System#getImports <em>Imports</em>}</li>
 *   <li>{@link xtext.pycom.System#getBoards <em>Boards</em>}</li>
 *   <li>{@link xtext.pycom.System#getServers <em>Servers</em>}</li>
 * </ul>
 *
 * @see xtext.pycom.PycomPackage#getSystem()
 * @model
 * @generated
 */
public interface System extends EObject
{
  /**
   * Returns the value of the '<em><b>Libraries</b></em>' containment reference list.
   * The list contents are of type {@link xtext.pycom.Library}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Libraries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Libraries</em>' containment reference list.
   * @see xtext.pycom.PycomPackage#getSystem_Libraries()
   * @model containment="true"
   * @generated
   */
  EList<Library> getLibraries();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link xtext.pycom.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see xtext.pycom.PycomPackage#getSystem_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Boards</b></em>' containment reference list.
   * The list contents are of type {@link xtext.pycom.Board}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boards</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boards</em>' containment reference list.
   * @see xtext.pycom.PycomPackage#getSystem_Boards()
   * @model containment="true"
   * @generated
   */
  EList<Board> getBoards();

  /**
   * Returns the value of the '<em><b>Servers</b></em>' containment reference list.
   * The list contents are of type {@link xtext.pycom.Server}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Servers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Servers</em>' containment reference list.
   * @see xtext.pycom.PycomPackage#getSystem_Servers()
   * @model containment="true"
   * @generated
   */
  EList<Server> getServers();

} // System
