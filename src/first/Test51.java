package first;

import java.util.Scanner;

public class Test51 {

	public static void main(String[] args) {
		System.out.println("请输入直角三角形的行数：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		for (int i = 0; i < a; i++) {
			for (int b = 0; b < a - i; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
