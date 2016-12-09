package com.andriod.inboxtest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import com.andriod.commonUtils.BaseLib;
import com.andriod.pomrepository.GmailWebView;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class GmailTest {
	AndroidDriver<WebElement> driver;
	BaseLib b = new BaseLib();
	
	@Test
	public void addNewAccount(Method m, XmlTest xmlObj) throws InterruptedException, IOException{
		
	  driver = b.initAppiumTest(m.getName(), xmlObj);
		
	  GmailWebView gmailweb = PageFactory.initElements(driver, GmailWebView.class);
	  gmailweb.navigateToGoogleAccount();
		
/*		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElement(By.id("com.google.android.gm:id/account_list_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.google.android.gm:id/manage_accounts_text")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("a");
		//driver.findElement(By.xpath("//android.widget.LinearLayout[@bounds='[0,240][1080,408]']")).click();
         
         
         //driver.findElement(By.xpath("//android.widget.LinearLayout[@name='Google']")).click();
         driver.findElementByAndroidUIAutomator("UiSelector().text(\"Google\")").click();
         System.out.println("b");*/
         
         
//		Thread.sleep(5000);
//		System.out.println("1");
//		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
//		//driver.findElement(By.xpath("//android.widget.LinearLayout[@bounds='[0,340][1080,541]']")).click();
//		driver.findElement(By.xpath("//android.widget.ImageButton[contains(@content-desc,'More options')]")).click();
//		System.out.println("f");
//		//driver.findElement(By.xpath("//android.widget.ImageButton[@id='android:id/title']")).click();
//		System.out.println("g"); 
//		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
//		System.out.println("k");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//android.widget.Button[@text='Cancel']")).click();
//		driver.quit();
	}

}
