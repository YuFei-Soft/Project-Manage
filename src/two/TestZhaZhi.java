package two;

import java.util.Scanner;

public class TestZhaZhi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������ˮ����");
		ZhaZhiJi s = new ZhaZhiJi();
		String shuiGuo = input.next();
		//�������ô�����������ʵ�ʲ�����Ҳ��ʵ��
		//ʵ�ε�����Ҳ�������ȡ������ҲҪ��ѭ�շ���������ͬʱҲҪ������
		//�βκ�ʵ�ε����ͱ���һ�£����ֿ���һ�£�Ҳ���Բ�һ�¡�ָ����shuiGuo��������
		String Zhi = s.zhaZhi(shuiGuo);
		System.out.println(Zhi);
	}
}
