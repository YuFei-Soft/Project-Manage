package graph;

public class Quadrilateral implements Graph {
	private double height;
	private double length;

	public Quadrilateral(double height, double length) {
		super();
		this.height = height;
		this.length = length;
	}

	public Quadrilateral() {
		super();
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getGirth() {
		return (length + height) * 2;
	}

	@Override
	public double getArea() {
		return height * length;
	}

	@Override
	public void print() {
		System.out.println("四边形的周长为："+this.getGirth());
		System.out.println("四边形的面积为："+this.getArea());
	}

}
