package year;

public class Test {
	public void getDays(int year, int month, int days) {
		int a = 0;// 31����·�
		int b = 0;// 30����·�
		int c = 0;// 2�µ�����
		for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				a++;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				b++;
				break;
			case 2:
				c = ifLeap(year) ? 29 : 28;
				break;
			}
		}
		int day=a*31+b*30+c+days;
		System.out.println(year+"��"+month+"��"+days+"��");
		
	}

	// �ж��Ƿ�Ϊ����
	public boolean ifLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}

	}
	public static void main(String[] args) {
		
		
	}

}
