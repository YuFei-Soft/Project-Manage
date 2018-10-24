package kaoshi2;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int [] a=new int[10];
	for(int i=0;i<10;i++){
	System.out.println("请输入第"+(i+1)+"学生的成绩：");
		a[i]=input.nextInt();	
	}
	Arrays.sort(a);
	int b=a[0];
	System.out.println("最小分数为；"+b);
}
}
