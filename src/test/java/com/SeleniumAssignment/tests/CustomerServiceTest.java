package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.CustomerServicePage;
import com.relevantcodes.extentreports.LogStatus;

public class CustomerServiceTest extends BaseTest{

	@Test(groups= {"Valid"})
	public void CustomerHelp() {
		extentTest=extent.startTest("Verifying New Releases Page");
		CustomerServicePage help=new CustomerServicePage(driver);
		help.clickcustomerservice();
		Assert.assertEquals(driver.getTitle(),"Amazon.in Help:Help");
		extentTest.log(LogStatus.PASS,"open Successfully");
		extent.endTest(extentTest);
		help.enterquestion();
		help.clicksearch();
	}
}
