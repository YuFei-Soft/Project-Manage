package two;

import java.util.Scanner;

public class Admin2 {
	public String name;
	public String mun;

	public void showNan() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("请输入用户名：");
			String name = input.next();
			System.out.println("请输入密码：");
			String mun = input.next();
			if (name.equals("张伟") && mun.equals("123456")) {
				System.out.println("请输入新密码：");
				String newMun = input.next();
				System.out.println("修改成功，新密码为" + newMun);
				break;

			} else {
				System.out.println("输入不正确，请重新输入！");
			}
		} while (true);

	}

	public static void main(String[] args) {
		Admin2 ad = new Admin2();
		ad.name = "张伟";
		ad.mun = "123456";
		ad.showNan();

	}
}