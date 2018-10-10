package zuche;

import java.util.Map;

public abstract class Moto {
	private String numberPlate;//车牌号
	
	
   public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}





public Moto(String numberPlate) {
		super();
		this.numberPlate = numberPlate;
	}

public Moto() {
	super();
	// TODO Auto-generated constructor stub
}
//计算租金
//返回值类型可以设置成void ，直接在方法中打印金额的信息，此处练习Map返回

public abstract Map calcRent(int days);
}
