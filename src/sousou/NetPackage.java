package sousou;

public class NetPackage extends ServicePackage implements NetService {
	// 上网的流量
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
	public void showInfo() {
		System.out.println("网虫套餐：上网流量：" + this.getFlow() + "GB/月" + "资费为："
				+ this.getPrice() + "元/月");

	}

}
