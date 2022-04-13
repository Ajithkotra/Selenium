package com.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}

	@FindBy(how=How.XPATH,using="//span[@id='nav-link-accountList-nav-line-1']")
	public WebElement Signinop;
	
	
		@FindBy(how=How.ID,using="ap_email")
		public WebElement emailbox;
		
		@FindBy(how=How.ID,using="continue")
		public WebElement Continuebutton;
		
		@FindBy(how=How.ID,using="ap_password")
		public WebElement Password;
		
		@FindBy(how=How.ID,using="signInSubmit")
		public WebElement signinButton;
		
		public void clickSigninopion() {
			Signinop.click();
	       }
	
	public void entermailid(String arg) {
		emailbox.sendKeys(arg);
       }
	
	public void clickcontinue() {
		Continuebutton.click();
	}
	
	public void enterpassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void clicksigninbutton() {
		signinButton.click();
	}
}
