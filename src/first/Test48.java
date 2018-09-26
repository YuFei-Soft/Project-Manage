package first;

import java.util.Arrays;
import java.util.Scanner;

public class Test48 {
	// 录入3个班每个班4个人的分数 int [][] scores=new int[3][4]
	// 显示每个班每个人的成绩
	public static void main(String[] args) {
		int[][] scores = new int[3][4];
		Scanner input = new Scanner(System.in);
		for (int a = 0; a < scores.length; a++) {
			for (int b = 0; b < scores[a].length; b++) {
				System.out.println("请输入第" + (a + 1) + "个班的第" + (b + 1)
						+ "个人的成绩");
				scores[a][b] = input.nextInt();
			}
		}
		for (int c = 0; c < scores.length; c++) {
			System.out.println(Arrays.toString(scores[c]));
		}
	}

}
