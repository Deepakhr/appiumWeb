package Netive_App;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FileManager {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto g4");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability("appPackage", "com.lenovo.FileBrowser2");
		cap.setCapability("appActivity", "com.lenovo.FileBrowser.activities.FileBrowserMain");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, cap);
		Thread.sleep(5000);
		driver.findElement(By.id("com.lenovo.FileBrowser2:id/filelistpicture")).click();
		Thread.sleep(5000);
		driver.swipe(0, 1460, 0, 490, 3000);
		Thread.sleep(5000);
		driver.findElement(By.id("com.lenovo.FileBrowser2:id/viewImageCheckRl")).click();
		Thread.sleep(5000);
		// int scrHeight = driver.manage().window().getSize().getHeight(); 
			
		//int scrWidth = driver.manage().window().getSize().getWidth();
			
			/*MultiTouchAction action=new MultiTouchAction(driver);
			TouchAction act1=new TouchAction(driver);
			TouchAction act2=new TouchAction(driver);
			act1.longPress(185,460, 10000).perform();
			act2.press(380,510).waitAction(3000).moveTo(200,300).release();
			action.add(act1).add(act2).perform();
			action.perform();
			Thread.sleep(5000);
			driver.pinch(100, 1000);
			//Thread.sleep(20000);
			driver.tap(1, 100, 200, 3000);
			Thread.sleep(5000);
			File f=driver.getScreenshotAs(OutputType.FILE);
			File f1=new File("D:\\AppiumAutomation\\Mobile_Automation\\screen\\j.png");
			FileUtils.copyFile(f, f1);*/
		/*	 int scrHeight = driver.manage().window().getSize().getHeight(); 
				
				int scrWidth = driver.manage().window().getSize().getWidth();
				
				MultiTouchAction action1=new MultiTouchAction(driver);
				TouchAction act3=new TouchAction(driver);
				TouchAction act4=new TouchAction(driver);
				act3.press(scrWidth/2,scrHeight/2).waitAction(3000).moveTo(-120,-200).release();
				act4.press(scrWidth/2,scrHeight/2+100).waitAction(3000).moveTo(100,120).release();
				action1.add(act3).add(act4).perform();
				action1.perform();*/
				//Thread.sleep(20000);
				 MultiTouchAction action1=new MultiTouchAction(driver);
				TouchAction act3=new TouchAction(driver);
				TouchAction act4=new TouchAction(driver);
				act3.longPress(400, 300,10000).waitAction(3000).perform();
				act4.longPress(500, 600,3000).perform();
				act4.moveTo(700, 900).release().perform();
				action1.add(act3).add(act4).perform();
				action1.perform();
				  
				driver.quit();
			//driver.quit();
		
	}

}
