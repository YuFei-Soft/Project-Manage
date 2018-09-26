package two;

public class CustunerBiz {
	Custuner[] peo = new Custuner[5];

	public void show() {
		for (int i = 0; i < peo.length; i++) {
			if (peo[i] == null) {
				break;
			}
			peo[i].show();
		}
	}

	public void addCustuner(Custuner cust) {
		int index = -1;
		for (int i = 0; i < peo.length; i++) {
			if (peo[i] == null) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			peo[index] = cust;
		} else {
			System.out.println("Ìí¼ÓÊ§°Ü");
		}
	}

	public static void main(String[] args) {
		CustunerBiz a = new CustunerBiz();

	}
}
