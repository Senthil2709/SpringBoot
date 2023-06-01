// package com;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Expertise {
	private String name;
	@XmlElementWrapper(name = "testcases")
	@XmlElement(name = "testcase")
	private List<Testcase> testcases;
	private Grade grade;
	public Expertise() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Expertise(String name, List<Testcase> testcases, Grade grade) {
		super();
		this.name = name;
		this.testcases = testcases;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Testcase> getTestcases() {
		return testcases;
	}
	public void setTestcases(List<Testcase> testcases) {
		this.testcases = testcases;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	
}
