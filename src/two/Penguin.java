package two;

public class Penguin extends Pet {
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Penguin() {

	}

	public Penguin(String name, int health, int love, String sex) {
		super(name, health, love);
		this.sex = sex;
	}

	@Override
	public void print() {
		System.out.println("Penguin [sex=" + sex + ",getNmame()" + getName()
				+ ",getHealth()=" + getHealth() + ",getLove()" + getLove()
				+ "]");
	}

	@Override
	public void eat() {
		if (getHealth() < 60) {
			setHealth(getHealth() + 20);
			System.out.println("企鹅吃食，体力增加为：" + getHealth());
		} else {
			System.out.println("企鹅不饿，不需喂食");
		}
	}

	@Override
	public void toHospital() {
		// TODO Auto-generated method stub
		
	}
	public void swimming () {
      System.out.println("企鹅去游泳");
	}

	

}
