package com.SeleniumAssignment.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {



	public static String CaptureScreenShot(WebDriver driver, String testName) {
		
		String screenshotPath=System.getProperty("User.dir")+"//FailedScreen//"+testName+".jpg";
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
		FileUtils.copyFile(srcFile,new File(screenshotPath));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return screenshotPath;
	}
}
