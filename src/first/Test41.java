package first;

import java.util.Scanner;

public class Test41 {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 2, 1, 23, 344, 12 };
		int sum = 0;
		int d = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.println("arr[" + i + "]=" + arr[i]);
		}
		System.out.println("sum=" + sum);
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��ֵ��");
		int c = input.nextInt();
		for (int b = 0; b < arr.length; b++) {
			if (c == arr[b]) {
				d = d + 1;
				break;
			}
		}
		if (d == 1) {
			System.out.println("��������");
		} else {
			System.out.println("����������");
		}
	}

}
