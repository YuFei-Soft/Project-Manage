package first;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("\t\t欢迎使用MyShopping管理系统\t\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * \t\n");
		System.out.println("\t\t1. 客户信息管理\t\n");
		System.out.println("\t\t2. 购物结算\t\n");
		System.out.println("\t\t3. 真情回馈\t\n");
		System.out.println("\t\t4. 注销\t\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * \t\n");
		System.out.print("请选择，输入数字：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a > 4) {
			System.out.print("输入错误，请从新输入：");
			int b = input.nextInt();
			switch (b) {
			case 1:
				System.out.println("执行客户信息管理\t\n");
				System.out.println("程序结束\t\n");
				break;
			case 2:
				System.out.println("执行 购物结算\t\n");
				System.out.println("程序结束\t\n");
				break;
			case 3:
				System.out.println("执行真情回馈\t\n");
				System.out.println("程序结束\t\n");
				break;
			case 4:
				System.out.println("执行 注销\t\n");
				System.out.println("程序结束\t\n");
				break;

			}

		}

	}

}
