
import java.util.Arrays;
import java.util.Scanner;

public class Kaoshi {
	// .ʮ����ί�����ִ��(��������)��ȥ����߷ֺ���ͷ֣�����ֵ�ƽ����
	public static void main(String[] args) {
		int  [] b=new int [10];
		Scanner input = new Scanner(System.in);
		int sum=0;
		double min=0;
		double max=0;
		double  vga=0;
		for (int i = 0; i <10; i++) {
			System.out.println("��" +( i+1) + "λ��ί�Ĵ��Ϊ��");
			b[i] = input.nextInt();
			sum=sum+b[i];				
		}
	    Arrays.toString(b);
	    max=b[9];
	    min=b[0];
	    vga=(sum-max-min)/8;
	    System.out.println("��߷֣�"+max);
	    System.out.println("��ͷ֣�"+min);
	    System.out.println(vga);
	}
}
