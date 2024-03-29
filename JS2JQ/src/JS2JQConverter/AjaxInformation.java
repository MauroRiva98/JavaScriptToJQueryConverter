package JS2JQConverter;

import java.util.HashMap;
import java.util.Map;

public class AjaxInformation {

	private String variableName;
	public int [] indexVariableInizialization;
	public int [] indexAjax;
	public HashMap<String, String> propertyMap;
	public HashMap<Integer, String> statusMap;
	public Boolean translateFlag;
	public Boolean sendReached;
	String errorMessage;
	
	public AjaxInformation(String variableName, int start, int stop) {
		this.variableName = variableName;
		this.indexVariableInizialization = new int[2];
		this.indexVariableInizialization[0] = start;
		this.indexVariableInizialization[1] = stop;
		this.indexAjax = new int[2];
		this.indexAjax[0] = -1;
		propertyMap = new HashMap<>();
		statusMap = new HashMap<>();
		sendReached = false;
		translateFlag = true;
		errorMessage = "";
	}
	
	public String getVariableName() {
		return this.variableName;
	}
	
	
}
