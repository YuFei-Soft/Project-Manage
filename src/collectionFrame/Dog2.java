package collectionFrame;

import java.util.HashMap;
import java.util.Map;

public class Dog2 {
	private String name;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Dog2(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public Dog2() {
		super();
	}

	@Override
	public String toString() {
		return name + "\t" + type;
	}

	public static void main(String[] args) {
		Dog2 dog = new Dog2("����", "��ë");
		Dog2 dog2 = new Dog2("����", "��������");
		Dog2 dog3 = new Dog2("ŷŷ", "ѩ����");
		Map<String, Dog2> dogs = new HashMap<String, Dog2>();
		dogs.put("����", dog);
		dogs.put("����", dog2);
		dogs.put("ŷŷ", dog3);
		System.out.println("Map��ָ�����󣬶�����Ϣ���£�");
		System.out.println(dogs.get("ŷŷ"));
		if (dogs.containsKey("����")) {
			System.out.println("�д˳���");
		} else {
			System.out.println("û���������");
		}
	}
}
