package lianxi2;

public class test {
	// 斐波拉契数列 1 1 2 3 5 8 .。。。。
	// 计算该数列第n项的值
	public static int getNum(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			// 第n项的和等于其前两项的和
			return getNum(n - 1) + getNum(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(getNum(50));
	}
}
