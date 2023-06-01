package com.model;


import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;


public class EPortal {
	
	@PositiveOrZero(message="{error.regNo.positive}")
	@Digits(integer=6, fraction=2,message="{error.regNo.max}")
	private int regNo;
	
	
	@NotEmpty(message = "{error.studentName.blank}") 
	private String studentName;
	
	private String courseName;
	private String duration;
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	

}
