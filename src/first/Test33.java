package first;

import java.util.Scanner;

public class Test33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a;
		String b;
		int sum = 0;
		do {
			sum++;
			System.out.print("�������û�����");
			a = input.next();
			System.out.print("���������룺");
			b = input.next();
			if (!a.equals("admin") || !b.equals("123456")) {
				System.out.println("��������㻹��" + (3 - sum) + "�λ���");
				if (sum == 3) {
					System.out.println("�Բ�����3���������");
				}
			} else {
				System.out.println("��½�ɹ�");
				break;
			}
		} while (sum < 3);
	}

}
