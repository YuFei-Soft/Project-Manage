package first;

import java.util.Scanner;



public class Test6 {
		public  static void main(String[] args){
			int  money;
			System.out.println("�������������: ");
			Scanner input =new Scanner(System.in);
			money =input.nextInt();
			input.close();
			System.out.println("��Ա���Ļ�������: "+money);
			System.out.println("��۽���Ϊ: "+money*0.4);
			System.out.println("�������Ϊ: "+money*0.25);
			System.out.println("Ա��н����: "+money*(1+0.25+0.4));
			
		}
}
