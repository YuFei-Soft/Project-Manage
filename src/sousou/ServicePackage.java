package sousou;

public abstract class ServicePackage {
	// �ײ͵����ʷ�
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

	// ��ʾ�ײ͵�����
	public abstract void showInfo();

}
