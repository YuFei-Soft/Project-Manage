package sousou;

import java.util.Scanner;

public class SosoMgr {
	public static void main(String[] args) {
		SosoMgr mgr = new SosoMgr();
		mgr.mainMenu();
	}

	// 一级菜单
	public void mainMenu() {
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
				System.out.println("用户登陆");
				secondMenu();
				continue;
			case 2:
				// 用户注册
				System.out.println("用户注册");
				continue;
			case 3:
				// 使用嗖嗖
				System.out.println("使用嗖嗖");
				continue;
			case 4:
				// 话费充值
				System.out.println("话费充值");
				continue;
			case 5:
				// 资费说明
				System.out.println("资费说明");
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
	public void secondMenu() {
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
				continue;
			case 4:
				System.out.println("4。套餐变更");
				continue;
			case 5:
				System.out.println("5。办理退网");
				continue;
			}
			break;
		} while (true);
	}
	

}
