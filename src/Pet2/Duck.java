package Pet2;

public class Duck extends Pet implements GetLegNum {
	private int legNum;

	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}
	

	public Duck(String name, int legNum) {
		super(name);
		this.legNum = legNum;
	}


	@Override
	public int getLegNum() {
		return this.legNum;
	}

	@Override
	public String getShot() {
		return "�¸¸�***";
	}

}
