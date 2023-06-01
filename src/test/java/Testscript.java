// package com;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Testscript {
	@XmlElement(name = "functiontested")
	private List<Functiontested> functiontested;

	public Testscript() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Testscript(List<Functiontested> functiontested) {
		super();
		this.functiontested = functiontested;
	}

	public List<Functiontested> getFunctiontested() {
		return functiontested;
	}

	public void setFunctiontested(List<Functiontested> functiontested) {
		this.functiontested = functiontested;
	}
	
}
