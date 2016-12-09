

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DEmo {

 WebDriver driver;

 public static void main(String[] args) throws MalformedURLException, InterruptedException {
	

	//File app=new File("C:\\Apk_file\\com.whatsapp_2.12.401-450853_minAPI7(armeabi,armeabi-v7a,mips,x86)(nodpi).apk");
	 DesiredCapabilities capabilities=new DesiredCapabilities();
	 //capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,BrowserType.CHROME);
	   // capabilities.setCapability(MobileCapabilityType.PLATFORM,Platform.ANDROID);
	   capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	  capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"moto g4");
	    capabilities.setCapability(MobileCapabilityType.VERSION,"6.0.1");
	    //capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	    capabilities.setCapability("appPackage", "com.whatsapp");
	    capabilities.setCapability("appActivity", "com.whatsapp.Main");
	  URL url= new URL("http://127.0.0.1:4723/wd/hub");
	  WebDriver driver = new AndroidDriver(url, capabilities);
	 /* driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	   driver.get("http://www.facebook.com");
	   System.out.println("Title "+driver.getTitle());
	 driver.findElement(By.name("email")).sendKeys("bapunamohanty@gmail.com");
	 driver.findElement(By.name("pass")).sendKeys("7205414303");
	 driver.findElement(By.id("u_0_5")).click();
	 Thread.sleep(10000);*/
	  
	  
 }
}