import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		File f=new File("src") ;
		File fs=new File(f,"ApiDemos-debug.apk");
		String Cadena="This is change from master";
		String branch="fromBranch";
		//new commen
		//adding a commne t above desiredcapabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		//New comment added in line X
		cap1.setCapability(MobileCapabilityType.DEVICE_NAME, "PixelAndroid9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	}

}
