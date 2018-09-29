package pet;

public class Cat extends Pet {

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

}
