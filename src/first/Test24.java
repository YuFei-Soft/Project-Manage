package first;

import java.util.Scanner;

public class Test24 {

	private static Scanner input;

	public static void main(String[] args) {
		System.out.print("���������ѽ�");
		input = new   Scanner(System.in);
		int money=input.nextInt();
		System.out.println("�Ƿ�μ��Żݻ��");
		System.out.println("1: ��50Ԫ����2Ԫ�������¿�������һƿ");
		System.out.println("2: ��100Ԫ����3Ԫ����500ml����һƿ");
		System.out.println("3: ��100Ԫ����10Ԫ�������һ��");
		System.out.println("4: ��200Ԫ����10Ԫ�����ղ������˹�");
		System.out.println("5: ��200Ԫ����20Ԫ����ŷ����");
		System.out.println("0:������");
		System.out.println("��ѡ��");
	
		if(money>=50){
			
		int mun=input.nextInt();
		switch(mun){
		case 1:
			System.out.println("���ѽ�"+(money+2));
			System.out.println("�ɹ�������1ƿ���¿���");
			break;
		
		case 2:
			System.out.println("���ѽ�"+(money+3));
			System.out.println("�ɹ�����������һƿ");
			break;
		case 3:
			System.out.println("���ѽ�"+(money+10));
			System.out.println("�ɹ�������5�������һ��");
			break;
		case 4:
			System.out.println("���ѽ�"+(money+10));
			System.out.println("�ɹ�������1���ղ�������һ��");
			break;
		case 5:
			System.out.println("���ѽ�"+(money+20));
			System.out.println("�ɹ�������1ƿŷ����");
			break;
		case 0:
			System.out.println("���ѽ�"+money);
			break;
		}
			
		}else{
			System.out.println("�������Żݻ��");
			System.out.println("���ѽ�"+money);
		}
	
			}
		
		
		
		
		
		
		
		
	

}
