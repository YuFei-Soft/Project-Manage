package two;

import java.util.Scanner;

public class Dog {
	public String name;
	public int health;
	public int love;
	public String strain;

	public void show() {
		System.out.println("����" + name + "����ֵ" + health + "����ֵ" + love + "Ʒ��"
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
		System.out.println("��ӭ���������");
		System.out.println("�������������");
		String name = input.next();
		System.out.println("��ѡ�����ͣ�1�� ��2���");
		int sum = input.nextInt();
		switch (sum) {
		case 1:
			System.out.println("�����빷��Ʒ��");
			String strain = input.next();
			Dog dog = new Dog();
			dog.name = name;
			dog.strain = strain;
			dog.show();
			break;

		}

	}
}
