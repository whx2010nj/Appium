package appiumUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by wanghongxiang on 16/6/23.
 */
public class AppiumInit {

    public static AndroidDriver init() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Android Device");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("appPackage", "me.ele");
        capabilities.setCapability("appActivity", ".Launcher");
//        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        AndroidDriver driver = null;
        try {
            // 根据 Desired Capabilities 打开应用
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
            long defaultTimeOut = 20;
            driver.manage().timeouts().implicitlyWait(defaultTimeOut, TimeUnit.SECONDS);

            return driver;
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return driver;
        }

    }
    }
