package first;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		System.out.print("С���Ŀ��Գɼ�Ϊ:    ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a == 100) {
			System.out.println("�ְָ���������");
		} else if (90 <= a && a < 100) {
			System.out.println("���������MP4");
		} else if (60 <= a && a < 90) {
			System.out.println("��������򱾲ο���");
		} else if (a < 60) {
			System.out.println("ʲô������");
		}

	}

}
