package two;

public class Car2 extends Moto {
	private String type;

	public Car2(String no, String barnd, String type) {
		super(no, barnd);
		this.type = type;
	}

	public Car2() {

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int calcRent(int days) {
		if ("����GL8".equals(type)) {
			return 600 * days;
		} else if ("����550i".equals(type)) {
			return 500 * days;
		} else {
			return 300 * days;
		}

	}

}
