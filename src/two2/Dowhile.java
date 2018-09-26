package two2;

public class Dowhile {

	public static void main(String[] args) {
		int x = 1;
		do {
			System.out.println("x=" + x);
			x++;
		} while (x < 3);

		// do while特点：无论条件是否满足，循环体至少执行一次。

		int y = 1;
		while (y < 3) {
			System.out.println("y=" + y);
			y++;
		}
	}

}
