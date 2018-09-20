package first;

import java.util.Scanner;

public class Test33 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a;
		String b;
		int sum = 0;
		do {
			sum++;
			System.out.print("请输入用户名：");
			a = input.next();
			System.out.print("请输入密码：");
			b = input.next();
			if (!a.equals("admin") || !b.equals("123456")) {
				System.out.println("输入错误！你还有" + (3 - sum) + "次机会");
				if (sum == 3) {
					System.out.println("对不起，你3次输入错误");
				}
			} else {
				System.out.println("登陆成功");
				break;
			}
		} while (sum < 3);
	}

}
