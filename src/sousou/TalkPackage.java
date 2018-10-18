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
	// ��Σ�minCount���������ƻ���绰��ʱ������card��ʹ�õĵ绰��
	// ����ֵ��ʵ�ʵĴ�绰��ʱ����Ӧ�ú�minCount�йأ�
	// �쳣������ײ͵����㣬�׳��쳣
	public int call(int minCount, MobileCard card) throws Exception {
		// һ����һ���ӵļ���
		for (int i = 0; i < minCount; i++) {
			// �ж��ײ������Ƿ��㹻
			if (talkTime > card.getRealtalktime()) {
				// ����ͨ����ʱ��
				card.setRealtalktime(card.getRealtalktime() + 1);
			} else {
				// �ײ�����ʹ�����
				// ʹ�����
				if (card.getMoney() > 0.2) {
					// ����ͨ��ʱ��
					card.setRealtalktime(card.getRealtalktime() + 1);
					// ������
					card.setMoney(card.getMoney() - 0.2);
					// �����Ѷ�����
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
	public int send(int count, MobileCard card) throws Exception {
		// ����һ��һ���ļ���
		for (int i = 0; i < count; i++) {
			// �ж��ײͶ������Ƿ��㹻
			if (smsCount > card.getRealSMSCount() + 1) {
				// ���Ӷ��ŵ�ʹ������
				card.setRealSMSCount(card.getRealSMSCount() + 1);
			} else {
				// �ײͶ�������ʹ�����
				// ʹ�����
				if (card.getMoney() > 0.1) {
					// ���Ӷ���ʹ�õ�����
					card.setRealSMSCount(card.getRealSMSCount() + 1);
					// ������
					card.setMoney(card.getMoney() - 0.1);
					// �����Ѷ�����
					card.setConsumAmount(card.getConsumAmount() + 0.1);
				} else {
					// ����
					throw new Exception("������" + i + "����Ϣ��������㣬���ֵ��");
				}
			}
		}

		return count;
	}

}
