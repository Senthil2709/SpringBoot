package com.example.demo;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.junit.Test;

public class FeatureTest
{
	@Test
	public void testAnnotationAboveController()
	{
		boolean flag=false;
		try {
		Class cobj=	Class.forName("com.controller.EPortalController");
		Annotation[] ann=cobj.getAnnotations();
		for(Annotation a:ann)
		{
			if(a.annotationType().getSimpleName().equals("Controller"))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
		} catch (ClassNotFoundException e) {
			fail("You have changed the EPortalController className inside the com.controller package");
		}
		catch(AssertionError e)
		{
			fail("You have not used the appropriate Annotation above the EPortalController class");
		}
	}
	
	
	
	
	@Test
	public void testDependencyInjection()
	{
		boolean flag=false;
		try {
		Class cobj=	Class.forName("com.controller.EPortalController");
		Field f=cobj.getDeclaredField("ePortalService");
		Annotation[] ann=f.getAnnotations();
		for(Annotation a:ann)
		{
			if(a.annotationType().getSimpleName().equals("Autowired"))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
		} catch (ClassNotFoundException e) {
			fail("You have changed the EPortalController className inside the com.controller package");
		}
		catch(AssertionError e)
		{
			e.printStackTrace();
			fail("You have not used the appropriate Annotation above the ePortalService attribute in the EPortalController class");
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			fail("You have not declared the attribute with the name ePortalService in the EPortalController class");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			fail("You have not declared the attribute with the name ePortalService in the EPortalController class");
		}
	}
	
	
	
	
	@Test
	public void testAnnotationAboveService()
	{
		boolean flag=false;
		try {
		Class cobj=	Class.forName("com.service.EPortalService");
		Annotation[] ann=cobj.getAnnotations();
		for(Annotation a:ann)
		{
			if(a.annotationType().getSimpleName().equals("Service"))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
		} catch (ClassNotFoundException e) {
			fail("You have changed the EPortalService className inside the com.service package");
		}
		catch(AssertionError e)
		{
			fail("You have not used the appropriate Annotation above the EPortalService class");
		}
	}
	
	
	@Test
	public void testAnnotationAboveMethod()
	{
		boolean flag=false;
		try {
		Class cobj=	Class.forName("com.controller.EPortalController");
		Method m=cobj.getMethod("populateCourse");
	Annotation ann[]=	m.getAnnotations();
		
		for(Annotation a:ann)
		{
			if(a.annotationType().getSimpleName().equals("ModelAttribute"))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
		} catch (ClassNotFoundException e) {
			fail("You have changed the EPortalController className inside the com.controller package");
		}
		catch(AssertionError e)
		{
			fail("You have not used the appropriate Annotation above the populateCourse method in the EPortalController");
		} catch (NoSuchMethodException e) {
			
			fail("You have changed the signature of populateCourse method inside the EPortalController class");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testAnnotationValueAboveMethod()
	{
		boolean flag=false;
		try {
		Class cobj=	Class.forName("com.controller.EPortalController");
		Method m=cobj.getMethod("populateCourse");
	Annotation ann[]=	m.getAnnotations();
		
		for(Annotation a:ann)
		{
			if(a instanceof ModelAttribute) {
		ModelAttribute m1=(ModelAttribute)a;
				
			if(m1.value().equals("courseList"))
			{
				
				flag=true;
				break;
			}
		}
		}
		if(flag==true)
		{
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
		} catch (ClassNotFoundException e) {
			fail("You have changed the EPortalController className inside the com.controller package");
		}
		catch(AssertionError e)
		{
			fail("You have not used the appropriate ModelAttribute value- courseList above the populateCourse method in the EPortalController");
		} catch (NoSuchMethodException e) {
			
			fail("You have changed the signature of populateCourse method inside the EPortalController class");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
	@Test
	public void test12AnnotationAboveMethod()
	{
		boolean flag=false;
		try {
		Class cobj=	Class.forName("com.controller.EPortalController");
		Method m=cobj.getMethod("populateDuration");
	Annotation ann[]=	m.getAnnotations();
		
		for(Annotation a:ann)
		{
			if(a.annotationType().getSimpleName().equals("ModelAttribute"))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
		} catch (ClassNotFoundException e) {
			fail("You have changed the EPortalController className inside the com.controller package");
		}
		catch(AssertionError e)
		{
			fail("You have not used the appropriate Annotation above the populateDuration method in the EPortalController");
		} catch (NoSuchMethodException e) {
			
			fail("You have changed the signature of populateDuration method inside the EPortalController class");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void test12AnnotationValueAboveMethod()
	{
		boolean flag=false;
		try {
		Class cobj=	Class.forName("com.controller.EPortalController");
		Method m=cobj.getMethod("populateDuration");
	Annotation ann[]=	m.getAnnotations();
		
		for(Annotation a:ann)
		{
			if(a instanceof ModelAttribute) {
		ModelAttribute m1=(ModelAttribute)a;
				
			if(m1.value().equals("durationList"))
			{
				
				flag=true;
				break;
			}
		}
		}
		if(flag==true)
		{
			assertTrue(true);
		}
		else {
			assertTrue(false);
		}
		} catch (ClassNotFoundException e) {
			fail("You have changed the EPortalController className inside the com.controller package");
		}
		catch(AssertionError e)
		{
			fail("You have not used the appropriate ModelAttribute value- durationList above the populateDuration method in the EPortalController");
		} catch (NoSuchMethodException e) {
			
			fail("You have changed the signature of populateDuration method inside the EPortalController class");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

	
	
}