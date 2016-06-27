package appiumUtil;

import org.openqa.selenium.WebElement;

/**
 * Created by wanghongxiang on 16/6/23.
 */
public class AppiumHandleUtil {
    /**
     * 控件类型为可编辑时,设置控件值
     * @param element 控件
     * @param value 设置值
     */
    public static void sendKeys(WebElement element, String value){

        element.sendKeys(value);
    }

    /**
     * 空件的点击事件
     * @param element
     */
    public static void click(WebElement element){
        element.click();
    }

    /**
     * 获取控件的文本值
     * @param element
     * @return
     */
    public static String getText(WebElement element){
        return element.getText();
    }



}
