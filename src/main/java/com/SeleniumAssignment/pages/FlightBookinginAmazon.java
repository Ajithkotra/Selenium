package com.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlightBookinginAmazon {
	
		WebDriver driver;
		
		public FlightBookinginAmazon(WebDriver driver) {
			PageFactory.initElements(driver,this);
			this.driver=driver;
		}
		@FindBy (how=How.CLASS_NAME,using="hm-icon-label")
		public WebElement All;
		
		@FindBy(how=How.LINK_TEXT,using="Flight Tickets")
		public WebElement FlightTicket;
		
		@FindBy(how=How.ID,using="ap_password")
		public WebElement Password;
		
		@FindBy(how=How.ID,using="ap_email")
		public WebElement Signin;
		
		@FindBy(how=How.CLASS_NAME,using="searchText")
		public WebElement SearchText;

		@FindBy(how=How.CLASS_NAME,using="searchText")
		public WebElement SearchTextto;

		@FindBy(how=How.ID,using="signInSubmit")
		public WebElement signinButton;
		
		@FindBy(how=How.CLASS_NAME,using="_7e41f983 bba41d3c  _50baedd0  ")
		public WebElement Search;

		
		public void clickonAll() {
			All.click();
		}
		
		public void clickonfligthticket() {
			FlightTicket.click();
		}
		
		public void entersignin(String arg) {
			Signin.sendKeys(arg);
		}
		
		public void enterpassword(String pass) {
			Password.sendKeys(pass);
		}
		
		public void clicksigninbutton() {
			signinButton.click();
		}
		public void enterfromplace() {
			SearchText.sendKeys("Mumbai");
		}
		
		public void entertoplace() {
			SearchTextto.sendKeys("Goa");
		}
		
		public void clickonsearch() {
			Search.click();
		}
		
}
