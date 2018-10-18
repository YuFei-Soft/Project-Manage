package sousou;

public class NetPackage extends ServicePackage implements NetService {
	// 上网的流量
	private int flow;
//	private double price;

	public NetPackage(double price, int flow) {
		this.price=price;
		this.flow = flow;
	}

	public NetPackage() {
		this.flow =1024* 3;
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
	public int netPlay(int flow, MobileCard card) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void showInfo() {
		System.out.println("网虫套餐：上网流量：" + this.getFlow() + "GB/月" + "资费为："
				+ this.getPrice() + "元/月");

	}

}
