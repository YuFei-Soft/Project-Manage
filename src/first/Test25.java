package first;

import java.util.Scanner;

public class Test25 {

	public static void main(String[] args) {
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
		System.out.println("请选择购买的商品的编号");
		System.out.println("1.T 恤\t\t" + "2.网球鞋\t\t" + "3.网球拍");
		System.out
				.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		double money = 245;
		double money1 = 300;
		double money2 = 400;
		Scanner input = new Scanner(System.in);
		String temp = "y";
		double x = 0;
		while (temp.equals("y")) {
			System.out.print("请输入商品的编号:");
			int a = input.nextInt();
			while(a>3){
				System.out.println("请重新输入商品编号：");
				a=input.nextInt();
			}
			System.out.print("请输入商品的数量:");
			int b = input.nextInt();
			switch (a) {
			case 1:
				x += money * b;
				System.out.println("T 恤￥" + money + "\t" + " 数量:" + b + "\t"
						+ "合计￥" + money * b);
				break;
			case 2:
				x += money1 * b;
				System.out.println("网球鞋￥" + money1 + "\t" + " 数量:" + b + "\t"
						+ "合计￥" + money1 * b);
				break;
			case 3:
				x += money2 * b;
				System.out.println("网球拍￥" + money2 + "\t" + " 数量:" + b + "\t"
						+ "合计￥" + money2 * b);
			}
			System.out.print("是否继续" + "(y/n):");
			temp = input.next();
		}
		System.out.println("合计为：" + x);
		System.out.println("折扣:" + 0.8);
		System.out.println("应付金额:" + x * 0.8);
		System.out.print("实付金额: ");
		double c = input.nextDouble();
		System.out.println("找零：" + (c - x * 0.8));
		System.out.println("购物结束。");
	}

}
