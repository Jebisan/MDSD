/**
 * generated by Xtext 2.16.0
 */
package xtext.pycom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import xtext.pycom.Board;
import xtext.pycom.Function;
import xtext.pycom.Import;
import xtext.pycom.Pin;
import xtext.pycom.PycomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xtext.pycom.impl.FunctionImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link xtext.pycom.impl.FunctionImpl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link xtext.pycom.impl.FunctionImpl#getPins <em>Pins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends ExpMemberImpl implements Function
{
  /**
   * The cached value of the '{@link #getBoard() <em>Board</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoard()
   * @generated
   * @ordered
   */
  protected Board board;

  /**
   * The cached value of the '{@link #getFunctionName() <em>Function Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionName()
   * @generated
   * @ordered
   */
  protected Import functionName;

  /**
   * The cached value of the '{@link #getPins() <em>Pins</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPins()
   * @generated
   * @ordered
   */
  protected EList<Pin> pins;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PycomPackage.Literals.FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Board getBoard()
  {
    if (board != null && board.eIsProxy())
    {
      InternalEObject oldBoard = (InternalEObject)board;
      board = (Board)eResolveProxy(oldBoard);
      if (board != oldBoard)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PycomPackage.FUNCTION__BOARD, oldBoard, board));
      }
    }
    return board;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Board basicGetBoard()
  {
    return board;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoard(Board newBoard)
  {
    Board oldBoard = board;
    board = newBoard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PycomPackage.FUNCTION__BOARD, oldBoard, board));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import getFunctionName()
  {
    if (functionName != null && functionName.eIsProxy())
    {
      InternalEObject oldFunctionName = (InternalEObject)functionName;
      functionName = (Import)eResolveProxy(oldFunctionName);
      if (functionName != oldFunctionName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PycomPackage.FUNCTION__FUNCTION_NAME, oldFunctionName, functionName));
      }
    }
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import basicGetFunctionName()
  {
    return functionName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFunctionName(Import newFunctionName)
  {
    Import oldFunctionName = functionName;
    functionName = newFunctionName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PycomPackage.FUNCTION__FUNCTION_NAME, oldFunctionName, functionName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Pin> getPins()
  {
    if (pins == null)
    {
      pins = new EObjectContainmentEList<Pin>(Pin.class, this, PycomPackage.FUNCTION__PINS);
    }
    return pins;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PycomPackage.FUNCTION__PINS:
        return ((InternalEList<?>)getPins()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PycomPackage.FUNCTION__BOARD:
        if (resolve) return getBoard();
        return basicGetBoard();
      case PycomPackage.FUNCTION__FUNCTION_NAME:
        if (resolve) return getFunctionName();
        return basicGetFunctionName();
      case PycomPackage.FUNCTION__PINS:
        return getPins();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PycomPackage.FUNCTION__BOARD:
        setBoard((Board)newValue);
        return;
      case PycomPackage.FUNCTION__FUNCTION_NAME:
        setFunctionName((Import)newValue);
        return;
      case PycomPackage.FUNCTION__PINS:
        getPins().clear();
        getPins().addAll((Collection<? extends Pin>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PycomPackage.FUNCTION__BOARD:
        setBoard((Board)null);
        return;
      case PycomPackage.FUNCTION__FUNCTION_NAME:
        setFunctionName((Import)null);
        return;
      case PycomPackage.FUNCTION__PINS:
        getPins().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PycomPackage.FUNCTION__BOARD:
        return board != null;
      case PycomPackage.FUNCTION__FUNCTION_NAME:
        return functionName != null;
      case PycomPackage.FUNCTION__PINS:
        return pins != null && !pins.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FunctionImpl
