package three;

public class Test {
	public static void main(String[] args) {
		Abnormal2 a = new Abnormal2();
		try {
			a.setAge(0);
		} catch (AgeException e) {
			e.printStackTrace();
		}

	}
}
