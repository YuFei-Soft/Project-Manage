package kaoshi2;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(10);
		Scanner input = new Scanner(System.in);
		int sum = 0;// ���еĴ���
		int sum2 = 0;// �´�Ĵ���
		int sum3 = 0;// ��С�Ĵ���
		while (true) {
			System.out.print("��������Ҫ�µ�����");
			int da = input.nextInt();
			if (da > number) {
				System.out.println("��´��ˣ�");
				sum2++;
			} else if (da < number) {
				System.out.println("���С�ˣ�");
				sum3++;
			} else {
				System.out.println("�������!");
				sum++;
				break;
			}
		}
		System.out.println("���еĴ���Ϊ��" + sum);
		System.out.println("�²�Ĵ���Ϊ��" + (sum3 + sum2));
	}

}
