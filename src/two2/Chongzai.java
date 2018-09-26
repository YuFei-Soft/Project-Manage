package two2;

public class Chongzai {

	public static void main(String[] args) {
		printCFB(5);
	}

	public static void printCFB(int num) {
		for (int x = 1; x <= num; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print(y + "*" + x + "=" + y * x + "\t");
			}
			System.out.println();
		}
	}
}
