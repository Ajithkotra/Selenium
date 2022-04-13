package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.NewReleasePage;
import com.relevantcodes.extentreports.LogStatus;

public class NewReleaseTest extends BaseTest {

	@Test(groups= {"Valid"})
	public void NewReleases() {
		extentTest=extent.startTest("Verifying New Releases Page");
		NewReleasePage newrelease=new NewReleasePage(driver);
		newrelease.clickonall();
		newrelease.clickonewrelease();
		Assert.assertEquals(driver.getTitle(),"");
		extentTest.log(LogStatus.PASS,"Verified New Releases Page Successfully");
		extent.endTest(extentTest);
	}
}
