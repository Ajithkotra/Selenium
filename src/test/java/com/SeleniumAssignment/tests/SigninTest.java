package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.SigninPage;
import com.relevantcodes.extentreports.LogStatus;

public class SigninTest extends BaseTest {

	@Test(groups= {"Valid"})
	@Parameters({"Username","Password"})
	public void Signin(String arg,String pass) {
		extentTest=extent.startTest("Verifying the valid Login");
		SigninPage signin=new SigninPage(driver);
		signin.clickSigninopion();
		Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
		extentTest.log(LogStatus.PASS,"Login is Successfully");
		extent.endTest(extentTest);
		signin.entermailid(arg);
		signin.clickcontinue();
		signin.enterpassword(pass);
		signin.clicksigninbutton();
		
	}
	@Test(groups= {"InValid"})
	@Parameters({"Username","Password"})
	
	public void InvalidSignin(String arg, String pass) {
		extentTest=extent.startTest("Verifying the valid Login");
		SigninPage signin=new SigninPage(driver);
		signin.clickSigninopion();
		Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
		extentTest.log(LogStatus.PASS,"Login is Successfully");
		extent.endTest(extentTest);
		signin.entermailid(arg);
		signin.clickcontinue();
		signin.enterpassword(pass);
		signin.clicksigninbutton();
		
	}
	
}
