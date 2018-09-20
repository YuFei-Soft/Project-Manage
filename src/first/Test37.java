package first;

public class Test37 {// 1-10µÄÀÛ¼ÓÖµ

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i <= 10; i++) {
			sum += i;

			if (sum > 20) {
				System.out.println(i);
				break;
			}
		}
	}
}
