package kuangjia;

import java.util.ArrayList;

public class Yuxi {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("������");
		list.add("����");
	//	list.add("����");
		list.add("���");
		// �жϼ������Ƿ������Ī�
		System.out.println(list.contains("��Ī��"));
		list.remove(0);// ������Ϊ0�������Ƴ���
		System.out.println("***********************");
		list.set(1, "����");
		for (int i = 0; i < list.size(); i++) {
			String name = (String) list.get(i);
			System.out.println(name);
		}
		System.out.println("***********************");
		System.out.println(list.indexOf("С��Ů"));
		list.clear();// ���list�е�����
		System.out.println("***********************");
		for (Object obj : list) {
			String name = (String) obj;
			System.out.println(name);

		}
		System.out.println(list.isEmpty());

	}

}
