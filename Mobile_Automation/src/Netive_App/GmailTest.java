package Netive_App;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GmailTest {

	static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto g4");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10");
		cap.setCapability("appPackage", "com.google.android.gm");
		cap.setCapability("appActivity", "com.google.android.gm.ui.MailActivityGmail");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver(url, cap);
		driver.findElement(By.className("android.widget.ImageButton")).click();
		driver.findElement(By.id("com.google.android.gm:id/account_list_button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("com.google.android.gm:id/manage_accounts_text")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("a");
		driver.findElement(By.xpath("//android.widget.LinearLayout[@bounds='[0,240][1080,408]']")).click();
		System.out.println("b");
		Thread.sleep(5000);
		System.out.println("1");
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
		//driver.findElement(By.xpath("//android.widget.LinearLayout[@bounds='[0,340][1080,541]']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[contains(@content-desc,'More options')]")).click();
		System.out.println("f");
		//driver.findElement(By.xpath("//android.widget.ImageButton[@id='android:id/title']")).click();
		System.out.println("g");
		driver.findElement(By.xpath("//android.widget.LinearLayout[@index='1']")).click();
		System.out.println("k");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.Button[@text='Cancel']")).click();
		driver.quit();
	}
}
