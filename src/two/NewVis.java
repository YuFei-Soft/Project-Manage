package two;

import java.util.Scanner;

public class NewVis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a;
		do {
			Visitor s = new Visitor();
			System.out.println("Ոݔ��������");
			s.name = input.next();
			System.out.println("Ոݔ�����g��");
			s.age = input.nextInt();
			s.showMoney();
			System.out.println("��ѡ��y/n��");
			a = input.next();
		} while (a.equals("y"));
		System.out.println("���������");
	}
}
