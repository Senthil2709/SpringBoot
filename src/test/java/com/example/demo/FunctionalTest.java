package com.example.demo;

import static org.junit.Assert.fail;

import org.assertj.core.api.Assertions;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.core.annotation.Order;
import org.springframework.test.context.junit4.SpringRunner;

import com.model.EPortal;
import com.service.EPortalService;

@RunWith(SpringRunner.class)
public class FunctionalTest {

	@Test
	@Order(3)
	public void testCalculateCourseFeesForJavaWhenDurationIsNormal() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("Java");
			epObj.setDuration("Normal");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(10000);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for Java Course for Normal duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@Order(2)
	public void testCalculateCourseFeesForJavaWhenDurationIsWeekend() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("Java");
			epObj.setDuration("Weekend");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(11000);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for Java Course for Weekend duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	@Order(1)
	public void testCalculateCourseFeesForJavaWhenDurationIsFastTrack() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("Java");
			epObj.setDuration("FastTrack");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(9000);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for Java Course for FastTrack duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@Order(4)
	public void testCalculateCourseFeesForJEEWhenDurationIsNormal() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("JEE");
			epObj.setDuration("Normal");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(15000);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for JEE Course for Normal duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@Order(6)
	public void testCalculateCourseFeesForJEEWhenDurationIsWeekend() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("JEE");
			epObj.setDuration("Weekend");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(16500);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for JEE Course for Weekend duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	@Order(5)
	public void testCalculateCourseFeesForJEEWhenDurationIsFastTrack() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("JEE");
			epObj.setDuration("FastTrack");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(13500);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for JEE Course for FastTrack duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	@Test
	@Order(7)
	public void testCalculateCourseFeesForFrameworksWhenDurationIsNormal() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("Frameworks");
			epObj.setDuration("Normal");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(20000);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for Frameworks Course for Normal duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@Order(9)
	public void testCalculateCourseFeesForFrameworksWhenDurationIsWeekend() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("Frameworks");
			epObj.setDuration("Weekend");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(22000);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for Frameworks Course for Weekend duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	@Order(8)
	public void testCalculateCourseFeesForFrameworksWhenDurationIsFastTrack() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("Frameworks");
			epObj.setDuration("FastTrack");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(18000);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for Frameworks Course for FastTrack duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@Order(11)
	public void testCalculateCourseFeesForDataScienceWhenDurationIsNormal() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("DataScience");
			epObj.setDuration("Normal");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(25000);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for DataScience Course for Normal duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	@Order(10)
	public void testCalculateCourseFeesForDataScienceWhenDurationIsWeekend() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("DataScience");
			epObj.setDuration("Weekend");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(27500);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for DataScience Course for Weekend duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	@Order(12)
	public void testCalculateCourseFeesForDataScienceWhenDurationIsFastTrack() {
		try {
			EPortal epObj = new EPortal();
			epObj.setRegNo(123456);
			epObj.setStudentName("Sathya");
			epObj.setCourseName("DataScience");
			epObj.setDuration("FastTrack");
			EPortalService expenseService = new EPortalService();
			Assertions.assertThat(expenseService.calculateCourseFees(epObj)).isEqualTo(22500);
		} catch (AssertionError ae) {
			fail("Logic for calculating Course Fees for DataScience Course for FastTrack duration is wrong");
			ae.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}