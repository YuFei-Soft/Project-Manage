package first;

import java.util.Scanner;

public class Test17 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 10);
		System.out.println("随机数为:    " + random);

		System.out.println("请输入4位会员卡号:   ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		// input.close();
		System.out.println("4位会员卡号位:    " + a);
		int baiwei = a / 100 % 10;
		System.out.println("百位数为:   " + baiwei);
		if (baiwei == random) {
			System.out.println("幸运用户");
		} else {
			System.out.println("不是幸运用户");
		}

	}

}
