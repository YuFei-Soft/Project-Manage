package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) {
		Class clazz=User.class;
		//�������
		Field[] Fields=clazz.getDeclaredFields();
		for (Field field : Fields) {
			System.out.println(field);
		}
		//������з���
		Method [] methods=clazz.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method);
		}
		//������еĹ��췽��
		Constructor [] constructors=clazz.getDeclaredConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}
		try {
			User user=(User) clazz.newInstance();
			Field  nameField=clazz.getDeclaredField("name");
			
			
		} catch (InstantiationException | IllegalAccessException e) {
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
