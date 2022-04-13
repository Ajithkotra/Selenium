package com.SeleniumAssignment.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
	public static WebDriver getBrowserInstance(String browsername) 
	{
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			return new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
			return new FirefoxDriver();
		}
		else if(browsername.equals("edge"))
		{
			System.setProperty("webdriver.msedge.driver","./Drivers/msedgedriver.exe");
			return new EdgeDriver();
		}
		else
		{
			return null;
		}
	}

}
