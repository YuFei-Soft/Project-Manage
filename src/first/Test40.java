package first;

import java.util.Scanner;

public class Test40 {
	// ����30�˵�ƽ���֣�ʹ������ʵ��
	public static void main(String[] args) {
		double[] scores = new double[30];// ���������ж��ٸ�Ԫ��
		Scanner input = new Scanner(System.in);
		double sum = 0; // �ܷ�
		for (int i = 0; i < 30; i++) {
			System.out.println("�������" + (i + 1) + "��ͬѧ�ĳɼ���");
			scores[i] = input.nextDouble();// Ϊ�����30�����Ӹ�ֵ
			sum = sum + scores[i];
		}
		// ����ƽ����
		double avg = sum / 30;
		System.out.println("�༶��ƽ�����ǣ�" + avg);
	}

}
