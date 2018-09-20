package first;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
			
			System.out.println("请输入会员卡号:   ");
			Scanner input= new  Scanner(System.in);
			int	custON=input.nextInt();
			input.close();
			System.out.println("会员卡号是:   "+custON);
			int  gewei= custON%10;
			int  shiwei=custON/10%10;
			int  baiwei= custON/100%10;
			int  qianwei=custON/1000;
			int  sum=gewei+shiwei+qianwei+baiwei;
			System.out.println("会员卡号"+custON+"各位之和:   "+sum);
			
			

	}

}
