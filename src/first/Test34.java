package first;

import java.util.Scanner;

public class Test34 {

	public static void main(String[] args) {
		System.out.println("我行我素购物管理系统>  客户信息>  添加客户");
		String c = null;
		do {
			System.out.print("请输入会员号（<4为整数）：");
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			System.out.print("请输入会员生日(月/日<用2位数表示>）：");
			String b = input.next();
			System.out.print("请输入积分:   ");
			int d = input.nextInt();
			System.out.println("已录入的会员信息是:  ");
			System.out.println(a + "\t\t" + b + "\t" + d + "\t");
			System.out.println("是否结束继续录入（y/n）");
			c = input.next();
		} while (!c.equals("y"));
		{
			System.out.println("录入结束");
		}
	}

}
