// package com;

public class PmdElements {
	public String Current_Element;
	public String ruleset;
	public Integer priority;
	public String method; 
	public String class_name;
	public String variable;
	public String Error_msg;
	public String getCurrent_Element() {
		return Current_Element;
	}
	public void setCurrent_Element(String current_Element) {
		Current_Element = current_Element;
	}
	public String getRuleset() {
		return ruleset;
	}
	public void setRuleset(String ruleset) {
		this.ruleset = ruleset;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getVariable() {
		return variable;
	}
	public void setVariable(String variable) {
		this.variable = variable;
	}
	public String getError_msg() {
		return Error_msg;
	}
	public void setError_msg(String error_msg) {
	        this.Error_msg = error_msg;
	}
	public PmdElements(String current_Element, String ruleset,
			Integer priority, String method, String class_name,
			String variable, String error_msg) {
		super();
		Current_Element = current_Element;
		this.ruleset = ruleset;
		this.priority = priority;
		this.method = method;
		this.class_name = class_name;
		this.variable = variable;
		Error_msg = error_msg;
	}
	public PmdElements() {
		super();
	}
	
	

}
