package two;

import java.util.Scanner;

public class Admin2 {
	public String name;
	public String mun;

	public void showNan() {
	}

	public static void main(String[] args) {
		Admin2 ad = new Admin2();
		ad.name = "��ΰ";
		ad.mun = "123456";
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("�������û�����");
			String name = input.next();
			System.out.println("���������룺");
			String mun = input.next();
			if (name.equals("��ΰ") && mun.equals("123456")) {
				System.out.println("�����������룺");
				String newMun = input.next();
				System.out.println("�޸ĳɹ���������Ϊ" + newMun);
				break;
			} else {
				System.out.println("���벻��ȷ�����������룡");
			}
		}
		//ad.showNan();
	}
}