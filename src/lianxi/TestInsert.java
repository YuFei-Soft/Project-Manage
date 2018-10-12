package lianxi;

import java.util.Scanner;

public class TestInsert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»´®Êı×Ö£º");
		String num = input.next();
		String b1 = "";
		StringBuffer ad = null;
		if (num.contains(".")) {
			String a = num;
			String[] b = a.split("\\.");
			ad = new StringBuffer(b[0]);
			b1 = "." + b[1];
		} else {
			ad = new StringBuffer(num);
		}

		for (int i = ad.length() - 3; i > 0; i = i - 3) {
			ad.insert(i, "£¬");
		}
		System.out.println(ad + b1);

	}

}
