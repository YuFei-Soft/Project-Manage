package graph;

public class Triangle extends GraphInfo implements Graph {
	private double line;
	private double line2;
	private double line3;
	private double height;

	public Triangle(double line, double line2, double line3, double height) {
		super();
		this.line = line;
		this.line2 = line2;
		this.line3 = line3;
		this.height = height;
	}

	public Triangle() {

	}

	public double getLine2() {
		return line2;
	}

	public void setLine2(double line2) {
		this.line2 = line2;
	}

	public double getLine3() {
		return line3;
	}

	public void setLine3(double line3) {
		this.line3 = line3;
	}

	public double getLine() {
		return line;
	}

	public void setLine(double line) {
		this.line = line;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getGirth() {

		return line + line2 + line3;
	}

	@Override
	public double getArea() {
		return (line*height)/2;
	}

	@Override
	public void print() {
		System.out.println("三角形的周长为："+this.getGirth());
		System.out.println("三角形的面积为："+this.getArea());
	}
}
