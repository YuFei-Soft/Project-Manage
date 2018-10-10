package zuche;

import java.util.Map;

public class Car extends Moto {
	private String type;
	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Car(String no, String brand, int dayMoney, String type) {
		super(no, brand, dayMoney);
		this.type = type;
	}

	public Car() {
		super();
	}


	@Override
	public Map calcRent(int days) {
		double price=this.getDayMoney()*days;
		if(days>150){
			price=0.7;
		}else if(days>30){
			price=0.8;
		}else{
			price=0.9;
		}
		return null;
	}

}
