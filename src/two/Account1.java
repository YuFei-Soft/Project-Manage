package two;

import java.util.Scanner;

public class Account1 {
	double money;

	public void getMoney(double money1) {// 存钱
		money += money1;
		System.out.println("存钱成功！");
	}

	public void putMoney(double money2) {// 取钱
		money -= money2;
		
	}

	public void moneyShow() {// 显示余额
			System.out.println(money);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account1 ac = new Account1();
		do {
			System.out.println("1,存款/t2,取款/t3,退出");
			System.out.println("请选择：");
			int choose = input.nextInt();
			double money = 0;
			switch (choose) {
			case 1:
				System.out.println("请输入金额");
				money=input.nextDouble();
				ac.getMoney(money);
				 ac.moneyShow();
				 break;
			case 2:
				System.out.println("输入取款金额");
				money=input.nextDouble();
				

			}

		} while (true);

	}
}
