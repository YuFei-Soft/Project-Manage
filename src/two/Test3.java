package two;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int days = -1;
		int chose = -1;
		String barnd = "";
		String type = "";
		Car2 car=new Car2();
		
		int money = -1;
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到汽车租赁公司");
		System.out.println("请输入要租赁的天数：");
		days = input.nextInt();
		System.out.println("请输入要租赁的汽车类型：（1,轿车2,客车");
		chose = input.nextInt();
		if (chose == 1) {
			System.out.println("请输入租赁的汽车品牌:（1，宝马2，别克）");
			chose = input.nextInt();
			if (chose == 1) {
				barnd = "宝马";
			car.setBrand("宝马");
			car.calcRent(days);

			} else {
				System.out.println("请输入轿车型号（1，商务GL8 2，林荫大道）");
				chose = input.nextInt();
				if (chose == 1) {
			

				} else {

				}

			}

		} else {

		}
		
		money=car.calcRent(days);
		System.out.println("租赁金额："+money);
	}
}
