package first;

import java.util.Scanner;

public class Tese22 {

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
			System.out.print("��ѡ��:");
			int b=input.nextInt();
			if (b == 1) {
				System.out.println("1.��ʾ���пͻ���Ϣ");
				System.out.println("2.��ӿͻ���Ϣ");
				System.out.println("3.�޸Ŀͻ���Ϣ");
				System.out.println("4.��ѯ�ͻ���Ϣ");
			}
			if (b== 3) {
				System.out.println("1.���˴����");
				System.out.println("2.���˳齱");
				System.out.println("3.�����ʺ�");
			} else {
				System.out.println("�˹���û�п�ͨ");
			}
		} else {
			System.out.print("��ӭ���ʹ�á�");
		}

	}

}
