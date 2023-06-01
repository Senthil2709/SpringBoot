<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:yellow">
<a href="/showPage?language=en">English</a>|<a href="/showPage?language=de">German</a>|<a href="/showPage?language=fr">French</a></align>
<h1><center> Welcome to Brand new E-Learning Platform for AWS PipeLine Using GitHub</center></h1>
<form:form method="post" action="billDesk" modelAttribute="ePortal">

<table style="margin: 0px auto; margin-left: auto; margin-right:auto">
		               
         <tr><td><spring:message code="label.regNo"/></td><td><form:input path="regNo" id="regNo"/></td><td><form:errors path="regNo"/></td></tr>
         <tr><td><spring:message code="label.studentName"/></td><td><form:input path="studentName" id="studentName"/></td><td><form:errors path="studentName"/></td></tr>
			<tr>
				<td><spring:message code="label.courseName"/></td>
				<td>
				 <form:select path="courseName" id="courseName">
						<form:options items="${courseList}"/>
					</form:select>	
					
				</td>
			</tr>
			<tr>
				<td><spring:message code="label.duration"/></td>
				<td>
				 <form:select path="duration" id="duration">
						<form:options items="${durationList}"/>
					</form:select>	
					
				</td>
			</tr>
						
			
				<td><input type="submit" value="RegisterCourse" id="submit" /></td>
				<td><input type="reset" value="Cancel"/></td>
			</tr>
			
		</table>
</form:form>


</body>
</html>	 	  	    	    	     	      	 	
