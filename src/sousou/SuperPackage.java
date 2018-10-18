package sousou;

public class SuperPackage extends ServicePackage implements CallService,
		SendService, NetService {
	// ͨ��ʱ��
	private int talkTime;
	// ���ŵ�����
	private int smsCount;
	// ����������
	private int flow;

	public int getTalkTime() {
		return talkTime;
	}

	public void setTalkTime(int talkTime) {
		this.talkTime = talkTime;
	}

	public int getSmsCount() {
		return smsCount;
	}

	public void setSmsCount(int smsCount) {
		this.smsCount = smsCount;
	}

	public int getFlow() {
		return flow;
	}

	public void setFlow(int flow) {
		this.flow = flow;
	}

	public SuperPackage(double price, int talkTime, int smsCount, int flow) {
		this.price = price;
		this.talkTime = talkTime;
		this.smsCount = smsCount;
		this.flow = flow;
	}

	public SuperPackage() {
		this.talkTime = 200;
		this.flow = 1024 * 1;
		this.smsCount = 50;
		this.price = 50;

	}

	@Override
	public int call(int minCount, MobileCard card) throws Exception {
		// һ����һ���ӵļ���
		for (int i = 0; i < minCount; i++) {
			if (talkTime > card.getRealtalktime()) {
				card.setRealtalktime(card.getRealtalktime() + 1);
			} else {
				if (card.getMoney() > 0.2) {
					card.setRealtalktime(card.getRealtalktime() + 1);
					card.setMoney(card.getMoney() - 0.2);
					card.setConsumAmount(card.getConsumAmount() + 0.2);
				} else {
					// ����
					throw new Exception("ͨ����" + i + "���ӣ�������㣬���ֵ��");
				}
			}
		}

		return minCount;
	}

	@Override
	public void showInfo() {
		System.out.println("�����ײͣ�ͨ��ʱ����" + this.getTalkTime() + "����/��" + "����������"
				+ this.getFlow() + "GB/��" + "����������" + this.getSmsCount()
				+ "��/��" + "�ʷѣ�" + this.getPrice() + "Ԫ/��");

	}

	@Override
	public int netPlay(int flow, MobileCard card) {
		return 0;
	}

	@Override
	public int send(int count, MobileCard card) {
		return 0;
	}

}
