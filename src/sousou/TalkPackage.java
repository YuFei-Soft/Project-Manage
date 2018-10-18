package sousou;

public class TalkPackage extends ServicePackage implements CallService,
		SendService {
	// ͨ����ʱ��
	private int talkTime;
	// ���ŵ�����
	private int smsCount;

	// ����
	// private double price;

	public TalkPackage() {
		this.talkTime = 500;
		this.smsCount = 30;
		this.price = 58;
	}

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

	public TalkPackage(double price, int talkTime, int smsCount) {
		super(price);
		this.talkTime = talkTime;
		this.smsCount = smsCount;
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
				+ this.getSmsCount() + "��/��" + "�ʷ�" + this.getPrice() + "Ԫ/��");

	}

	@Override
	public int send(int count, MobileCard card) {
		// TODO Auto-generated method stub
		return 0;
	}

}
