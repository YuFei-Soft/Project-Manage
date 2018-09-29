package pet;

public class Cat extends Pet implements GetLegNum {

	public Cat() {
		super();
	}

	public Cat(String name, int legNum) {
		super(name, legNum);
	}

	@Override
	public String getShot() {
		return "ίχίχίχ*******";
	}

	@Override
	public int getLegNum() {
		return 4;
	}

}
