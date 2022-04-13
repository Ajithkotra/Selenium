package com.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuyPrimePage {
	WebDriver driver;
	
	public BuyPrimePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	@FindBy(how=How.LINK_TEXT,using="Prime")
	public WebElement Prime;
	
	@FindBy(how=How.LINK_TEXT,using="Login to join Prime")
	public WebElement JoinPrime;
	
	@FindBy(how=How.CLASS_NAME,using="a-button-input")
	public WebElement OnemonthPrime;
	
	@FindBy(how=How.ID,using="pp-YTSlk6-66")
	public WebElement SelectPaymentType;
	

	@FindBy(how=How.ID,using="ap_email")
	public WebElement emailbox;
	
	@FindBy(how=How.ID,using="continue")
	public WebElement Continuebutton;
	
	@FindBy(how=How.ID,using="ap_password")
	public WebElement Password;
	
	@FindBy(how=How.ID,using="signInSubmit")
	public WebElement signinButton;
	
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
	
  public void clickonPrime() {
	  Prime.click();
  }
   
  public void clickonJoinPrime() {
	  JoinPrime.click();
  }
  public void clickononemonth() {
	  OnemonthPrime.click();
  }
  
  public void clickonpaymenttype() {
	  SelectPaymentType.click();
  }
  
  
}
