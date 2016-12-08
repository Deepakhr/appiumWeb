package Basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.xml.XmlTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseLib {
	
	public static AndroidDriver<WebElement>driver;
	public static Properties loadproperty() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\config_folder\\configApp.properties");
		Properties pro=new Properties();
		pro.load(fis);
		return pro;
	}
	public AndroidDriver<WebElement>initApp() throws IOException {
		
		Properties pobj=loadproperty();
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.VERSION,"6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto g4");
		cap.setCapability("appPackage", "com.bigbasket.mobileapp");
		cap.setCapability("appActivity", "com.bigbasket.mobileapp.activity.SplashActivity");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver<>(url, cap);
		
		return driver;
	}
}
