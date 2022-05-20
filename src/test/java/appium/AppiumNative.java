package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumNative {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        desiredCapabilities.setCapability("appPackage","com.android.chrome");
        desiredCapabilities.setCapability("appActivity","com.amazon.android.apps.chrome.Main");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:127.0.0.1:4723/wd/hub"),desiredCapabilities);
        driver.get("https://www.amazon.com");
        Thread.sleep(7000);

     driver.findElementByXPath("//span[@id='a-autoid-0-announce']").click();
     //   Thread.sleep(3000);
//
     //  driver.findElementByXPath("//android.view.View[@content-desc=\"Sign In ›\"]/android.widget.TextView").click();
//
     //  String expectedText="Welcome";
     //  String actual=driver.findElementByXPath("//*[@text='Welcome']").getText();
     //  Assert.assertEquals(expectedText,actual);
    }
}
