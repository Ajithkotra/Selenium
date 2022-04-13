package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.SetLocation;
import com.relevantcodes.extentreports.LogStatus;

public class SetLocationTest extends BaseTest{
@Test(groups= {"Valid"})
	public void SetUserLocation() {
		extentTest=extent.startTest("Verifying Location");
		SetLocation location=new SetLocation(driver);
		location.clickonlocation();
		location.enterpincode();
		location.clickonapply();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
		extentTest.log(LogStatus.PASS,"Verifying Location Successfully");
		extent.endTest(extentTest);
		
	}
	
@Test(groups= {"InValid"})
public void InvalidSetUserLocation() {
	extentTest=extent.startTest("Verifying Location");
	SetLocation location=new SetLocation(driver);
	location.clickonlocation();
	location.enterpincode();
	location.clickonapply();
	Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	extentTest.log(LogStatus.PASS,"Verifying Location Successfully");
	extent.endTest(extentTest);
	
}

	
}
