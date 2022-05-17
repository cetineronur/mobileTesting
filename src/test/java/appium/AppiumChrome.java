package appium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumChrome {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        //telefondaki chrome test edilecek
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UIAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.NO_RESET,"true");
        desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
        //https://chromedriver.storage.googleapis.com/index.html grekli driver buradan indirilir.(101.0.4951)
        desiredCapabilities.setCapability("chromedriverExecutable","D:\\mobileTesting\\appiumNew-master\\src\\driver\\chromedriver.exe");

        AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
        driver.get("https://www.amazon.com/");
        //chrome://inspect/#devices bu adrese girersek bilgisayarda bagli olan devicelar gozukur ve kontrol edebiliriz.
        driver.findElementByXPath("//a[@class='nav-a nav-show-sign-in']").click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElementByXPath("//h2").isDisplayed());

        driver.quit();
    }
}
