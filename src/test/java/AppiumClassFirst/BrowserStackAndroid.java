package AppiumClassFirst;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserStackAndroid {

    public static String userName = "onuretiner_SaZnUO";
    public static String accessKey = "MCfzmxBzJj8yE2knbcjN";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "My FirstTest");
        caps.setCapability("name", "Browserstack");
        caps.setCapability("app", "bs://4a5e08b8b59f4278992c43f1728cacf07946f163");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);


        driver.quit();
    }
}

//curl -u "onuretiner_SaZnUO:MCfzmxBzJj8yE2knbcjN" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@D:\\mobileTesting\\appiumNew-master\\src\\test\\java\\AppiumClassFirst\\APP\\etsy.apk"
