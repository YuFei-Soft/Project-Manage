package sousou;

public class TalkPackage extends ServicePackage implements CallService,
		SendService {
	// 通话的时长
	private int talkTime;
	// 短信的条数
	private int smsCount;

	// 费用
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
		// 一分钟一分钟的计算
		for (int i = 0; i < minCount; i++) {
			if (talkTime > card.getRealtalktime()) {
				card.setRealtalktime(card.getRealtalktime() + 1);
			} else {
				if (card.getMoney() > 0.2) {
					card.setRealtalktime(card.getRealtalktime() + 1);
					card.setMoney(card.getMoney() - 0.2);
					card.setConsumAmount(card.getConsumAmount() + 0.2);
				} else {
					// 余额不足
					throw new Exception("通话了" + i + "分钟，你的余额不足，请充值！");
				}
			}
		}

		return minCount;
	}

	@Override
	public void showInfo() {
		System.out.println("话痨套餐：通话时长：" + this.getTalkTime() + "分钟/月" + "短信条数："
				+ this.getSmsCount() + "条/月" + "资费" + this.getPrice() + "元/月");

	}

	@Override
	public int send(int count, MobileCard card) {
		// TODO Auto-generated method stub
		return 0;
	}

}
