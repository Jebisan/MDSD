/**
 * generated by Xtext 2.16.0
 */
package xtext.pycom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xtext.pycom.CommunicationType#getName <em>Name</em>}</li>
 *   <li>{@link xtext.pycom.CommunicationType#getSsid <em>Ssid</em>}</li>
 *   <li>{@link xtext.pycom.CommunicationType#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see xtext.pycom.PycomPackage#getCommunicationType()
 * @model
 * @generated
 */
public interface CommunicationType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see xtext.pycom.PycomPackage#getCommunicationType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link xtext.pycom.CommunicationType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ssid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ssid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ssid</em>' attribute.
   * @see #setSsid(String)
   * @see xtext.pycom.PycomPackage#getCommunicationType_Ssid()
   * @model
   * @generated
   */
  String getSsid();

  /**
   * Sets the value of the '{@link xtext.pycom.CommunicationType#getSsid <em>Ssid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ssid</em>' attribute.
   * @see #getSsid()
   * @generated
   */
  void setSsid(String value);

  /**
   * Returns the value of the '<em><b>Password</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Password</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Password</em>' attribute.
   * @see #setPassword(String)
   * @see xtext.pycom.PycomPackage#getCommunicationType_Password()
   * @model
   * @generated
   */
  String getPassword();

  /**
   * Sets the value of the '{@link xtext.pycom.CommunicationType#getPassword <em>Password</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Password</em>' attribute.
   * @see #getPassword()
   * @generated
   */
  void setPassword(String value);

} // CommunicationType