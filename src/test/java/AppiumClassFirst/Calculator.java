package AppiumClassFirst;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        desiredCapabilities.setCapability("appPackage","com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
       // desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Onur\\Downloads\\appiumNew-master\\appiumNew-master\\src\\test\\java\\AppiumClassFirst\\APP\\Duolingo.apk");
    // ! Yukarıdaki path i kendinize göre ayarlayınız.


    AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
        WebElement sieben = driver.findElementById("com.android.calculator2:id/digit_7");
        sieben.click();
        Thread.sleep(3000);

        WebElement carpma = driver.findElementById("com.android.calculator2:id/op_mul");
        carpma.click();
        Thread.sleep(3000);

        WebElement acht = driver.findElementById("com.android.calculator2:id/digit_8");
        acht.click();
        Thread.sleep(3000);

        WebElement gleich = driver.findElementById("com.android.calculator2:id/eq");
        gleich.click();
        Thread.sleep(5000);

        WebElement expected = driver.findElementById("com.android.calculator2:id/result");
        String expected1 = expected.getText();
        Thread.sleep(3000);
        Assert.assertEquals("56",expected1);
}
}
