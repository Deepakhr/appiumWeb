package Netive_App;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Scroll_operaton {

	AndroidDriver driver;
	@Test
	public void configBeforeMethod() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto g(4)");
		cap.setCapability("appPackage", "com.google.android.launcher");
		cap.setCapability("appActivity", "com.google.android.launcher.StubApp");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		int scrHeight = driver.manage().window().getSize().getHeight(); 
		
		int scrWidth = driver.manage().window().getSize().getWidth();
		MultiTouchAction multiTouch = new MultiTouchAction(driver);
		TouchAction tAction0 = new TouchAction(driver);
		TouchAction tAction1 = new TouchAction(driver);
		tAction0.press(scrWidth/2,scrHeight/2).waitAction(1000).moveTo(0,60).release();
		tAction1.press(scrWidth/2,scrHeight/2+40).waitAction(1000).moveTo(0,80).release();
		multiTouch.add(tAction0).add(tAction1);
		multiTouch.perform();
	}
	
		
}
