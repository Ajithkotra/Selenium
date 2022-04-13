package com.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewReleasePage {
	WebDriver driver;
	
	public NewReleasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		}
	
	@FindBy(how=How.CLASS_NAME,using="hm-icon-label")
	public WebElement All;
	
	@FindBy(how=How.LINK_TEXT,using="New Releases")
	public WebElement Newreleases;
	
	public void clickonall() {
		All.click();
	}
	
	public void clickonewrelease() {
		Newreleases.click();
	}
}
