package appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class AppiumApidemos extends AppiumBase {
    @Test
    public void test() throws MalformedURLException, InterruptedException {
        AndroidDriver driver=androidDriver();

        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Preference\"]").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]\n").click();
        Thread.sleep(2000);

   String check = driver.findElementByAndroidUIAutomator("UiSelector().className(\"android.widget.CheckBox\")").getAttribute("checked");
        System.out.println(check);

            if(check.equals("false")){
                driver.findElementById("android:id/checkbox").click();
                Thread.sleep(2000);
                driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
            }else{
                driver.findElementByXPath("//android.widget.TextView[@text='WiFi settings']").click();
                Thread.sleep(2000);
            }

     driver.findElementByClassName("android.widget.EditText").sendKeys("onur");
     driver.findElementByClassName("android.widget.Button").click();
     //driver.close();
    }
}
