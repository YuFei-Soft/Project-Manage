package first;

import java.util.Scanner;

public class Test43 {

	public static void main(String[] args) {
		System.out.println("�������Ա���µ����Ѽ�¼");
		double[] a = new double[5];
		Scanner input = new Scanner(System.in);
		double sum = 0; // �ܽ��
		for (int x = 0; x < a.length; x++) {
			System.out.println("�������" + (x + 1) + "�ʹ����");
			a[x] = input.nextDouble();
			sum = sum + a[x];
		}
		System.out.println("���\t\t\t" + "��Ԫ��");
		for (int c = 0; c < 5; c++) {
			System.out.println((c + 1) + "\t\t\t\t" + a[c]);
		}

		System.out.println("�ܽ�\t\t" + sum);
	}

}
