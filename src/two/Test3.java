package two;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int days = -1;
		int chose = -1;
		String barnd = "";
		String type = "";
		Car2 car=new Car2();
		
		int money = -1;
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ�����������޹�˾");
		System.out.println("������Ҫ���޵�������");
		days = input.nextInt();
		System.out.println("������Ҫ���޵��������ͣ���1,�γ�2,�ͳ�");
		chose = input.nextInt();
		if (chose == 1) {
			System.out.println("���������޵�����Ʒ��:��1������2����ˣ�");
			chose = input.nextInt();
			if (chose == 1) {
				barnd = "����";
			car.setBrand("����");
			car.calcRent(days);

			} else {
				System.out.println("������γ��ͺţ�1������GL8 2����������");
				chose = input.nextInt();
				if (chose == 1) {
			

				} else {

				}

			}

		} else {

		}
		
		money=car.calcRent(days);
		System.out.println("���޽�"+money);
	}
}
