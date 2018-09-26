package two2;

public class Drawjuxing {
	public static void main(String[] args) {
		draw(4, 9);
	}

	public static void draw(int lie, int hang) {

		for (int x = 1; x <= lie; x++) {
			for (int y = 1; y <= hang; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}
}
