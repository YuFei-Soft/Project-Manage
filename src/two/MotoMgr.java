package two;

public class MotoMgr {

	public static void main(String[] args) {
		Moto[] motos = new Moto[6];
		motos[0] = new Car2("苏A11111", "宝马", "宝马550i");
		motos[1] = new Car2("苏A22222", "别克", "商务GL8");
		motos[2] = new Car2("苏A33333", "别克", "林荫大道");
		motos[3] = new Bus("苏A44444", "金杯", 16);
		motos[4] = new Bus("苏A55555", "金龙", 40);
		motos[5] = new Bus("苏A66666", "卡车", 100);
		
		int days = 6;
		MotoMgr moto = new MotoMgr();
		int totalRent = moto.calcTotalRent(motos, days);
		System.out.println("计算总金额：" + totalRent);

	}

	public int calcTotalRent(Moto[] motos, int days) {
		int totalRent = 0;
		for (int i = 0; i < motos.length; ++i) {
			totalRent += motos[i].calcRent(days);
		}
		return totalRent;
	}

}
