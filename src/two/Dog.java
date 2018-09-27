package two;

public class Dog extends Pet {
	private String strain;

	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}

	public Dog() {

	}

	public Dog(String name, int health, int love, String strain) {
		super(name, health, love);
		this.strain = strain;
	}

	@Override
	public String toString() {
		return "Dog [strain=" + strain + "]" + ",getNmame()" + getName()
				+ ",getHealth()=" + getHealth() + ",getLove()" + getLove()
				+ "]";
	}

	@Override
	public void print() {
		System.out.println("Dog [strain=" + strain + "]" + ",getNmame()"
				+ getName() + ",getHealth()=" + getHealth() + ",getLove()"
				+ getLove() + "]");
	}

	@Override
	public void eat() {
		if (getHealth() < 70) {
			setHealth(getHealth() + 10);
			System.out.println("狗吃食，体力增加：" + getHealth());
		} else {
			System.out.println("狗不饿，不需要吃食");
		}
	}

	@Override
	public void toHospital() {
		// TODO Auto-generated method stub
		
	}
	public void catchingFlyDisc() {
      	 System.out.println("狗狗咬飞碟");
	}


}
