package two;

import java.util.Scanner;

/*��дAccount�࣬��Ӵ���
 ����ʵ�ִ���ȡ��ҵ��
 ���ʱ�ʻ���ʼ���Ϊ0Ԫ
 ȡ��ʱ������������ʾ*/

public class Account {
	double money = 0;

	public boolean SaveMoney(double saveMoney)// ��Ǯ
	{
		if (saveMoney > 0) {
			this.money += saveMoney;
			return true;
		}
		return false;
	}

	public boolean GetMoney(double getMoney)// ȡǮ
	{
		if (this.money >= getMoney) {
			this.money -= getMoney;
			return true;
		}
		return false;
	}

	public double getGalance() {// ��ѯ���
		return this.money;
	}

	public static void main(String args[]) {
		int num = 0;
		double money;
		Account moneyAccount = new Account();
		Scanner input = new Scanner(System.in);
		do {
			System.out
					.println("***��ǰ���Ϊ:" + moneyAccount.getGalance() + "Ԫ***");
			System.out.println("1�����\t2.ȡ��\t0.�˳�");
			System.out.println("��ѡ������Ҫ�����ҵ��:");
			try {
				num = input.nextInt();// ¼��˵�����
			} catch (Exception e) {
				num = 0;
			}
			if (num == 1) {
				System.out.println("����������:");
				try {
					money = input.nextDouble();// ¼����
					if (moneyAccount.SaveMoney(money)) {
						System.out.println("���ɹ�");
					} else {
						System.out.println("���ʧ��,�����������0");
					}
				} catch (Exception e) {
					System.out.println("���ʧ�ܣ���ȷ��������ȷ��");
				}
			} else if (num == 2) {
				System.out.println("������ȡ����:");
				try {
					money = input.nextDouble();// ¼����
					if (moneyAccount.GetMoney(money)) {
						System.out.println("ȡ��ɹ�");
					} else {
						System.out.println("ȡ��ʧ�ܣ�����");
					}
				} catch (Exception e) {
					System.out.println("ȡ��ʧ�ܣ���ȷ��������ȷ��");
				}
			}
		} while (num != 0);
	}
}
