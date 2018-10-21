package sousou;

import java.util.Scanner;

public class SosoMgr {
	CardUtil utils = new CardUtil();

	public static void main(String[] args) {
		SosoMgr mgr = new SosoMgr();
		mgr.mainMenu();
	}

	// 一级菜单
	public void mainMenu() {
		String mobileNumber = "";
		String passWord = "";
		utils.init();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("********欢迎使用嗖嗖移动业务大厅**********");
			System.out.print("1。用户登陆");
			System.out.print("2。用户注册");
			System.out.print("3。使用嗖嗖");
			System.out.print("4。话费充值");
			System.out.print("5。资费说明");
			System.out.println("6。退出系统");
			System.out.print("请选择：");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				// 用户登陆
				// System.out.println("用户登陆");
				System.out.print("请输入手机号：");
				mobileNumber = input.next();
				System.out.print("请输入密码：");
				passWord = input.next();
				if (utils.isExistCard(mobileNumber, passWord)) {
					secondMenu(mobileNumber);
				} else {
					System.out.println("对不起，您输入的信息有误，无法登陆！");
				}

				// secondMenu();
				continue;
			case 2:
				// 用户注册
				// System.out.println("用户注册");
				registCard();
				continue;
			case 3:
				// 使用嗖嗖
				// System.out.println("使用嗖嗖");
				System.out.print("请输入手机号：");
				mobileNumber = input.next();
				utils.useSoso(mobileNumber);
				continue;
			case 4:
				// 话费充值
				// System.out.println("话费充值");
				System.out.print("请输入要充值的号码：");
				mobileNumber = input.next();
				if (utils.isExists(mobileNumber))
					;
				System.out.print("请输入要充值的金额：");
				double money = input.nextDouble();
				utils.chargeMoney(mobileNumber, money);

				continue;
			case 5:
				// 资费说明
				System.out.print("资费说明");
				utils.showDescription();
				System.out.println("打印完成！");
				continue;
			case 6:
				// 退出
				System.out.println("退出程序,欢迎下次使用！");
				break;
			}
			break;
		} while (true);
	}

	// 二级菜单
	public void secondMenu(String mobileNumber) {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("********嗖嗖移动用户账单**********");
			System.out.println("1。本月账单查询");
			System.out.println("2。套餐余量查询");
			System.out.println("3。打印消费详单");
			System.out.println("4。套餐变更");
			System.out.println("5。办理退网");
			System.out.println("请选择（）输入1-5选择功能，其他返回上一级：");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1。本月账单查询");
				continue;
			case 2:
				System.out.println("2。套餐余量查询");
				continue;
			case 3:
				System.out.println("3。打印消费详单");
				utils.printConsumInfos(mobileNumber);
				continue;
			case 4:
				System.out.println("4。套餐变更");
				System.out.print("1.话痨套餐 2.网虫套餐 3.超人套餐     请选择（序号）：");
				utils.changePack(mobileNumber, input.next());
				continue;
			case 5:
				System.out.println("5。办理退网");
				utils.delCard(mobileNumber);
				System.out.println("谢谢使用");
				//办理退网后推出系统
				System.exit(1);
				//continue;
			}
			break;
		} while (true);
	}

	// 注册新卡的流程
	public void registCard() {
		Scanner input = new Scanner(System.in);
		String[] newNumbers = utils.getNewNumbers(9);
		// 可以选择的卡号列表
		System.out.println("**********可以选择的卡号**********");
		for (int i = 0; i < 9; i++) {
			System.out.print((i + 1) + "." + newNumbers[i] + "\t\t");
			if ((i + 1) % 3 == 0) {
				System.out.println();
			}
		}
		// 选择手机号码
		System.out.print("请选择卡号（输入1——9的序号）");
		String number = newNumbers[input.nextInt() - 1];
		// 选择套餐类型
		System.out.print("(1.话痨套餐         2.网虫套餐       3.超人套餐)");
		System.out.print(" 请选择套餐（输入序号）：");
		// 获取套餐对象
		ServicePackage pack = utils.createPack(input.nextInt());
		// 输入同户名
		System.out.print("请输入姓名：");
		String name = input.next();
		// 输入密码
		System.out.print("请输入密码：");
		String passWord = input.next();
		// 预存话费金额
		double money = 0;
		System.out.print("请输入预存话费金额：");
		money = input.nextDouble();
		while (money < pack.getPrice()) {
			System.out.print("您预存的话费金额不足以支付本月的固定套餐资费，请重新充值：");
			money = input.nextDouble();
		}
		/*
		 * String cardNumber, String userName, String passWord, ServicePackage
		 * serPackage, double consumAmount, double money,
		 */
		MobileCard newCard = new MobileCard(number, name, passWord, pack,
				pack.getPrice(), money - pack.getPrice());
		utils.addCardNo(newCard);
		newCard.showMeg();
		utils.showPack(pack);
		System.out.println("\r\n");

	}

}
