package kaoshi2;

public class Test3 {
	static int LeapYear(int year) {
		if ((year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0)) {
			return 1; // �����꣬�򷵻�1
		} else {
			return 0; // �������꣬�򷵻�0
		}
	}

	public static void main(String[] args) {
		int year;
		int count = 0;
		for (year = 2000; year <= 3000; year++) {
			if (LeapYear(year) == 1) { // �������1��������ͼ�1
				count++;
			}
		}
		System.out.print("2000�굽3000�������Ϊ��" + count + "��");
	}

}
