package fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test3 {
	public static void main(String[] args) {
		Class<User> clazz = User.class;
		try {
			User user = (User) clazz.newInstance();
			Constructor<User> c1 = clazz.getDeclaredConstructor();
			Constructor<User> c2 = clazz.getDeclaredConstructor(Integer.class,String.class,Integer.class);
			User user1=(User) c1.newInstance();
			User user2=(User) c2.newInstance(12,"ÀîËÄ",33);
			System.out.println(user1);
			System.out.println(user2);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
