package first;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		System.out.print("�û���:  ");
		Scanner input = new Scanner(System.in);
		String a = input.next();
		// String f="123456";
		if (a.equals("admin")) {
			System.out.print("����������:    ");
	
			String f = input.next();		
			if (f.equals("123456")) {
				System.out.print("��½�ɹ�");
			} else {
				System.out.print("�������.");
			}
		} else {
			System.out.print("���û���������");
		}

	}

}
