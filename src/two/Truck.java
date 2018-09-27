package two;

public class Truck extends Moto {
	private int  tonnage;
	

	public double getTonnage() {
		return tonnage;
	}


	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}


	public Truck(String no, String brand, int  tonnage) {
		super(no, brand);
		this.tonnage = tonnage;
	}
public Truck(){
	
}

	@Override
	public int calcRent(int days) {
		int prices=0;
		return prices=tonnage*50*days;
	
	}

}
