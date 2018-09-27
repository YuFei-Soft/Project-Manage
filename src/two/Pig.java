package two;

public class Pig extends Pet {

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void eat() {
		if (getHealth() < 80) {
			setHealth(getHealth() + 20);
		} else {
			System.out.println("猪不饿，不需要吃食");
		}
	}

	@Override
	public void toHospital() {
		// TODO Auto-generated method stub
		
	}

	
		
	

}
