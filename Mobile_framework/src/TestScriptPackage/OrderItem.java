package TestScriptPackage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Basepackage.BaseLib;
import PageObjectPackage.HomePageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class OrderItem  {
	AndroidDriver<WebElement>driver;
	BaseLib base;
	@Test
	public void FisstTest() throws IOException, InterruptedException
	{
		base=new BaseLib();
		driver = base.initApp();
		Thread.sleep(5000);
		HomePageObject BS_Pob=new HomePageObject(driver);	
		BS_Pob.Click_Searchbtn();
		//BS_Pob.Enter_Searchtxt("mango");
		String Actual_Result = BS_Pob.getInvalidmsg();
	}
}
