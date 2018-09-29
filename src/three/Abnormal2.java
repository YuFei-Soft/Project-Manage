package three;

public class Abnormal2 {
	private int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {
		if (age > 0 && age < 100) {
			this.age = age;
		} else {
			throw new AgeException("ÇëÊäÈë1¡ª100Ö®¼ä");
		}
	}

	
}
