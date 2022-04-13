package com.SeleniumAssignment.tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.SeleniumAssignment.utils.Screenshots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {

	static WebDriver driver;
	static File file=new File("./Resources/config.properties");
	static FileInputStream fis=null;
	static Properties prop=new Properties();
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	
	
	
	@BeforeSuite(groups= {"InValid","Valid"})
	public void setExtent(){
		extent=new ExtentReports("report");
		
	}
	@AfterSuite(groups= {"InValid","Valid"})
	public void endReport() {
		extent.flush();
		extent.close();
		
	}
	
	@AfterMethod(groups= {"InValid","Valid"})
	public void attachScreenshot(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE) {
		String screenshotPath=Screenshots.CaptureScreenShot(driver, result.getName());
		extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
		extent.endTest(extentTest);
		}
		else if(result.getStatus()==ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "TestCase Passed Successfully");
		}
	}
	
	
	@BeforeMethod(groups= {"InValid","Valid"})
		public static void intializingWebDriver() {
		driver= Drivers.getBrowserInstance("chrome");			
		//driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	
		@BeforeMethod(groups= {"InValid","Valid"})
		public static void openUrl() {
			driver.get(prop.getProperty("url"));
		}
		
		@AfterMethod(groups= {"InValid","Valid"})
		public static void closeBrowser() {
			driver.close();
		}
		
		
	}


