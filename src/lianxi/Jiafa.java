package lianxi;

public class Jiafa {
	/*
	 * [a] 8 [n] + 3 [b] 4 _______________________ 4 [c] 1 _ [d] [e] [m]
	 * _______________________ [f] 5
	 */
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int n = 7;
		int m = 6;
		int num = 0;
		for (int i = 1; i < 10; i++) {
			a = i;
			for (int j = 0; j < 10; j++) {
				b = j;
				for (int k = 0; k < 10; k++) {
					c = k;
					for (int l = 1; l < 10; l++) {
						d = l;
						for (int x = 0; x < 10; x++) {
							e = x;
							for (int y = 1; y < 10; y++) {
								f = y;
								int a1 = a * 100 + 8 * 10 + n;
								int a2 = 3 * 100 + b * 10 + 4;
								int a3 = 4 * 100 + c * 10 + 1;
								int a4 = d * 100 + e * 10 + m;
								int a5 = f * 10 + 5;
								if (a1 + a2 == a3 && a3 - a4 == a5) {
									System.out.println("a=" + a + "b=" + b
											+ "c=" + c + "d=" + d + "e=" + e
											+ "f=" + f);
									num++;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(num);

	}

}
