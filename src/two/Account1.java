package two;

import java.util.Scanner;

public class Account1 {
	double money;//

	public void getMoney(double some) {// 存钱
		money += some;
		System.out.println("存钱成功！");
	}

	public void putMoney(double some) {// 取钱
		if (money < some) {// 判断是否大于money
			System.out.println("余额不足，不能取款!!!");
		} else {
			money -= some;
		}
	}

	public void moneyShow() {// 显示余额
		System.out.println(money);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account1 ac = new Account1();
		do {
			System.out.println("1,存款\t2,取款\t3,退出");
			System.out.println("请选择：");
			int choose = input.nextInt();
			double money = 0;
			switch (choose) {
			case 1:
				System.out.println("请输入金额");
				money = input.nextDouble();
				ac.getMoney(money);
				ac.moneyShow();
				break;
			case 2:
				System.out.println("输入取款金额");
				money = input.nextDouble();
				ac.putMoney(money);
				ac.moneyShow();
				break;
			case 3:
				System.out.println("退出系统");
				return;
			}

		} while (true);

	}
}
