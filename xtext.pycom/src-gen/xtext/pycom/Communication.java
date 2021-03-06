/**
 * generated by Xtext 2.16.0
 */
package xtext.pycom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.pycom.Communication#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see xtext.pycom.PycomPackage#getCommunication()
 * @model
 * @generated
 */
public interface Communication extends BoardMember
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(CommunicationType)
   * @see xtext.pycom.PycomPackage#getCommunication_Type()
   * @model containment="true"
   * @generated
   */
  CommunicationType getType();

  /**
   * Sets the value of the '{@link xtext.pycom.Communication#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(CommunicationType value);

} // Communication
