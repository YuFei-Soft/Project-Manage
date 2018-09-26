package two2;

public class Fshuzuidazhi {
	public static void main(String[] args) {
		int[] arr = { -34, -19, -11, -109, -3, -56 };
		int max = getMax(arr);
		System.out.println("max=" + max);
	}

	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max)
				max = arr[x];
		}
		return max;
	}
}
