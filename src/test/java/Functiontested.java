// package com;


import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Functiontested {
	private String name;
	@XmlElementWrapper(name = "expertises")
	@XmlElement(name = "expertise")
	private List<Expertise> expertises;
	public Functiontested() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Functiontested(String name, List<Expertise> expertises) {
		super();
		this.name = name;
		this.expertises = expertises;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Expertise> getExpertises() {
		return expertises;
	}
	public void setExpertises(List<Expertise> expertises) {
		this.expertises = expertises;
	}
	
}
