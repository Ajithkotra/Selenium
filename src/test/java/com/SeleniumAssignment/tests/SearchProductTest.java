package com.SeleniumAssignment.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SeleniumAssignment.pages.SearchProduct;
import com.relevantcodes.extentreports.LogStatus;



public class SearchProductTest extends BaseTest{
	
	
@Test(groups= {"Valid"})
@Parameters({"Search"})
	public void SearchProductUser(String arg) {
	extentTest=extent.startTest("Verifying the Searchbox");
		SearchProduct search=new SearchProduct(driver);
		search.enterproductname(arg);
		search.clicksearch();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : apple");
		extentTest.log(LogStatus.PASS,"Verified searchbox successfully");
		extent.endTest(extentTest);
		
	}
@Test(groups= {"InValid"})
@Parameters({"Search1"})
public void InvalidSearchProductUser(String arg) {
	extentTest=extent.startTest("Verifying the Searchbox");
		SearchProduct search=new SearchProduct(driver);
		search.enterproductname(arg);
		search.clicksearch();
		Assert.assertEquals(driver.getTitle(), "Amazon.in : apple");
		extentTest.log(LogStatus.FAIL,"Verified searchbox successfully");
		extent.endTest(extentTest);
		
	}
}
