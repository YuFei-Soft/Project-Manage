package lianxi2;

public class test {
	// 쳲��������� 1 1 2 3 5 8 .��������
	// ��������е�n���ֵ
	public static int getNum(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			// ��n��ĺ͵�����ǰ����ĺ�
			return getNum(n - 1) + getNum(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println(getNum(50));
	}
}
