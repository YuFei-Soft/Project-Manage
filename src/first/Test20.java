package first;

import java.util.Scanner;

public class Test20 {

	private static Scanner input;

	public static void main(String[] args) {
 		System.out.println("请输入是否是会员:  是（y）/否（其他字符）:");
		input = new Scanner(System.in);
		String a = input.next();
		
		System.out.println("请输入购物金额：");
		int b = input.nextInt();

		if ("y".equals(a)) {
			if (b < 200) {
				System.out.println("实际支付=" + b * 0.8);
			} else  {
				System.out.println("实际支付=" + b * 0.75);
			}
		}else{
			if (b > 100) {
				System.out.println("实际支付=" + b * 0.9);
			} else {
				System.out.println("实际支付=" + b);
			}
		}
	

	}
}
