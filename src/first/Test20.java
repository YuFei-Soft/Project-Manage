package first;

import java.util.Scanner;

public class Test20 {

	private static Scanner input;

	public static void main(String[] args) {
 		System.out.println("�������Ƿ��ǻ�Ա:  �ǣ�y��/�������ַ���:");
		input = new Scanner(System.in);
		String a = input.next();
		
		System.out.println("�����빺���");
		int b = input.nextInt();

		if ("y".equals(a)) {
			if (b < 200) {
				System.out.println("ʵ��֧��=" + b * 0.8);
			} else  {
				System.out.println("ʵ��֧��=" + b * 0.75);
			}
		}else{
			if (b > 100) {
				System.out.println("ʵ��֧��=" + b * 0.9);
			} else {
				System.out.println("ʵ��֧��=" + b);
			}
		}
	

	}
}
