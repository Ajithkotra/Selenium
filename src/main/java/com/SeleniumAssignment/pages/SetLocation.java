package com.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SetLocation {

	WebDriver driver;
	
	public SetLocation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy (how=How.ID,using="glow-ingress-line2")
	public WebElement Location;
	
	@FindBy(how=How.ID,using="GLUXZipUpdateInput")
	public WebElement Pincode;
	
	@FindBy(how=How.CLASS_NAME,using="a-button-input")
	public WebElement ApplyButton;
	
	public void clickonlocation() {
		Location.click();
	}
	
	public void enterpincode() {
		Pincode.sendKeys("517619");
	}
	public void clickonapply() {
		ApplyButton.click();
	}
}
