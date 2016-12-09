import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TabzoomTest {

	@Test
	public void Test() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"moto g4");
		cap.setCapability("appPackage", "com.google.android.apps.maps");
		cap.setCapability("appActivity", "com.google.android.maps.MapsActivity");
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
		Thread.sleep(6000);
        int scrHeight = driver.manage().window().getSize().getHeight(); 
		
		int scrWidth = driver.manage().window().getSize().getWidth();
		
		MultiTouchAction action=new MultiTouchAction(driver);
		TouchAction act1=new TouchAction(driver);
		TouchAction act2=new TouchAction(driver);
		act1.longPress(scrWidth/2,scrHeight/2, 10000).perform();
		act2.longPress(scrWidth/2+100,scrHeight/2+100).waitAction(3000).moveTo(100,120).release();
		action.add(act1).add(act2).perform();
		action.perform();
		Thread.sleep(20000);
		driver.quit();
		
		
		
		
		
		
		
		
		/*int scrHeight = driver.manage().window().getSize().getHeight(); 
		int scrWidth = driver.manage().window().getSize().getWidth();
		
		driver.tap(1, scrHeight/2, scrWidth/2, 3000);
		Thread.sleep(5000);
		driver.pinch(500, 600);
		//driver.pinc
	
		//driver.quit();
*/	}
}
