package com.andriod.pomrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumExecutionMethod;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AppiumCommandExecutor;

public class GmailWeb {
	

	AndroidDriver<WebElement>driver;
	
/*	public GmailWeb(AndroidDriver<WebElement> driver, GmailWeb wb){
		PageFactory.initElements(new AppiumFieldDecorator(driver), wb);
	}*/

public GmailWeb(AndroidDriver<WebElement>driver)
{
	PageFactory.initElements(driver, this);
}
	@FindBy(id="Email")
	 public WebElement gmailEdt;
	
/*	@AndroidFindBy(uiAutomator="UiSelector().text(\"Enter your email\")")
	public WebElement gmailEdt;*/

	public void login(){
		gmailEdt.sendKeys("deepak");
	}

}
