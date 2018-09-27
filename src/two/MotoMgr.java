package two;

public class MotoMgr {

	public static void main(String[] args) {
		Moto[] motos = new Moto[6];
		motos[0] = new Car2("��A11111", "����", "����550i");
		motos[1] = new Car2("��A22222", "���", "����GL8");
		motos[2] = new Car2("��A33333", "���", "������");
		motos[3] = new Bus("��A44444", "��", 16);
		motos[4] = new Bus("��A55555", "����", 40);
		motos[5] = new Bus("��A66666", "����", 100);
		
		int days = 6;
		MotoMgr moto = new MotoMgr();
		int totalRent = moto.calcTotalRent(motos, days);
		System.out.println("�����ܽ�" + totalRent);

	}

	public int calcTotalRent(Moto[] motos, int days) {
		int totalRent = 0;
		for (int i = 0; i < motos.length; ++i) {
			totalRent += motos[i].calcRent(days);
		}
		return totalRent;
	}

}
