package first;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Test32 {

	public static void main(String[] args) {
			int year=0;
			double  b=0;
			System.out.println("�������ж���Ϊ�˿ͣ�");
			Scanner  input=new Scanner(System.in);
			   int  a =input.nextInt();
			for(int sum=0;sum<a;sum++){
				System.out.println("������"+a+"λ�еĵ�"+(sum+1)+"λ�˿͵�����Ϊ��");
				year=input.nextInt();
				if(year<=30){
					b=b+1;
				}
			}
			System.out.println("30�����µı���Ϊ:"+(b/a)*100+"%");
			System.out.println("30�����ϵı���Ϊ:"+(a-b)/a*100+"%");
	}

}
