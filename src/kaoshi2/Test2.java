package kaoshi2;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int [] a=new int[10];
	for(int i=0;i<10;i++){
	System.out.println("�������"+(i+1)+"ѧ���ĳɼ���");
		a[i]=input.nextInt();	
	}
	Arrays.sort(a);
	int b=a[0];
	System.out.println("��С����Ϊ��"+b);
}
}
