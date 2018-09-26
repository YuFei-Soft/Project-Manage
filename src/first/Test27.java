package first;

public class Test27 {

	public static void main(String[] args) {
		int year = 2012;
		double people = 25;
		while (people <= 100) {
			people = people * 1.25;
			year++;
		}
		System.err.println("第" + year + "年人数达到100人");
	}

}
