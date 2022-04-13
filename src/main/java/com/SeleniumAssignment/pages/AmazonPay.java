package com.SeleniumAssignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonPay {

	WebDriver driver;
	
	public  AmazonPay(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(how=How.LINK_TEXT,using="Amazon Pay")
	public WebElement AmazonPay;
	
	
	@FindBy(how=How.LINK_TEXT,using="Add Money")
	public WebElement Addmoney;
	

	@FindBy(how=How.ID,using="ap_email")
	public WebElement emailbox;
	
	@FindBy(how=How.ID,using="continue")
	public WebElement Continuebutton;
	
	@FindBy(how=How.ID,using="ap_password")
	public WebElement Password;
	
	@FindBy(how=How.ID,using="signInSubmit")
	public WebElement signinButton;
	
	@FindBy(how=How.ID,using="adm-load-amount")
	public WebElement EnterMoney;
	
	@FindBy(how=How.CLASS_NAME,using="a-button-input")
	public WebElement AddMoneytoBalance;
	
	@FindBy (how=How.ID,using="pp-GUeq7g-84")
	public WebElement ChooseCardtype;
	
	@FindBy(how=How.ID,using="pp-0ITR5l-84")
	public WebElement DebitCard;
	
	@FindBy(how=How.ID,using="pp-0ITR5l-90")
	public WebElement NetBanking;
	
	@FindBy(how=How.ID,using="pp-0ITR5l-87")
	public WebElement AddDebitCard;
	
	@FindBy(how=How.ID,using="pp-A7ttAW-14")
	public WebElement DebitCardNumber;
	
	@FindBy(how=How.ID,using="pp-A7ttAW-16")
	public WebElement DebitCardName;
	
	@FindBy(how=How.CLASS_NAME,using="a-dropdown-prompt")
	public WebElement Cardexpiremonth;
	
	@FindBy(how=How.CLASS_NAME,using="a-dropdown-prompt")
	public WebElement Cardexpireyear;
	
	@FindBy(how=How.CLASS_NAME,using="a-button-input")
	public WebElement AddYourcard;
	
	
	
 
	
	public void clickonAmazonpay() {
		AmazonPay.click();
	}

	public void clickonaddmoney() {
		Addmoney.click();
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
	
	public void entermoneyinbox(String amount) {
		EnterMoney.sendKeys(amount);
	}
	
	public void clickonaddbalance() {
		AddMoneytoBalance.click();
	}
	
	public void clickdebitcard() {
		DebitCard.click();
	}
	
	public void clickadddebitcard() {
		AddDebitCard.click();
	}
	
	public void clicknetbanking() {
		NetBanking.click();
	}
	
	public void entercardnumber() {
		DebitCardNumber.sendKeys("123232432342");
	}
	
	public void entercardName(String Name) {
	DebitCardNumber.sendKeys(Name);
	}
	
	public void entercardexdate(String month) {
		Cardexpiremonth.sendKeys(month);
		}
	

	public void entercardexyear(String year) {
		Cardexpireyear.sendKeys(year);
		}
	
	public void clickaddyourcard() {
		AddYourcard.click();
	}
	
}
