package com.calculator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import bsh.Capabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class FileUpload {
	
	static DesiredCapabilities capabilities;
	//static AndroidDriver driver;
	
	public static void main(String args[]) throws MalformedURLException, InterruptedException
	{
		capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0.1");
		capabilities.setCapability("deviceName", "ASUS_Z010D");
		capabilities.setCapability("browserName", "chrome");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://m.gmail.com");
		driver.findElement(By.id("Email")).sendKeys("seleniumoar1234");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("selenium1234567");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='V j od']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cmattb_cmcsubj")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).click();
		Thread.sleep(5000);
		driver.context("NATIVE_APP").findElement(By.name("Gallery")).click();
		Thread.sleep(5000);
		driver.tap(1, 530, 728, 1);
		Thread.sleep(5000);
		driver.tap(1, 121, 238, 1);
		Thread.sleep(5000);
		driver.findElement(By.className("android.widget.EditText")).sendKeys("yashi231.priya@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.name("Subject:")).sendKeys("file");
		Thread.sleep(5000);
		driver.findElement(By.name("Send")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}
