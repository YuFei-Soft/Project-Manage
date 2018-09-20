package first;

import java.util.Scanner;



public class Test6 {
		public  static void main(String[] args){
			int  money;
			System.out.println("请输入基本工资: ");
			Scanner input =new Scanner(System.in);
			money =input.nextInt();
			input.close();
			System.out.println("该员工的基本工资: "+money);
			System.out.println("物价津贴为: "+money*0.4);
			System.out.println("房租津贴为: "+money*0.25);
			System.out.println("员工薪资是: "+money*(1+0.25+0.4));
			
		}
}
