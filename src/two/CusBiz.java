package two;

import java.util.Scanner;

public class CusBiz {
	String name;
	String a;
	public String[] names = new String[5];

	public void addName(String name) {
		int index = -1;
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			names[index] = name;
		} else {
			System.out.println("Ìí¼ÓÊ§°Ü");
		}
	}

	public void show() {
		for (String name : names) {
			if (name == null) {
				break;
			}
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		CusBiz d = new CusBiz();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("ÇëÊäÈëÐÕÃû£º");
			String re = input.next();
			System.out.println("¼ÌÐøÂð£¿£¨y/n£©");
			String ad = input.next();
			if ("n".equals(ad)) {

				break;
			}

		} while (true);
	}

}