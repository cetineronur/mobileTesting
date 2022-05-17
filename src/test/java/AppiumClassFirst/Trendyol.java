package AppiumClassFirst;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Trendyol {

    @Test
    public void handyTest() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "CPH1893");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
        desiredCapabilities.setCapability(MobileCapabilityType.UDID, "4030c43c");
        desiredCapabilities.setCapability("noReset", "true");
        //? noReset, true olarak ayarlanırsa, bu oturum başlamadan önce uygulama verileri SİLİNMEZ.
        //? fullReset true olarak ayarlanırsa uygulama kaldırılır ve tüm veriler temizlenir.
       //desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gunceproapp.GunceCloud");

       // desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "crc645e33510600e34ad5.MainActivity");

        // ! Yukarıdaki path i kendinize göre ayarlayınız.

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:127.0.0.1:4723/wd/hub"), desiredCapabilities);
    }
}
