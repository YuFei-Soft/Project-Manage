package fanshe;

import java.io.File;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Test4 {
	public static void main(String[] args) {
		Map<String,User> map=new HashMap<String,User>();
		SAXReader reader=new SAXReader();
		try {
			Document doc=reader.read(new File("src/stu.xml"));
			Element root=doc.getRootElement();
		//	List<Element> bards = element.elements();
			for (Element obj:(List<Element>)root.elements()) {
				String key=obj.attributeValue("key");
				String type=obj.attributeValue("type");
				Class clazz=Class.forName(type);
				User user=(User) clazz.newInstance();
				for (Element pro:(List<Element>)obj.elements()){
					String attName=pro.attributeValue("name");
					String  sttValue=pro.attributeValue("value");
					 Field  field=clazz.getDeclaredField(attName); 
					 field.setAccessible(true);
					// System.out.println(field.getType().getName());
					 if(field.getType().getName().equals("java.lang.Integer")){
						 field.set(user, Integer.parseInt(sttValue));						 					 
					 }else{
						 field.set(user, sttValue);
					 }					 										
				}
				map.put(key, user);
			}	
			User  u2=map.get("U2");
			System.out.println(u2);
			User u1=map.get("U1");
			System.out.println(u1);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
