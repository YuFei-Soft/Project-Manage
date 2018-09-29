package three;

import java.util.Scanner;

public class Abnormal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入课程代号（1—3之间的数字）");
		try {
			int chose = input.nextInt();
			switch (chose) {
			case 1:
				System.out.println("JAVA");
				break;
			case 2:
				System.out.println("C++");
				break;
			case 3:
				System.out.println("C#编程");
				break;
			}
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("出现异常！退出程序！");
		} finally {
			System.out.println("欢迎提出建议");
		}
	}
}
