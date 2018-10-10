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
		Dog2 dog = new Dog2("美美", "金毛");
		Dog2 dog2 = new Dog2("亚亚", "拉布拉多");
		Dog2 dog3 = new Dog2("欧欧", "雪纳瑞");
		Map<String, Dog2> dogs = new HashMap<String, Dog2>();
		dogs.put("美美", dog);
		dogs.put("亚亚", dog2);
		dogs.put("欧欧", dog3);
		System.out.println("Map中指定对象，对象信息如下：");
		System.out.println(dogs.get("欧欧"));
		if (dogs.containsKey("拉拉")) {
			System.out.println("有此宠物");
		} else {
			System.out.println("没有这个宠物");
		}
	}
}
