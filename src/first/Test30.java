package first;

import java.util.Scanner;

public class Test30 {

	public static void main(String[] args) {
		System.out.println("��ӭʹ��MyShopping����ϵͳ");
		System.out
				.println("* * * * * * * *  * * * * * * * * * *  * ** * * * *** ** ** *");
		System.out.println("1.�ͻ�����ϵͳ");
		System.out.println("2.�������");
		System.out.println("3.�������"); // �ؼ��������ϣ�����
		System.out.println("4.ע��");
		System.out
				.println("* * * * * * * *  * * * * * * * * * *  * ** * * * *** ** ** *");
		System.out.println("��ѡ����������:");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		while (a > 4) {
			System.out.println("����������������룺");
			a = input.nextInt();
		}
		switch (a) {
		case 1:
			System.out.println("1.�ͻ�����ϵͳ");
			break;
		case 2:
			System.out.println("2.�������");
			break;
		case 3:
			System.out.println("3.�������");
			break;
		case 4:
			System.out.println("4.ע��");
			break;

		}
		System.out.println("�������");
	}

}
