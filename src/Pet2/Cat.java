package Pet2;

public class Cat extends Pet implements GetLegNum {

	@Override
	public int getLegNum() {
		return 4;
	}

	@Override
	public String getShot() {
		return "ίχίχίχ*******";
	}

}
