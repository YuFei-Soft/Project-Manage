package sousou;

import java.util.Scanner;

public class SosoMgr {
	CardUtil utils = new CardUtil();

	public static void main(String[] args) {
		SosoMgr mgr = new SosoMgr();
		mgr.mainMenu();
	}

	// һ���˵�
	public void mainMenu() {
		String mobileNumber = "";
		String passWord = "";
		utils.init();
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
				// System.out.println("�û���½");
				System.out.print("�������ֻ��ţ�");
				mobileNumber = input.next();
				System.out.print("���������룺");
				passWord = input.next();
				if (utils.isExistCard(mobileNumber, passWord)) {
					secondMenu(mobileNumber);
				} else {
					System.out.println("�Բ������������Ϣ�����޷���½��");
				}

				// secondMenu();
				continue;
			case 2:
				// �û�ע��
				// System.out.println("�û�ע��");
				registCard();
				continue;
			case 3:
				// ʹ����
				// System.out.println("ʹ����");
				System.out.print("�������ֻ��ţ�");
				mobileNumber = input.next();
				utils.useSoso(mobileNumber);
				continue;
			case 4:
				// ���ѳ�ֵ
				// System.out.println("���ѳ�ֵ");
				System.out.print("������Ҫ��ֵ�ĺ��룺");
				mobileNumber = input.next();
				if (utils.isExists(mobileNumber))
					;
				System.out.print("������Ҫ��ֵ�Ľ�");
				double money = input.nextDouble();
				utils.chargeMoney(mobileNumber, money);

				continue;
			case 5:
				// �ʷ�˵��
				System.out.print("�ʷ�˵��");
				utils.showDescription();
				System.out.println("��ӡ��ɣ�");
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
	public void secondMenu(String mobileNumber) {
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
				utils.printConsumInfos(mobileNumber);
				continue;
			case 4:
				System.out.println("4���ײͱ��");
				System.out.print("1.�����ײ� 2.�����ײ� 3.�����ײ�     ��ѡ����ţ���");
				utils.changePack(mobileNumber, input.next());
				continue;
			case 5:
				System.out.println("5����������");
				utils.delCard(mobileNumber);
				System.out.println("ллʹ��");
				//�����������Ƴ�ϵͳ
				System.exit(1);
				//continue;
			}
			break;
		} while (true);
	}

	// ע���¿�������
	public void registCard() {
		Scanner input = new Scanner(System.in);
		String[] newNumbers = utils.getNewNumbers(9);
		// ����ѡ��Ŀ����б�
		System.out.println("**********����ѡ��Ŀ���**********");
		for (int i = 0; i < 9; i++) {
			System.out.print((i + 1) + "." + newNumbers[i] + "\t\t");
			if ((i + 1) % 3 == 0) {
				System.out.println();
			}
		}
		// ѡ���ֻ�����
		System.out.print("��ѡ�񿨺ţ�����1����9����ţ�");
		String number = newNumbers[input.nextInt() - 1];
		// ѡ���ײ�����
		System.out.print("(1.�����ײ�         2.�����ײ�       3.�����ײ�)");
		System.out.print(" ��ѡ���ײͣ�������ţ���");
		// ��ȡ�ײͶ���
		ServicePackage pack = utils.createPack(input.nextInt());
		// ����ͬ����
		System.out.print("������������");
		String name = input.next();
		// ��������
		System.out.print("���������룺");
		String passWord = input.next();
		// Ԥ�滰�ѽ��
		double money = 0;
		System.out.print("������Ԥ�滰�ѽ�");
		money = input.nextDouble();
		while (money < pack.getPrice()) {
			System.out.print("��Ԥ��Ļ��ѽ�����֧�����µĹ̶��ײ��ʷѣ������³�ֵ��");
			money = input.nextDouble();
		}
		/*
		 * String cardNumber, String userName, String passWord, ServicePackage
		 * serPackage, double consumAmount, double money,
		 */
		MobileCard newCard = new MobileCard(number, name, passWord, pack,
				pack.getPrice(), money - pack.getPrice());
		utils.addCardNo(newCard);
		newCard.showMeg();
		utils.showPack(pack);
		System.out.println("\r\n");

	}

}
