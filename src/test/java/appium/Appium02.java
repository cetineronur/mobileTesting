package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium02 {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.APP,"D:\\mobileTesting\\appiumNew-master\\src\\app\\Calculator_v8.1 (403424005)_apkpure.com.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);

        driver.findElementById("com.google.android.calculator:id/digit_7").click();
        driver.findElementById("com.google.android.calculator:id/op_mul").click();
        driver.findElementById("com.google.android.calculator:id/digit_5").click();
        driver.findElementById("com.google.android.calculator:id/eq").click();

        String expected="35";
        WebElement resultFinal=driver.findElementById("com.google.android.calculator:id/result_final");
        Assert.assertEquals(expected,resultFinal.getText());

    }
}
