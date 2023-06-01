package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.EPortal;
import com.service.EPortalService;

@Controller
public class EPortalController {
	@Autowired
	private EPortalService ePortalService;
	
	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("ePortal") EPortal ePortal) {
		
		return "showpage";
	}
	
	@ModelAttribute("courseList")
	public  Map<String, String> populateCourse(){
		
		Map<String, String> courseMap = new HashMap<String, String>();
		courseMap.put("Java", "Java");
		courseMap.put("JEE", "JEE");
		courseMap.put("Frameworks", "Frameworks");
		courseMap.put("DataScience", "DataScience");
		return courseMap;                     
		
	}	
	
	@ModelAttribute("durationList")
	public  Map<String, String> populateDuration(){
		
		Map<String, String> durationMap = new HashMap<String, String>();
		durationMap.put("Normal", "Normal");
		durationMap.put("Weekend", "Weekend");
		durationMap.put("FastTrack", "FastTrack");
		return durationMap;                     
		
	}	

	@RequestMapping(value = "/billDesk", method = RequestMethod.POST)
	public String calculateCourseFees(@Valid@ModelAttribute("ePortal") EPortal ePortal, 
			BindingResult result,ModelMap model) {
		
		if(result.hasErrors())
			return "showpage";
		else
		{
		double fees=ePortalService.calculateCourseFees(ePortal);
		model.addAttribute("fees", fees);
		model.addAttribute("name",ePortal.getCourseName());
		return "billdesk";
		}
	}

}
