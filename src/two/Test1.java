package two;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person person1 = new Person();
		do {
			System.out.println("������������");
			String name = input.next();
			if ("n".equals(name)) {
				break;
			}
			System.out.println("����������Ϊ��");
			int age = input.nextInt();
			person1.name = name;
			person1.age = age;
			person1.showPrices();

		} while (true);
		System.out.println("�˳�����");
	}

}
