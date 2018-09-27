package two;

public class Mester {
	public void sure(Pet pet) {
		if (pet.getHealth() < 50) {
			pet.toHospital();
		}
	}

}
