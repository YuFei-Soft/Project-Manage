package first;

import java.util.Scanner;

public class Test23 {

	public static void main(String[] args) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("\t\t��ӭ�������ع���ϵ\t\n");
		System.out.println("\t\t\t1.��½ϵͳ\t\n");
		System.out.println("\t\t\t2.�˳�\t\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * \t\n");
		System.out.print("�������֣�");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a == 1) {

			System.out.println("1.�ͻ���Ϣ����");
			System.out.println("2.�������");
			System.out.println("3.�������");
			System.out.println("4.ע��");
			System.out.print("�������֣�");
			Scanner input1 = new Scanner(System.in);
			int b = input1.nextInt();
			switch (b) {
			case 1:
				System.out.println("1.��ʾ���пͻ���Ϣ");
				System.out.println("2.��ӿͻ���Ϣ");
				System.out.println("3.�޸Ŀͻ���Ϣ");
				System.out.println("4.��ѯ�ͻ���Ϣ");
				break;
			case 2:
			case 4:
				System.out.println("�˹���û�п�ͨ");
				break;
			case 3:
				System.out.println("1.���˴����");
				System.out.println("2.���˳齱");
				System.out.println("3.�����ʺ�");
				break;
			}

		} else {
			System.out.println("��ӭʹ��");
		}

	}

}
