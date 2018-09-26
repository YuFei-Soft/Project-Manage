package two2;

public class Paixu {
	public static void main(String[] args) {
		int[] arr = { 34, 19, 11, 109, 3, 56 };
		printArray(arr);
		selectSort(arr);
		printArray(arr);
	}

	public static void selectSort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x] < arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0; x < arr.length; x++) {
			if (x != arr.length - 1)
				System.out.print(arr[x] + ",");
			else
				System.out.println(arr[x] + "]");
		}
	}
}
