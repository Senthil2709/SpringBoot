package com.service;

import org.springframework.stereotype.Service;

import com.model.EPortal;


@Service
public class EPortalService {
	
	public double calculateCourseFees(EPortal ePortal)
	{
			double fees=0;
		
			if(ePortal.getCourseName().equalsIgnoreCase("java") && ePortal.getDuration().equalsIgnoreCase("Normal") ) {
				fees=10000;
			}
			
			else if (ePortal.getCourseName().equalsIgnoreCase("java") && ePortal.getDuration().equalsIgnoreCase("Weekend") ) {
				fees = 10000+(10000 * 0.1 );
			}
			
			else if (ePortal.getCourseName().equalsIgnoreCase("java") && ePortal.getDuration().equalsIgnoreCase("FastTrack") ) {
				fees = 10000-(10000 * 0.1 );
			}
			if(ePortal.getCourseName().equalsIgnoreCase("JEE") && ePortal.getDuration().equalsIgnoreCase("Normal") ) {
				fees=15000;
			}
			
			else if (ePortal.getCourseName().equalsIgnoreCase("JEE") && ePortal.getDuration().equalsIgnoreCase("Weekend") ) {
				fees = 15000+(15000 * 0.1 );
			}
			
			else if (ePortal.getCourseName().equalsIgnoreCase("JEE") && ePortal.getDuration().equalsIgnoreCase("FastTrack") ) {
				fees = 15000-(15000 * 0.1 );
			}
			
			if(ePortal.getCourseName().equalsIgnoreCase("Frameworks") && ePortal.getDuration().equalsIgnoreCase("Normal") ) {
				fees=20000;
			}
			
			else if (ePortal.getCourseName().equalsIgnoreCase("Frameworks") && ePortal.getDuration().equalsIgnoreCase("Weekend") ) {
				fees = 20000+(20000 * 0.1 );
			}
			
			else if (ePortal.getCourseName().equalsIgnoreCase("Frameworks") && ePortal.getDuration().equalsIgnoreCase("FastTrack") ) {
				fees = 20000-(20000 * 0.1 );
			}
			
			if(ePortal.getCourseName().equalsIgnoreCase("DataScience") && ePortal.getDuration().equalsIgnoreCase("Normal") ) {
				fees=25000;
			}
			
			else if (ePortal.getCourseName().equalsIgnoreCase("DataScience") && ePortal.getDuration().equalsIgnoreCase("Weekend") ) {
				fees = 25000+(25000 * 0.1 );
			}
			
			else if (ePortal.getCourseName().equalsIgnoreCase("DataScience") && ePortal.getDuration().equalsIgnoreCase("FastTrack") ) {
				fees = 25000-(25000 * 0.1 );
			}
			return fees;
	}

}
