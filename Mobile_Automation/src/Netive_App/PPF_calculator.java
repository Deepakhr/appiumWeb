package Netive_App;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PPF_calculator {

	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto g4");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability("appPackage", "com.rkayapps.financeindia");
		cap.setCapability("appActivity", "com.rkayapps.financeindia.ui.MainActivity");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver(url, cap);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Loan - EMI']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Rs.']")).sendKeys("350000");
		driver.findElement(By.xpath("//android.widget.EditText[@text='%']")).sendKeys("10");
		Thread.sleep(5000);
		driver.findElement(By.id("com.rkayapps.financeindia:id/editBankLoanTerm")).sendKeys("10");
		Thread.sleep(5000);
		driver.hideKeyboard();
		driver.findElement(By.id("com.rkayapps.financeindia:id/buttonBankLoanCalculate")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@bounds='[540,1316][1050,1365]']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@bounds='[540,1366][1050,1415]']")).getText());
		System.out.println(driver.findElement(By.xpath("//android.widget.TextView[@bounds='[540,1416][1050,1465]']")).getText());
		TouchAction act=new TouchAction(driver);
		act.tap(driver.findElement(By.xpath("//android.widget.Button[@text='Reset']"))).perform();
		Thread.sleep(10000);
		driver.findElement(By.id("com.rkayapps.financeindia:id/spinnerBankLoanTermType")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@index='1']")).click();
		Thread.sleep(10000);
		driver.quit();

	}

}
