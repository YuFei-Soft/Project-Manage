package two;

import java.util.Scanner;

public class Dog {
	public String name;
	public int health;
	public int love;
	public String strain;

	public void show() {
		System.out.println("名字" + name + "健康值" + health + "亲密值" + love + "品种"
				+ strain);
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getLove() {
		return love;
	}

	public String getStrain() {
		return strain;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到宠物店");
		System.out.println("请输入宠物姓名");
		String name = input.next();
		System.out.println("请选择类型：1狗 ，2企鹅");
		int sum = input.nextInt();
		switch (sum) {
		case 1:
			System.out.println("请输入狗的品种");
			String strain = input.next();
			Dog dog = new Dog();
			dog.name = name;
			dog.strain = strain;
			dog.show();
			break;

		}

	}
}
