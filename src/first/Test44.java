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
		System.out.println("���������ӵĳɼ��ǣ�");
		int b = input.nextInt();
		int index = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (b > a[i]) {
				index = i;
				break;
			}
		}// ����ƶ�һλ
		for (int c = a.length - 1; c > index; c--) {
			a[c] = a[c - 1];
		}
		a[index] = b;
		System.out.println("������±��ǣ�" + index);
		System.out.println("��������Ԫ��Ϊ��");
		for (int d : a) {
			System.out.print(d + "\t");
		}
	}

}
