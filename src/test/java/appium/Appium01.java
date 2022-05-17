package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium01 {
    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
       // desiredCapabilities.setCapability(CapabilityType.PLATFORM_NAME, "Android");
       // desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"D:\\mobileTesting\\appiumNew-master\\src\\app\\Gesture Tool_v1.3_apkpure.com.apk");
       desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
        //desiredCapabilities.setCapability("appPackage","com.google.android.apps.nexuslauncher" );
       // desiredCapabilities.setCapability("appActivity","com.google.android.apps.nexuslauncher.NexusLauncherActivity" );

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
        //driver.findElementById("com.davemac327.gesture.tool:id/addButton").click();
       // driver.findElementByXPath("//*[@text='Add gesture']").click();
        driver.findElementById("com.davemac327.gesture.tool:id/testButton").click();
        WebElement text = driver.findElementByXPath("//*[@text='Test a gesture']");
        String expectedText= "Test a gesture";
        Assert.assertEquals(expectedText,text.getText());
        driver.quit();
    }
}
