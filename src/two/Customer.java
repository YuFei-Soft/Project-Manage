package two;

public class Customer {
	String type;
	int scores;

	public void show() {
		if ((type.equals("��") && scores >= 1000)
				|| (type.equals("�տ�") && scores >= 5000)) {
			System.out.println("����:" + type + " ����:" + scores + " ��������:" + 500);
		} else {
			System.out.println("����:" + type + " ����:" + scores + "û�л�������");
		}
	}

	public static void main(String[] args) {
		Customer   a=new Customer();
		a.scores=200;
		a.type="��";
		a.show();
	}
}
