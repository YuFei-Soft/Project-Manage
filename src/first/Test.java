package first;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("\t\t��ӭʹ��MyShopping����ϵͳ\t\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * \t\n");
		System.out.println("\t\t1. �ͻ���Ϣ����\t\n");
		System.out.println("\t\t2. �������\t\n");
		System.out.println("\t\t3. �������\t\n");
		System.out.println("\t\t4. ע��\t\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * \t\n");
		System.out.print("��ѡ���������֣�");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a > 4) {
			System.out.print("���������������룺");
			int b = input.nextInt();
			switch (b) {
			case 1:
				System.out.println("ִ�пͻ���Ϣ����\t\n");
				System.out.println("�������\t\n");
				break;
			case 2:
				System.out.println("ִ�� �������\t\n");
				System.out.println("�������\t\n");
				break;
			case 3:
				System.out.println("ִ���������\t\n");
				System.out.println("�������\t\n");
				break;
			case 4:
				System.out.println("ִ�� ע��\t\n");
				System.out.println("�������\t\n");
				break;

			}

		}

	}

}
