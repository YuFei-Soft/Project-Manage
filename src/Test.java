public class Test {
	// ��ӡ������1,2,3,4�ĸ�������ɵ���λ��(һ�����5��)������ͳ�Ƹ���
	// Ҫ��ȥ���������ظ��������磨121,313,122��222�ȣ�
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
		System.out.println("����Ϊ��" + sum);
	}
}
