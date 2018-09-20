package first;

import java.util.Scanner;

public class Test18 {

	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统>  客户信息>  添加客户");
		System.out.print("请输入会员号（<4为整数）：");
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt()) {
			int a = input.nextInt();
			if (a > 999 && a < 10000) {
				System.out.print("请输入会员生日(月/日<用2位数表示>）：");
				String b = input.next();
				System.out.print("请输入积分:   ");
				int d = input.nextInt();
				System.out.println("已录入的会员信息是:  ");
				System.out.println(a + "\t\t" + b + "\t" + d + "\t");
			} else {
				System.out.print("请输入1000-9999之间");
			}
		} else {
			System.out.print("请输入整数");
		}

	}

}
