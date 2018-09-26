package first;

import java.util.Scanner;

public class Test43 {

	public static void main(String[] args) {
		System.out.println("请输入会员本月的消费记录");
		double[] a = new double[5];
		Scanner input = new Scanner(System.in);
		double sum = 0; // 总金额
		for (int x = 0; x < a.length; x++) {
			System.out.println("请输入第" + (x + 1) + "笔购物金额：");
			a[x] = input.nextDouble();
			sum = sum + a[x];
		}
		System.out.println("序号\t\t\t" + "金额（元）");
		for (int c = 0; c < 5; c++) {
			System.out.println((c + 1) + "\t\t\t\t" + a[c]);
		}

		System.out.println("总金额：\t\t" + sum);
	}

}
