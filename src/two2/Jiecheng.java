package two2;

public class Jiecheng {

	public static void main(String[] args) {
		long n = 20, sum = 1;
		while (n > 1) {
			sum = sum * n;
			n--;
		}
		System.out.println("sum=" + sum);

		long n1 = 1, sum1 = 1;
		while (n1 < 21) {
			sum1 = sum1 * n1;
			n1++;
		}

		System.out.println("sum1=" + sum1);

	}

}
