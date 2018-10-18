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
	// 入参：minCount数据量（计划打电话的时长），card：使用的电话卡
	// 返回值：实际的打电话的时长（应该和minCount有关）
	// 异常：如果套餐的余额不足，抛出异常
	public int call(int minCount, MobileCard card) throws Exception {
		// 一分钟一分钟的计算
		for (int i = 0; i < minCount; i++) {
			// 判断套餐余量是否足够
			if (talkTime > card.getRealtalktime()) {
				// 增加通话的时间
				card.setRealtalktime(card.getRealtalktime() + 1);
			} else {
				// 套餐余量使用完毕
				// 使用余额
				if (card.getMoney() > 0.2) {
					// 增加通话时间
					card.setRealtalktime(card.getRealtalktime() + 1);
					// 余额减除
					card.setMoney(card.getMoney() - 0.2);
					// 总消费额增加
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
	public int send(int count, MobileCard card) throws Exception {
		// 短信一条一条的计算
		for (int i = 0; i < count; i++) {
			// 判断套餐短信数是否足够
			if (smsCount > card.getRealSMSCount() + 1) {
				// 增加短信的使用条数
				card.setRealSMSCount(card.getRealSMSCount() + 1);
			} else {
				// 套餐短信条数使用完毕
				// 使用余额
				if (card.getMoney() > 0.1) {
					// 增加短信使用的条数
					card.setRealSMSCount(card.getRealSMSCount() + 1);
					// 余额减除
					card.setMoney(card.getMoney() - 0.1);
					// 总消费额增加
					card.setConsumAmount(card.getConsumAmount() + 0.1);
				} else {
					// 余额不足
					throw new Exception("发送了" + i + "条信息，你的余额不足，请充值！");
				}
			}
		}

		return count;
	}

}
