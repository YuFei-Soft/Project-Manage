package first;

import java.util.Scanner;

public class Test35 { // 求输入数的最大值和最小值，数输0结束。

	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		int a;
		int c = 0;
		Scanner input = new Scanner(System.in);
		do {
			c++;
			System.out.println("请输入一个整数（输入0结束）");
			a = input.nextInt();
			if(a==0){
				break;
			}
			if (c == 1) {
				max = a;
				min = a;
			}

			if (a > max) {
				max = a;
			}
			if (a < min) {
				min = a;
			}
		} while (a != 0);
		if(a==0&&c==1){
			System.out.println("程序结束，无最大，无最小。");
		}else{
			System.out.println("最大值" + max + "最小值" + min);
		}
		

	}

}
