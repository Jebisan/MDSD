/*
 * generated by Xtext 2.16.0
 */
package xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import xtext.pycom.Board
import xtext.pycom.Server
import xtext.pycom.Communication
import xtext.pycom.Actuator
import java.util.HashMap
import java.io.BufferedInputStream
import java.net.URL
import java.nio.file.Paths
import java.io.IOException
import xtext.pycom.Sensor
import xtext.pycom.ConditionalAction
import xtext.pycom.Condition
import xtext.pycom.Function
import xtext.pycom.Expression
import javax.swing.JOptionPane
import java.util.List
import xtext.pycom.ExpMember
import xtext.pycom.ParameterType
import xtext.pycom.Connection
import java.util.ArrayList
import xtext.pycom.CommunicationType
import xtext.pycom.Pin

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PycomGenerator extends AbstractGenerator {
	
	var externalFilesMap = new HashMap<String, URL>();
	var moduleMap = new HashMap<String, String>();
	
	var HashMap<String, String> importcode
	var HashMap<String, String> codeMap
	
	var HashMap<String, String> logicmap
	var HashMap<String, String> functionmap
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		for (board : resource.allContents.toIterable.filter(typeof(Board))) {
			fsa.generateFile(board.name + ".py", generatePycomFiles(board, resource, fsa))			
		}
				
	/*	for (server : resource.allContents.toIterable.filter(typeof(Server))) {
			fsa.generateFile(server.name + ".js", generateServerFiles(server, resource))			
		}  
 */				
	}
		
	def oppositeOP(String op) {
		if(op.equals("<")) {
			return ">"
		}
		if(op.equals(">")) {
			return "<"
		}
		if(op.equals("<=")) {
			return ">"
		}
		if(op.equals(">=")) {
			return "<"
		}
		if(op.equals("==")) {
			return "!="
		}
		if(op.equals("!=")) {
			return "=="
		}	
	}

	//  ��
	// EzCopy
	// Single Line Generate Comment �/* Comment goes here */�
	// Debug Code
	// JOptionPane.showMessageDialog( null , "Message", "Title" , JOptionPane.INFORMATION_MESSAGE)
	
	def generatePycomFiles(Board b, Resource r, IFileSystemAccess2 fsa) {
		generatePycom(b, r)
		
		'''
		import ILibrary
		import pycom
		import urequests
		import machine
		import time 

		
		isRunning = True
		pycom.heartbeat(False)
			
		�generatePycomCode(b, r)�
			
		�genFunctions(b, r)�
		while(isRunning):
			�generateLogic(b, r)�
		#CODE GENERATION END
		'''
	}

 
	def generatePycomCode(Board b, Resource r) { 
		val sb = new StringBuilder();
		sb.append("\n")
		codeMap.forEach[k, v| {
			sb.append(v + "\n")
		}]
		return sb.toString
	}

	def generateLogic(Board board, Resource resource) {
		val sb = new StringBuilder();
		sb.append("\n")
		logicmap.forEach[k, v| {
			sb.append(v + "\n")
		}]
		return sb.toString
	}

	def genFunctions(Board board, Resource resource) {
		val sb = new StringBuilder();
		sb.append("\n")
		functionmap.forEach[k, v| {
			sb.append(v + "\n")
		}]
		return sb.toString
	}
	
	def generatePycom(Board b, Resource r) {
		importcode = new HashMap<String, String>();
		codeMap = new HashMap<String, String>();
		logicmap = new HashMap<String, String>();
		functionmap = new HashMap<String, String>();
		generatePycomConnection(b, r)
	//	generatePycomActuator(b, r)
	//	generatePycomSensor(b, r)
		generateFunctions(b, r)
	}
	
	def generateFunctions(Board board, Resource resource) {
		for (server : resource.allContents.toIterable.filter(typeof(Server))) {
			for (condaction : server.exps) {
				genConditionalAction(board, resource, condaction, server)
			} 				
		} 		
	}
	
	def void genConditionalAction(Board board, Resource resource, ConditionalAction conAction, Server server) {
		genCondition(board, resource, conAction.condition, server)
		for (exp : conAction.expMembers) {
			if(exp instanceof ConditionalAction) {
				genConditionalAction(board, resource, exp, server)
			} else if(exp instanceof Function) {
				genFunction(board, resource, exp, server)
			}
		}
	}
	
	def ParameterType getParameterType(ParameterType param){
		return param
	}
	
	def void genCondition(Board board, Resource resource, Condition condition, Server server) {
		if(condition.nestedCondition !== null) {
			genCondition(board, resource, condition.nestedCondition, server)
		}
		if(condition.logicEx.compExp.left.outputfunction !== null) {
			if (condition.logicEx.compExp.left.outputfunction.board.equals(board)) {
				var func = condition.logicEx.compExp.left.outputfunction
				var op = condition.logicEx.compExp.op
				if(condition.logicEx.compExp.right.outputfunction === null) {
					var thresholdvalue = condition.logicEx.compExp.right.outputValue
					generateThresholdFunction(board, resource, func, thresholdvalue, op, server)
				} else if (condition.logicEx.compExp.right.outputfunction.board.equals(board)) {
					var thresholdfunc = condition.logicEx.compExp.right.outputfunction
					generateDoubleFunction(board, resource, func, thresholdfunc, op, server)
				}
			}
		}
		if(condition.logicEx.compExp.right.outputfunction !== null) {
			if (condition.logicEx.compExp.right.outputfunction.board.equals(board)) {
				var func = condition.logicEx.compExp.right.outputfunction
				var op = condition.logicEx.compExp.op
				if(condition.logicEx.compExp.left.outputfunction === null) {
					var thresholdvalue = condition.logicEx.compExp.left.outputValue
					generateThresholdFunction(board, resource, func, thresholdvalue, op, server)
				} else if (condition.logicEx.compExp.left.outputfunction.board.equals(board)) {
					var thresholdfunc = condition.logicEx.compExp.left.outputfunction
					generateDoubleFunction(board, resource, func, thresholdfunc, op, server)
				}
			}
		}
	}
	
	def getServerAddress(Connection conn) {
		var String adress
		if(!conn.host.ipAdr.isNullOrEmpty) {
			adress = conn.host.ipAdr
		} else if ((!conn.host.website.isNullOrEmpty)) {
			adress = conn.host.website
		} else {
			adress = "#Undefined Address"
		}
		adress = adress + ":" + conn.portnumber
		return adress
	}
	
	def getPostAddress(Board board, Function function) {

			return '''/�board.name�/�function.functionName.name�/float/{}'''
		
	}
	
	//if funk1 < 20
	
	def generateThresholdFunction(Board board, Resource resource, Function function, int i, String op, Server server) {	
		var postaddress = getPostAddress(board, function) 
		var power = ''
		var input = ''
			
		for (parameter : function.pins) {
			if(parameter.getPower()!=null && parameter.getInput()!=null) {
				 power = parameter.getPower().name
				 input = parameter.getInput().name
			}
		}
		
		
		var threshold = '''
		var passedTreshold = False
		�function.functionName.name�Threshold = �i�
		�function.functionName.name�Value = ILibrary.�function.functionName.name�(�power�,�input�)
		if (�function.functionName.name�Value �op� �function.functionName.name�Threshold and !passedTreshold):
			passedTreshold = not passedTreshold
			sendurl = "�getServerAddress(server.conn)��postaddress�".format(�function.functionName.name�Value)
			res = urequests.post(sendurl)   
			print("Res code: ", res.status_code)
			print("Res: ", res.reason)
		if (�function.functionName.name�Value �oppositeOP(op)� �function.functionName.name�Threshold and passedTreshold):
			passedTreshold = not passedTreshold
			sendurl = "�getServerAddress(server.conn)��postaddress�".format(�function.functionName.name�Value)
			res = urequests.post(sendurl)   
			print("Res code: ", res.status_code)
			print("Res: ", res.reason)
		time.sleep(�board.communicationRate�)
		'''				
		var funk = 
		'''
		def �function.functionName.name�():		
		'''
		logicmap.put(function.functionName.name, threshold)
		functionmap.put(function.functionName.name, funk)
	}
	
	//if funk1 < funk2
	
	def generateDoubleFunction(Board board, Resource resource, Function function, Function function2, String op, Server server) {
		var postaddress = getPostAddress(board, function)
		var transmitcode = '''
		�function.functionName.name�Value = �function.functionName.name�()
		�function2.functionName.name�Value = �function2.functionName.name�()
		if (�function.functionName.name�Value �op� �function2.functionName.name�Value):
			sendurl = "�getServerAddress(server.conn)��postaddress�".format(True)
			res = urequests.post(sendurl)   
			print("Res code: ", res.status_code)
			print("Res: ", res.reason)
		if (�function.functionName.name�Value �oppositeOP(op)� �function2.functionName.name�Value):
			sendurl = "�getServerAddress(server.conn)��postaddress�".format(false)
			res = urequests.post(sendurl)   
			print("Res code: ", res.status_code)
			print("Res: ", res.reason)
		'''
		var funk = '''
		def �function.functionName.name�():
		'''
		
		
		var funk2 = '''
		def �function2.functionName.name�():
		'''
		logicmap.put(function.functionName.name, transmitcode)
		functionmap.put(function.functionName.name, funk)
		functionmap.put(function.functionName.name, funk2)
	}
	//('/boardEt/Engine/myEngine1'
	
	def genFunction(Board board, Resource resource, Function function, Server server) {
		if(function.board.equals(board)) {
			var address = getServerAddress(server.conn)
			var String sendUrl;
			var String functionname
				sendUrl = '''sendurl = "�address�/�board.name�/�function.functionName.name�/turnOn'''
			
			var getCode='''
			�sendUrl�
			urequests.get(sendurl) 
			    response = res.text
			    print('sending')
			    print("Res code: ", res.status_code)
			    print("Response: " + response)
			    ILibrary.�function.functionName.name�(response)
			time.sleep(�board.communicationRate�)
			'''
			logicmap.put(function.functionName.name, getCode)
			var funk = '''
			def �function.functionName.name�(serverResponse):
			'''
			functionmap.put(function.functionName.name, funk)
		}
	}
	
	def generatePycomSensor(Board b, Resource r) {
		for (sensor : b.boardMembers.filter(typeof(Sensor))) {
				if (!importcode.containsKey(sensor.typeName.name)) {
					importcode.put(sensor.typeName.name, generateSensorImport(b, r, sensor).toString())
					codeMap.put(sensor.typeName.name, generateSensorCode(b, r, sensor))
			}
		}
	}

	def generateSensorCode(Board board, Resource resource, Sensor sensor) {
		if(sensor.pins !== null) {
			var power = sensor.pins.power.name
			var input = sensor.pins.input.name
			if(power == null || input == null) {
				if(moduleMap.containsKey(sensor.typeName)) {
					return '''�sensor.sensorName.name� = �moduleMap.get(sensor.typeName)�(Pin.IN = �input�, Pin.OUT = �power�)'''
				} else {
					return '''�sensor.sensorName.name� = #Unknown Sensor'''
				}
			}	
		}
		if(moduleMap.containsKey(sensor.typeName)) {
			return '''�sensor.sensorName.name� = �moduleMap.get(sensor.typeName)�()'''
		} else {
			return '''�sensor.sensorName.name� = #Unknown Sensor'''
		}
	}
	
	def generateSensorImport(Board b, Resource r, Sensor sensor) {			
		if(moduleMap.containsKey(sensor.typeName)) {
			return '''from �moduleMap.get(sensor.typeName)� import �moduleMap.get(sensor.typeName)�'''
		} else {
			return '''import �sensor.typeName�'''
		}		
	}

	
	
	def generatePycomActuator(Board b, Resource r) {
		for (actuator : b.boardMembers.filter(typeof(Actuator))) {
				if (!importcode.containsKey(actuator.typeName.name)) {
					importcode.put(actuator.typeName.name, generateActuatorImports(b, r, actuator).toString())
					codeMap.put(actuator.typeName.name, generateActuatorCode(b, r, actuator))
			}
		}
	}
	
	
	def generateActuatorCode(Board board, Resource resource, Actuator actuator) {
		if(actuator.pins !== null) {
			var power = actuator.pins.power.name
			var input = actuator.pins.input.name
			if(power == null || input == null) {
				if(moduleMap.containsKey(actuator.typeName.name)) {
					return '''�actuator.typeName.name� = �moduleMap.get(actuator.typeName.name)�(Pin.IN = �input�, Pin.OUT = �power�)'''
				} else {
					return '''�actuator.typeName.name� = #Unknown Actuator'''
				}
			}	
		}
		if(moduleMap.containsKey(actuator.typeName.name)) {
			return '''�actuator.typeName.name� = �moduleMap.get(actuator.typeName.name)�()'''
		} else {
			return '''�actuator.typeName.name� = #Unknown Actuator'''
		}
	}
	
	
	def generateActuatorImports(Board b, Resource r, Actuator actuator) {	
		'''import �actuator.typeName.name�'''
	}
	
	//Generating communication - Only WiFi is supported at the moment
	def generatePycomConnection(Board b, Resource r) {
		for (a : b.boardMembers.filter(Communication)) {
			if (!importcode.containsKey(a.type)) {
				if (a.type.name.equals("WiFi")) {
		    		importcode.put(a.type.name, generatePycomWifiImport(b, r).toString)
		    		codeMap.put(a.type.name, generatePycomWifiCode(b, r, a.type).toString)
			    } else {
			    	importcode.put(a.type.name, "#Not Supported Communication-type: " + a.type) //Default case for unsupported BlueThooth|SigFox
			    	var s = '''
			    				#***�a� SETUP***
			    		
			    				#Unsupported Communication
			    		
			    				#***�a� SETUP END***
			    			'''
			    	codeMap.put(a.type.name, s)
			    }
			}
		}
	}

	def generatePycomWifiImport(Board b, Resource r) {	
		'''
			from network import WLAN
			
		'''
	}
	
	def generatePycomWifiCode(Board b, Resource r, CommunicationType c) {
		'''
			#***WIFI SETUP***
			wlan = WLAN(mode=WLAN.STA)
			nets = wlan.scan()
			ssidname = "�c.ssid�"
			password = "�c.password�"
			
			if wlan.isconnected() == False:
			    for net in nets:
			        print(net.ssid)
			        if net.ssid == ssidname:
			            wlan.connect(net.ssid, auth=(net.sec, password), timeout=5000)
			            break
			
			while not wlan.isconnected():
			    machine.idle()
			print ('wlan connection succeeded!')
			print (wlan.ifconfig())
			
			#***WIFI SETUP END***
			
		'''
	}
		/*
	def GenerateServerHeader(Server s)
	{
		'''
		var express = require('express');
		var app = express();
		var bodyParser = require('body-parser');
		app.use(bodyParser.json());
		
		// Host: �if (s.conn.host.ipAdr === null) s.conn.host.website else s.conn.host.ipAdr �
		
		app.listen(�s.conn.portnumber�, () => 
		{
		    console.log('Started on port �s.conn.portnumber�');
		});
		
		app.get("/", function(req, res)
		{		     
		    res.send("Default get route");
		    console.log("Default get route");
		});		
						
		'''
	}

	def generateServerFiles(Server s, Resource r) 
	{					
		var stringBuilder = new StringBuilder;		
		stringBuilder.append(GenerateServerHeader(s))			
		stringBuilder.append(GenerateGlobalVariables(s))
		GeneratePostRoutes(stringBuilder, r, s)
		
		var counter = 0;
		for(ConditionalAction conditionalAction : s.exps)
		{
			var type = conditionalAction.type;			
			GenerateIfFunctions(stringBuilder, conditionalAction, r, type, s, counter)
			counter++;	
		}
		
		return stringBuilder.toString;
	}
	
	var HashMap<String, String>  globalVariables
	var HashMap<String, String>  variableNamesForPostAndGetRoutes
	
	def GenerateGlobalVariables(Server s) {
		val sb = new StringBuilder()
		globalVariables = new HashMap<String, String>
		variableNamesForPostAndGetRoutes = new HashMap<String, String>
		for (exp : s.exps) 
		{
			generateVariableConditionalAction(s, exp)
		}
		globalVariables.forEach[k, v| {
			sb.append(v)
		}]
		
		sb.append("\n")
		return sb.toString
	}
	
	def void generateVariableConditionalAction(Server server, ConditionalAction action) {
		generateVariableFromCondition(action.condition)
		for(exp : action.expMembers) {
			if(exp instanceof ConditionalAction) 
			{
				generateVariableConditionalAction(server, exp)
			} 
			else if(exp instanceof Function) 
			{
				generateVariableFunction(exp)
			}
		}
	}
	
	def void generateVariableFunction(Function exp) {
		var String varname;
			if(exp instanceof ModuleFunction) {
				if(exp.moduleType instanceof ) {
					varname = exp.board.name + "_" + exp.moduleType.name + "_" + exp.moduleType.name + "_" + exp.functionName.name + "_" + "boolean"
				} else if (exp.moduleType instanceof SensorType) {
					varname = exp.board.name + "_" + exp.moduleType.name + "_" + exp.moduleType.name + "_" + exp.functionName.name + "_" + "float"
				} else {
					varname = exp.board.name + "_" + exp.moduleType.name + "_" + exp.moduleType.name + "_" + exp.functionName.name + "_" + "unknown"
				}
					
			} else {
				varname = exp.board.name + "_" + exp.functionName.name
			}
			if(!globalVariables.containsKey(varname)) {
				globalVariables.put(varname,"var " + varname + " = undefined" + "\n")
				if(exp instanceof ModuleFunction) {
					if (exp.moduleType instanceof SensorType) {
						variableNamesForPostAndGetRoutes.put(varname,"SensorFunction")
					} else if (exp.moduleType instanceof ActuatorType) {
						variableNamesForPostAndGetRoutes.put(varname,"ActuatorFunction")
					} else {
						variableNamesForPostAndGetRoutes.put(varname,"UnknownFunction")
					}
				} else {
					variableNamesForPostAndGetRoutes.put(varname,"Function")
				}
				
			}														
	}
	 
	def void generateVariableFromCondition(Condition condition) {
		if(condition.nestedCondition !== null) {
			generateVariableFromCondition(condition.nestedCondition)
		}
		if(condition.logicEx.compExp.left.outputfunction !== null) {
			generateVariableFunction(condition.logicEx.compExp.left.outputfunction)
		}
		if(condition.logicEx.compExp.right.outputfunction !== null) {
			generateVariableFunction(condition.logicEx.compExp.right.outputfunction)
		}
	}		
	
	def GeneratePostRoutes(StringBuilder stringBuilder, Resource r, Server s)
	{			
		variableNamesForPostAndGetRoutes.forEach[k, v| {
			if(v.equals("SensorFunction"))
			{
				var numberList = new ArrayList<String>
				for(var i = 0; i < s.exps.filter(typeof(ConditionalAction)).size; i++)
				{
					numberList.add(i.toString)
				}
				
				var String urlSnippet = k.replace("_", "/");
				stringBuilder.append(						
					'''							
					app.post('/�urlSnippet�/:value', function(req, res)
						{    					    
						    �k� = req.params.value; 
						    �FOR number : numberList�							    	
						    	ServerFunction�number�();
						    �ENDFOR�
						    								    
					    	res.send("Message received: " + �k�);
					    	console.log("Message received: " + �k�)    								    
						});	
															
					'''				
					)				
			}
			else if(v.equals("ActuatorFunction"))
			{
				var String urlSnippet = k.replace("_", "/");
				stringBuilder.append(						
						'''							
						app.get('/�urlSnippet�', function(req, res)
							{ 
								if(�k� == undefined)
								{
									res.send("undefined");
								} 
								else
								{  					    
							    	res.send(�k�);
							    }
						    	console.log("Return �k�: " + �k�)    								    
							});	
																
						'''				
						)		
			}
		}]
	}
	
	def GenerateIfFunctions(StringBuilder stringBuilder, ConditionalAction conditionalAction, Resource r, String type, Server s, int counter)
	{
		var conditionalStringBuilder = new StringBuilder();
		var content = GetConditionalStatementContent(conditionalStringBuilder, conditionalAction.condition);		
		var scopeContent = GetConditionalStatementScopeContent(conditionalAction.expMembers);								
		var splittedScopeContent = scopeContent.split("");	
		var elseScopeStringBuilder = new StringBuilder();	
		
		var index = 0;		
		for(String character : splittedScopeContent)
		{			
			if(character.equals("=") && splittedScopeContent.get(index-1).equals("!"))
			{
				elseScopeStringBuilder.deleteCharAt(index-1)
				elseScopeStringBuilder.append("==")
			}
			else if(character.equals("=") && splittedScopeContent.get(index-1).equals("="))
			{
				elseScopeStringBuilder.deleteCharAt(index-1)
				elseScopeStringBuilder.append("!=")
			}
			else if(character.equals("=") && splittedScopeContent.get(index-1).equals("<"))
			{
				elseScopeStringBuilder.deleteCharAt(index-1)
				elseScopeStringBuilder.append(">=")
			}
			else if(character.equals("=") && splittedScopeContent.get(index-1).equals(">"))
			{
				elseScopeStringBuilder.deleteCharAt(index-1)
				elseScopeStringBuilder.append("<=")
			}
			else if(character.equals("<"))
			{
				elseScopeStringBuilder.append(">")				
			}
			else if(character.equals(">"))
			{
				elseScopeStringBuilder.append("<")
			}
			else
			{
				elseScopeStringBuilder.append(character)
			}
											
			index++;
		}					
						
		stringBuilder.append(						
		'''										
			function ServerFunction�counter�()
			{    					    			    			    
			    �type�(�content�)
			    {  
			    	�scopeContent�				    	
			    }
			    else
			    {
			    	�elseScopeStringBuilder.toString.replace("= true", "= false")�					
				}
			}	
						
		'''				
		)																		
	}
	
	def GetConditionalStatementScopeContent(List<ExpMember> content)
	{
		val scopeContentBuilder = new StringBuilder();		
		
		for (exp : content) 
		{
			if(exp instanceof ConditionalAction) 
			{
				var tempBuilder = new StringBuilder();
				var text = GetConditionalStatementContent(tempBuilder, exp.condition)
				scopeContentBuilder.append(exp.type + "(" + text + ")\n")				
				
				if(exp.expMembers.size > 0)
				{
					scopeContentBuilder.append("{\n" + GetConditionalStatementScopeContent(exp.expMembers) + "}\n")
				}
			} 
			else if(exp instanceof Function) 
			{				
				if(exp instanceof ModuleFunction) 
				{
					if(exp.moduleType instanceof ActuatorType) 
					{
						var out = exp.board.name + "_" + exp.moduleType.name + "_" + exp.moduleType.name + "_" + exp.functionName.name + "_" + "boolean"						
						scopeContentBuilder.append("\t" + out + " = true\n");
					} // Else: Do nothing - Should only contain global variables for actuators
				}																			
			}
		}
		
		return scopeContentBuilder.toString;
	}
	
	def GetConditionalStatementContent(StringBuilder stringBuilder, Condition condition)
	{																	
		if(condition.logicEx.compExp.left.outputfunction != null)
		{		
			val String boardName = condition.logicEx.compExp.left.outputfunction.board.name;
			val String functionName = condition.logicEx.compExp.left.outputfunction.functionName.name;	
					
			variableNamesForPostAndGetRoutes.forEach[k, v| {
				if(k.contains(boardName) && k.contains(functionName))
					stringBuilder.append(k);
			}]								
		}	
		else
		{
			stringBuilder.append(String.valueOf(condition.logicEx.compExp.left.outputValue));
		}
		
		var operator = condition.logicEx.compExp.op;
		stringBuilder.append(" " + operator + " ")
		
		if(condition.logicEx.compExp.right.outputfunction != null)
		{
			val String boardName = condition.logicEx.compExp.left.outputfunction.board.name;
			val String functionName = condition.logicEx.compExp.left.outputfunction.functionName.name;	
					
			variableNamesForPostAndGetRoutes.forEach[k, v| {
				if(k.contains(boardName) && k.contains(functionName))
					stringBuilder.append(k);
			}]	
		}
		else
		{
			stringBuilder.append(String.valueOf(condition.logicEx.compExp.right.outputValue));
		}				
		
		if(condition.operator != null)
		{
			stringBuilder.append(" " + condition.operator + " ");
		}	
		
		if(condition.nestedCondition != null)
		{
			GetConditionalStatementContent(stringBuilder, condition.nestedCondition)
		}	
		
		return stringBuilder.toString;
	}
	 */
}