package com.andriod.inboxtest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import com.andriod.commonUtils.BaseLib;
import com.andriod.pomrepository.GmailWeb;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class GmailWebTest {	
	AndroidDriver<WebElement> driver;
//	GmailWeb wb1=new GmailWeb();
	BaseLib b = new BaseLib();
	
	@Test
	public void gmailBrowserTest(Method m , XmlTest xmlObj) throws IOException, InterruptedException{
		GmailWeb wb1=new GmailWeb(driver);
		System.out.println("1");
		driver = b.initAppiumTest(m.getName(), xmlObj);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		driver.get("http://www.gmail.com");
		//Thread.sleep(10000);
		wb1.login();
	}

}
