import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GoogleSearch {

	public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"moto g4");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "org.chromium.chrome.browser.document.ChromeLauncherActivity");
		AppiumDriver<WebElement> driver= new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//driver.zoom(driver.findElement(By.id("Email")));
		//driver.tap(1, driver.findElement(By.id("Email")), 3000);
		
		Thread.sleep(5000);
		driver.zoom(300, 900);
		
		/*
		
		int scrHeight = driver.manage().window().getSize().getHeight(); 
		System.out.println(scrHeight);
		int scrWidth = driver.manage().window().getSize().getWidth();
		System.out.println(scrWidth);
		MultiTouchAction multiTouch = new MultiTouchAction(driver);
		System.out.println("1");
		TouchAction tAction0 = new TouchAction(driver);
		System.out.println("2");
		TouchAction tAction1 = new TouchAction(driver);
		System.out.println("3");
		tAction0.press(100,200).waitAction(1000).moveTo(70,10).release();
		Thread.sleep(5000);
		tAction1.press(100,280).waitAction(1000).moveTo(20,80).release();
		multiTouch.add(tAction0).add(tAction1);
		multiTouch.perform();
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.zoom(700, 990);
		
		
//		Thread.sleep(3000);
//		driver.findElement(By.className("android.widget.EditText")).sendKeys("www.flipkart.com");
//		Robot rb=new Robot();
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//		driver.findElement(By.className("android.view.View")).sendKeys("clothes");
//		Robot rb1=new Robot();
//		rb1.keyPress(KeyEvent.VK_ENTER);
//		rb1.keyRelease(KeyEvent.VK_ENTER);
//	List<WebElement>lst=	driver.findElements(By.className("android.view.View"));
//	for (int i = 0; i <lst.size(); i++) {
//		System.out.println(lst.get(i).getText());
//		Thread.sleep(2000);
	}

	}


