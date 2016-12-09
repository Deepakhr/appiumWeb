package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.xml.XmlTest;

import com.thoughtworks.selenium.webdriven.commands.DragAndDrop;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseLib {

	public AndroidDriver<WebElement>driver;
	
	public Properties loadProperty() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\ConfigProperty\\Config.properties");
		Properties pro=new Properties();
		pro.load(fis);
		return pro;
	}
	public AndroidDriver<WebElement> initApp(XmlTest t) throws IOException
	{
		Properties pr=loadProperty();
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, t.getParameter(""));
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, t.getParameter(""));
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, t.getParameter(""));
		cap.setCapability("appPackage", pr.get("Su_AppPackage"));
		cap.setCapability("appActivity", pr.get("Su_AppActivity"));
		URL url=new URL("http://"+t.getParameter("hostName")+":"+t.getParameter("portNumber")+"/wd/hub");
		driver=new AndroidDriver<>(url, cap);
		return driver;
		
	}
}
