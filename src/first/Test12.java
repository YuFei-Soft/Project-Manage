package first;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("STB�ĳɼ��ǣ�");
		int STB = input.nextInt();
		System.out.println("JAVA�ĳɼ��ǣ�");
		int JAVA = input.nextInt();
		System.out.println("SQL�ĳɼ���:       ");
		int SQL = input.nextInt();
		input.close();
		int diffen = JAVA - SQL;
		double avg = (STB + JAVA + SQL) / 3;
		System.out.println("JAVA��SQL�ĳɼ�����:       " + diffen);
		System.out.println("���ſε�ƽ������:       " + avg);

	}

}
