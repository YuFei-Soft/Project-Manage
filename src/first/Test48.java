package first;

import java.util.Arrays;
import java.util.Scanner;

public class Test48 {
	// ¼��3����ÿ����4���˵ķ��� int [][] scores=new int[3][4]
	// ��ʾÿ����ÿ���˵ĳɼ�
	public static void main(String[] args) {
		int[][] scores = new int[3][4];
		Scanner input = new Scanner(System.in);
		for (int a = 0; a < scores.length; a++) {
			for (int b = 0; b < scores[a].length; b++) {
				System.out.println("�������" + (a + 1) + "����ĵ�" + (b + 1)
						+ "���˵ĳɼ�");
				scores[a][b] = input.nextInt();
			}
		}
		for (int c = 0; c < scores.length; c++) {
			System.out.println(Arrays.toString(scores[c]));
		}
	}

}
