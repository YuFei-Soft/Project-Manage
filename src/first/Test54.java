package first;

import java.util.Arrays;

//ц╟ещеепР
public class Test54 {

	public static void main(String[] args) {
		int[] a = { 5, 8, 9, 10, 11, 3 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int c = 0; c < a.length - 1 - i; c++) {
				if (a[c + 1] < a[c]) {
					int d = a[c];
					a[c] = a[c + 1];
					a[c + 1] = d;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
