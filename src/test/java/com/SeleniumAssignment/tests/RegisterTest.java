package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.RegisterPage;
import com.relevantcodes.extentreports.LogStatus;

public class RegisterTest extends BaseTest {
	

	@Test(groups= {"Valid"})
	@Parameters({"Name","mobile","Username","Password","Password"})
	public void RegisterUser(String arg, String mobile,String mail,String pass,String pass1) {
		extentTest=extent.startTest("Verifying the Registeration");
		RegisterPage register=new RegisterPage(driver);
		register.createaccountpage();
		Assert.assertEquals(driver.getTitle(),"Amazon Registration");
		extentTest.log(LogStatus.PASS,"Register Page open Successfully");
		register.enterusername(arg);
		register.entermobilenumber(mobile);
		register.enterusermailid(mail);
		register.enteruserpassword(pass);
		register.enteruserconpassword(pass1);
		register.clickcontinue();
		Assert.assertEquals(driver.getTitle(),"Authentication required");
		extentTest.log(LogStatus.PASS,"Verifying page is open successfully");
		extent.endTest(extentTest);
		
	}
	
	@Test(groups= {"InValid"})
	@Parameters({"Name","mobile","Username1","Password","Password"})
	public void InvalidRegisterUser(String arg, String mobile,String mail,String pass,String pass1) {
		extentTest=extent.startTest("Verifying the Registeration");
		RegisterPage register=new RegisterPage(driver);
		register.createaccountpage();
		Assert.assertEquals(driver.getTitle(),"Amazon Registration");
		extentTest.log(LogStatus.PASS,"Register Page open Successfully");
		register.enterusername(arg);
		//register.entermobilenumber(mobile);
		register.enterusermailid(mail);
		register.enteruserpassword(pass);
		register.enteruserconpassword(pass1);
		register.clickcontinue();
		Assert.assertEquals(driver.getTitle(),"Authentication required");
		extentTest.log(LogStatus.PASS,"Verifying page is open successfully");
		extent.endTest(extentTest);
		
	}

}
