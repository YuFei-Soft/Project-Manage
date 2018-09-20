package first;

public class Test29 {

	public static void main(String[] args) {
		int x = 1;
		int sum = 0;
		while (x <= 100) {
			sum = sum + x;
			x++;
		}
		System.err.println("sum=" + sum);
	}

}
