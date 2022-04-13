package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.BuyPrimePage;
import com.relevantcodes.extentreports.LogStatus;

public class BuyPrimeTest extends BaseTest{

	@Test(groups= {"Valid"})
	public void AfterSignin() {
		extentTest=extent.startTest("Verifying New Releases Page");
		BuyPrimePage prime=new BuyPrimePage(driver);
		prime.clickonPrime();
		Assert.assertEquals(driver.getTitle(), "Amazon.in: Amazon Prime");
		extentTest.log(LogStatus.PASS,"open Successfully");
		extent.endTest(extentTest);
		prime.clickonJoinPrime();
		prime.clickononemonth();
		prime.clickonpaymenttype();
	}
	
	@Test(groups= {"Valid"})
	@Parameters({"Username","Password"})
	public void BeforeSignin(String arg,String pass) {
		extentTest=extent.startTest("Verifying New Releases Page");
		BuyPrimePage prime=new BuyPrimePage(driver);
		prime.clickonPrime();
		Assert.assertEquals(driver.getTitle(), "Amazon.in: Amazon Prime");
		prime.clickonJoinPrime();
		Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
		extentTest.log(LogStatus.PASS,"Login is Successfully");
		extent.endTest(extentTest);
		prime.entermailid(arg);
		prime.clickcontinue();
		prime.enterpassword(pass);
		prime.clicksigninbutton();
		Assert.assertEquals(driver.getTitle(),"Amazon.in: Amazon Prime");
		extentTest.log(LogStatus.PASS,"open Succesfully");
		extent.endTest(extentTest);
		prime.clickononemonth();
		prime.clickonpaymenttype();
		
	}
}
