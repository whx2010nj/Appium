package util;



/**
 * Created by wanghongxiang on 16/6/22.
 */
public class SaveDataUtil {

    public  WebElemetnsFactory factory = null;


    public SaveDataUtil(WebElemetnsFactory factory){
        this.factory = factory;
    }

    public  void saveUserData(){
        System.out.println(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",5,"android.widget.TextView",0).getText()
                + ":" + factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",5,"android.widget.TextView",1).getText()
        );
        System.out.println(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",6,"android.widget.TextView",0).getText()
        );

        System.out.println(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",7,"android.widget.TextView",0).getText()
                + ":" + factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",7,"android.widget.CheckedTextView",0).getText()
        );
        System.out.println(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",8,"android.widget.TextView",0).getText()
                + ":" + factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",8,"android.widget.CheckedTextView",0).getText()
        );
        System.out.println(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",9,"android.widget.TextView",0).getText()
                + ":" + factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",9,"android.widget.CheckedTextView",0).getText()
        );
        System.out.println(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",10,"android.widget.TextView",0).getText()
                + ":" + factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",10,"android.widget.CheckedTextView",0).getText()
        );
        System.out.println(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",11,"android.widget.TextView",0).getText()
                + ":" + factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",11,"android.widget.CheckedTextView",0).getText()
        );
        System.out.println(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",12,"android.widget.TextView",0).getText()
                + ":" + factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",12,"android.widget.CheckedTextView",0).getText()
        );
        System.out.println(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",13,"android.widget.TextView",0).getText()
        );

    }

    public void saveAddressData(){
        System.out.print(factory.getWebElementByViewTogetChildView("android.widget.FrameLayout",3,"android.widget.TextView",0).getText());
        System.out.print(factory.getWebElementByViewTogetChildView("android.widget.FrameLayout",5,"android.widget.TextView",0).getText());

        System.out.print(factory.getWebElementByViewTogetallChildView("android.widget.FrameLayout","android.widget.TextView",0));
//        System.out.print(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",5,"android.widget.TextView",0).getText());
//
//        System.out.print(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",6,"android.widget.TextView",0).getText());
//
//        System.out.print(factory.getWebElementByViewTogetChildView("android.widget.LinearLayout",7,"android.widget.TextView",0).getText());


    }

}
