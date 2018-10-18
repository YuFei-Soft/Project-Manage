package sousou;

public class NetPackage extends ServicePackage implements NetService {
	// ����������
	private int flow;

	// private double price;

	public NetPackage(double price, int flow) {
		this.price = price;
		this.flow = flow;
	}

	public NetPackage() {
		this.flow = 1024 * 3;
		this.price = 68;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

	@Override
	public int netPlay(int flow, MobileCard card) throws Exception {
		// һMBһMB�ļ���
		for (int i = 0; i < flow; i++) {
			// �ж��ײ������Ƿ��㹻
			if (flow > card.getRealFlow()) {
				// ����ͨ����ʱ��
				card.setRealFlow(card.getRealFlow() + 1);
			} else {
				// �ײ�����ʹ�����
				// ʹ�����
				if (card.getMoney() > 0.1) {
					// ����������ʹ����
					card.setRealFlow(card.getRealFlow() + 1);
					// ������
					card.setMoney(card.getMoney() - 0.1);
					// �����Ѷ�����
					card.setConsumAmount(card.getConsumAmount() + 0.2);
				} else {
					// ����
					throw new Exception("ʹ����" + i + "M������������㣬���ֵ��");
				}
			}
		}

		return flow;
	}

	@Override
	public void showInfo() {
		System.out.println("�����ײͣ�����������" + this.getFlow() + "GB/��" + "�ʷ�Ϊ��"
				+ this.getPrice() + "Ԫ/��");

	}

}
