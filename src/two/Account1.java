package two;

import java.util.Scanner;

public class Account1 {
	double money;//

	public void getMoney(double some) {// ��Ǯ
		money += some;
		System.out.println("��Ǯ�ɹ���");
	}

	public void putMoney(double some) {// ȡǮ
		if (money < some) {// �ж��Ƿ����money
			System.out.println("���㣬����ȡ��!!!");
		} else {
			money -= some;
		}
	}

	public void moneyShow() {// ��ʾ���
		System.out.println(money);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account1 ac = new Account1();
		do {
			System.out.println("1,���\t2,ȡ��\t3,�˳�");
			System.out.println("��ѡ��");
			int choose = input.nextInt();
			double money = 0;
			switch (choose) {
			case 1:
				System.out.println("��������");
				money = input.nextDouble();
				ac.getMoney(money);
				ac.moneyShow();
				break;
			case 2:
				System.out.println("����ȡ����");
				money = input.nextDouble();
				ac.putMoney(money);
				ac.moneyShow();
				break;
			case 3:
				System.out.println("�˳�ϵͳ");
				return;
			}

		} while (true);

	}
}
