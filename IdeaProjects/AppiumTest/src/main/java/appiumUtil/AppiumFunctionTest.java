package appiumUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/6/24.
 */
public class AppiumFunctionTest {

    public  static void testOtherLaunch(AppiumDriver driver1,String page) throws InterruptedException {

        AndroidDriver  driver = (AndroidDriver) driver1;
        AppiumActionUtil.clickAppiumFactory(driver,page,"我的");
        if(!AppiumActionUtil.clickAppiumFactory(driver,page,"立即登录",true)){
            AppiumActionUtil.clickAppiumFactory(driver,page,"设置");
            AppiumActionUtil.clickAppiumFactory(driver,page,"退出登录");
            AppiumActionUtil.clickAppiumFactory(driver,page,"跳过");

            AppiumActionUtil.clickAppiumFactory(driver,page,"立即登录");
        }

//        Set<String> contextNames = driver.getContextHandles();
//        String strWebViewContext = null;
//        for (String contextName : contextNames) {
//            System.out.println("--->" + contextName);
//
//            if (contextName.contains("WEBVIEW")) {
//                strWebViewContext = contextName;
//            }
//        }
//            AppiumActionUtil.clickAppiumFactory(driver,page,"微信");
//            Thread.sleep(2000);
//        //System.out.print(driver.getPageSource());
//            WebElement weixinelement = driver.findElement(By.className("com.tencent.smtt.webkit.WebView"));
//            weixinelement.click();
//
//            AppiumActionUtil.clickAppiumFactory(driver,page,"设置");
//            AppiumActionUtil.clickAppiumFactory(driver,page,"退出登录");
//            AppiumActionUtil.clickAppiumFactory(driver,page,"跳过");
//
//            AppiumActionUtil.clickAppiumFactory(driver,page,"立即登录");
//            AppiumActionUtil.clickAppiumFactory(driver,page,"QQ");
//            Thread.sleep(2000);
//           // System.out.print(driver.getPageSource());
//            WebElement QQelement = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").text(\"登录\")");
//
//            QQelement.click();
//
//            AppiumActionUtil.clickAppiumFactory(driver,page,"设置");
//            AppiumActionUtil.clickAppiumFactory(driver,page,"退出登录");
//            AppiumActionUtil.clickAppiumFactory(driver,page,"跳过");
//
//            AppiumActionUtil.clickAppiumFactory(driver,page,"立即登录");
        AppiumActionUtil.clickAppiumFactory(driver,page,"微博");
        Thread.sleep(4000);
        //System.out.print(driver.getPageSource());
//            WebElement weiBoelement = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").text(\"确定\")");
//            weiBoelement.click();
//            Thread.sleep(2000);
        AppiumActionUtil.clickAppiumFactory(driver,page,"设置");
        AppiumActionUtil.clickAppiumFactory(driver,page,"退出登录");
        AppiumActionUtil.clickAppiumFactory(driver,page,"跳过");

        AppiumActionUtil.clickAppiumFactory(driver,page,"立即登录");
        AppiumActionUtil.clickAppiumFactory(driver,page,"淘宝");
        Thread.sleep(5000);
        // System.out.print(driver.getPageSource());
        WebElement taobaoelement = driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.Button\").text(\"授权并登陆\")");
        taobaoelement.click();
        AppiumActionUtil.clickAppiumFactory(driver,page,"设置");
        AppiumActionUtil.clickAppiumFactory(driver,page,"退出登录");
        AppiumActionUtil.clickAppiumFactory(driver,page,"跳过");

    }

    public static void getUserCenterPage(AppiumDriver driver,String page){


        AppiumActionUtil.clickAppiumFactory(driver,page,"我的");
        if(AppiumActionUtil.clickAppiumFactory(driver,page,"立即登录",true)){
            AppiumActionUtil.clickAppiumFactory(driver,page,"密码登录");
            AppiumActionUtil.inputAppiumFactory(driver,page,"手机","15996239267");
            AppiumActionUtil.inputAppiumFactory(driver,page,"密码","whx0506,.");
            AppiumActionUtil.clickAppiumFactory(driver,page,"登录");
        }
        AppiumActionUtil.clickAppiumFactory(driver,page,"立即登录");
        AppiumActionUtil.printPageTextInfo(driver);
        AppiumActionUtil.clickAppiumFactory(driver,page,"返回");

        AppiumActionUtil.clickAppiumFactory(driver,page,"我的余额");
        AppiumActionUtil.printPageTextInfo(driver);
        AppiumActionUtil.clickAppiumFactory(driver,page,"返回");

        AppiumActionUtil.clickAppiumFactory(driver,page,"我的红包");
        AppiumActionUtil.printPageTextInfo(driver);
        AppiumActionUtil.clickAppiumFactory(driver,page,"返回");

        AppiumActionUtil.clickAppiumFactory(driver,page,"我的积分");
        AppiumActionUtil.printPageTextInfo(driver);
        AppiumActionUtil.clickAppiumFactory(driver,page,"返回");

        AppiumActionUtil.clickAppiumFactory(driver,page,"收货地址");
        AppiumActionUtil.printPageTextInfo(driver);
        AppiumActionUtil.clickAppiumFactory(driver,page,"返回");

        AppiumActionUtil.clickAppiumFactory(driver,page,"我的收藏");
        AppiumActionUtil.printPageTextInfo(driver);
        AppiumActionUtil.clickAppiumFactory(driver,page,"返回");

        AppiumActionUtil.clickAppiumFactory(driver,page,"美食相册");
        AppiumActionUtil.printPageTextInfo(driver);
        AppiumActionUtil.clickAppiumFactory(driver,page,"返回");

        AppiumActionUtil.clickAppiumFactory(driver,page,"积分商城");
        AppiumActionUtil.printPageTextInfo(driver);
        AppiumActionUtil.clickAppiumFactory(driver,page,"返回");

        AppiumActionUtil.clickAppiumFactory(driver,page,"饿了么会员卡");
        AppiumActionUtil.printPageTextInfo(driver);
        AppiumActionUtil.clickAppiumFactory(driver,page,"返回");

    }

}
