package first;

import java.util.Scanner;

public class Test52 {

	public static void main(String[] args) {
		System.out.println("请输入等腰三角形的行数：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		for (int i = 1; i <= a; i++) {
			for (int b = 0; b < (a - i + 10); b++) {
				System.out.print(" ");
			}
			for (int c = 0; c < 2 * i - 1; c++) {
				if (c == 0 || c == 2 * i - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = a - 1; i >= 1; i--) {
			for (int b = 0; b < (a - i + 10); b++) {
				System.out.print(" ");
			}
			for (int c = 0; c < 2 * i - 1; c++) {
				if (c == 0 || c == 2 * i - 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
