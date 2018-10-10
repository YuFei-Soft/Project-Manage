package zuche;

import java.util.Map;

public abstract class Moto {
	private String No;
	private String brand;
	private int dayMoney;

	public String getNo() {
		return No;
	}

	public void setNo(String no) {
		No = no;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getDayMoney() {
		return dayMoney;
	}

	public void setDayMoney(int dayMoney) {
		this.dayMoney = dayMoney;
	}

	public Moto(String no, String brand, int dayMoney) {
		super();
		No = no;
		this.brand = brand;
		this.dayMoney = dayMoney;
	}

	public Moto() {
		super();
	}
   public abstract Map calcRent(int days);
}
