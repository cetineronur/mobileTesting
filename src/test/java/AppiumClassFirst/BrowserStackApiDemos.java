package AppiumClassFirst;

import java.net.URL;
import java.util.List;
import java.net.MalformedURLException;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserStackApiDemos {

    public static String userName = "onuretiner_SaZnUO";
    public static String accessKey = "MCfzmxBzJj8yE2knbcjN";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "android");
        caps.setCapability("platformVersion", "7.0");
        caps.setCapability("deviceName", "Samsung Galaxy S8 Plus");
        caps.setCapability("app", "bs://33b94295f5c34fbb8d73c0f46b90055895ad009c");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

        WebElement preference = driver.findElementByAccessibilityId("Preference");
        preference.click();

        Thread.sleep(2000);
        WebElement preferenceDependencies = driver.findElementByAccessibilityId("3. Preference dependencies");
        preferenceDependencies.click();

        WebElement checkBox = driver.findElementById("android:id/checkbox");
        checkBox.click();

        Thread.sleep(2000);

        WebElement wifiSetting = driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]"));
        wifiSetting.click();

        WebElement inputBox = driver.findElementById("android:id/edit");

        inputBox.sendKeys("appiumTest");

        WebElement okButton = driver.findElementById("android:id/button1");

        Assert.assertEquals("appiumTest",inputBox.getText());

        okButton.click();

        driver.quit();
    }
}