package first;

import java.util.Scanner;

public class Test25 {

	public static void main(String[] args) {
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("��ѡ�������Ʒ�ı��");
		System.out.println("1.T ��\t\t" + "2.����Ь\t\t" + "3.������");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		double money = 245;
		double money1 = 300;
		double money2 = 400;
		Scanner input = new Scanner(System.in);
		String temp = "y";
		double x = 0;
		while (temp.equals("y")) {
			System.out.print("��������Ʒ�ı��:");
			int a = input.nextInt();
			while(a>3){
				System.out.println("������������Ʒ��ţ�");
				a=input.nextInt();
			}
			System.out.print("��������Ʒ������:");
			int b = input.nextInt();
			switch (a) {
			case 1:
				x += money * b;
				System.out.println("T ����" + money + "\t" + " ����:" + b + "\t"
						+ "�ϼƣ�" + money * b);
				break;
			case 2:
				x += money1 * b;
				System.out.println("����Ь��" + money1 + "\t" + " ����:" + b + "\t"
						+ "�ϼƣ�" + money1 * b);
				break;
			case 3:
				x += money2 * b;
				System.out.println("�����ģ�" + money2 + "\t" + " ����:" + b + "\t"
						+ "�ϼƣ�" + money2 * b);
			}
			System.out.print("�Ƿ����" + "(y/n):");
			temp = input.next();
		}
		System.out.println("�ϼ�Ϊ��" + x);
		System.out.println("�ۿ�:" + 0.8);
		System.out.println("Ӧ�����:" + x * 0.8);
		System.out.print("ʵ�����: ");
		double c = input.nextDouble();
		System.out.println("���㣺" + (c - x * 0.8));
		System.out.println("���������");
	}

}
