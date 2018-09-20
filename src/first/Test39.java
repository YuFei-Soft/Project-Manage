package first;

import java.util.Scanner;

public class Test39 { // 求5名学生的平均分，最高分和最低分

	public static void main(String[] args) {
		int[] scoers = new int[5];
		double a = 0;
		double b = 0;
		int max = 0;
		int min = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5名学生的成绩：");
		for (int i = 0; i < scoers.length; i++) {
			scoers[i] = input.nextInt();
		}
		max = scoers[0];
		min = scoers[0];
		for (int c = 0; c < scoers.length; c++) {
			a = a + scoers[c];
			if (scoers[c] > max) {
				max = scoers[c];
			}
			if (scoers[c] < min) {
				min = scoers[c];
			}

		}
		b = a / scoers.length;
		System.out.println("平均数：" + b);
		System.out.println("总分数：" + a);
		System.out.println("最高分：" + max);
		System.out.println("最低分：" + min);

	}

}
