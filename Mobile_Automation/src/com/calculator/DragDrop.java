package com.calculator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragDrop {
	
	static DesiredCapabilities caps;
	static AndroidDriver driver;
	//static TouchAction act;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		caps= new DesiredCapabilities();
		caps.setCapability("automationName", "Appium");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "5.0.2");
		caps.setCapability("deviceName", "Galaxy Grand Prime");
		caps.setCapability("appPackage", "com.mobeta.android.demodslv");
		caps.setCapability("appActivity", "Launcher");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

		driver.findElement(By.xpath("//android.widget.TextView[@text='Basic usage playground']")).click();
		Thread.sleep(5000);
		//List<AndroidElement> dragHandles = driver.findElements(By.id("com.mobeta.android.demodslv:id/drag_handle"));
		WebElement swb = driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[18,258][216,459]']"));
		WebElement dwb = driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[18,1293][216,1494]']"));

		TouchAction act=new TouchAction((MobileDriver)driver);
		//act.longPress(dragHandles.get(0)).moveTo(dragHandles.get(7)).release().perform();
		act.longPress(swb).moveTo(dwb).release().perform();

		driver.quit();
	}

}
