package Netive_App;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ppf2 {

	static AndroidDriver<WebElement> driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G");
		cap.setCapability("appPackage", "com.android.dialer");
		cap.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
	 
		driver.findElement(By.id("com.android.dialer:id/floating_action_button")).click();
		
        int scrHeight = driver.manage().window().getSize().getHeight(); 
		int scrWidth = driver.manage().window().getSize().getWidth();
		MultiTouchAction multiTouch = new MultiTouchAction(driver);
		TouchAction tAction0 = new TouchAction(driver);
		TouchAction tAction1 = new TouchAction(driver);
		tAction0.press(scrWidth/2,scrHeight/2).waitAction(1000).moveTo(0,60).release();
		tAction1.press(scrWidth/2,scrHeight/2+40).waitAction(1000).moveTo(0,80).release();
		multiTouch.add(tAction0).add(tAction1);
		multiTouch.perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*
		driver.swipe(1000, 0, 92, 0, 3000);
		Thread.sleep(5000);
		driver.swipe(0, 1624, 0, 700, 5000);
		Thread.sleep(5000);
		TouchAction act=new TouchAction(driver);
		
		act.moveTo(driver.findElement(By.id("com.android.dialer:id/primary_action_view"))).perform();
		Thread.sleep(5000);	
		TouchAction act1=new TouchAction(driver);
		act1.longPress(driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc='0,+']"))).perform();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.id("com.android.dialer:id/floating_action_button")).click();
		TouchAction act2=new TouchAction(driver);
		act2.longPress(533, 1450,3000).perform();
		System.out.println("4");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.swipe(133, 0, 1106, 0, 3000);*/

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
