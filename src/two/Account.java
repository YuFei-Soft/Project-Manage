package two;

import java.util.Scanner;

/*编写Account类，添加带参
 方法实现存款和取款业务
 存款时帐户初始金额为0元
 取款时如果余额不足给出提示*/

public class Account {
	double money = 0;

	public boolean SaveMoney(double saveMoney)// 存钱
	{
		if (saveMoney > 0) {
			this.money += saveMoney;
			return true;
		}
		return false;
	}

	public boolean GetMoney(double getMoney)// 取钱
	{
		if (this.money >= getMoney) {
			this.money -= getMoney;
			return true;
		}
		return false;
	}

	public double getGalance() {// 查询余额
		return this.money;
	}

	public static void main(String args[]) {
		int num = 0;
		double money;
		Account moneyAccount = new Account();
		Scanner input = new Scanner(System.in);
		do {
			System.out
					.println("***当前余额为:" + moneyAccount.getGalance() + "元***");
			System.out.println("1：存款\t2.取款\t0.退出");
			System.out.println("请选择你需要办理的业务:");
			try {
				num = input.nextInt();// 录入菜单数字
			} catch (Exception e) {
				num = 0;
			}
			if (num == 1) {
				System.out.println("请输入存款金额:");
				try {
					money = input.nextDouble();// 录入存款
					if (moneyAccount.SaveMoney(money)) {
						System.out.println("存款成功");
					} else {
						System.out.println("存款失败,存款金额必须大于0");
					}
				} catch (Exception e) {
					System.out.println("存款失败，请确定输入正确！");
				}
			} else if (num == 2) {
				System.out.println("请输入取款金额:");
				try {
					money = input.nextDouble();// 录入存款
					if (moneyAccount.GetMoney(money)) {
						System.out.println("取款成功");
					} else {
						System.out.println("取款失败，余额不足");
					}
				} catch (Exception e) {
					System.out.println("取款失败，请确定输入正确！");
				}
			}
		} while (num != 0);
	}
}
