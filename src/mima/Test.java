package mima;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***��ӭ��½ע��ϵͳ***");
		do {
			System.out.println("�������û�����");
			String name = input.next();
			System.out.println("���������룺");
			String pwd = input.next();
			System.out.println("���ٴ��������룺");
			String rePwd = input.next();
			// �ж��û���������
			boolean flag1 = false;
			if (name.length() > 3 && pwd.length() > 6 && rePwd.length() > 6) {
				// ��ȷ�ĸ�ʽ
				flag1 = true;
			} else {
				// ����ȷ�ĸ�ʽ
				flag1 = false;
				System.out.println("�û�����������С��3�����볤�Ȳ���С��6");
			}
			// ��������
			boolean flag2 = false;
			if (rePwd.equals(pwd)) {
				flag2 = true;
				// ��ͬ�����
			} else {
				// ��ͬ�����
				flag2 = false;
				System.out.println("������������벻ͬ��");
			}
			if (flag1 & flag2) {
				System.out.println("ע��ɹ������μ�");
				break;
			}

		} while (true);

	}

}
