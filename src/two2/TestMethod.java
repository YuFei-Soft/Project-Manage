package two2;

public class TestMethod {
	public static int get3() {
		int sum = 0;
		for (int x = 1; x <= 20; x++) {
			if (x % 3 == 0) {
				sum++;
			}
		}
		return sum;
	}

	public static int get4() {
		int sum = 0;
		for (int x = 1; x <= 20; x++) {
			if (x % 4 == 0) {
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int q = get3();
		System.out.print(q);

		int w = get4();
		System.out.print(w);
	}

}
