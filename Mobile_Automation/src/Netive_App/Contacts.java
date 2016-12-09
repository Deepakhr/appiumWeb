package Netive_App;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Contacts {

	AppiumDriver<WebElement> driver;
	List<WebElement>lst;
	@BeforeMethod
	public void configBeforeMethod() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MBONSKQSY9JNSKFE");
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("appActivity", "com.android.contacts.DialtactsContactsEntryActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver(url,cap);
		
		
		
	}
	@Test(priority=0)
	public void addcontactTest() throws InterruptedException, AWTException
	{
		

		
		driver.swipe(0, 100, 0, 843, 3000);
		
	
				//driver.swipe(0, 128, 0, 600, 3000);
		
		
		
		
	}
	@AfterMethod()
	public void configAftermethod()
	{
		//driver.quit();
	}
}
