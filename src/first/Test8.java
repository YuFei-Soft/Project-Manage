package first;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("�����뱾�� ");
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		input.close();
		double x = money * (1 + 0.0225);
		double x2 = money * (1 + 0.027 * 2);
		double x3 = money * (1 + 0.0324 * 3);
		double x4 = money * (1 + 0.036 * 5);
		System.out.println("����Ϊ�� " + money);
		System.out.println("��ȡһ���ı�ϢΪ��" + x);
		System.out.println("��ȡ�����ı�ϢΪ��" + x2);
		System.out.println("��ȡ�����ı�ϢΪ��" + x3);
		System.out.println("��ȡ�����ı�ϢΪ��" + x4);
	}

}
