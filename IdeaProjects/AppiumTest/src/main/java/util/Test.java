package util;

import io.appium.java_client.android.AndroidDriver;
import org.dom4j.*;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Created by wanghongxiang on 16/6/21.
 */
public class Test {

    private WebElemetnsFactory factory;

    public static void main(String[] args){


         //System.out.print(ClassLoader.getSystemResource(""));
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
             long defaultTimeOut = 10;
             driver.manage().timeouts().implicitlyWait(defaultTimeOut, TimeUnit.SECONDS);
//             System.out.print(driver.getPageSource());
             String path = "config.xml";
             xmlParser parser = new xmlParser(path);
             Map<String, String> elementMap = parser.parseXML();
             WebElemetnsFactory factory = new WebElemetnsFactory(driver);
             factory.getWebElementByxpath(elementMap.get("我的")).click();
             WebElement user_center = factory.getWebElementByxpath(elementMap.get("user_center"));
             String tag = user_center.findElement(By.id("me.ele:id/userCenter_name_tv")).getText();
             //System.out.print(tag);
             user_center.click();
             if("立即登录".equals(tag)) {
                 factory.getWebElementByxpath(elementMap.get("launchButton")).click();

                 WebElement user_text = factory.getWebElementByxpath(elementMap.get("user_text"));
                 if (user_text.getText() == null) {
                     user_text.sendKeys("15996239267");
                 }
                 factory.getWebElementByxpath(elementMap.get("user_pwd")).sendKeys("whx0506,.");
                 factory.getWebElementByxpath(elementMap.get("user_launch")).click();
                 Thread.sleep(2000);
                 user_center.click();
             }


             List<WebElement> elementsByAndroidUIAutomator = driver.findElementsByAndroidUIAutomator("new UiSelector().classNameMatches(\".*?TextView$\")");
//             List<WebElement> elementsByAndroidUIAutomator = driver.findElementsByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\")");

//             List<WebElement> elementsByAndroidUIAutomator = driver.findElements(By.className("android.widget.TextView"));
             for (WebElement e:elementsByAndroidUIAutomator
                  ) {
                System.out.print(e.getText());

             }

            /*
             SaveDataUtil save = new SaveDataUtil(factory);
             save.saveUserData();

             WebElement backButton = factory.getWebElementByxpath(elementMap.get("backButton"));
             backButton.click();
             factory.getWebElementByxpath(elementMap.get("myAddress")).click();
             save.saveAddressData();

             backButton.click();
             WebElement myBalance = factory.getWebElementByxpath(elementMap.get("myBalance"));
             myBalance.click();
            // System.out.print(factory.getWebElementByViewTogetallChildView("android.widget.FrameLayout","android.widget.View",0));

             backButton.click();
             WebElement myHongbao = factory.getWebElementByxpath(elementMap.get("myHongbao"));
             myHongbao.click();
            // System.out.print(factory.getWebElementByViewTogetallChildView("android.widget.FrameLayout","android.widget.TextView",0));


             backButton.click();
             WebElement myScore = factory.getWebElementByxpath(elementMap.get("myScore"));
             myScore.click();
           //  System.out.print(factory.getWebElementByViewTogetallChildView("android.widget.FrameLayout","android.widget.TextView",0));

             backButton.click();
             WebElement myColllection = factory.getWebElementByxpath(elementMap.get("myColllection"));
             myColllection.click();


             backButton.click();
             WebElement foodPhotoes = factory.getWebElementByxpath(elementMap.get("foodPhotoes"));
             foodPhotoes.click();

             backButton.click();
             WebElement scoreMall = factory.getWebElementByxpath(elementMap.get("ScoreMall"));
             scoreMall.click();

             backButton.click();
             WebElement elemeMember = factory.getWebElementByxpath(elementMap.get("elemeMember"));
             elemeMember.click();

*/
//             System.out.println(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",15,"android.widget.TextView",0).getText()
//                     + ":" + factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",15,"android.widget.CheckedTextView",0).getText()
//             );



//             List<WebElement> lnearList = driver.findElementsByClassName("android.widget.LinearLayout");
////
//             String  str= lnearList.get(4).findElements(By.className("android.widget.TextView")).get(1).getText();
//             System.out.print(str);
//             for (WebElement w: lnearList
//                  ) {
//                 System.out.print(w.getAttribute("package"));
//
//             }
//             System.out.print("手机 :" + driver.findElementByName("手机").getText());
//             System.out.print("邮箱 :" + driver.findElementByName("邮箱").getText());
//             System.out.print("微信 :" + driver.findElementByName("微信").getText());
//             System.out.print("QQ :" + driver.findElementByName("QQ").getText());
//             System.out.print("微博 :" + driver.findElementByName("微博").getText());
//             System.out.print("淘宝 :" + driver.findElementByName("淘宝").getText());



             //String user_page = driver.getPageSource();
             //System.out.print(user_page);

             //String user_source = driver.getPageSource();


//             for (String name:
//                  elementMap.keySet()) {
//                 factory.getWebElementByxpath(elementMap.get(name)).click();
//                 Thread.sleep(500);
//
//             }

//             driver.lockScreen(1);



         }catch (Exception e){
             e.printStackTrace();
         }finally {
             // 关闭应用
             driver.quit();
//            driver.close();
         }

     }

}
