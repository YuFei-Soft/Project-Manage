package sousou;

import java.util.Scanner;

public class SosoMgr {
	public static void main(String[] args) {
		SosoMgr mgr = new SosoMgr();
		mgr.mainMenu();
	}

	// һ���˵�
	public void mainMenu() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("********��ӭʹ�����ƶ�ҵ�����**********");
			System.out.print("1���û���½");
			System.out.print("2���û�ע��");
			System.out.print("3��ʹ����");
			System.out.print("4�����ѳ�ֵ");
			System.out.print("5���ʷ�˵��");
			System.out.println("6���˳�ϵͳ");
			System.out.print("��ѡ��");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				// �û���½
				System.out.println("�û���½");
				secondMenu();
				continue;
			case 2:
				// �û�ע��
				System.out.println("�û�ע��");
				continue;
			case 3:
				// ʹ����
				System.out.println("ʹ����");
				continue;
			case 4:
				// ���ѳ�ֵ
				System.out.println("���ѳ�ֵ");
				continue;
			case 5:
				// �ʷ�˵��
				System.out.println("�ʷ�˵��");
				continue;
			case 6:
				// �˳�
				System.out.println("�˳�����,��ӭ�´�ʹ�ã�");
				break;
			}
			break;
		} while (true);
	}

	// �����˵�
	public void secondMenu() {
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("********���ƶ��û��˵�**********");
			System.out.println("1�������˵���ѯ");
			System.out.println("2���ײ�������ѯ");
			System.out.println("3����ӡ�����굥");
			System.out.println("4���ײͱ��");
			System.out.println("5����������");
			System.out.println("��ѡ�񣨣�����1-5ѡ���ܣ�����������һ����");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("1�������˵���ѯ");
				continue;
			case 2:
				System.out.println("2���ײ�������ѯ");
				continue;
			case 3:
				System.out.println("3����ӡ�����굥");
				continue;
			case 4:
				System.out.println("4���ײͱ��");
				continue;
			case 5:
				System.out.println("5����������");
				continue;
			}
			break;
		} while (true);
	}
	

}
