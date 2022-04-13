package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.FlightBookinginAmazon;
import com.relevantcodes.extentreports.LogStatus;

public class FlightBookinginAmazonTest extends BaseTest{

	@Test(groups= {"valid"})
	@Parameters({"UserName","Password"})
	public void FlightBooking(String arg, String pass) {
		extentTest=extent.startTest("Verifying the Flight Booking");
		FlightBookinginAmazon booking=new FlightBookinginAmazon(driver);
		booking.clickonAll();
		booking.clickonfligthticket();
		Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
		extentTest.log(LogStatus.PASS,"Login is Successfully");
		booking.entersignin(arg);
		booking.enterpassword(pass);
		booking.clicksigninbutton();
		Assert.assertEquals(driver.getTitle(),"Flight Bookings on Amazon");
		extentTest.log(LogStatus.PASS,"Login is Successfully");
		extent.endTest(extentTest);
		booking.enterfromplace();
		booking.entertoplace();
		booking.clickonsearch();
		 
		
	}
	
	@Test(groups= {"InValid"})
	@Parameters({"UserName1","Password1"})
	public void InvalidFlightBooking(String arg1, String pass1) {
		extentTest=extent.startTest("Verifying the Flight Booking");
		FlightBookinginAmazon booking=new FlightBookinginAmazon(driver);
		booking.clickonAll();
		booking.clickonfligthticket();
		Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
		extentTest.log(LogStatus.PASS,"Login is Successfully");
		booking.entersignin(arg1);
		booking.enterpassword(pass1);
		booking.clicksigninbutton();
		Assert.assertEquals(driver.getTitle(),"Flight Bookings on Amazon");
		extentTest.log(LogStatus.PASS,"Login is Successfully");
		extent.endTest(extentTest);
		booking.enterfromplace();
		booking.entertoplace();
		booking.clickonsearch();
		 
		
	}
	
}
