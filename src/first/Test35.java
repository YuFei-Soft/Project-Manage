package first;

import java.util.Scanner;

public class Test35 { // �������������ֵ����Сֵ������0������

	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		int a;
		int c = 0;
		Scanner input = new Scanner(System.in);
		do {
			c++;
			System.out.println("������һ������������0������");
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
			System.out.println("������������������С��");
		}else{
			System.out.println("���ֵ" + max + "��Сֵ" + min);
		}
		

	}

}
