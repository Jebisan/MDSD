/**
 * generated by Xtext 2.16.0
 */
package xtext.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.net.URL;
import java.util.HashMap;
import java.util.function.BiConsumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import xtext.pycom.Actuator;
import xtext.pycom.Board;
import xtext.pycom.Communication;
import xtext.pycom.CommunicationType;
import xtext.pycom.Condition;
import xtext.pycom.ConditionalAction;
import xtext.pycom.Connection;
import xtext.pycom.ExpMember;
import xtext.pycom.Function;
import xtext.pycom.ModuleType;
import xtext.pycom.ParameterType;
import xtext.pycom.Pin;
import xtext.pycom.Sensor;
import xtext.pycom.Server;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PycomGenerator extends AbstractGenerator {
  private HashMap<String, URL> externalFilesMap = new HashMap<String, URL>();
  
  private HashMap<String, String> moduleMap = new HashMap<String, String>();
  
  private HashMap<String, String> importcode;
  
  private HashMap<String, String> codeMap;
  
  private HashMap<String, String> logicmap;
  
  private HashMap<String, String> functionmap;
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Board> _filter = Iterables.<Board>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Board.class);
    for (final Board board : _filter) {
      String _name = board.getName();
      String _plus = (_name + ".py");
      fsa.generateFile(_plus, this.generatePycomFiles(board, resource, fsa));
    }
  }
  
  public String oppositeOP(final String op) {
    boolean _equals = op.equals("<");
    if (_equals) {
      return ">";
    }
    boolean _equals_1 = op.equals(">");
    if (_equals_1) {
      return "<";
    }
    boolean _equals_2 = op.equals("<=");
    if (_equals_2) {
      return ">";
    }
    boolean _equals_3 = op.equals(">=");
    if (_equals_3) {
      return "<";
    }
    boolean _equals_4 = op.equals("==");
    if (_equals_4) {
      return "!=";
    }
    boolean _equals_5 = op.equals("!=");
    if (_equals_5) {
      return "==";
    }
    return null;
  }
  
  public CharSequence generatePycomFiles(final Board b, final Resource r, final IFileSystemAccess2 fsa) {
    CharSequence _xblockexpression = null;
    {
      this.generatePycom(b, r);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import ILibrary");
      _builder.newLine();
      _builder.append("import pycom");
      _builder.newLine();
      _builder.append("import urequests");
      _builder.newLine();
      _builder.append("import machine");
      _builder.newLine();
      _builder.append("import time ");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("isRunning = True");
      _builder.newLine();
      _builder.append("pycom.heartbeat(False)");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      String _generatePycomCode = this.generatePycomCode(b, r);
      _builder.append(_generatePycomCode);
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.newLine();
      String _genFunctions = this.genFunctions(b, r);
      _builder.append(_genFunctions);
      _builder.newLineIfNotEmpty();
      _builder.append("while(isRunning):");
      _builder.newLine();
      _builder.append("\t");
      String _generateLogic = this.generateLogic(b, r);
      _builder.append(_generateLogic, "\t");
      _builder.newLineIfNotEmpty();
      _builder.append("#CODE GENERATION END");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public String generatePycomCode(final Board b, final Resource r) {
    final StringBuilder sb = new StringBuilder();
    sb.append("\n");
    final BiConsumer<String, String> _function = (String k, String v) -> {
      sb.append((v + "\n"));
    };
    this.codeMap.forEach(_function);
    return sb.toString();
  }
  
  public String generateLogic(final Board board, final Resource resource) {
    final StringBuilder sb = new StringBuilder();
    sb.append("\n");
    final BiConsumer<String, String> _function = (String k, String v) -> {
      sb.append((v + "\n"));
    };
    this.logicmap.forEach(_function);
    return sb.toString();
  }
  
  public String genFunctions(final Board board, final Resource resource) {
    final StringBuilder sb = new StringBuilder();
    sb.append("\n");
    final BiConsumer<String, String> _function = (String k, String v) -> {
      sb.append((v + "\n"));
    };
    this.functionmap.forEach(_function);
    return sb.toString();
  }
  
  public void generatePycom(final Board b, final Resource r) {
    HashMap<String, String> _hashMap = new HashMap<String, String>();
    this.importcode = _hashMap;
    HashMap<String, String> _hashMap_1 = new HashMap<String, String>();
    this.codeMap = _hashMap_1;
    HashMap<String, String> _hashMap_2 = new HashMap<String, String>();
    this.logicmap = _hashMap_2;
    HashMap<String, String> _hashMap_3 = new HashMap<String, String>();
    this.functionmap = _hashMap_3;
    this.generatePycomConnection(b, r);
    this.generateFunctions(b, r);
  }
  
  public void generateFunctions(final Board board, final Resource resource) {
    Iterable<Server> _filter = Iterables.<Server>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Server.class);
    for (final Server server : _filter) {
      EList<ConditionalAction> _exps = server.getExps();
      for (final ConditionalAction condaction : _exps) {
        this.genConditionalAction(board, resource, condaction, server);
      }
    }
  }
  
  public void genConditionalAction(final Board board, final Resource resource, final ConditionalAction conAction, final Server server) {
    this.genCondition(board, resource, conAction.getCondition(), server);
    EList<ExpMember> _expMembers = conAction.getExpMembers();
    for (final ExpMember exp : _expMembers) {
      if ((exp instanceof ConditionalAction)) {
        this.genConditionalAction(board, resource, ((ConditionalAction)exp), server);
      } else {
        if ((exp instanceof Function)) {
          this.genFunction(board, resource, ((Function)exp), server);
        }
      }
    }
  }
  
  public ParameterType getParameterType(final ParameterType param) {
    return param;
  }
  
  public void genCondition(final Board board, final Resource resource, final Condition condition, final Server server) {
    Condition _nestedCondition = condition.getNestedCondition();
    boolean _tripleNotEquals = (_nestedCondition != null);
    if (_tripleNotEquals) {
      this.genCondition(board, resource, condition.getNestedCondition(), server);
    }
    Function _outputfunction = condition.getLogicEx().getCompExp().getLeft().getOutputfunction();
    boolean _tripleNotEquals_1 = (_outputfunction != null);
    if (_tripleNotEquals_1) {
      boolean _equals = condition.getLogicEx().getCompExp().getLeft().getOutputfunction().getBoard().equals(board);
      if (_equals) {
        Function func = condition.getLogicEx().getCompExp().getLeft().getOutputfunction();
        String op = condition.getLogicEx().getCompExp().getOp();
        Function _outputfunction_1 = condition.getLogicEx().getCompExp().getRight().getOutputfunction();
        boolean _tripleEquals = (_outputfunction_1 == null);
        if (_tripleEquals) {
          int thresholdvalue = condition.getLogicEx().getCompExp().getRight().getOutputValue();
          this.generateThresholdFunction(board, resource, func, thresholdvalue, op, server);
        } else {
          boolean _equals_1 = condition.getLogicEx().getCompExp().getRight().getOutputfunction().getBoard().equals(board);
          if (_equals_1) {
            Function thresholdfunc = condition.getLogicEx().getCompExp().getRight().getOutputfunction();
            this.generateDoubleFunction(board, resource, func, thresholdfunc, op, server);
          }
        }
      }
    }
    Function _outputfunction_2 = condition.getLogicEx().getCompExp().getRight().getOutputfunction();
    boolean _tripleNotEquals_2 = (_outputfunction_2 != null);
    if (_tripleNotEquals_2) {
      boolean _equals_2 = condition.getLogicEx().getCompExp().getRight().getOutputfunction().getBoard().equals(board);
      if (_equals_2) {
        Function func_1 = condition.getLogicEx().getCompExp().getRight().getOutputfunction();
        String op_1 = condition.getLogicEx().getCompExp().getOp();
        Function _outputfunction_3 = condition.getLogicEx().getCompExp().getLeft().getOutputfunction();
        boolean _tripleEquals_1 = (_outputfunction_3 == null);
        if (_tripleEquals_1) {
          int thresholdvalue_1 = condition.getLogicEx().getCompExp().getLeft().getOutputValue();
          this.generateThresholdFunction(board, resource, func_1, thresholdvalue_1, op_1, server);
        } else {
          boolean _equals_3 = condition.getLogicEx().getCompExp().getLeft().getOutputfunction().getBoard().equals(board);
          if (_equals_3) {
            Function thresholdfunc_1 = condition.getLogicEx().getCompExp().getLeft().getOutputfunction();
            this.generateDoubleFunction(board, resource, func_1, thresholdfunc_1, op_1, server);
          }
        }
      }
    }
  }
  
  public String getServerAddress(final Connection conn) {
    String adress = null;
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(conn.getHost().getIpAdr());
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      adress = conn.getHost().getIpAdr();
    } else {
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(conn.getHost().getWebsite());
      boolean _not_1 = (!_isNullOrEmpty_1);
      if (_not_1) {
        adress = conn.getHost().getWebsite();
      } else {
        adress = "#Undefined Address";
      }
    }
    int _portnumber = conn.getPortnumber();
    String _plus = ((adress + ":") + Integer.valueOf(_portnumber));
    adress = _plus;
    return adress;
  }
  
  public String getPostAddress(final Board board, final Function function) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/");
    String _name = board.getName();
    _builder.append(_name);
    _builder.append("/");
    String _name_1 = function.getFunctionName().getName();
    _builder.append(_name_1);
    _builder.append("/float/{}");
    return _builder.toString();
  }
  
  public String generateThresholdFunction(final Board board, final Resource resource, final Function function, final int i, final String op, final Server server) {
    String _xblockexpression = null;
    {
      String postaddress = this.getPostAddress(board, function);
      String power = "";
      String input = "";
      EList<Pin> _pins = function.getPins();
      for (final Pin parameter : _pins) {
        if (((!Objects.equal(parameter.getPower(), null)) && (!Objects.equal(parameter.getInput(), null)))) {
          power = parameter.getPower().getName();
          input = parameter.getInput().getName();
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var passedTreshold = False");
      _builder.newLine();
      String _name = function.getFunctionName().getName();
      _builder.append(_name);
      _builder.append("Threshold = ");
      _builder.append(i);
      _builder.newLineIfNotEmpty();
      String _name_1 = function.getFunctionName().getName();
      _builder.append(_name_1);
      _builder.append("Value = ILibrary.");
      String _name_2 = function.getFunctionName().getName();
      _builder.append(_name_2);
      _builder.append("(");
      _builder.append(power);
      _builder.append(",");
      _builder.append(input);
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("if (");
      String _name_3 = function.getFunctionName().getName();
      _builder.append(_name_3);
      _builder.append("Value ");
      _builder.append(op);
      _builder.append(" ");
      String _name_4 = function.getFunctionName().getName();
      _builder.append(_name_4);
      _builder.append("Threshold and !passedTreshold):");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("passedTreshold = not passedTreshold");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sendurl = \"");
      String _serverAddress = this.getServerAddress(server.getConn());
      _builder.append(_serverAddress, "\t");
      _builder.append(postaddress, "\t");
      _builder.append("\".format(");
      String _name_5 = function.getFunctionName().getName();
      _builder.append(_name_5, "\t");
      _builder.append("Value)");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("res = urequests.post(sendurl)   ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print(\"Res code: \", res.status_code)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print(\"Res: \", res.reason)");
      _builder.newLine();
      _builder.append("if (");
      String _name_6 = function.getFunctionName().getName();
      _builder.append(_name_6);
      _builder.append("Value ");
      String _oppositeOP = this.oppositeOP(op);
      _builder.append(_oppositeOP);
      _builder.append(" ");
      String _name_7 = function.getFunctionName().getName();
      _builder.append(_name_7);
      _builder.append("Threshold and passedTreshold):");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("passedTreshold = not passedTreshold");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("sendurl = \"");
      String _serverAddress_1 = this.getServerAddress(server.getConn());
      _builder.append(_serverAddress_1, "\t");
      _builder.append(postaddress, "\t");
      _builder.append("\".format(");
      String _name_8 = function.getFunctionName().getName();
      _builder.append(_name_8, "\t");
      _builder.append("Value)");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("res = urequests.post(sendurl)   ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print(\"Res code: \", res.status_code)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print(\"Res: \", res.reason)");
      _builder.newLine();
      _builder.append("time.sleep(");
      int _communicationRate = board.getCommunicationRate();
      _builder.append(_communicationRate);
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      String threshold = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("def ");
      String _name_9 = function.getFunctionName().getName();
      _builder_1.append(_name_9);
      _builder_1.append("():\t\t");
      _builder_1.newLineIfNotEmpty();
      String funk = _builder_1.toString();
      this.logicmap.put(function.getFunctionName().getName(), threshold);
      _xblockexpression = this.functionmap.put(function.getFunctionName().getName(), funk);
    }
    return _xblockexpression;
  }
  
  public String generateDoubleFunction(final Board board, final Resource resource, final Function function, final Function function2, final String op, final Server server) {
    String _xblockexpression = null;
    {
      String postaddress = this.getPostAddress(board, function);
      StringConcatenation _builder = new StringConcatenation();
      String _name = function.getFunctionName().getName();
      _builder.append(_name);
      _builder.append("Value = ");
      String _name_1 = function.getFunctionName().getName();
      _builder.append(_name_1);
      _builder.append("()");
      _builder.newLineIfNotEmpty();
      String _name_2 = function2.getFunctionName().getName();
      _builder.append(_name_2);
      _builder.append("Value = ");
      String _name_3 = function2.getFunctionName().getName();
      _builder.append(_name_3);
      _builder.append("()");
      _builder.newLineIfNotEmpty();
      _builder.append("if (");
      String _name_4 = function.getFunctionName().getName();
      _builder.append(_name_4);
      _builder.append("Value ");
      _builder.append(op);
      _builder.append(" ");
      String _name_5 = function2.getFunctionName().getName();
      _builder.append(_name_5);
      _builder.append("Value):");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("sendurl = \"");
      String _serverAddress = this.getServerAddress(server.getConn());
      _builder.append(_serverAddress, "\t");
      _builder.append(postaddress, "\t");
      _builder.append("\".format(True)");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("res = urequests.post(sendurl)   ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print(\"Res code: \", res.status_code)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print(\"Res: \", res.reason)");
      _builder.newLine();
      _builder.append("if (");
      String _name_6 = function.getFunctionName().getName();
      _builder.append(_name_6);
      _builder.append("Value ");
      String _oppositeOP = this.oppositeOP(op);
      _builder.append(_oppositeOP);
      _builder.append(" ");
      String _name_7 = function2.getFunctionName().getName();
      _builder.append(_name_7);
      _builder.append("Value):");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("sendurl = \"");
      String _serverAddress_1 = this.getServerAddress(server.getConn());
      _builder.append(_serverAddress_1, "\t");
      _builder.append(postaddress, "\t");
      _builder.append("\".format(false)");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("res = urequests.post(sendurl)   ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print(\"Res code: \", res.status_code)");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print(\"Res: \", res.reason)");
      _builder.newLine();
      String transmitcode = _builder.toString();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("def ");
      String _name_8 = function.getFunctionName().getName();
      _builder_1.append(_name_8);
      _builder_1.append("():");
      _builder_1.newLineIfNotEmpty();
      String funk = _builder_1.toString();
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("def ");
      String _name_9 = function2.getFunctionName().getName();
      _builder_2.append(_name_9);
      _builder_2.append("():");
      _builder_2.newLineIfNotEmpty();
      String funk2 = _builder_2.toString();
      this.logicmap.put(function.getFunctionName().getName(), transmitcode);
      this.functionmap.put(function.getFunctionName().getName(), funk);
      _xblockexpression = this.functionmap.put(function.getFunctionName().getName(), funk2);
    }
    return _xblockexpression;
  }
  
  public String genFunction(final Board board, final Resource resource, final Function function, final Server server) {
    String _xifexpression = null;
    boolean _equals = function.getBoard().equals(board);
    if (_equals) {
      String _xblockexpression = null;
      {
        String address = this.getServerAddress(server.getConn());
        String sendUrl = null;
        String functionname = null;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("sendurl = \"");
        _builder.append(address);
        _builder.append("/");
        String _name = board.getName();
        _builder.append(_name);
        _builder.append("/");
        String _name_1 = function.getFunctionName().getName();
        _builder.append(_name_1);
        _builder.append("/turnOn");
        sendUrl = _builder.toString();
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(sendUrl);
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("urequests.get(sendurl) ");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("response = res.text");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("print(\'sending\')");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("print(\"Res code: \", res.status_code)");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("print(\"Response: \" + response)");
        _builder_1.newLine();
        _builder_1.append("    ");
        _builder_1.append("ILibrary.");
        String _name_2 = function.getFunctionName().getName();
        _builder_1.append(_name_2, "    ");
        _builder_1.append("(response)");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("time.sleep(");
        int _communicationRate = board.getCommunicationRate();
        _builder_1.append(_communicationRate);
        _builder_1.append(")");
        _builder_1.newLineIfNotEmpty();
        String getCode = _builder_1.toString();
        this.logicmap.put(function.getFunctionName().getName(), getCode);
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("def ");
        String _name_3 = function.getFunctionName().getName();
        _builder_2.append(_name_3);
        _builder_2.append("(serverResponse):");
        _builder_2.newLineIfNotEmpty();
        String funk = _builder_2.toString();
        _xblockexpression = this.functionmap.put(function.getFunctionName().getName(), funk);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public void generatePycomSensor(final Board b, final Resource r) {
    Iterable<Sensor> _filter = Iterables.<Sensor>filter(b.getBoardMembers(), Sensor.class);
    for (final Sensor sensor : _filter) {
      boolean _containsKey = this.importcode.containsKey(sensor.getTypeName().getName());
      boolean _not = (!_containsKey);
      if (_not) {
        this.importcode.put(sensor.getTypeName().getName(), this.generateSensorImport(b, r, sensor).toString());
        this.codeMap.put(sensor.getTypeName().getName(), this.generateSensorCode(b, r, sensor));
      }
    }
  }
  
  public String generateSensorCode(final Board board, final Resource resource, final Sensor sensor) {
    Pin _pins = sensor.getPins();
    boolean _tripleNotEquals = (_pins != null);
    if (_tripleNotEquals) {
      String power = sensor.getPins().getPower().getName();
      String input = sensor.getPins().getInput().getName();
      if ((Objects.equal(power, null) || Objects.equal(input, null))) {
        boolean _containsKey = this.moduleMap.containsKey(sensor.getTypeName());
        if (_containsKey) {
          StringConcatenation _builder = new StringConcatenation();
          String _name = sensor.getSensorName().getName();
          _builder.append(_name);
          _builder.append(" = ");
          String _get = this.moduleMap.get(sensor.getTypeName());
          _builder.append(_get);
          _builder.append("(Pin.IN = ");
          _builder.append(input);
          _builder.append(", Pin.OUT = ");
          _builder.append(power);
          _builder.append(")");
          return _builder.toString();
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          String _name_1 = sensor.getSensorName().getName();
          _builder_1.append(_name_1);
          _builder_1.append(" = #Unknown Sensor");
          return _builder_1.toString();
        }
      }
    }
    boolean _containsKey_1 = this.moduleMap.containsKey(sensor.getTypeName());
    if (_containsKey_1) {
      StringConcatenation _builder_2 = new StringConcatenation();
      String _name_2 = sensor.getSensorName().getName();
      _builder_2.append(_name_2);
      _builder_2.append(" = ");
      String _get_1 = this.moduleMap.get(sensor.getTypeName());
      _builder_2.append(_get_1);
      _builder_2.append("()");
      return _builder_2.toString();
    } else {
      StringConcatenation _builder_3 = new StringConcatenation();
      String _name_3 = sensor.getSensorName().getName();
      _builder_3.append(_name_3);
      _builder_3.append(" = #Unknown Sensor");
      return _builder_3.toString();
    }
  }
  
  public String generateSensorImport(final Board b, final Resource r, final Sensor sensor) {
    boolean _containsKey = this.moduleMap.containsKey(sensor.getTypeName());
    if (_containsKey) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("from ");
      String _get = this.moduleMap.get(sensor.getTypeName());
      _builder.append(_get);
      _builder.append(" import ");
      String _get_1 = this.moduleMap.get(sensor.getTypeName());
      _builder.append(_get_1);
      return _builder.toString();
    } else {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("import ");
      ModuleType _typeName = sensor.getTypeName();
      _builder_1.append(_typeName);
      return _builder_1.toString();
    }
  }
  
  public void generatePycomActuator(final Board b, final Resource r) {
    Iterable<Actuator> _filter = Iterables.<Actuator>filter(b.getBoardMembers(), Actuator.class);
    for (final Actuator actuator : _filter) {
      boolean _containsKey = this.importcode.containsKey(actuator.getTypeName().getName());
      boolean _not = (!_containsKey);
      if (_not) {
        this.importcode.put(actuator.getTypeName().getName(), this.generateActuatorImports(b, r, actuator).toString());
        this.codeMap.put(actuator.getTypeName().getName(), this.generateActuatorCode(b, r, actuator));
      }
    }
  }
  
  public String generateActuatorCode(final Board board, final Resource resource, final Actuator actuator) {
    Pin _pins = actuator.getPins();
    boolean _tripleNotEquals = (_pins != null);
    if (_tripleNotEquals) {
      String power = actuator.getPins().getPower().getName();
      String input = actuator.getPins().getInput().getName();
      if ((Objects.equal(power, null) || Objects.equal(input, null))) {
        boolean _containsKey = this.moduleMap.containsKey(actuator.getTypeName().getName());
        if (_containsKey) {
          StringConcatenation _builder = new StringConcatenation();
          String _name = actuator.getTypeName().getName();
          _builder.append(_name);
          _builder.append(" = ");
          String _get = this.moduleMap.get(actuator.getTypeName().getName());
          _builder.append(_get);
          _builder.append("(Pin.IN = ");
          _builder.append(input);
          _builder.append(", Pin.OUT = ");
          _builder.append(power);
          _builder.append(")");
          return _builder.toString();
        } else {
          StringConcatenation _builder_1 = new StringConcatenation();
          String _name_1 = actuator.getTypeName().getName();
          _builder_1.append(_name_1);
          _builder_1.append(" = #Unknown Actuator");
          return _builder_1.toString();
        }
      }
    }
    boolean _containsKey_1 = this.moduleMap.containsKey(actuator.getTypeName().getName());
    if (_containsKey_1) {
      StringConcatenation _builder_2 = new StringConcatenation();
      String _name_2 = actuator.getTypeName().getName();
      _builder_2.append(_name_2);
      _builder_2.append(" = ");
      String _get_1 = this.moduleMap.get(actuator.getTypeName().getName());
      _builder_2.append(_get_1);
      _builder_2.append("()");
      return _builder_2.toString();
    } else {
      StringConcatenation _builder_3 = new StringConcatenation();
      String _name_3 = actuator.getTypeName().getName();
      _builder_3.append(_name_3);
      _builder_3.append(" = #Unknown Actuator");
      return _builder_3.toString();
    }
  }
  
  public CharSequence generateActuatorImports(final Board b, final Resource r, final Actuator actuator) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import ");
    String _name = actuator.getTypeName().getName();
    _builder.append(_name);
    return _builder;
  }
  
  public void generatePycomConnection(final Board b, final Resource r) {
    Iterable<Communication> _filter = Iterables.<Communication>filter(b.getBoardMembers(), Communication.class);
    for (final Communication a : _filter) {
      boolean _containsKey = this.importcode.containsKey(a.getType());
      boolean _not = (!_containsKey);
      if (_not) {
        boolean _equals = a.getType().getName().equals("WiFi");
        if (_equals) {
          this.importcode.put(a.getType().getName(), this.generatePycomWifiImport(b, r).toString());
          this.codeMap.put(a.getType().getName(), this.generatePycomWifiCode(b, r, a.getType()).toString());
        } else {
          String _name = a.getType().getName();
          CommunicationType _type = a.getType();
          String _plus = ("#Not Supported Communication-type: " + _type);
          this.importcode.put(_name, _plus);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("#***");
          _builder.append(a);
          _builder.append(" SETUP***");
          _builder.newLineIfNotEmpty();
          _builder.append("\t\t\t    \t\t");
          _builder.newLine();
          _builder.append("#Unsupported Communication");
          _builder.newLine();
          _builder.append("\t\t\t    \t\t");
          _builder.newLine();
          _builder.append("#***");
          _builder.append(a);
          _builder.append(" SETUP END***");
          _builder.newLineIfNotEmpty();
          String s = _builder.toString();
          this.codeMap.put(a.getType().getName(), s);
        }
      }
    }
  }
  
  public CharSequence generatePycomWifiImport(final Board b, final Resource r) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("from network import WLAN");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generatePycomWifiCode(final Board b, final Resource r, final CommunicationType c) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#***WIFI SETUP***");
    _builder.newLine();
    _builder.append("wlan = WLAN(mode=WLAN.STA)");
    _builder.newLine();
    _builder.append("nets = wlan.scan()");
    _builder.newLine();
    _builder.append("ssidname = \"");
    String _ssid = c.getSsid();
    _builder.append(_ssid);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("password = \"");
    String _password = c.getPassword();
    _builder.append(_password);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("if wlan.isconnected() == False:");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("for net in nets:");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("print(net.ssid)");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("if net.ssid == ssidname:");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("wlan.connect(net.ssid, auth=(net.sec, password), timeout=5000)");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("break");
    _builder.newLine();
    _builder.newLine();
    _builder.append("while not wlan.isconnected():");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("machine.idle()");
    _builder.newLine();
    _builder.append("print (\'wlan connection succeeded!\')");
    _builder.newLine();
    _builder.append("print (wlan.ifconfig())");
    _builder.newLine();
    _builder.newLine();
    _builder.append("#***WIFI SETUP END***");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
