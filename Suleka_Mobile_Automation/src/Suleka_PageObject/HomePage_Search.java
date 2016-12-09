package Suleka_PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class HomePage_Search {

	public AppiumDriver driver;
	
	public HomePage_Search(AppiumDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="sulekha.yellowpages.lcf:id/et_need")
	public WebElement serchBox;
	@FindBy(id="sulekha.yellowpages.lcf:id/menu_search")
	public WebElement Text;
}
