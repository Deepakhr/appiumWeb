package Sulekha_TestScript;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import BasePackage.BaseLib;
import Suleka_PageObject.HomePage_Search;
import io.appium.java_client.android.AndroidDriver;

public class SearchTest {

	AndroidDriver<WebElement>driver;
	BaseLib lib;
	@Test
	public void SerchTest(XmlTest xmlObj) throws IOException, InterruptedException
	{
		lib=new BaseLib();
		driver = lib.initApp(xmlObj);
		Thread.sleep(5000);
		HomePage_Search p=new HomePage_Search(driver);
		p.serchBox.click();
		p.Text.sendKeys("manas mohanty");
	}
}
