package first;

import java.util.Scanner;

public class Test56 {

	public static void main(String[] args) {
		String[] names = new String[4]; // ���涩��������
		String[] dishMegs = new String[4]; // �����Ʒ��������
		int[] times = new int[4]; // �����Ͳ�ʱ��
		String[] addresses = new String[4]; // �����Ͳ͵�ַ
		int[] states = new int[4]; // ���涩��״̬�� 0����Ԥ�� 1�������
		double[] sumPrices = new double[4]; // ���涩�����ܽ��
		names[0] = "����";
		dishMegs[0] = "���մ���2��";
		times[0] = 14;
		addresses[0] = "�Ͼ�������16��";
		states[0] = 0;
		sumPrices[0] = 76.0;
		names[1] = "����";
		dishMegs[1] = "������˿2��";
		times[1] = 12;
		addresses[1] = "�Ͼ�������16��";
		states[1] = 1;
		sumPrices[1] = 45.0;
		String[] dishNames = { "���մ���", "������˿", "ʱ���߲�" };
		double[] dishPrices = { 38, 20, 10 };
		int[] nums = { 2, 1, 0 };
		int re = -1;
		int index = -1;
		Scanner input = new Scanner(System.in);
		do {
			index = -1;
			System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
			System.out.println("************************************");
			System.out.println("1����Ҫ����");
			System.out.println("2���鿴�ʹ�");
			System.out.println("3��ǩ�ն���");
			System.out.println("4��ɾ������");
			System.out.println("5����Ҫ����");
			System.out.println("6���˳�ϵͳ");
			System.out.println("************************************");
			System.out.print("��ѡ��");
			while (!input.hasNextInt()) {
				input.next();
				System.out.println("�����������֣�����������");
			}
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("***��Ҫ����***");
				for (int i = 0; i < names.length; i++) {
					if (names[i] == null) {
						index = i;
						break;
					}
				}
				if (index == -1) {
					System.out.println("�ʹ�������������ӣ�");
				} else {
					System.out.println("�����붩���˵�������");
					names[index] = input.next();
					System.out.println("���\t����\t����\t������\t");
					for (int i = 0; i < dishNames.length; i++) {
						System.out.println(i + 1 + "\t" + dishNames[i] + "\t"
								+ dishPrices[i] + "\t\t\t" + nums[i]);
					}
					System.out.println("��ѡ����Ҫ��Ĳ�Ʒ��ţ�");
					int tempIndex = input.nextInt();// ���
					System.out.println("��ѡ����������");
					int dishNum = input.nextInt();// ����
					System.out.println("�������Ͳ�ʱ�䣨ʱ����10-20֮�䣩��");
					times[index] = input.nextInt();// ʱ��
					System.out.println("�������Ͳ͵�ַ��");
					addresses[index] = input.next();
					System.out.println("���ͳɹ���");
					// ���㣬���뵽����
					// �����˷ѵĲͷ�
					double dishPrice = dishPrices[tempIndex - 1] * dishNum;
					// �˷�
					double otherPrice = dishPrice >= 50?0:5;
					// �ܷ���
					sumPrices[index] = dishPrice + otherPrice;
					// ���ò�Ʒ�����Ƽ�����
					dishMegs[index] = dishNames[tempIndex - 1] + dishNum + "��";
					// ��ӡ������Ϣ
					System.out.println("�㶩����:" + dishMegs[index]);
					System.out.println("�Ͳ�ʱ��:" + times[index] + "��");
					System.out.println("�ͷ�:" + dishPrice + "Ԫ\t�˷�:"
							+ otherPrice + "�ܼ�:" + sumPrices[index] + "Ԫ");
				}
				break;
			case 2:
				System.out.println("***�鿴�ʹ�***");
				System.out.println("���\t������\t��Ʒ��Ϣ\t�ʹ�ʱ��\t�Ͳ͵�ַ\t���\t�����Ϣ\t");
				for (int i = 0; i < names.length; i++) {
					if (names[i] == null) {
						break;
					}
					System.out.println(i + 1 + "\t" + "\t" + names[i] + "\t"
							+ dishMegs[i] + "\t" + times[i] + "\t"
							+ addresses[i] + "\t" + sumPrices[i] + "\t" + "\t"
							+ (states[i] == 0 ? "��Ԥ��" : "�����" + "\t"));

				}
				break;
			case 3:
				System.out.println("***ǩ�ն���***");
				System.out.println("������Ҫǩ�յĶ���");
				while (!input.hasNextInt()) {
					System.out.println("�������������֣�");
					input.next();
				}
				index = input.nextInt();
				if (index < 1 || index > names.length) {// �ж��Ƿ񳬳���Χ
					System.out.println("���ֳ�����Χ��");
				} else if (names[index - 1] == null) {
					System.out.println("���������ڣ�");// �ж϶����Ƿ���ڣ��Ƿ����ǩ�ա�
				} else if (states[index - 1] != 0) {// �ж϶���״̬��
					System.out.println("����������Ԥ��״̬������ǩ�գ�");
				} else {
					states[index - 1] = 1;
					System.out.println("ǩ�ճɹ���");
				}

				break;
			case 4:
				System.out.println("***ɾ������***");
				System.out.println("��ѡ����ţ�");
				index = input.nextInt();
				if (names[index - 1] == null) {
					System.out.println("��Ӧ�Ķ���Ϊ�գ�����ɾ����");
				} else if (states[index - 1] == 0) {
					System.out.println("����δǩ�գ�����ɾ����");
				} else {
					for (int i = index - 1; i < names.length - 1; i++) {
						names[i] = names[i + 1];
						dishMegs[i] = dishMegs[i + 1];
						times[i] = times[i + 1];
						addresses[i] = addresses[i + 1];
						states[i] = states[i + 1];
						sumPrices[i] = sumPrices[i + 1];
					}
					names[names.length - 1] = null;
					dishMegs[names.length - 1] = null;
					times[names.length - 1] = 0;
					addresses[names.length - 1] = null;
					states[names.length - 1] = 0;
					sumPrices[names.length - 1] = 0;
				}
				System.out.println("ɾ���ɹ���");
				break;
			case 5:
				System.out.println("***��Ҫ����***");
				System.out.println("���\t����\t����\t������\t");
				for (int i = 0; i < dishNames.length; i++) {
					System.out.println(i + 1 + "\t" + dishNames[i] + "\t"
							+ dishPrices[i] + "\t\t\t" + nums[i]);
				}
				System.out.println("��ѡ����ţ�");
				index = input.nextInt();
				nums[index - 1]++;
				System.out.println("������ɣ�");
				break;
			case 6:
				System.out.println("�˳�ϵͳ");
				// �˳�����(���������������˳�java�����)
				System.exit(0);
				break;
			default:
				System.out.println("ֻ������1-6!");
				break;
			}
			System.out.println("����0����");
			re = input.nextInt();

		} while (re == 0);
		System.out.println("��ӭʹ�ã���ӭ�´ι��٣�");
	}

}
