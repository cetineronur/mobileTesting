package AppiumClassFirst;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BrowserStackGunceDemos {

    public static String userName = "onuretiner_SaZnUO";
    public static String accessKey = "MCfzmxBzJj8yE2knbcjN";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        // Use Java Client v6.0.0 or above
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("platformVersion", "10.0");
        capabilities.setCapability("deviceName", "Samsung Galaxy Note 20");
        capabilities.setCapability("app", "bs://526672a4849ab6c68fdcfb30d038f70953d5eacc");

        // ! Yukarıdaki path i kendinize göre ayarlayınız.
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);

        driver.quit();
    }
}
