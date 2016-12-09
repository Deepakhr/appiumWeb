package com.andriod.pomrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GmailWebView {
	
	static AndroidDriver<WebElement> driver;
	
	public GmailWebView(AndroidDriver<WebElement> driver){
		GmailWebView.driver = driver;
	}
	
	@AndroidFindBy(className="android.widget.ImageButton")
	 WebElement gamilmenu;
	
	
	
	
	
	
	
	
	
	
	@AndroidFindBy(id="com.google.android.gm:id/account_list_button")
	 WebElement gmailAccountMenu;
	
	@AndroidFindBy(id="com.google.android.gm:id/manage_accounts_text")
	 WebElement manageAccountLnk;
	
	@AndroidFindBy(xpath="//android.widget.LinearLayout[@bounds='[0,240][1080,408]']")
	 WebElement layout;
	
	
	@AndroidFindBy(uiAutomator="UiSelector().text(\"Google\")")
	WebElement GooleText;
//	
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[@index='1']")
//	 WebElement menuBtn;
//	
//	@AndroidFindBy(xpath="//android.widget.ImageButton[contains(@content-desc,'More options')]]")
//	 WebElement menuBtn;
//	
//	@AndroidFindBy(xpath="//android.widget.LinearLayout[@index='1']")
//	 WebElement menuBtn;
//	
//	@AndroidFindBy(xpath="//android.widget.Button[@text='Cancel']")
//	 WebElement menuBtn;
//	
	public void navigateToGoogleAccount() throws InterruptedException{
		Thread.sleep(3000);
		gamilmenu.click();
		gmailAccountMenu.click();
		manageAccountLnk.click();
		GooleText.click();
	}
	
}
