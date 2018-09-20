package first;

import java.util.Scanner;

public class Tese22 {

	public static void main(String[] args) {
		System.out.println("* * * * * * * * * * * * * * * * * * * * * *");
		System.out.println("\t\t欢迎我行我素购物系\t\n");
		System.out.println("\t\t\t1.登陆系统\t\n");
		System.out.println("\t\t\t2.退出\t\n");
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * \t\n");
		System.out.print("输入数字：");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a == 1) {
			System.out.println("1.客户信息管理");
			System.out.println("2.购物结算");
			System.out.println("3.真情回馈");
			System.out.println("4.注销");
			System.out.print("请选择:");
			int b=input.nextInt();
			if (b == 1) {
				System.out.println("1.显示所有客户信息");
				System.out.println("2.添加客户信息");
				System.out.println("3.修改客户信息");
				System.out.println("4.查询客户信息");
			}
			if (b== 3) {
				System.out.println("1.幸运大放送");
				System.out.println("2.幸运抽奖");
				System.out.println("3.生日问候");
			} else {
				System.out.println("此功能没有开通");
			}
		} else {
			System.out.print("欢迎你的使用。");
		}

	}

}
