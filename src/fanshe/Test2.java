package fanshe;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test2 {
	public static void main(String[] args) {
		Class clazz = User.class;
		try {
			User user = (User) clazz.newInstance();
			Method method = clazz.getDeclaredMethod("say", String.class,
					String.class);
			Object re = method.invoke(user, "kakak", "xiaiaia");
			System.out.println(re);
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