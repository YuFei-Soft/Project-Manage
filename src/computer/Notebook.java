package computer;

public abstract class Notebook {
	private String name;
	private String type;
	private double weight;
	private double price;
	
	public Notebook(String name, String type, double weight, double price) {
		super();
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.price = price;
	}
	public Notebook(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
