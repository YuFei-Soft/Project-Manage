package kuangjia;

import java.util.ArrayList;

public class Yuxi {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("张三丰");
		list.add("郭靖");
	//	list.add("黄蓉");
		list.add("杨过");
		// 判断集合中是否包含李莫愁。
		System.out.println(list.contains("李莫愁"));
		list.remove(0);// 把索引为0的数据移除。
		System.out.println("***********************");
		list.set(1, "黄蓉");
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println(name);
		}
		System.out.println("***********************");
		System.out.println(list.indexOf("小龙女"));
		list.clear();// 清空list中的数据
		System.out.println("***********************");
		for (Object obj : list) {
			String name = (String) obj;
			System.out.println(name);

		}
		System.out.println(list.isEmpty());

	}

}
