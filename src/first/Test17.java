package first;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 10);
		System.out.println("�����Ϊ:    " + random);

		System.out.println("������4λ��Ա����:   ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		// input.close();
		System.out.println("4λ��Ա����λ:    " + a);
		int baiwei = a / 100 % 10;
		System.out.println("��λ��Ϊ:   " + baiwei);
		if (baiwei == random) {
			System.out.println("�����û�");
		} else {
			System.out.println("���������û�");
		}

	}

}
