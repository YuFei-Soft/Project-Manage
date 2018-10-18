package sousou;

public class ConsumInfo {
	// 卡号
	private String cardNumber;
	// 消费的类型：通话，发短信，上网
	private String type;
	// 消费的数据：通话（每分钟），发短信（条），上网：（MB）
	private int consumData;

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getConsumData() {
		return consumData;
	}

	public void setConsumData(int consumData) {
		this.consumData = consumData;
	}

	public ConsumInfo(String cardNumber, String type, int consumData) {
		this.cardNumber = cardNumber;
		this.type = type;
		this.consumData = consumData;
	}

	public ConsumInfo() {

	}

}
