package Netive_App;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CallANumber {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "MBONSKQSY9JNSKFE");
	
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("appActivity", "com.android.contacts.DialtactsContactsEntryActivity");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		
		
		
		AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.findElement(By.id("com.android.dialer:id/floating_action_button")).click();
		
		
		WebElement wb = driver.findElementByAccessibilityId("0,+");
		TouchAction t = new TouchAction(driver);
		t.longPress(wb).perform();	
		Thread.sleep(3000);
		driver.quit();
		
		
		
	
		
		
		
		
		
		
		
//		try{
//		
//		driver.findElement(By.id("com.android.dialer:id/eight")).click();
//		driver.findElement(By.id("com.android.dialer:id/eight")).click();
//		driver.findElement(By.id("com.android.dialer:id/six")).click();
//		driver.findElement(By.id("com.android.dialer:id/seven")).click();
//		driver.findElement(By.id("com.android.dialer:id/five")).click();
//		driver.findElement(By.id("com.android.dialer:id/seven")).click();
//		driver.findElement(By.id("com.android.dialer:id/four")).click();
//		driver.findElement(By.id("com.android.dialer:id/seven")).click();
//		driver.findElement(By.id("com.android.dialer:id/four")).click();
//		driver.findElement(By.id("com.android.dialer:id/zero")).click();
//		System.out.println(driver.findElement(By.id("com.android.dialer:id/digits")).getText());
//		driver.findElement(By.id("com.android.dialer:id/dialpad_floating_action_button")).click();
//		driver.findElement(By.id("com.android.dialer:id/select_account_list_item_view")).click();
//		driver.findElement(By.id("com.android.dialer:id/audioButton")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.id("com.android.dialer:id/floating_end_call_action_button")).click();	
//		driver.quit();
//		
		//
	//	}
//
//		catch(Throwable e)
//		{
//			System.out.println(e.getMessage());
//			EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
//			File str=edriver.getScreenshotAs(OutputType.FILE);
//			File dest=new File("D:\\AppiumAutomation\\Mobile_Automation\\screen\\m.PNG");
//			FileUtils.copyFile(str, dest);
//			driver.quit();
//	}/
	}

}
