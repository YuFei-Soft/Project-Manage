package lianxi;

//Province��ʵ�ּ���쵼�Ͱ�ȫ�����Ĺ���
public class Province extends StataCouncil implements Cent {

	@Override
	public void partyLeader() {
		System.out.println("��ֵ����쵼");
	}

	@Override
	public void safeProduction() {
		System.out.println("��ȫ����������");
	}

	public static void main(String[] args) {
		Province province = new Province();
		province.partyLeader();
		province.safeProduction();
	}
}
