package first;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		System.out.print("用户名:  ");
		Scanner input = new Scanner(System.in);
		String a = input.next();
		// String f="123456";
		if (a.equals("admin")) {
			System.out.print("请输入密码:    ");
	
			String f = input.next();		
			if (f.equals("123456")) {
				System.out.print("登陆成功");
			} else {
				System.out.print("密码错误.");
			}
		} else {
			System.out.print("该用户名不存在");
		}

	}

}
