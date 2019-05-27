/**
 * generated by Xtext 2.16.0
 */
package xtext.pycom.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import xtext.pycom.Actuator;
import xtext.pycom.Board;
import xtext.pycom.BoardMember;
import xtext.pycom.Communication;
import xtext.pycom.CommunicationType;
import xtext.pycom.ComparisonExp;
import xtext.pycom.Condition;
import xtext.pycom.ConditionalAction;
import xtext.pycom.Connection;
import xtext.pycom.ExpMember;
import xtext.pycom.Expression;
import xtext.pycom.Function;
import xtext.pycom.Host;
import xtext.pycom.Import;
import xtext.pycom.Library;
import xtext.pycom.LogicExp;
import xtext.pycom.ModuleName;
import xtext.pycom.ModuleType;
import xtext.pycom.ParameterType;
import xtext.pycom.Pin;
import xtext.pycom.PinName;
import xtext.pycom.PycomFactory;
import xtext.pycom.PycomPackage;
import xtext.pycom.Sensor;
import xtext.pycom.Server;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PycomFactoryImpl extends EFactoryImpl implements PycomFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PycomFactory init()
  {
    try
    {
      PycomFactory thePycomFactory = (PycomFactory)EPackage.Registry.INSTANCE.getEFactory(PycomPackage.eNS_URI);
      if (thePycomFactory != null)
      {
        return thePycomFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PycomFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PycomFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PycomPackage.SYSTEM: return createSystem();
      case PycomPackage.LIBRARY: return createLibrary();
      case PycomPackage.IMPORT: return createImport();
      case PycomPackage.PARAMETER_TYPE: return createParameterType();
      case PycomPackage.SERVER: return createServer();
      case PycomPackage.CONNECTION: return createConnection();
      case PycomPackage.HOST: return createHost();
      case PycomPackage.BOARD: return createBoard();
      case PycomPackage.BOARD_MEMBER: return createBoardMember();
      case PycomPackage.CONDITIONAL_ACTION: return createConditionalAction();
      case PycomPackage.EXP_MEMBER: return createExpMember();
      case PycomPackage.SENSOR: return createSensor();
      case PycomPackage.ACTUATOR: return createActuator();
      case PycomPackage.MODULE_TYPE: return createModuleType();
      case PycomPackage.MODULE_NAME: return createModuleName();
      case PycomPackage.COMMUNICATION: return createCommunication();
      case PycomPackage.COMMUNICATION_TYPE: return createCommunicationType();
      case PycomPackage.PIN: return createPin();
      case PycomPackage.PIN_NAME: return createPinName();
      case PycomPackage.CONDITION: return createCondition();
      case PycomPackage.LOGIC_EXP: return createLogicExp();
      case PycomPackage.BOOLEAN: return createBoolean();
      case PycomPackage.COMPARISON_EXP: return createComparisonExp();
      case PycomPackage.EXPRESSION: return createExpression();
      case PycomPackage.FUNCTION: return createFunction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public xtext.pycom.System createSystem()
  {
    SystemImpl system = new SystemImpl();
    return system;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Library createLibrary()
  {
    LibraryImpl library = new LibraryImpl();
    return library;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterType createParameterType()
  {
    ParameterTypeImpl parameterType = new ParameterTypeImpl();
    return parameterType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Server createServer()
  {
    ServerImpl server = new ServerImpl();
    return server;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Connection createConnection()
  {
    ConnectionImpl connection = new ConnectionImpl();
    return connection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Host createHost()
  {
    HostImpl host = new HostImpl();
    return host;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Board createBoard()
  {
    BoardImpl board = new BoardImpl();
    return board;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoardMember createBoardMember()
  {
    BoardMemberImpl boardMember = new BoardMemberImpl();
    return boardMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionalAction createConditionalAction()
  {
    ConditionalActionImpl conditionalAction = new ConditionalActionImpl();
    return conditionalAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpMember createExpMember()
  {
    ExpMemberImpl expMember = new ExpMemberImpl();
    return expMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sensor createSensor()
  {
    SensorImpl sensor = new SensorImpl();
    return sensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Actuator createActuator()
  {
    ActuatorImpl actuator = new ActuatorImpl();
    return actuator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModuleType createModuleType()
  {
    ModuleTypeImpl moduleType = new ModuleTypeImpl();
    return moduleType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModuleName createModuleName()
  {
    ModuleNameImpl moduleName = new ModuleNameImpl();
    return moduleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Communication createCommunication()
  {
    CommunicationImpl communication = new CommunicationImpl();
    return communication;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommunicationType createCommunicationType()
  {
    CommunicationTypeImpl communicationType = new CommunicationTypeImpl();
    return communicationType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pin createPin()
  {
    PinImpl pin = new PinImpl();
    return pin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PinName createPinName()
  {
    PinNameImpl pinName = new PinNameImpl();
    return pinName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicExp createLogicExp()
  {
    LogicExpImpl logicExp = new LogicExpImpl();
    return logicExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public xtext.pycom.Boolean createBoolean()
  {
    BooleanImpl boolean_ = new BooleanImpl();
    return boolean_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComparisonExp createComparisonExp()
  {
    ComparisonExpImpl comparisonExp = new ComparisonExpImpl();
    return comparisonExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PycomPackage getPycomPackage()
  {
    return (PycomPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PycomPackage getPackage()
  {
    return PycomPackage.eINSTANCE;
  }

} //PycomFactoryImpl