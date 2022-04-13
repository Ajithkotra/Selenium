package com.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	
WebDriver driver;
	
	public SearchProduct(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		}
 @FindBy(how=How.ID,using="twotabsearchtextbox")
 public WebElement SearchBox;
	
 @FindBy(how=How.ID,using="nav-search-submit-button")
 public WebElement SearchButton;
 
 public void enterproductname(String arg) {
	 SearchBox.sendKeys(arg);
 }
 
 public void clicksearch() {
	 SearchButton.click();
 }

}
