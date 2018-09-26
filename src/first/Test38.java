package first;

public class Test38 {

	public static void main(String[] args) {
		int sum = 0;
		for (int a = 1; a <= 10; a++) {
			if (a % 2 != 0) {
				continue;
			}

			sum = sum + a;
		}
		System.out.println("sum=" + sum);
	}

}
