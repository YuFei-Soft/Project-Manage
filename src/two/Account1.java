package two;

import java.util.Scanner;

public class Account1 {
	double money;

	public void getMoney(double money1) {// ��Ǯ
		money += money1;
		System.out.println("��Ǯ�ɹ���");
	}

	public void putMoney(double money2) {// ȡǮ
		money -= money2;
		
	}

	public void moneyShow() {// ��ʾ���
			System.out.println(money);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Account1 ac = new Account1();
		do {
			System.out.println("1,���/t2,ȡ��/t3,�˳�");
			System.out.println("��ѡ��");
			int choose = input.nextInt();
			double money = 0;
			switch (choose) {
			case 1:
				System.out.println("��������");
				money=input.nextDouble();
				ac.getMoney(money);
				 ac.moneyShow();
				 break;
			case 2:
				System.out.println("����ȡ����");
				money=input.nextDouble();
				

			}

		} while (true);

	}
}
