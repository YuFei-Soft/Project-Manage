package graph;

public class Round implements Graph {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Round(double radius) {
		super();
		this.radius = radius;
	}

	public Round() {
		super();
	}

	@Override
	public double getGirth() {
		return 2 * 3.14 * radius;
	}

	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public void print() {
		System.out.println("Բ���ܳ�Ϊ��"+this.getGirth());
		System.out.println("Բ�����Ϊ��"+this.getArea());
		
	}

}
