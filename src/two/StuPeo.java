package two;

public class StuPeo {
	String[] names = new String[10];

	// ����ѧ����������name����Ҫ���ѧ������
	public void putName(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i] == null) {
				names[i] = name;
				break;
			}
		}

	}

	// ��һ���������ڲ���ĩ��ѧ��
	// Ҫ֪�������￪ʼ���ң���Ҫ�����Ǹ��ˡ�start �ǿ�ʼ���ҵ�λ�� end�ǽ������ҵ�λ�� name�ǲ��ҵ�ѧ������
	public boolean getName(int start, int end, String name) {
		boolean flag = false; // ����Ƿ���ҵ���ѧ����false��û�ҵ���true���ҵ��ˡ�
		for (int i = start - 1; i < end; i++) {
			if (names[i].equals(name)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	// ��ӡѧ���������б�
	public void shoeName() {
		System.out.println("***ѧ���б�***");
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null) {
				System.out.println(names[i] + "\t");
			}
		}
	}
}
