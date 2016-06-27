package appiumUtil;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by wanghongxiang on 16/6/23.
 */
public class AppiumDom4JXmlUtil {


    /**
     * @param page xml文件名
     * @param elementName 要查找的控件元素名
     * @return  返回控件的查找属性
     */
    public static Map<String,String> getXmlValue(String page, String elementName){

        try{
            //获取page xml文件
           // InputStream inputStream = this.getClass().getResourceAsStream("/module02.xml");
            File file = new File(AppiumDom4JXmlUtil.class.getClassLoader().getResource(page).getPath());
            //创建SAXReader读取器，专门用于读取xml
            SAXReader saxReader = new SAXReader();
            //根据saxReader的read重写方法可知，既可以通过inputStream输入流来读取，也可以通过file对象来读取
            Document document = saxReader.read(file);

            Element rootElement = document.getRootElement();
            List<Element> elements = rootElement.elements("element");
            Map<String,String> findXmlValue = new HashMap<>();
            Element findElement = null;

            for (Element e:elements
                 ) {
                if (elementName.equals(e.attributeValue("name"))) {
                    findElement = e;
                    break;
                }

            }


            List<Element> elementsChild = findElement.elements();
            for (Element e:elementsChild
                 ) {
                findXmlValue.put(e.getName(),e.getText());
                System.out.println(e.getName() + ":" + e.getText());

            }
            return findXmlValue;


//            Iterator<Element> modulesIterator = rootElement.elements("module").iterator();
//            //rootElement.element("name");获取某一个子元素
//            //rootElement.elements("name");获取根节点下子元素moudule节点的集合，返回List集合类型
//            //rootElement.elements("module").iterator();把返回的list集合里面每一个元素迭代子节点，全部返回到一个Iterator集合中
//            while(modulesIterator.hasNext()){
//                Element moduleElement = modulesIterator.next();
//                Element nameElement = moduleElement.element("name");
//                System.out.println(nameElement.getName() + ":" + nameElement.getText());
//                Element valueElement = moduleElement.element("value");
//                System.out.println(valueElement.getName() + ":" + valueElement.getText());
//                Element descriptElement = moduleElement.element("descript");
//                System.out.println(descriptElement.getName() + ":" + descriptElement.getText());
//            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

    /**
     * @param page
     * @param elementName
     * @param attribute 查找控件的属性
     * @return
     */
    public static String getXmlValue(String page, String elementName,String attribute){

        return getXmlValue(page,elementName).get(attribute);

    }


}
