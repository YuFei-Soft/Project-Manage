package zuche;

import java.util.Map;

public class Bus extends Moto {
	private int seatCount;

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public Bus(String no, String brand, int dayMoney, int seatCount) {
		super(no, brand, dayMoney);
		this.seatCount = seatCount;
	}

	public Bus() {
		super();
	}

	public Bus(String no, String brand, int dayMoney) {
		super(no, brand, dayMoney);
	}

	@Override
	public Map calcRent(int days) {
		double price =this.getDayMoney()*days;
		if(days>=150){
			price = 0.6;
		}else if(days>=30){
			 price=0.7;
		}else if (days>=7){
			 price=0.8;
		}else{
			 price=0.9;
		}
		return null;
	}

}
