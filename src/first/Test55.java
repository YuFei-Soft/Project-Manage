package first;

import java.util.Scanner;

public class Test55 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("�������" + (i + 1) + "���˹���������·��۸�");
			int sum = 0;
			for (int c = 0; c < 3; c++) {	
				double d = input.nextDouble();
				if (d > 300) {
					sum++;
					continue;
				}
			}
			System.out.println("��" + (i + 1) + "�˹���" + sum + "���·��Ż�");
		}
	}

}
