package first;

import java.util.Scanner;

public class Test31 {

	public static void main(String[] args) {
				System.out.println("欢迎使用购物系统");
				System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
				System.out.println("1.客户信息");
				System.out.println("2.购物结算");
				System.out.println("3.真情回馈");
				System.out.println("4.注销");
				System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * ");
				System.out.print("请选择，输入数字： ");
				Scanner  input=new  Scanner(System.in);
				int  a =input.nextInt();
				while(a>4){
					System.out.println("输入错误，请重新输入：");
					a=input.nextInt();	
				}
				switch(a){
				case 1:
					System.out.println("1.客户信息");
					break;
				case 2:
					System.out.println("2.购物结算");
					break;
				case 3:
					System.out.println("3.真情回馈");
					break;
				case 4:
					System.out.println("4.注销");
					break;
				}
				
				System.out.println("程序结束");
	}

}
