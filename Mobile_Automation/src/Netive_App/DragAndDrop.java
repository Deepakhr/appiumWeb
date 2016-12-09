package Netive_App;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDrop {

	static AndroidDriver driver;
public static void main(String[] args) throws InterruptedException, IOException {
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G");
		cap.setCapability("appPackage", "com.android.dialer");
		cap.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		 driver=new AndroidDriver(url,cap);
		Thread.sleep(5000);
		driver.navigate().back();
		
		TouchAction act=new TouchAction(driver);
		WebElement wb=driver.findElement(By.xpath("//android.widget.TextView[@text='Financial Calculator India']"));
		System.out.println(wb.getText());
		act.longPress(wb, 5000);
		WebElement wb1=driver.findElement(By.xpath("//android.widget.TextView[@text='Play Store']"));
		System.out.println(wb1.getText());
		act.moveTo(wb1).release().perform();
		
		
}
}
