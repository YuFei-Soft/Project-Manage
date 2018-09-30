package Pet2;

public class Dolphin extends Pet implements GetLegNum {
	private int legNum;

	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}

	@Override
	public int getLegNum() {
		return this.legNum;
	}

	@Override
	public String getShot() {
		return "∫£Î‡“Ù***";
	}

}
