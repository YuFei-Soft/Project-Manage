import java.util.Scanner;

public class Test2 {
	/*
	  3.��дDVD����ϵͳ�� DVD�����ƣ�������������״̬���ѽ����δ������������� Ҫ��ʵ�����¹���: (1)�鿴����DVD����Ϣ
	  ��2������dvd ��3��ɾ��dvd�����״̬Ϊ�ѽ���Ĳ���ɾ���� ��4�����DVD�����״̬Ϊ�ѽ���Ĳ����ٽ裬����ɹ��󣬽��������1��
	  ��5���˳�ϵͳ ����ÿ���ӹ���ִ����ɺ�Ҫ���ܹ��������˵������û�����ѡ����������
	 */
	public static void main(String[] args) {
		String[] names = new String[5];
		String[] re = new String[5];
		int[] times = new int[5];
		String c = "δ���";
		String b = "�ѽ��";
		names[0] = "����";
		re[0] = c;
		times[0] = 0;
		int num = 1;
		Scanner input = new Scanner(System.in);
		do {
			int a;
			String name;
			System.out.println("******��ӭ�����DVD******");
			System.out.println("1.�鿴����DVD��Ϣ");
			System.out.println("2.����DVD");
			System.out.println("3.ɾ��DVD");
			System.out.println("4.���DVD");
			System.out.println("5.�˳�ϵͳ");
			System.out.println("��ѡ��");
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("******DVD��Ϣ******");
				System.out.println("����\t" + "���״̬\t" + "�������");
				for (int i = 0; i < num; i++) {
					System.out.println(names[i] + "\t" + re[i] + "\t"
							+ times[i]);
				}
				System.out.println("����0���أ�");
				a = input.nextInt();
				if (a == 0) {
					break;
				}
			case 2:
				System.out.println("******����DVD******");
				System.out.println("����������DVD���ƣ�");
				name = input.next();
				names[num] = name;
				re[num] = c;
				times[num] = 0;
				num++;
				System.out.println("����DVD�ɹ�");
				System.out.println("����0���أ�");
				a = input.nextInt();
				if (a == 0) {
					break;
				}
			case 3:
				System.out.println("******ɾ��DVD******");
				System.out.println("������Ҫɾ����DVD���ƣ�");
				name = input.next();
				for (int i = 0; i < num; i++) {
					if (name.equals(names[i]) && c.equals(re[i])) {
						names[i] = names[i + 1];
						re[i] = re[i + 1];
						times[i] = times[i + 1];
						num--;
						System.out.println("DVD��ɾ����");
						break;
					}
					if (i == num - 1) {
						System.out.println("DVD�����ڻ��ѽ����");
					}
				}
				System.out.println("����0���أ�");
				a = input.nextInt();
				if (a == 0) {
					break;
				}
			case 4:
				System.out.println("******���DVD******");
				System.out.println("������Ҫ�����DVD���ƣ�");
				name = input.next();
				for (int i = 0; i < num; i++) {
					if (name.equals(names[i]) && c.equals(re[i])) {
						System.out.println("����ɹ���");
						times[i]++;
						re[i] = b;
					} else {
						System.out.println("DVD�ѽ����");
					}
				}
				System.out.println("����0���أ�");
				a = input.nextInt();
				if (a == 0) {
					break;
				}
			case 5:
				System.out.println("���˳�ϵͳ��");
				System.exit(0);
			default:
				System.out.println("ѡ�����������ѡ��");
				System.out.println("����0���أ�");
				a = input.nextInt();
				if (a == 0) {
					break;
				}
			}
		} while (true);

	}
	
}
