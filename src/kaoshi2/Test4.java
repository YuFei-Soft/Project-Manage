package kaoshi2;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(10);
		Scanner input = new Scanner(System.in);
		int sum = 0;// 猜中的次数
		int sum2 = 0;// 猜大的次数
		int sum3 = 0;// 猜小的次数
		while (true) {
			System.out.print("请输入你要猜的数：");
			int da = input.nextInt();
			if (da > number) {
				System.out.println("你猜大了！");
				sum2++;
			} else if (da < number) {
				System.out.println("你猜小了！");
				sum3++;
			} else {
				System.out.println("你猜中了!");
				sum++;
				break;
			}
		}
		System.out.println("猜中的次数为：" + sum);
		System.out.println("猜测的次数为：" + (sum3 + sum2));
	}

}
