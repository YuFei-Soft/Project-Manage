package first;

import java.util.Arrays;
import java.util.Scanner;

public class Test46 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] a = { 1, 2, 3, 5, 6, 7, 8 };
		int index = a.length;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.print("待输入的数为：");
		int b = input.nextInt();
		for (int x = 0; x < a.length; x++) {
			if (a[x] > b) {
				index = x;
				break;
			}
		}
		System.out.println("带插入的下标为：" + index);
		int[] c = Arrays.copyOf(a, a.length + 1);
		for (int x = c.length - 1; x > index; x--) {
			c[x] = c[x - 1];
		}
		System.out.println("新的数组为：");
		c[index] = b;
		for (int x = 0; x < c.length; x++) {
			System.out.println(c[x]);
		}

	}
}