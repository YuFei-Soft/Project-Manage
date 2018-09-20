package two;

public class Customer {
	String type;
	int scores;

	public void show() {
		if ((type.equals("金卡") && scores >= 1000)
				|| (type.equals("普卡") && scores >= 5000)) {
			System.out.println("类型:" + type + " 积分:" + scores + " 回馈积分:" + 500);
		} else {
			System.out.println("类型:" + type + " 积分:" + scores + "没有回馈积分");
		}
	}

	public static void main(String[] args) {
		Customer   a=new Customer();
		a.scores=200;
		a.type="金卡";
		a.show();
	}
}
