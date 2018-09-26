package first;

import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		System.out.print("小明的考试成绩为:    ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if (a == 100) {
			System.out.println("爸爸给他买辆车");
		} else if (90 <= a && a < 100) {
			System.out.println("妈妈给她买MP4");
		} else if (60 <= a && a < 90) {
			System.out.println("妈妈给她买本参考书");
		} else if (a < 60) {
			System.out.println("什么都不买");
		}

	}

}
