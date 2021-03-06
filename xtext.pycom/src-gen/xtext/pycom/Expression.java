/**
 * generated by Xtext 2.16.0
 */
package xtext.pycom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.pycom.Expression#getOutputValue <em>Output Value</em>}</li>
 *   <li>{@link xtext.pycom.Expression#getOutputfunction <em>Outputfunction</em>}</li>
 * </ul>
 *
 * @see xtext.pycom.PycomPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Output Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Value</em>' attribute.
   * @see #setOutputValue(int)
   * @see xtext.pycom.PycomPackage#getExpression_OutputValue()
   * @model
   * @generated
   */
  int getOutputValue();

  /**
   * Sets the value of the '{@link xtext.pycom.Expression#getOutputValue <em>Output Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Value</em>' attribute.
   * @see #getOutputValue()
   * @generated
   */
  void setOutputValue(int value);

  /**
   * Returns the value of the '<em><b>Outputfunction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Outputfunction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputfunction</em>' containment reference.
   * @see #setOutputfunction(Function)
   * @see xtext.pycom.PycomPackage#getExpression_Outputfunction()
   * @model containment="true"
   * @generated
   */
  Function getOutputfunction();

  /**
   * Sets the value of the '{@link xtext.pycom.Expression#getOutputfunction <em>Outputfunction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Outputfunction</em>' containment reference.
   * @see #getOutputfunction()
   * @generated
   */
  void setOutputfunction(Function value);

} // Expression
