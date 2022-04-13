package com.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CustomerServicePage {

	WebDriver driver;

	public CustomerServicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
}
	@FindBy(how=How.LINK_TEXT,using="Customer Service")
	public WebElement CustomerService;
	
	@FindBy(how=How.ID,using="helpsearch")
	public WebElement HelpSearch;

	@FindBy(how=How.CLASS_NAME,using="a-icon a-icon-search")
	public WebElement SearchIcon;
	
	public void clickcustomerservice() {
		CustomerService.click();
	}
	
	public void enterquestion() {
		HelpSearch.sendKeys("Refund the Product");
	}
	
	public void clicksearch() {
		SearchIcon.click();
	}
}