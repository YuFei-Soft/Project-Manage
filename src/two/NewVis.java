package two;

import java.util.Scanner;

public class NewVis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a;
		do {
			Visitor s = new Visitor();
			System.out.println("請輸入姓名：");
			s.name = input.next();
			System.out.println("請輸入年齡：");
			s.age = input.nextInt();
			s.showMoney();
			System.out.println("请选择（y/n）");
			a = input.next();
		} while (a.equals("y"));
		System.out.println("程序结束！");
	}
}
