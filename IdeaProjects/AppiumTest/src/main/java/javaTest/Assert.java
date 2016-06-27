package javaTest;

/**
 * Created by wanghongxiang on 16/6/24.
 */
public class Assert {


    public static void main(String[] args) {
        boolean isOpen = false;
        assert isOpen = true; //如果开启了断言，会将isOpen的值改为true
        System.out.println(isOpen);//打印是否开启了断言
    }

}
