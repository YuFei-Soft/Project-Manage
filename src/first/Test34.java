package first;

import java.util.Scanner;

public class Test34 {

	public static void main(String[] args) {
		System.out.println("�������ع������ϵͳ>  �ͻ���Ϣ>  ��ӿͻ�");
		String c = null;
		do {
			System.out.print("�������Ա�ţ�<4Ϊ��������");
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			System.out.print("�������Ա����(��/��<��2λ����ʾ>����");
			String b = input.next();
			System.out.print("���������:   ");
			int d = input.nextInt();
			System.out.println("��¼��Ļ�Ա��Ϣ��:  ");
			System.out.println(a + "\t\t" + b + "\t" + d + "\t");
			System.out.println("�Ƿ��������¼�루y/n��");
			c = input.next();
		} while (!c.equals("y"));
		{
			System.out.println("¼�����");
		}
	}

}
