package Pet2;

public class Cat extends Pet implements GetLegNum {
	private int legNum;

	
	
	public void setLegNum(int legNum) {
		this.legNum = legNum;
	}

	public Cat(String name, int legNum) {
		super(name);
		this.legNum = legNum;
	}

	public Cat() {
		
	}

	

	@Override
	public int getLegNum() {
		return this.legNum;
	}

	@Override
	public String getShot() {
		return "ίχίχίχ***";
	}

}
