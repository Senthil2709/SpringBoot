// package com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Testcase {
	private String name;
	private String maxmark;
	private String description;
	private String shortdescription;
	
	public String getShortdescription() {
		return shortdescription;
	}
	public void setShortdescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Testcase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Testcase(String name, String maxmark) {
		super();
		this.name = name;
		this.maxmark = maxmark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaxmark() {
		return maxmark;
	}
	public void setMaxmark(String maxmark) {
		this.maxmark = maxmark;
	}
	
}
