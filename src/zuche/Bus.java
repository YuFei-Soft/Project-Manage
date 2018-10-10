package zuche;

import java.util.HashMap;
import java.util.Map;

public class Bus extends Moto {
	private int seatCount;// ��λ��

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public Bus(String numberPlate, int seatCount) {
		super(numberPlate);
		this.seatCount = seatCount;
	}

	public Bus() {
		super();
	}

	@Override
	public Map<String, Double> calcRent(int days) {
		double discount = 1;// �ۿۼ�
		double price = 0;// ÿ��Ľ��
		if (days >= 150) {
			discount = 0.6;
		} else if (days >= 30) {
			discount = 0.7;
		} else if (days >= 7) {
			discount = 0.8;
		} else if (days >= 3) {
			discount = 0.9;
		}

		if (seatCount > 34) {
			price = 1500;
		} else {
			price = 800;
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
