package two;

//�����õ��� ������
import java.util.Scanner;

public class TestStuPeo {
	public static void main(String[] args) {
		StuPeo ad = new StuPeo();
		Scanner input = new Scanner(System.in);
		// ѭ������5��ѧ��������
		for (int i = 0; i < 5; i++) {
			System.out.println("����������");
			String newName = input.next();
			ad.putName(newName);
		}
		// ��ʾѧ������Ϣ
		ad.shoeName();
		// ���ض��������ڲ���һ���ض���ѧԱ��
		System.out.println("�����뿪ʼ���ҵ�λ�ã�");
		int start = input.nextInt();
		System.out.println("������������ҵ�λ�ã�");
		int end = input.nextInt();
		System.out.println("��������ҵ�ѧ��������");
		String name = input.next();
		System.out.println("***���ҽ��***");
		boolean flag = ad.getName(start, end, name);// ��boolean
													// �����ͷ���ֻ��false����true
		if (flag) { // Ĭ�ϵ���true ���Ծ�ֱ���ж�flag����
			System.out.println("�ҵ���");
		} else {
			System.out.println("û�ҵ�������");
		}

	}
}
