import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class scroll {

	static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6.0.1");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "moto g(4)");
		cap.setCapability("appPackage", "com.android.contacts");
		cap.setCapability("appActivity", "com.android.contacts.DialtactsContactsEntryActivity");
		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AndroidDriver(url,cap);
		

	}

}
