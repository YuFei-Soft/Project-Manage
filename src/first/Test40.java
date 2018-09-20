package first;

import java.util.Scanner;

public class Test40 {
	// 计算30人的平均分，使用数组实现
	public static void main(String[] args) {
		double[] scores = new double[30];// 定义数组有多少个元素
		Scanner input = new Scanner(System.in);
		double sum = 0; // 总分
		for (int i = 0; i < 30; i++) {
			System.out.println("请输入第" + (i + 1) + "个同学的成绩：");
			scores[i] = input.nextDouble();// 为数组的30个格子赋值
			sum = sum + scores[i];
		}
		// 计算平均分
		double avg = sum / 30;
		System.out.println("班级的平均分是：" + avg);
	}

}
