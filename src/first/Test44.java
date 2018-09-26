package first;

import java.util.Scanner;

public class Test44 {

	public static void main(String[] args) {
		int[] a = new int[6];
		a[0] = 99;
		a[1] = 85;
		a[2] = 82;
		a[3] = 63;
		a[4] = 60;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入增加的成绩是：");
		int b = input.nextInt();
		int index = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (b > a[i]) {
				index = i;
				break;
			}
		}// 向后移动一位
		for (int c = a.length - 1; c > index; c--) {
			a[c] = a[c - 1];
		}
		a[index] = b;
		System.out.println("插入的下标是：" + index);
		System.out.println("插入后的新元素为：");
		for (int d : a) {
			System.out.print(d + "\t");
		}
	}

}
