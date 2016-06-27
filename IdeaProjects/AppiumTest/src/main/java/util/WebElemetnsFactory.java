package util;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by wanghongxiang on 16/6/21.
 */
public class WebElemetnsFactory {

    private static AndroidDriver driver = null;
    public WebElemetnsFactory(AndroidDriver driver){
        this.driver = driver;
    }


    public  WebElement getWebElementByname(String name){
        return  driver.findElementByName(name);
    }
    public  WebElement getWebElementByxpath(String xpath){
        return driver.findElementByXPath(xpath);

    }

    public List<WebElement> getListWebElementByClassname(String className){
        return driver.findElementsByClassName(className);
    }
    public WebElement getWebElementByViewTogetChildView(String classname, int index, String childClassName,int childIndex){

        List<WebElement> lnearList = getListWebElementByClassname(classname);
//
        WebElement webElement = lnearList.get(index).findElements(By.className(childClassName)).get(childIndex);
        return webElement;
    }
    public String getWebElementByViewTogetallChildView(String classname,String childClassName,int childIndex){

        StringBuilder sb = new StringBuilder();
        List<WebElement> lnearList = getListWebElementByClassname(classname);

        for(int i = 0;i<lnearList.size();i++){

            WebElement webElement = lnearList.get(i).findElements(By.className(childClassName)).get(childIndex);
            sb.append(webElement.getText() + "\n");
        }
        return sb.toString();
    }



}
