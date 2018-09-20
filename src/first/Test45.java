package first;

import java.util.Scanner;

public class Test45 {

	public static void main(String[] args) {
			int [] a=new int [5];
			Scanner input=new Scanner(System.in);
			System.out.println("请输入5家店的价格：");
			for(int i=0;i<a.length;i++){
				System.out.println("第"+(i+1)+"家店的价格为：");
				a[i]=input.nextInt();
			}
			int min=0;
			for(int x=0;x<a.length;x++){
				if(min>a[x]){
					min=a[x];
				}
				System.out.println("最低为"+a[x]);
			}
			//	System.out.println("最低为"+a[x]);
	}

}
