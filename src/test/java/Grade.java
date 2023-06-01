// package com;



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Grade {
	private String complete;
	private String partial;
	private String incomplete;
	public Grade(String complete, String partial, String incomplete) {
		super();
		this.complete = complete;
		this.partial = partial;
		this.incomplete = incomplete;
	}
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getComplete() {
		return complete;
	}
	public void setComplete(String complete) {
		this.complete = complete;
	}
	public String getPartial() {
		return partial;
	}
	public void setPartial(String partial) {
		this.partial = partial;
	}
	public String getIncomplete() {
		return incomplete;
	}
	public void setIncomplete(String incomplete) {
		this.incomplete = incomplete;
	}
	
	
	
}
