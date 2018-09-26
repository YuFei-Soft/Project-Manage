package first;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("STB的成绩是：");
		int STB = input.nextInt();
		System.out.println("JAVA的成绩是：");
		int JAVA = input.nextInt();
		System.out.println("SQL的成绩是:       ");
		int SQL = input.nextInt();
		input.close();
		int diffen = JAVA - SQL;
		double avg = (STB + JAVA + SQL) / 3;
		System.out.println("JAVA和SQL的成绩差是:       " + diffen);
		System.out.println("三门课的平均分是:       " + avg);

	}

}
