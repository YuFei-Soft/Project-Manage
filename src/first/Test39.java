package first;

import java.util.Scanner;

public class Test39 { // ��5��ѧ����ƽ���֣���߷ֺ���ͷ�

	public static void main(String[] args) {
		int[] scoers = new int[5];
		double a = 0;
		double b = 0;
		int max = 0;
		int min = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("������5��ѧ���ĳɼ���");
		for (int i = 0; i < scoers.length; i++) {
			scoers[i] = input.nextInt();
		}
		max = scoers[0];
		min = scoers[0];
		for (int c = 0; c < scoers.length; c++) {
			a = a + scoers[c];
			if (scoers[c] > max) {
				max = scoers[c];
			}
			if (scoers[c] < min) {
				min = scoers[c];
			}

		}
		b = a / scoers.length;
		System.out.println("ƽ������" + b);
		System.out.println("�ܷ�����" + a);
		System.out.println("��߷֣�" + max);
		System.out.println("��ͷ֣�" + min);

	}

}
