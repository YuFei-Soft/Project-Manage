package zuche;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MotoBiz {
	private Map<String, Moto> map = new HashMap<String, Moto>();

	// 初始化车辆的信息
	public void init() {
		Car car1 = new Car("苏A111111", "宝马X6");
		Car car2 = new Car("苏A222222", "宝马X7");
		Car car3 = new Car("苏A333333", "宝马X8");
		Bus bus1 = new Bus("苏A444444", 15);
		Bus bus2 = new Bus("苏A555555", 30);
		Bus bus3 = new Bus("苏A666666", 50);

		// 添加车辆和Bus的信息
		map.put(car1.getNumberPlate(), car1);
		map.put(car2.getNumberPlate(), car2);
		map.put(car3.getNumberPlate(), car3);
		map.put(bus1.getNumberPlate(), bus1);
		map.put(bus2.getNumberPlate(), bus2);
		map.put(bus3.getNumberPlate(), bus3);
	}

	// 根据汽车的牌照来获得车
	public Moto getMoto(String carNo) {
		return map.get(carNo);

	}

	// 根据天数来计算租金
	public void calcRent(int days) {
		// 键盘输入车的牌照
		Scanner input = new Scanner(System.in);
		System.out.println("请输入汽车的牌照：");
		String carNo = input.next();
		// 来获得车辆
		Moto moto = getMoto(carNo);
		Map map = moto.calcRent(days);
		Object discount = map.get("折扣");
		Object totaMoney = map.get("总金额");
		Object realMoney = map.get("实际金额");
		System.out.println("原金额" + totaMoney + "折扣" + discount + "实际金额"
				+ realMoney);

	}

}
