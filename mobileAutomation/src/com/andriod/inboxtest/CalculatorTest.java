package com.andriod.inboxtest;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import com.andriod.commonUtils.BaseLib;
import com.andriod.pomrepository.Calculator;
import com.andriod.pomrepository.GmailWebView;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorTest {
	
	AndroidDriver<WebElement> driver;
	BaseLib b = new BaseLib();

	@Test
	public void calcTest(XmlTest xmlObj, Method m) throws InterruptedException, IOException{
		
		 driver = b.initAppiumTest(m.getName(), xmlObj);
			
		  Calculator gmailweb = new Calculator(driver);
		  gmailweb.add();
	
	}

}
