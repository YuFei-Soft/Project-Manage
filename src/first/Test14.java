package first;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
			String   shirtName;
			String   shoeName;
			String   padName;
			int  shirtPrice;
			int  shoePtice;
			int   padPrice;
			int   shirtNum;
			int   shoeNum;
			int  padNum;
			Scanner   input  = new  Scanner(System.in);
			System.out.println("�������һ����Ʒ����");
			shirtName  =input.next();
			System.out.println("������"+shirtName+"�ļ۸�");
			shirtPrice =input.nextInt();
			System.out.println("������"+shirtName +"������");
			 shirtNum =input.nextInt();
			
			
			System.out.println("������ڶ�����Ʒ����");
			 shoeName  =input.next();
			System.out.println("������"+ shoeName+"�ļ۸�");
			 shoePtice =input.nextInt();
			 System.out.println("������"+shoeName +"������");
			 shoeNum =input.nextInt();
		
			System.out.println("�������������Ʒ����");
			 padName  =input.next();
			System.out.println("������"+  padName+"�ļ۸�");
			padPrice =input.nextInt();
			System.out.println("������"+  padName+"������");
			padNum=input.nextInt();
			 int  money=shirtPrice*shirtNum;
			 int  money2=shoePtice*shoeNum;
			 int  money3= padPrice*padNum;
			 
			System.out.println("*************���ѵ�**************");
			System.out.println("����\t����\t����\t���");
			System.out.println(shirtName+       "\t"+shirtPrice+    "\t"+ shirtNum+   "\t"+money);
			System.out.println(shoeName+      "\t"+ shoePtice+   "\t"+ shoeNum+   "\t"+money2);
			System.out.println(padName+        "\t"+padPrice+     "\t"+	padNum+   "\t"+money3);




			 
			

	}

}
