package pet;

public abstract class Pet {
	private String name;
	private int LegNum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLegNum() {
		return LegNum;
	}

	public void setLegNum(int legNum) {
		LegNum = legNum;
	}

	public Pet() {

	}

	public Pet(String name, int legNum) {
		super();
		this.name = name;
		LegNum = legNum;
	}

	public abstract String  getShot();
}
