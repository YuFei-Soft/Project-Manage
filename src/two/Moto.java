package two;

public  abstract class Moto {
	
	private String no;
	private String brand;
	public Moto(String no, String brand) {
		super();
		this.no = no;
		this.brand = brand;
	}
	public Moto() {

	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

  public abstract int  calcRent(int days);
	  
  
}
