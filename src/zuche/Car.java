package zuche;

import java.util.HashMap;
import java.util.Map;

public class Car extends Moto {
	private String type;// ������Ʒ��

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Car(String numberPlate, String type) {
		super(numberPlate);
		this.type = type;
	}

	public Car() {

	}

	@Override
	public String toString() {
		return "Car [type=" + type + "]";
	}

	@Override
	public Map<String, Double> calcRent(int days) {
		double discount = 1;// �������ۿ�
		double price = 0;// ����ÿ��Ľ��
		if (days > 150) {
			discount = 0.7;
		} else if (days > 30&&days<150) {
			discount = 0.8;
		} else if (days > 3&&days<30) {
			discount = 0.9;
		}

		if (("����X7").equals(type)) {
			price = 800;
		} else if (("����X6").equals(type)) {
			price = 600;
		} else {
			price = 500;
		}
		// �����ܽ��
		double totaMoney = price * days;
		// ����ʵ�ʽ��
		double realMoney = totaMoney * discount;
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("�ۿ�", discount);
		map.put("�ܽ��", totaMoney);
		map.put("ʵ�ʽ��", realMoney);

		return map;
	}

}
