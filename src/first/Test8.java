package first;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		System.out.println("请输入本金： ");
		Scanner input = new Scanner(System.in);
		int money = input.nextInt();
		input.close();
		double x = money * (1 + 0.0225);
		double x2 = money * (1 + 0.027 * 2);
		double x3 = money * (1 + 0.0324 * 3);
		double x4 = money * (1 + 0.036 * 5);
		System.out.println("本金为： " + money);
		System.out.println("存取一年后的本息为：" + x);
		System.out.println("存取两年后的本息为：" + x2);
		System.out.println("存取三年后的本息为：" + x3);
		System.out.println("存取五年后的本息为：" + x4);
	}

}
