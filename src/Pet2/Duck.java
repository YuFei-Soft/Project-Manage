package Pet2;

public class Duck extends Pet implements GetLegNum {

	@Override
	public int getLegNum() {
		return 2;
	}

	@Override
	public String getShot() {
		return "¸Â¸Â¸Â***";
	}

}
