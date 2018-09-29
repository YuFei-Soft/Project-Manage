package pet;

public class Duck extends Pet {

	public Duck() {
		super();
	}

	public Duck(String name, int legNum) {
		super(name, legNum);
	}

	@Override
	public String  getShot() {
		return "¸Â¸Â¸Â****";
	}

}
