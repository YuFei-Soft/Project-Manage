package first;

import java.util.Scanner;

public class Test49 {

	public static void main(String[] args) {
				int a=3;
				int student=4;
				
				int [] sores=new int[4];
				Scanner input=new Scanner(System.in);
				for(int i=0;i<a;i++){
					for(int b=0;b<student;b++){
						System.out.println("请输入第"+(i+1)+"班级第"+(b+1)+"人的成绩");
						sores[b]=input.nextInt();
					}
				}
				
				
				
	}		

}
