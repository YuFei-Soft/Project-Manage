package first;

import java.util.Scanner;

public class Test45 {

	public static void main(String[] args) {
			int [] a=new int [5];
			Scanner input=new Scanner(System.in);
			System.out.println("������5�ҵ�ļ۸�");
			for(int i=0;i<a.length;i++){
				System.out.println("��"+(i+1)+"�ҵ�ļ۸�Ϊ��");
				a[i]=input.nextInt();
			}
			int min=0;
			for(int x=0;x<a.length;x++){
				if(min>a[x]){
					min=a[x];
				}
				System.out.println("���Ϊ"+a[x]);
			}
			//	System.out.println("���Ϊ"+a[x]);
	}

}
