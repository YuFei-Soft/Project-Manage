public class Test {
	// 打印所有由1,2,3,4四个数字组成的三位数(一行输出5个)，并且统计个数
	// 要求去除其中有重复的数字如（121,313,122，222等）
	public static void main(String[] args) {

		int  sum = 0;
		for (int a = 1; a <5; a++) {
			for (int i = 1; i < 5; i++) {
				for (int c = 1; c < 5; c++) {
					if (a != i && a != c && i != c) {
						sum++;
						int time = 100 * a + 10 * i + c;
						System.out.print(time + " ");
				if(sum%5==0){
					System.out.println();
				}
					}
				}
			}
		}
		System.out.println();
		System.out.println("个数为：" + sum);
	}
}
