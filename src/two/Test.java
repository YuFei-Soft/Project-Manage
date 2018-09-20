package two;

public class Test {

	public static void main(String[] args) {
		// 最有效率的方式算出2乘以8等于几？
		// System.out.println(2<<3);
		// 对两个整数变量的值进行互换。(不需要第三方变量）。
		// int a=3,b=5;
		// System.out.println("a="+b+",b="+a);
		/*
		 * 开发时，使用第三方变量形式，因为阅读性强。 int c; c=a; a=b; b=c;
		 */

		// 这种方式不要用，如果两个整数的数值过大，会超出int范围，会强制转换，数据变化。
		/*
		 * a=a+b;//a=3 + 5;a=8; b=a-b;//3+5-5=3;b=3; a=a-b;//3+5-3=5;a=5;
		 */
		/*
		 * 面试的时候用。 a=a^b;//a=3^5; b=a^b;//b=(3^5)^5;b=3; a=a^b;//a=(3^5)^3;a=5;
		 */

		// 获取两个整数中较大的整数
		// int a,b;
		// int max=a>b?a:b;

		// 获取三个整数中较大的整数
		// int q,w,e;
		// int temp =q>w?q:w;
		// int max2 =temp>e?temp:e;

		int x = 3, y = 4, z;
		z = (x > y) ? x : y;
		System.out.println("z=" + z);

	}

}
