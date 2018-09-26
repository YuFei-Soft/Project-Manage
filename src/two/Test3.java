package two;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int seatCount = -1;
		String barnd = "";
		String type = "";
		String no = "苏A74110";
		int money = -1;
		Car2 car = null;
		Bus bus = null;
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎来到汽车租赁公司");
		System.out.println("请输入要租赁的天数：");
		int days = input.nextInt();
		System.out.println("请输入要租赁的汽车类型：（1,轿车2,客车");
		int chose = input.nextInt();
		if (chose == 1) {
			System.out.println("请输入租赁的汽车品牌:（1，宝马2，别克）");
			chose = input.nextInt();
			if (chose == 1) {
				barnd = "宝马";
				System.out.println("请选择型号：");
				System.out.println("1，宝马550i");
				chose = input.nextInt();
				if (chose == 1) {
					type = "宝马550i";
				}
			} else {
				barnd = "别克";
				System.out.println("请输入轿车型号（1，商务GL8 2，林荫大道）");
				chose = input.nextInt();
				if (chose == 1) {
					type = "商务GL8";

				} else {
					type = "林荫大道";
				}
			}
			car = new Car2(no, barnd, type);
			money = car.calcRent(days);
		} else {
			System.out.println("请选择品牌（1，金杯2，金龙）");
			chose = input.nextInt();
			if (chose == 1) {
				barnd = "金杯";
				seatCount = 15;
			} else {
				barnd = "金龙";
				seatCount = 25;
			}
			bus = new Bus(no, barnd, seatCount);
			money = bus.calcRent(days);
		}
		System.out.println("租赁金额：" + money);
	}
}
