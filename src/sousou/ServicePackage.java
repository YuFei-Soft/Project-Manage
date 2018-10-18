package sousou;

public abstract class ServicePackage {
	// 套餐的月资费
	protected double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ServicePackage(double price) {
		super();
		this.price = price;
	}

	public ServicePackage() {

	}

	// 显示套餐的数据
	public abstract void showInfo();

}
