package sousou;

public class ConsumInfo {
	// ����
	private String cardNumber;
	// ���ѵ����ͣ�ͨ���������ţ�����
	private String type;
	// ���ѵ����ݣ�ͨ����ÿ���ӣ��������ţ���������������MB��
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
