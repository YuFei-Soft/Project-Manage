package first;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		System.out.println("�������ع������ϵͳ>  �ͻ���Ϣ>  ��ӿͻ�");
		System.out.print("�������Ա�ţ�<4Ϊ��������");
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt()) {
			int a = input.nextInt();
			if (a > 999 && a < 10000) {
				System.out.print("�������Ա����(��/��<��2λ����ʾ>����");
				String b = input.next();
				System.out.print("���������:   ");
				int d = input.nextInt();
				System.out.println("��¼��Ļ�Ա��Ϣ��:  ");
				System.out.println(a + "\t\t" + b + "\t" + d + "\t");
			} else {
				System.out.print("������1000-9999֮��");
			}
		} else {
			System.out.print("����������");
		}

	}

}
