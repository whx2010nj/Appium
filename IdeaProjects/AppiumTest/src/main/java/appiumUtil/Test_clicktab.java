package appiumUtil;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.event.KeyEvent;
import java.util.Set;

/**
 * Created by wanghongxiang on 16/6/23.
 */
public class Test_clicktab {

    public static void main(String[] args)  {

        AndroidDriver driver = AppiumInit.init();
        if(driver == null) {
            throw new RuntimeException("the init not success");

        }


        try {

            String page = "clicktab.xml";
//        String elementName ="我的";
//
//            AppiumActionUtil.clickAppiumFactory(driver,page,"我的");
//            if(AppiumActionUtil.clickAppiumFactory(driver,page,"立即登录",true)){
//                AppiumActionUtil.clickAppiumFactory(driver,page,"密码登录");
//                AppiumActionUtil.inputAppiumFactory(driver,page,"手机","15996239267");
//                AppiumActionUtil.inputAppiumFactory(driver,page,"密码","whx0506,.");
//                AppiumActionUtil.clickAppiumFactory(driver,page,"登录");
//            }
//            AppiumActionUtil.clickAppiumFactory(driver,page,"立即登录");
//            Thread.sleep(2000);
//            AppiumActionUtil.printPageTextInfo(driver);
            Thread.sleep(5000);

            //测试手势操作
            AppiumActionUtil.swipeToDown(driver,3000);
            AppiumActionUtil.swipeToUp(driver,3000);


            //获取用户登录相关信息
            //AppiumFunctionTest.getUserCenterPage(driver,page);

            //第三方登录验证
            //AppiumFunctionTest.testOtherLaunch(driver,page);


//        AppiumActionUtil.clickAppiumFactory(driver,page,"转到上一级");
//
//        AppiumActionUtil.clickAppiumFactory(driver,page,"QQ");
//        Thread.sleep(2000);
//        AppiumActionUtil.clickAppiumFactory(driver,page,"转到上一级");
//        AppiumActionUtil.clickAppiumFactory(driver,page,"微博");
//        Thread.sleep(2000);
//        AppiumActionUtil.clickAppiumFactory(driver,page,"转到上一级");
//        AppiumActionUtil.clickAppiumFactory(driver,page,"淘宝");
//        Thread.sleep(2000);
//        AppiumActionUtil.clickAppiumFactory(driver,page,"转到上一级");
            Thread.sleep(20000);
            //driver.getKeyboard();
            //String appStrings = driver.getAppStrings();
            //System.out.print(appStrings);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            driver.quit();
        }



    }

}
