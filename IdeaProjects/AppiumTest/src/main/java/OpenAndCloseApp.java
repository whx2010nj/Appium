import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by wanghongxiang on 16/6/21.
 */
public class OpenAndCloseApp {

    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", "Android Device");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("appPackage", "me.ele");
        capabilities.setCapability("appActivity", ".Launcher");
        AndroidDriver driver = null;
        try{
            // 根据 Desired Capabilities 打开应用
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
//        driver.findElement(By.id("me.ele:id/"));
            long defaultTimeOut = 50;
            driver.manage().timeouts().implicitlyWait(defaultTimeOut, TimeUnit.SECONDS);
//            String pageSource = driver.getPageSource();
            // System.out.print(pageSource);

            //我的按钮
            WebElement me = driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]" +
                    "/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]" +
                    "/android.widget.FrameLayout[1]/android.widget.LinearLayout[4]");
            me.click();
            //登陆界面
            WebElement launch = driver.findElementByXPath("//android.widget.LinearLayout[1]" +
                    "/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]" +
                    "/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]" +
                    "/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]" +
                    "/android.widget.RelativeLayout[1]\n");
            launch.click();
//            WebElement myBalance = driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/" +
//                    "android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/" +
//                    "android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/" +
//                    "android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/" +
//                    "android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]\n");
//            WebElement hongbao = driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[2]\n");
//            WebElement accumulate = driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]\n");

            WebElement pwdLaunch = driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.TextView[1]\n");
            pwdLaunch.click();

            WebElement userText = driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]");
            System.out.print(userText.getText());
            WebElement pwdText = driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.EditText[1]");
            pwdText.sendKeys("whx0506,.");


            WebElement launchButton = driver.findElementByXPath("//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]\n");
            launchButton.click();
            Thread.sleep(10000);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            // 关闭应用
            driver.quit();
//            driver.close();
        }

//




    }
}
