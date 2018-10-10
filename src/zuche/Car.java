package zuche;

import java.util.HashMap;
import java.util.Map;

public class Car extends Moto {
	private String type;// 汽车的品牌

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
		double discount = 1;// 汽车的折扣
		double price = 0;// 汽车每天的金额
		if (days > 150) {
			discount = 0.7;
		} else if (days > 30&&days<150) {
			discount = 0.8;
		} else if (days > 3&&days<30) {
			discount = 0.9;
		}

		if (("宝马X7").equals(type)) {
			price = 800;
		} else if (("宝马X6").equals(type)) {
			price = 600;
		} else {
			price = 500;
		}
		// 计算总金额
		double totaMoney = price * days;
		// 计算实际金额
		double realMoney = totaMoney * discount;
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("折扣", discount);
		map.put("总金额", totaMoney);
		map.put("实际金额", realMoney);

		return map;
	}

}
