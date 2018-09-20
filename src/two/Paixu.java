package two;

import java.util.Arrays;

public class Paixu {
	public void sortShow(String[] names) {
		Arrays.sort(names);
	}

	public static void main(String[] args) {
		Paixu Paixu2 = new Paixu();
		String[] name = { "aa", "bb", "pp", "dd" };
		Paixu2.sortShow(name);
		System.out.println(Arrays.toString(name));

	}

}
