/*
 * generated by Xtext 2.16.0
 */
package xtext.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import xtext.ide.contentassist.antlr.internal.InternalPycomParser;
import xtext.services.PycomGrammarAccess;

public class PycomParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PycomGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PycomGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
			builder.put(grammarAccess.getHostAccess().getAlternatives(), "rule__Host__Alternatives");
			builder.put(grammarAccess.getBoardMemberAccess().getAlternatives(), "rule__BoardMember__Alternatives");
			builder.put(grammarAccess.getExpMemberAccess().getAlternatives(), "rule__ExpMember__Alternatives");
			builder.put(grammarAccess.getCommunicationTypeAccess().getAlternatives(), "rule__CommunicationType__Alternatives");
			builder.put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
			builder.put(grammarAccess.getLogicExpAccess().getAlternatives(), "rule__LogicExp__Alternatives");
			builder.put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getSystemAccess().getGroup(), "rule__System__Group__0");
			builder.put(grammarAccess.getLibraryAccess().getGroup(), "rule__Library__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup_4(), "rule__Import__Group_4__0");
			builder.put(grammarAccess.getServerAccess().getGroup(), "rule__Server__Group__0");
			builder.put(grammarAccess.getConnectionAccess().getGroup(), "rule__Connection__Group__0");
			builder.put(grammarAccess.getIpaddressAccess().getGroup(), "rule__Ipaddress__Group__0");
			builder.put(grammarAccess.getBoardAccess().getGroup(), "rule__Board__Group__0");
			builder.put(grammarAccess.getBoardAccess().getGroup_7(), "rule__Board__Group_7__0");
			builder.put(grammarAccess.getBoardAccess().getGroup_7_2(), "rule__Board__Group_7_2__0");
			builder.put(grammarAccess.getConditionalActionAccess().getGroup(), "rule__ConditionalAction__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup(), "rule__Sensor__Group__0");
			builder.put(grammarAccess.getSensorAccess().getGroup_4(), "rule__Sensor__Group_4__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup(), "rule__Actuator__Group__0");
			builder.put(grammarAccess.getActuatorAccess().getGroup_4(), "rule__Actuator__Group_4__0");
			builder.put(grammarAccess.getCommunicationAccess().getGroup(), "rule__Communication__Group__0");
			builder.put(grammarAccess.getCommunicationTypeAccess().getGroup_0(), "rule__CommunicationType__Group_0__0");
			builder.put(grammarAccess.getPinAccess().getGroup(), "rule__Pin__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_1(), "rule__Condition__Group_1__0");
			builder.put(grammarAccess.getConditionAccess().getGroup_2(), "rule__Condition__Group_2__0");
			builder.put(grammarAccess.getComparisonExpAccess().getGroup(), "rule__ComparisonExp__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getSystemAccess().getLibrariesAssignment_0(), "rule__System__LibrariesAssignment_0");
			builder.put(grammarAccess.getSystemAccess().getImportsAssignment_1(), "rule__System__ImportsAssignment_1");
			builder.put(grammarAccess.getSystemAccess().getBoardsAssignment_2(), "rule__System__BoardsAssignment_2");
			builder.put(grammarAccess.getSystemAccess().getServersAssignment_3(), "rule__System__ServersAssignment_3");
			builder.put(grammarAccess.getLibraryAccess().getNameAssignment_1(), "rule__Library__NameAssignment_1");
			builder.put(grammarAccess.getLibraryAccess().getImportsAssignment_3(), "rule__Library__ImportsAssignment_3");
			builder.put(grammarAccess.getImportAccess().getNameAssignment_1(), "rule__Import__NameAssignment_1");
			builder.put(grammarAccess.getImportAccess().getParameterAssignment_3(), "rule__Import__ParameterAssignment_3");
			builder.put(grammarAccess.getImportAccess().getParameterAssignment_4_1(), "rule__Import__ParameterAssignment_4_1");
			builder.put(grammarAccess.getImportAccess().getPathAssignment_7(), "rule__Import__PathAssignment_7");
			builder.put(grammarAccess.getParameterTypeAccess().getNumberAssignment_0(), "rule__ParameterType__NumberAssignment_0");
			builder.put(grammarAccess.getParameterTypeAccess().getTextAssignment_1(), "rule__ParameterType__TextAssignment_1");
			builder.put(grammarAccess.getServerAccess().getNameAssignment_1(), "rule__Server__NameAssignment_1");
			builder.put(grammarAccess.getServerAccess().getConnAssignment_3(), "rule__Server__ConnAssignment_3");
			builder.put(grammarAccess.getServerAccess().getExpsAssignment_6(), "rule__Server__ExpsAssignment_6");
			builder.put(grammarAccess.getConnectionAccess().getHostAssignment_0(), "rule__Connection__HostAssignment_0");
			builder.put(grammarAccess.getConnectionAccess().getPortnumberAssignment_2(), "rule__Connection__PortnumberAssignment_2");
			builder.put(grammarAccess.getHostAccess().getIpAdrAssignment_0(), "rule__Host__IpAdrAssignment_0");
			builder.put(grammarAccess.getHostAccess().getWebsiteAssignment_1(), "rule__Host__WebsiteAssignment_1");
			builder.put(grammarAccess.getBoardAccess().getNameAssignment_1(), "rule__Board__NameAssignment_1");
			builder.put(grammarAccess.getBoardAccess().getBoardTypeAssignment_3(), "rule__Board__BoardTypeAssignment_3");
			builder.put(grammarAccess.getBoardAccess().getCommunicationRateAssignment_5(), "rule__Board__CommunicationRateAssignment_5");
			builder.put(grammarAccess.getBoardAccess().getLibraryAssignment_7_1(), "rule__Board__LibraryAssignment_7_1");
			builder.put(grammarAccess.getBoardAccess().getLibraryAssignment_7_2_1(), "rule__Board__LibraryAssignment_7_2_1");
			builder.put(grammarAccess.getBoardAccess().getBoardMembersAssignment_9(), "rule__Board__BoardMembersAssignment_9");
			builder.put(grammarAccess.getBoardMemberAccess().getBoardMemberAssignment_0(), "rule__BoardMember__BoardMemberAssignment_0");
			builder.put(grammarAccess.getConditionalActionAccess().getTypeAssignment_0(), "rule__ConditionalAction__TypeAssignment_0");
			builder.put(grammarAccess.getConditionalActionAccess().getConditionAssignment_2(), "rule__ConditionalAction__ConditionAssignment_2");
			builder.put(grammarAccess.getConditionalActionAccess().getExpMembersAssignment_5(), "rule__ConditionalAction__ExpMembersAssignment_5");
			builder.put(grammarAccess.getSensorAccess().getTypeNameAssignment_1(), "rule__Sensor__TypeNameAssignment_1");
			builder.put(grammarAccess.getSensorAccess().getSensorNameAssignment_3(), "rule__Sensor__SensorNameAssignment_3");
			builder.put(grammarAccess.getSensorAccess().getPinsAssignment_4_1(), "rule__Sensor__PinsAssignment_4_1");
			builder.put(grammarAccess.getActuatorAccess().getTypeNameAssignment_1(), "rule__Actuator__TypeNameAssignment_1");
			builder.put(grammarAccess.getActuatorAccess().getActuatorNameAssignment_3(), "rule__Actuator__ActuatorNameAssignment_3");
			builder.put(grammarAccess.getActuatorAccess().getPinsAssignment_4_1(), "rule__Actuator__PinsAssignment_4_1");
			builder.put(grammarAccess.getModuleTypeAccess().getNameAssignment(), "rule__ModuleType__NameAssignment");
			builder.put(grammarAccess.getModuleNameAccess().getNameAssignment(), "rule__ModuleName__NameAssignment");
			builder.put(grammarAccess.getCommunicationAccess().getTypeAssignment_2(), "rule__Communication__TypeAssignment_2");
			builder.put(grammarAccess.getCommunicationTypeAccess().getNameAssignment_0_0(), "rule__CommunicationType__NameAssignment_0_0");
			builder.put(grammarAccess.getCommunicationTypeAccess().getSsidAssignment_0_2(), "rule__CommunicationType__SsidAssignment_0_2");
			builder.put(grammarAccess.getCommunicationTypeAccess().getPasswordAssignment_0_4(), "rule__CommunicationType__PasswordAssignment_0_4");
			builder.put(grammarAccess.getCommunicationTypeAccess().getNameAssignment_1(), "rule__CommunicationType__NameAssignment_1");
			builder.put(grammarAccess.getCommunicationTypeAccess().getNameAssignment_2(), "rule__CommunicationType__NameAssignment_2");
			builder.put(grammarAccess.getPinAccess().getPowerAssignment_0(), "rule__Pin__PowerAssignment_0");
			builder.put(grammarAccess.getPinAccess().getInputAssignment_2(), "rule__Pin__InputAssignment_2");
			builder.put(grammarAccess.getPinNameAccess().getNameAssignment(), "rule__PinName__NameAssignment");
			builder.put(grammarAccess.getConditionAccess().getLogicExAssignment_0(), "rule__Condition__LogicExAssignment_0");
			builder.put(grammarAccess.getConditionAccess().getLogicExAssignment_1_0(), "rule__Condition__LogicExAssignment_1_0");
			builder.put(grammarAccess.getConditionAccess().getOperatorAssignment_1_1(), "rule__Condition__OperatorAssignment_1_1");
			builder.put(grammarAccess.getConditionAccess().getNestedConditionAssignment_1_2(), "rule__Condition__NestedConditionAssignment_1_2");
			builder.put(grammarAccess.getConditionAccess().getLogicExAssignment_2_0(), "rule__Condition__LogicExAssignment_2_0");
			builder.put(grammarAccess.getConditionAccess().getOperatorAssignment_2_1(), "rule__Condition__OperatorAssignment_2_1");
			builder.put(grammarAccess.getConditionAccess().getNestedConditionAssignment_2_2(), "rule__Condition__NestedConditionAssignment_2_2");
			builder.put(grammarAccess.getLogicExpAccess().getBoolValAssignment_0(), "rule__LogicExp__BoolValAssignment_0");
			builder.put(grammarAccess.getLogicExpAccess().getCompExpAssignment_1(), "rule__LogicExp__CompExpAssignment_1");
			builder.put(grammarAccess.getBooleanAccess().getValueAssignment_0(), "rule__Boolean__ValueAssignment_0");
			builder.put(grammarAccess.getBooleanAccess().getValueAssignment_1(), "rule__Boolean__ValueAssignment_1");
			builder.put(grammarAccess.getComparisonExpAccess().getLeftAssignment_0(), "rule__ComparisonExp__LeftAssignment_0");
			builder.put(grammarAccess.getComparisonExpAccess().getOpAssignment_1(), "rule__ComparisonExp__OpAssignment_1");
			builder.put(grammarAccess.getComparisonExpAccess().getRightAssignment_2(), "rule__ComparisonExp__RightAssignment_2");
			builder.put(grammarAccess.getExpressionAccess().getOutputValueAssignment_0(), "rule__Expression__OutputValueAssignment_0");
			builder.put(grammarAccess.getExpressionAccess().getOutputfunctionAssignment_1(), "rule__Expression__OutputfunctionAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getBoardAssignment_0(), "rule__Function__BoardAssignment_0");
			builder.put(grammarAccess.getFunctionAccess().getFunctionNameAssignment_2(), "rule__Function__FunctionNameAssignment_2");
			builder.put(grammarAccess.getFunctionAccess().getPinsAssignment_4(), "rule__Function__PinsAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PycomGrammarAccess grammarAccess;

	@Override
	protected InternalPycomParser createParser() {
		InternalPycomParser result = new InternalPycomParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PycomGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PycomGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
