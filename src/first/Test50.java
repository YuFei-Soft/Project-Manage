package first;

import java.util.Scanner;

public class Test50 {

	public static void main(String[] args) {
		System.out.println("������ֱ�������ε�������");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int c = 1; c <= 2 * i - 1; c++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
