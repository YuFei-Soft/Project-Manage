package two;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int seatCount = -1;
		String barnd = "";
		String type = "";
		String no = "��A74110";
		int money = -1;
		Car2 car = null;
		Bus bus = null;
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ�����������޹�˾");
		System.out.println("������Ҫ���޵�������");
		int days = input.nextInt();
		System.out.println("������Ҫ���޵��������ͣ���1,�γ�2,�ͳ�");
		int chose = input.nextInt();
		if (chose == 1) {
			System.out.println("���������޵�����Ʒ��:��1������2����ˣ�");
			chose = input.nextInt();
			if (chose == 1) {
				barnd = "����";
				System.out.println("��ѡ���ͺţ�");
				System.out.println("1������550i");
				chose = input.nextInt();
				if (chose == 1) {
					type = "����550i";
				}
			} else {
				barnd = "���";
				System.out.println("������γ��ͺţ�1������GL8 2����������");
				chose = input.nextInt();
				if (chose == 1) {
					type = "����GL8";

				} else {
					type = "������";
				}
			}
			car = new Car2(no, barnd, type);
			money = car.calcRent(days);
		} else {
			System.out.println("��ѡ��Ʒ�ƣ�1����2��������");
			chose = input.nextInt();
			if (chose == 1) {
				barnd = "��";
				seatCount = 15;
			} else {
				barnd = "����";
				seatCount = 25;
			}
			bus = new Bus(no, barnd, seatCount);
			money = bus.calcRent(days);
		}
		System.out.println("���޽�" + money);
	}
}
