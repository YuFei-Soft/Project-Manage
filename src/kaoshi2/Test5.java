package kaoshi2;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个字母：");
		char zimu = input.next().charAt(0);
		if (Character.isLowerCase(zimu)) {
			zimu = Character.toUpperCase(zimu);
			System.out.println(zimu);
		} else {
			System.out.println("不是小写字母");
		}
	}

}
