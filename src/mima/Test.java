package mima;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("***欢迎登陆注册系统***");
		do {
			System.out.println("请输入用户名：");
			String name = input.next();
			System.out.println("请输入密码：");
			String pwd = input.next();
			System.out.println("请再次输入密码：");
			String rePwd = input.next();
			// 判断用户名和密码
			boolean flag1 = false;
			if (name.length() > 3 && pwd.length() > 6 && rePwd.length() > 6) {
				// 正确的格式
				flag1 = true;
			} else {
				// 不正确的格式
				flag1 = false;
				System.out.println("用户名不被不过小于3！密码长度不能小于6");
			}
			// 两次密码
			boolean flag2 = false;
			if (rePwd.equals(pwd)) {
				flag2 = true;
				// 相同的情况
			} else {
				// 不同的情况
				flag2 = false;
				System.out.println("两次输入的密码不同！");
			}
			if (flag1 & flag2) {
				System.out.println("注册成功，请牢记");
				break;
			}

		} while (true);

	}

}
