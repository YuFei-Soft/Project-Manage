package kaoshi2;

public class Test3 {
	static int LeapYear(int year) {
		if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
			return 1; // 是闰年，则返回1
		} else {
			return 0; // 不是闰年，则返回0
		}
	}

	public static void main(String[] args) {
		int year;
		int count = 0;
		for (year = 2000; year <= 3000; year++) {
			if (LeapYear(year) == 1) { // 如果等于1就是闰年就加1
				count++;
			}
		}
		System.out.print("2000年到3000年的闰年为：" + count + "个");
	}

}
