package com.andriod.commonUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.eclipse.jdt.internal.compiler.ast.AnnotationMethodDeclaration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.xml.XmlTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseLib {
	
	public AndroidDriver<WebElement> driver;
	
	public Properties loadPropertiesFile(String testNAme) throws IOException{

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\com\\andriod\\config\\testConfig.properties");
		Properties propertyObj = new Properties();
		propertyObj.load(fis);
		return propertyObj;
	}
	
	public AndroidDriver<WebElement> initAppiumTest(String testNAme , XmlTest t) throws IOException{
		Properties pObj = loadPropertiesFile(testNAme);
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, t.getParameter("PLATFORM_NAME"));
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, t.getParameter("PLATFORM_VERSION"));
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, t.getParameter("DEVICE_NAME"));
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, t.getParameter("NEW_COMMAND_TIMEOUT"));
		cap.setCapability("appPackage", pObj.get(testNAme+"_appPackage"));
		cap.setCapability("appActivity", pObj.get(testNAme+"_appActivity"));
		URL url=new URL("http://"+t.getParameter("hostName")+":"+t.getParameter("portNumber")+"/wd/hub");
		return driver=new AndroidDriver<WebElement>(url, cap);
		
	}

}
