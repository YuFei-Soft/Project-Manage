package three;

import java.util.Scanner;

public class Abnormal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������γ̴��ţ�1��3֮������֣�");
		try {
			int chose = input.nextInt();
			switch (chose) {
			case 1:
				System.out.println("JAVA");
				break;
			case 2:
				System.out.println("C++");
				break;
			case 3:
				System.out.println("C#���");
				break;
			}
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("�����쳣���˳�����");
		} finally {
			System.out.println("��ӭ�������");
		}
	}
}
