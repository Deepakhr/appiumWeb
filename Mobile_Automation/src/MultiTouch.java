import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class MultiTouch {

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
		//driver.findElement(by)
		Thread.sleep(5000);
		int scrHeight = driver.manage().window().getSize().getHeight(); 
		int scrWidth = driver.manage().window().getSize().getWidth();
		MultiTouchAction multiTouch = new MultiTouchAction(driver);
		TouchAction tAction0 = new TouchAction(driver);
		TouchAction tAction1 = new TouchAction(driver);
		tAction0.press(scrWidth/2,scrHeight/2).waitAction(3000).moveTo(0,400).release();
		tAction1.press(scrWidth/2+80,scrHeight/2+80).waitAction(3000).moveTo(0,400).release();
		multiTouch.add(tAction0).add(tAction1);
		multiTouch.perform();
		Thread.sleep(20000);
		driver.quit();
	}
}
