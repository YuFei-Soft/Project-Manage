package zuche;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MotoBiz {
	private Map<String, Moto> map = new HashMap<String, Moto>();

	// ��ʼ����������Ϣ
	public void init() {
		Car car1 = new Car("��A111111", "����X6");
		Car car2 = new Car("��A222222", "����X7");
		Car car3 = new Car("��A333333", "����X8");
		Bus bus1 = new Bus("��A444444", 15);
		Bus bus2 = new Bus("��A555555", 30);
		Bus bus3 = new Bus("��A666666", 50);

		// ��ӳ�����Bus����Ϣ
		map.put(car1.getNumberPlate(), car1);
		map.put(car2.getNumberPlate(), car2);
		map.put(car3.getNumberPlate(), car3);
		map.put(bus1.getNumberPlate(), bus1);
		map.put(bus2.getNumberPlate(), bus2);
		map.put(bus3.getNumberPlate(), bus3);
	}

	// ������������������ó�
	public Moto getMoto(String carNo) {
		return map.get(carNo);

	}

	// �����������������
	public void calcRent(int days) {
		// �������복������
		Scanner input = new Scanner(System.in);
		System.out.println("���������������գ�");
		String carNo = input.next();
		// ����ó���
		Moto moto = getMoto(carNo);
		Map map = moto.calcRent(days);
		Object discount = map.get("�ۿ�");
		Object totaMoney = map.get("�ܽ��");
		Object realMoney = map.get("ʵ�ʽ��");
		System.out.println("ԭ���" + totaMoney + "�ۿ�" + discount + "ʵ�ʽ��"
				+ realMoney);

	}

}
