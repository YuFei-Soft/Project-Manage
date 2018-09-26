package two2;

public class For {
	public static void main(String[] args) {
		// int x=1;
		// for(System.out.println("a");x<3;System.out.println("c"))
		// {
		// System.out.println("d");
		// x++;
		// }
		int sum = 0;
		for (int x = 1; x <= 10; x++) {
			sum = sum + x;
		}
		System.out.println("sum=" + sum);
	}
}
