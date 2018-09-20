package first;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Test32 {

	public static void main(String[] args) {
			int year=0;
			double  b=0;
			System.out.println("请输入有多少为顾客：");
			Scanner  input=new Scanner(System.in);
			   int  a =input.nextInt();
			for(int sum=0;sum<a;sum++){
				System.out.println("请输入"+a+"位中的第"+(sum+1)+"位顾客的年龄为：");
				year=input.nextInt();
				if(year<=30){
					b=b+1;
				}
			}
			System.out.println("30岁以下的比例为:"+(b/a)*100+"%");
			System.out.println("30岁以上的比例为:"+(a-b)/a*100+"%");
	}

}
