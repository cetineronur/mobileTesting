package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumUISelector {

    @Test
    public void test() throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAtomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"D:\\mobileTesting\\appiumNew-master\\src\\app\\Gesture Tool_v1.3_apkpure.com.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);

        //resourceId
        driver.findElementByAndroidUIAutomator("UISelector().resourceId(\"com.davemac327.gesture.tool:id/addButton\")").click();

        //class Name
        driver.findElementByAndroidUIAutomator("UISelector().resourceId(\"android.widget.Button\")").click();
    }
}
