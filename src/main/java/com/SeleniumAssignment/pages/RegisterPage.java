package com.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

WebDriver driver;
	
public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		}

	
	@FindBy(how=How.LINK_TEXT,using="Start here.")
 	public WebElement Createaccount;
	
	@FindBy(how=How.ID,using="ap_customer_name")
	public WebElement UserName;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_phone_number']")
	public WebElement UserMoblienumber;
	
	@FindBy(how=How.ID,using="ap_email")
	public WebElement UserMailId;
	
	@FindBy(how=How.ID,using="ap_password")
	public WebElement Password;
	
	@FindBy (how=How.ID,using="ap_password_check")
	public WebElement ConfirmPassword;
	
	@FindBy (how=How.ID,using="continue")
	public WebElement ContinueButton;
	
	
	
	public void createaccountpage() {
		Createaccount.click();
	}
	
	public void enterusername(String arg ) {
		UserName.sendKeys(arg);
	}
	
	public void entermobilenumber(String mobile) {
		UserMoblienumber.sendKeys(mobile);
	}
	
	public void enterusermailid(String mail) {
		UserMailId.sendKeys(mail);
	}
	
	public void enteruserpassword(String pass) {
		Password.sendKeys(pass);
	}
	
	public void enteruserconpassword(String pass1) {
		ConfirmPassword.sendKeys(pass1);
	}
	
	
	public void clickcontinue() {
		ContinueButton.click();
	}
}
