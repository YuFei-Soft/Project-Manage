package sousou;

public class SuperPackage extends ServicePackage implements CallService,
		SendService, NetService {
	// 通话时长
	private int talkTime;
	// 短信的条数
	private int smsCount;
	// 上网的流量
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
		this.price = 78;

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
		System.out.println("超人套餐：通话时长：" + this.getTalkTime() + "分钟/月" + "上网流量："
				+ this.getFlow() + "GB/月" + "短信条数：" + this.getSmsCount()
				+ "条/月" + "资费：" + this.getPrice() + "元/月");

	}

	@Override
	public int netPlay(int flow, MobileCard card) throws Exception {
		// 一MB一MB的计算
		for (int i = 0; i < flow; i++) {
			// 判断套餐流量是否足够
			if (flow > card.getRealFlow()) {
				// 增加通话的时间
				card.setRealFlow(card.getRealFlow() + 1);
			} else {
				// 套餐流量使用完毕
				// 使用余额
				if (card.getMoney() > 0.1) {
					// 增加流量的使用数
					card.setRealFlow(card.getRealFlow() + 1);
					// 余额减除
					card.setMoney(card.getMoney() - 0.1);
					// 总消费额增加
					card.setConsumAmount(card.getConsumAmount() + 0.2);
				} else {
					// 余额不足
					throw new Exception("使用了" + i + "M流量，你的余额不足，请充值！");
				}
			}
		}

		return flow;
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
