package util;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wanghongxiang on 16/6/21.
 */
public class xmlParser {

    private String path = null;
    public xmlParser(String path){
        this.path = this.getClass().getClassLoader().getResource(path).getPath();
    }


    public Map<String, String> parseXML(){

        SAXReader reader = new SAXReader();
        File file = new File(path);

        try {
            Document document = reader.read(file);
            Element root = document.getRootElement();
            List<Element> childElements = root.elements();
            Map<String,String> elementsMap = new HashMap<>();
            for (Element child : childElements) {


                System.out.println("element: " + child.attributeValue("name") + child.attributeValue("xpath"));

                elementsMap.put( child.attributeValue("name"),child.attributeValue("xpath"));

            }

            return elementsMap;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
