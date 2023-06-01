package com.example.demo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import javax.validation.Validation;
import javax.validation.Validator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.context.WebApplicationContext;

import com.controller.EPortalController;
import com.model.EPortal;
import com.service.EPortalService;



//@SpringBootConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SpringTest {

	
    @Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;
   @Mock
   private EPortalService service;
    
    @InjectMocks
   private EPortalController ctrl;
    
    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        MockitoAnnotations.initMocks(this);
   
       }
    @Test
    public void testShowPage(){
    	ResultMatcher ok=MockMvcResultMatchers.status().isOk();
    		
       try {
		this.mockMvc.perform(get("/showPage")).andExpect(ok);
		this.mockMvc.perform(get("/showPage")).andExpect(ok).andExpect(view().name("showpage"));
       	}
       catch (AssertionError e) {
		   if(e.getMessage().contains("View"))
    	   {
    		   fail(e.getMessage());
    	   }
		fail("The request Mapping - /showPage(above showPage method in EPortalController) that redirects to show page is not correct");
       	}
       catch(Exception e)
       {
    	  fail("The request Mapping - /showPage(above showPage method in EPortalController) that redirects to show page is not correct");
       }
       
   }
    

    @Test
    public void testResultPage()
    {
    	ResultMatcher ok=MockMvcResultMatchers.status().isOk();
    		
    	EPortal bean=new EPortal();
    	bean.setRegNo(123456);
    	bean.setStudentName("Sathya");
    	bean.setCourseName("Java");
    	bean.setDuration("Normal");
    	
       try {
		   this.mockMvc.perform(post("/billDesk").flashAttr("ePortal", bean)).andExpect(ok);
		   this.mockMvc.perform(post("/billDesk").flashAttr("ePortal", bean)).andExpect(ok).andExpect(view().name("billdesk"));
		
       	}
       catch (AssertionError e) {
    	   e.printStackTrace();
		   if(e.getMessage().contains("View"))
    	   {
    		   fail(e.getMessage());
    	   }
		fail("Request Mapping -/billDesk(above calculateCourseFees method in EPortalController class) that redirects to billdesk page is not correct");
       	}
       catch(Exception e)
       { 
    	   fail("The model attribute-ePortal/POST request is not as per the requirement");
       }
      

   }
   
   @Test
   public void testToInvokingcalculateCourseFeesMethodInEPortalServiceClass()
   {
         
      try {
  BindingResult result=Mockito.mock(BindingResult.class);
  EPortal bean=new EPortal();
  bean.setRegNo(123456);
  bean.setStudentName("Sathya");
  bean.setCourseName("Frameworks");
  bean.setDuration("Weekend");
  ModelMap model=Mockito.mock(ModelMap.class);
      ctrl.calculateCourseFees(bean,result, model);
     verify(service).calculateCourseFees(bean);
      }
      catch (AssertionError e) {
//       e.printStackTrace();
 fail("The invoking of calculateCourseFees Method in EPortalService class is not done as per requirement");
      }
      catch(Exception e)
      {
      fail("The model attribute name should be as per the requirement");
      }
  }


}
