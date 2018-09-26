package first;

public class Test28 {

	public static void main(String[] args) {
		double c = 0;
		double f = 0;
		int count = 0;
		System.err.println("ĞòºÅ\tÉãÊÏÎÂ¶È\t»ªÊÏÎÂ¶È\t");
		do {
			count++;
			f = c * 9 / 5 + 32;
			System.out.println(count + "\t" + c + "\t" + f);
			c = c + 20;
		} while (count < 10 && c <= 250);
	}

}
