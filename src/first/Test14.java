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
			System.out.println("请输入第一件商品名称");
			shirtName  =input.next();
			System.out.println("请输入"+shirtName+"的价格");
			shirtPrice =input.nextInt();
			System.out.println("请输入"+shirtName +"的数量");
			 shirtNum =input.nextInt();
			
			
			System.out.println("请输入第二件商品名称");
			 shoeName  =input.next();
			System.out.println("请输入"+ shoeName+"的价格");
			 shoePtice =input.nextInt();
			 System.out.println("请输入"+shoeName +"的数量");
			 shoeNum =input.nextInt();
		
			System.out.println("请输入第三件商品名称");
			 padName  =input.next();
			System.out.println("请输入"+  padName+"的价格");
			padPrice =input.nextInt();
			System.out.println("请输入"+  padName+"的数量");
			padNum=input.nextInt();
			 int  money=shirtPrice*shirtNum;
			 int  money2=shoePtice*shoeNum;
			 int  money3= padPrice*padNum;
			 
			System.out.println("*************消费单**************");
			System.out.println("名称\t单价\t个数\t金额");
			System.out.println(shirtName+       "\t"+shirtPrice+    "\t"+ shirtNum+   "\t"+money);
			System.out.println(shoeName+      "\t"+ shoePtice+   "\t"+ shoeNum+   "\t"+money2);
			System.out.println(padName+        "\t"+padPrice+     "\t"+	padNum+   "\t"+money3);




			 
			

	}

}
