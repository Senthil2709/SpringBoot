package com.example.demo;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Web {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

//    @Rule
  //  public Timeout globalTimeout = Timeout.seconds(5); // 10 seconds max per method tested
	@Before
	public void setUp() throws Exception {
	   // String port1=System.getenv("USER");
		// String port=port1.substring(0);
		try
		{
			driver = new HtmlUnitDriver();
		    baseUrl ="";
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   // String url="http://localhost:"+port+"/showPage";
			//driver.get(url);
		    driver.get("http://localhost:8098/showPage");
	    }
		catch(Exception e){
			e.printStackTrace();
			fail("Check for the file showpage.jsp or Syntax of JavaScript / CSS / HTML");
		}
	}
	

	
	@Test(timeout=10000)
	public void test11showpageJSPForCourseJava() throws Exception{
		try{
			try{
				boolean flag=false;
				WebElement e=driver.findElement(By.id("courseName"));
				Select dropdown= new Select(e);
				assertEquals(true, e.isDisplayed());
				List<WebElement> options=dropdown.getOptions();
				for(WebElement option:options)
				{
					//System.out.println(option.getText() +" flag "+flag);
					if(option.getText().equals("Java"))
					flag=true;
				}
				if(flag==true)
				assertTrue(true);
				else
				assertTrue(false);
			//	assertEquals("true",e.getAttribute("required"));
				//assertEquals("User Name",e.getAttribute("placeholder")); 
			}
			catch(Error e){
				fail("Correct HTML Component with the id 'courseName' must be used with appropriate constraints/Check whether course name Java is autopopulated as per the requirement");
				
			}
			catch(Exception e){
				fail("Correct HTML Component with the id 'courseName' must be used with appropriate constraints/Check whether course name Java is autopopulated as per the requirement");
				
			}
		}
		catch(Exception e){
			fail("Should have got a tag with the name - courseName");
		}
	
	}
	
	@Test(timeout=10000)
	public void test11showpageJSPForCourseJEE() throws Exception{
		try{
			try{
				boolean flag=false;
				WebElement e=driver.findElement(By.id("courseName"));
				Select dropdown= new Select(e);
				assertEquals(true, e.isDisplayed());
				List<WebElement> options=dropdown.getOptions();
				for(WebElement option:options)
				{
					//System.out.println(option.getText() +" flag "+flag);
					if(option.getText().equals("JEE"))
					flag=true;
				}
				if(flag==true)
				assertTrue(true);
				else
				assertTrue(false);
			//	assertEquals("true",e.getAttribute("required"));
				//assertEquals("User Name",e.getAttribute("placeholder")); 
			}
			catch(Error e){
				fail("Correct HTML Component with the id 'courseName' must be used with appropriate constraints/Check whether course name JEE is autopopulated as per the requirement");
				
			}
			catch(Exception e){
				fail("Correct HTML Component with the id 'courseName' must be used with appropriate constraints/Check whether course name JEE is autopopulated as per the requirement");
				
			}
		}
		catch(Exception e){
			fail("Should have got a tag with the name - courseName");
		}
	
	}
	
	@Test(timeout=10000)
	public void test11showpageJSPForCourseFrameworks() throws Exception{
		try{
			try{
				boolean flag=false;
				WebElement e=driver.findElement(By.id("courseName"));
				Select dropdown= new Select(e);
				assertEquals(true, e.isDisplayed());
				List<WebElement> options=dropdown.getOptions();
				for(WebElement option:options)
				{
					//System.out.println(option.getText() +" flag "+flag);
					if(option.getText().equals("Frameworks"))
					flag=true;
				}
				if(flag==true)
				assertTrue(true);
				else
				assertTrue(false);
			//	assertEquals("true",e.getAttribute("required"));
				//assertEquals("User Name",e.getAttribute("placeholder")); 
			}
			catch(Error e){
				fail("Correct HTML Component with the id 'courseName' must be used with appropriate constraints/Check whether course name Frameworks is autopopulated as per the requirement");
				
			}
			catch(Exception e){
				fail("Correct HTML Component with the id 'courseName' must be used with appropriate constraints/Check whether course name Frameworks is autopopulated as per the requirement");
				
			}
		}
		catch(Exception e){
			fail("Should have got a tag with the name - courseName");
		}
	
	}
	
	@Test(timeout=10000)
	public void test11showpageJSPForCourseDataScience() throws Exception{
		try{
			try{
				boolean flag=false;
				WebElement e=driver.findElement(By.id("courseName"));
				Select dropdown= new Select(e);
				assertEquals(true, e.isDisplayed());
				List<WebElement> options=dropdown.getOptions();
				for(WebElement option:options)
				{
					//System.out.println(option.getText() +" flag "+flag);
					if(option.getText().equals("DataScience"))
					flag=true;
				}
				if(flag==true)
				assertTrue(true);
				else
				assertTrue(false);
			//	assertEquals("true",e.getAttribute("required"));
				//assertEquals("User Name",e.getAttribute("placeholder")); 
			}
			catch(Error e){
				fail("Correct HTML Component with the id 'courseName' must be used with appropriate constraints/Check whether course name DataScience is autopopulated as per the requirement");
				
			}
			catch(Exception e){
				fail("Correct HTML Component with the id 'courseName' must be used with appropriate constraints/Check whether course name DataScience is autopopulated as per the requirement");
				
			}
		}
		catch(Exception e){
			fail("Should have got a tag with the name - courseName");
		}
	
	}
	@Test(timeout=10000)
	public void test14showpageJSPForStudentName() throws Exception{
	try{
		try{
			WebElement e=driver.findElement(By.id("studentName"));
			assertEquals("text", e.getAttribute("type"));
		//	assertEquals("true",e.getAttribute("required"));
			//assertEquals("User Name",e.getAttribute("placeholder")); 
		}
		catch(Error e){
			fail("Correct HTML Component with the id 'studentName' must be used with appropriate constraints");
			
		}catch(Exception e){
			fail("Correct HTML Component with the id 'studentName' must be used with appropriate constraints");
			
		}
	}
	catch(Exception e){
		fail("Should have got a tag with the name - studentName");
	}
}
	
@Test(timeout=10000)
	public void test15SuccessFlowForJavaCourseNormalDuration(){
		try{
			try{
				driver.findElement(By.id("studentName")).clear();
				driver.findElement(By.id("studentName")).sendKeys("Sathya");
				WebElement mySelectElement = driver.findElement(By.id("courseName"));
				Select dropdown= new Select(mySelectElement);
				dropdown.selectByVisibleText("Java");
				WebElement mySelectElement1 = driver.findElement(By.id("duration"));
				Select dropdown1= new Select(mySelectElement1);
				dropdown1.selectByVisibleText("Normal");
				driver.findElement(By.id("regNo")).clear();
				driver.findElement(By.id("regNo")).sendKeys("123456");
				driver.findElement(By.id("submit")).click();
				try{
					try{
						WebElement element = driver.findElement(By.tagName("h2"));
						String s1=element.getText().toLowerCase().replace(" ","");
						String s2="The Course Fees for Java is 10000.0".toLowerCase().replace(" ","");

						if (element != null)
						assertEquals(s2, s1);
						else
						assertTrue(false);
					}
					catch(Error e){
						fail("Your Business Logic does not give the required output as expected in the problem statement in the UI for Java Course Normal Duration");
					}
					catch(Exception e){
						fail("Your Business Logic does not give the required output as expected in the problem statement in the UI for Java Course Normal Duration");
					}
				}
				catch(Exception e){
					fail("Should have got billdesk.jsp");
				}
			}
			catch(Exception e){
			//	System.out.println(e);
				e.printStackTrace();
				fail("Correct HTML Component with the id 'courseName'/'duration' must be used with appropriate constraints/Check whether CourseName/duration is autopopulated as per the requirement");
				
			}
		}catch(Exception e){
			fail("Should have got proper element "+e.getMessage());
		}
		
	}
@Test(timeout=10000)
public void test15SuccessFlowForJEECourseFastTrackDuration(){
	try{
		try{
			driver.findElement(By.id("studentName")).clear();
			driver.findElement(By.id("studentName")).sendKeys("Sathya");
			WebElement mySelectElement = driver.findElement(By.id("courseName"));
			Select dropdown= new Select(mySelectElement);
			dropdown.selectByVisibleText("JEE");
			WebElement mySelectElement1 = driver.findElement(By.id("duration"));
			Select dropdown1= new Select(mySelectElement1);
			dropdown1.selectByVisibleText("FastTrack");
			driver.findElement(By.id("regNo")).clear();
			driver.findElement(By.id("regNo")).sendKeys("123456");
			driver.findElement(By.id("submit")).click();
			try{
				try{
					WebElement element = driver.findElement(By.tagName("h2"));
					String s1=element.getText().toLowerCase().replace(" ","");
					String s2="The Course Fees for JEE is 13500.0".toLowerCase().replace(" ","");

					if (element != null)
					assertEquals(s2, s1);
					else
					assertTrue(false);
				}
				catch(Error e){
					fail("Your Business Logic does not give the required output as expected in the problem statement in the UI for JEE Course FastTrack Duration");
				}
				catch(Exception e){
					fail("Your Business Logic does not give the required output as expected in the problem statement in the UI for JEE Course FastTrack Duration");
				}
			}
			catch(Exception e){
				fail("Should have got billdesk.jsp");
			}
		}
		catch(Exception e){
		//	System.out.println(e);
			e.printStackTrace();
			fail("Correct HTML Component with the id 'courseName'/'duration' must be used with appropriate constraints/Check whether CourseName/duration is autopopulated as per the requirement");
			
		}
	}catch(Exception e){
		fail("Should have got proper element "+e.getMessage());
	}
	
}
@Test(timeout=10000)
public void test15SuccessFlowForFrameworksCourseWeekendDuration(){
	try{
		try{
			driver.findElement(By.id("studentName")).clear();
			driver.findElement(By.id("studentName")).sendKeys("Sathya");
			WebElement mySelectElement = driver.findElement(By.id("courseName"));
			Select dropdown= new Select(mySelectElement);
			dropdown.selectByVisibleText("Frameworks");
			WebElement mySelectElement1 = driver.findElement(By.id("duration"));
			Select dropdown1= new Select(mySelectElement1);
			dropdown1.selectByVisibleText("Weekend");
			driver.findElement(By.id("regNo")).clear();
			driver.findElement(By.id("regNo")).sendKeys("123456");
			driver.findElement(By.id("submit")).click();
			try{
				try{
					WebElement element = driver.findElement(By.tagName("h2"));
					String s1=element.getText().toLowerCase().replace(" ","");
					String s2="The Course Fees for Frameworks is 22000.0".toLowerCase().replace(" ","");

					if (element != null)
					assertEquals(s2, s1);
					else
					assertTrue(false);
				}
				catch(Error e){
					fail("Your Business Logic does not give the required output as expected in the problem statement in the UI for Frameworks Course Weekend Duration");
				}
				catch(Exception e){
					fail("Your Business Logic does not give the required output as expected in the problem statement in the UI for Frameworks Course Weekend Duration");
				}
			}
			catch(Exception e){
				fail("Should have got billdesk.jsp");
			}
		}
		catch(Exception e){
		//	System.out.println(e);
			e.printStackTrace();
			fail("Correct HTML Component with the id 'courseName'/'duration' must be used with appropriate constraints/Check whether CourseName/duration is autopopulated as per the requirement");
			
		}
	}catch(Exception e){
		fail("Should have got proper element "+e.getMessage());
	}
	
}
@Test(timeout=10000)
public void test15SuccessFlowForDataScienceCourseWeekendDuration(){
	try{
		try{
			driver.findElement(By.id("studentName")).clear();
			driver.findElement(By.id("studentName")).sendKeys("Sathya");
			WebElement mySelectElement = driver.findElement(By.id("courseName"));
			Select dropdown= new Select(mySelectElement);
			dropdown.selectByVisibleText("DataScience");
			WebElement mySelectElement1 = driver.findElement(By.id("duration"));
			Select dropdown1= new Select(mySelectElement1);
			dropdown1.selectByVisibleText("Weekend");
			driver.findElement(By.id("regNo")).clear();
			driver.findElement(By.id("regNo")).sendKeys("123456");
			driver.findElement(By.id("submit")).click();
			try{
				try{
					WebElement element = driver.findElement(By.tagName("h2"));
					String s1=element.getText().toLowerCase().replace(" ","");
					String s2="The Course Fees for DataScience is 27500.0".toLowerCase().replace(" ","");

					if (element != null)
					assertEquals(s2, s1);
					else
					assertTrue(false);
				}
				catch(Error e){
					fail("Your Business Logic does not give the required output as expected in the problem statement in the UI for DataScience Course Weekend Duration");
				}
				catch(Exception e){
					fail("Your Business Logic does not give the required output as expected in the problem statement in the UI for DataScience Course Weekend Duration");
				}
			}
			catch(Exception e){
				fail("Should have got billdesk.jsp");
			}
		}
		catch(Exception e){
		//	System.out.println(e);
			e.printStackTrace();
			fail("Correct HTML Component with the id 'courseName'/'duration' must be used with appropriate constraints/Check whether CourseName/duration is autopopulated as per the requirement");
			
		}
	}catch(Exception e){
		fail("Should have got proper element "+e.getMessage());
	}
	
}
	
	
	/***************ForValdiations and Internationalization**/
	
	@Test(timeout = 10000)
	public void test1showPageUIForDefaultEnglish()
	{
			try {
			    System.out.println("For english");
//	
//	 String port1=System.getenv("USER");
//	 String port=port1.substring(0);
//				  
//	driver.get("http://localhost:"+port+"/showPage");

			   driver.get("http://localhost:8098/showPage");
			    String a=driver.findElement(By.cssSelector("body")).getText();
				//String result="Total number of updated status6Total number of passed status5Total number of failed status1Total amount(Passed)482100.0Total amount(Failed)24000.0";
			//	System.out.println(a.toLowerCase());
				String aWithoutSpace=a.replaceAll("\\s", "").toLowerCase(); 
				System.out.println(aWithoutSpace);
				
			
			
	    	try
	    	{
	    		
	    		if(aWithoutSpace!=null && aWithoutSpace.contains("registrationnumberinenglish")&&aWithoutSpace.contains("studentnameinenglish")&&aWithoutSpace.contains("coursenameinenglish")&&aWithoutSpace.contains("durationinenglish"))
				{
	    		assertTrue(true);
				}
	    		else
	    		{
	    			assertTrue(false);
	    		}
	    			
	    	}
	    	catch(Error e)
	    	{
	    		fail("You have not internationalized the all the components in the showpage.jsp page as per the problem statement for English which is the default ");
	    	}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			fail("Check for the file showpage.jsp");
			}
	  }
	 
	
	@Test(timeout = 10000)
	public void test1showPageUIForGerman()
	{
			try {
			    System.out.println("For German");
//	
//	 String port1=System.getenv("USER");
//	 String port=port1.substring(0);
//				  
//	driver.get("http://localhost:"+port+"/showPage");

			   driver.get("http://localhost:8098/showPage?language=de");
			    String a=driver.findElement(By.cssSelector("body")).getText();
				//String result="Total number of updated status6Total number of passed status5Total number of failed status1Total amount(Passed)482100.0Total amount(Failed)24000.0";
			//	System.out.println(a.toLowerCase());
				String aWithoutSpace=a.replaceAll("\\s", "").toLowerCase(); 
				System.out.println(aWithoutSpace);
				
			
			
	    	try
	    	{
	    		
	    		if(aWithoutSpace!=null && aWithoutSpace.contains("registrationnumberingerman")&&aWithoutSpace.contains("studentnameingerman")&&aWithoutSpace.contains("coursenameingerman")&&aWithoutSpace.contains("durationingerman"))
				{
	    		assertTrue(true);
				}
	    		else
	    		{
	    			assertTrue(false);
	    		}
	    			
	    	}
	    	catch(Error e)
	    	{
	    		fail("You have not internationalized the all the components in the showpage.jsp page as per the problem statement for German ");
	    	}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			fail("Check for the file showpage.jsp");
			}
	  }
	 
	@Test(timeout = 10000)
	public void test3showPageUIForFrench()
	{
			try {
			    System.out.println("For French");
//	
//	 String port1=System.getenv("USER");
//	 String port=port1.substring(0);
//				  
//	driver.get("http://localhost:"+port+"/showPage?language=fr");

			    driver.get("http://localhost:8098/showPage?language=fr");
			    String a=driver.findElement(By.cssSelector("body")).getText();
				//String result="Total number of updated status6Total number of passed status5Total number of failed status1Total amount(Passed)482100.0Total amount(Failed)24000.0";
			//	System.out.println(a.toLowerCase());
				String aWithoutSpace=a.replaceAll("\\s", "").toLowerCase(); 
				System.out.println(aWithoutSpace);
				
			
			
	    	try
	    	{
	    		
	    		if(aWithoutSpace!=null && aWithoutSpace.contains("registrationnumberinfrench")&&aWithoutSpace.contains("studentnameinfrench")&&aWithoutSpace.contains("coursenameinfrench")&&aWithoutSpace.contains("durationinfrench"))
				{
	    		assertTrue(true);
				}
	    		else
	    		{
	    			assertTrue(false);
	    		}
	    			
	    	}
	    	catch(Error e)
	    	{
	    		fail("You have not internationalized the all the components in the showpage.jsp page as per the problem statement for French ");
	    	}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			fail("Check for the file showpage.jsp");
			}
	  }
//Validations	 
	@Test(timeout = 10000)
	public void test4ErrorMessageForStudentNameEmptyInGerman()
	{
			try {
			//driver.get("http://localhost:9092/getdetails");
				//System.out.println("Error.............");
			//System.out.println("called");
		//	driver.get("http://localhost:9091/showRegisterPage");
		
	//	 String port1=System.getenv("USER");
	//	 String port=port1.substring(0);
		 //System.out.println("frst name blank");
		//  driver.get("http://localhost:"+port+"/showPage?language=de");
			driver.get("http://localhost:8098/showPage?language=de");
			driver.findElement(By.id("submit")).click();
			Thread.sleep(100);
			String a=driver.findElement(By.cssSelector("body")).getText();
			String aWithoutSpace=a.replaceAll("\\s", "").toLowerCase();
			if(aWithoutSpace!=null && aWithoutSpace.contains("studentnamecannotbeblankingerman"))
			{
				assertTrue(true);
			}
			else
			{
				assertTrue(false);
			}
			
			
		//	System.out.println("End......................................................");
			}
			catch(AssertionError e)
			{
				fail("Error Messages for student name (Student name cannot be blank in German)  is not correctly displayed in the showpage.jsp");
			}
			catch(Exception e)
			{
			fail("Check for the file showpage.jsp");

			}
		
	  }
	
	
	@Test(timeout = 10000)
	public void test6ErrorMessageForRegistrationNumberNegativeCheckInGerman()
	{
			try {
		
		// String port1=System.getenv("USER");
	//	String port=port1.substring(0);
		 //System.out.println("frst name blank");
		//  driver.get("http://localhost:"+port+"/showPage?language=de");
			driver.get("http://localhost:8098/showPage?language=de");
			driver.findElement(By.id("studentName")).clear();
			driver.findElement(By.id("studentName")).sendKeys("Sathya");
			driver.findElement(By.id("regNo")).clear();
			driver.findElement(By.id("regNo")).sendKeys("-7");
			driver.findElement(By.id("submit")).click();
			Thread.sleep(100);
			String a=driver.findElement(By.cssSelector("body")).getText();
			String aWithoutSpace=a.replaceAll("\\s", "").toLowerCase();
			if(aWithoutSpace!=null && aWithoutSpace.contains("registrationnumbercanonlybezeroorpositivenumbersingerman"))
			{
				assertTrue(true);
			}
			else
			{
				assertTrue(false);
			}
			
			
		//	System.out.println("End......................................................");
			}
			catch(AssertionError e)
			{
				fail("Error Messages for registration number (Registration number can only be zero or positive numbers in German)  is not correctly displayed in the showpage.jsp");
			}
			catch(Exception e)
			{
			fail("Check for the file showPage.jsp");

			}
		
	  }
	
	
	@Test(timeout = 10000)
	public void test6ErrorMessageForRegistrationNumberExceedCheckInGerman()
	{
			try {
		
		// String port1=System.getenv("USER");
	//	String port=port1.substring(0);
		 //System.out.println("frst name blank");
		//  driver.get("http://localhost:"+port+"/showPage?language=de");
				driver.get("http://localhost:8098/showPage?language=de");
				driver.findElement(By.id("studentName")).clear();
				driver.findElement(By.id("studentName")).sendKeys("Sathya");
				driver.findElement(By.id("regNo")).clear();
				driver.findElement(By.id("regNo")).sendKeys("123456789");
				driver.findElement(By.id("submit")).click();
			Thread.sleep(100);
			String a=driver.findElement(By.cssSelector("body")).getText();
			String aWithoutSpace=a.replaceAll("\\s", "").toLowerCase();
			if(aWithoutSpace!=null && aWithoutSpace.contains("registrationnumbercannotexceedsixdigitsingerman"))
			{
				assertTrue(true);
			}
			else
			{
				assertTrue(false);
			}
			
			
		//	System.out.println("End......................................................");
			}
			catch(AssertionError e)
			{
				fail("Error Messages for Registration number (Registration number cannot exceed six digits in German)  is not correctly displayed in the showpage.jsp");
			}
			catch(Exception e)
			{
			fail("Check for the file showpage.jsp");

			}
		
	  }

	
	

}
