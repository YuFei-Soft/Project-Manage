package first;

import java.util.Arrays;

public class Test47 {

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4 }, { 11, 22 } };
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
			for (int x = 0; x < a[i].length; x++) {
				System.out.println(a[i][x]);
			}
			System.out.println("+++++++++++++++");
		}

	}
}