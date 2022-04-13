package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.AmazonPay;
import com.relevantcodes.extentreports.LogStatus;

public class AmazonPayTest extends BaseTest{

	@Test(groups= {"Valid"})
	@Parameters({"Username","Password","Money","Carddate","Cardyear","CardName"})
	public void UserDebitcard(String arg, String pass,String amount,String date, String year, String name) {
		extentTest=extent.startTest("Verifying the valid Login");
		AmazonPay pay=new AmazonPay(driver);
        pay.clickonAmazonpay();
        pay.clickonaddmoney();
        Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
		extentTest.log(LogStatus.PASS,"Login is Successfully");
		extent.endTest(extentTest);
        pay.entermailid(arg);
  		pay.clickcontinue();
  		pay.enterpassword(pass);
  		pay.clicksigninbutton();
  		pay.entermoneyinbox(amount);
  		pay.clickonaddbalance();
  		pay.clickdebitcard();
  		pay.clickadddebitcard();
  		pay.entercardnumber();
  		pay.entercardName(name);
  		pay.entercardexdate(date);
  		pay.entercardexyear(year);
  		pay.clickaddyourcard();
	}
	@Test(groups= {"InValid"})
	@Parameters({"Username1","Password","Money","Carddate","Cardyear","CardName"})

	public void UserDebitcardInvalid(String arg, String pass,String amount,String date, String year, String name) {
		extentTest=extent.startTest("Verifying the valid Login");
		AmazonPay pay=new AmazonPay(driver);
        pay.clickonAmazonpay();
        pay.clickonaddmoney();
        Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
		extentTest.log(LogStatus.FAIL,"Login is Successfully");
		extent.endTest(extentTest);
        pay.entermailid(arg);
  		pay.clickcontinue();
  		pay.enterpassword(pass);
  		pay.clicksigninbutton();
  		pay.entermoneyinbox(amount);
  		pay.clickonaddbalance();
  		pay.clickdebitcard();
  		pay.clickadddebitcard();
  		pay.entercardnumber();
  		pay.entercardName(name);
  		pay.entercardexdate(date);
  		pay.entercardexyear(year);
  		pay.clickaddyourcard();
	}
}
