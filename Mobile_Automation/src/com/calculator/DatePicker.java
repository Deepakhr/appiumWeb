package com.calculator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class DatePicker {
	
	static AndroidDriver driver;
	static DesiredCapabilities capabilities;
	static int x,y;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "Galaxy Grand Prime");
		capabilities.setCapability("appPackage", "com.android.calendar");
		capabilities.setCapability("appActivity", "com.android.calendar.LaunchActivity");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	
		Thread.sleep(3000);
		for(y=137;y<=703;y=y+140)
		{
			for(x=409;x<=486;x=x+80)
			{
				//Thread.sleep(5000);
				driver.tap(1, x, y, 1);
				//Thread.sleep(5000);
			}
		}
	}

}
