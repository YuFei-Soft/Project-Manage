package sousou;

public class MobileCard {
	private String cardNumber;// �ֻ�����
	private String userName;// ʹ��������
	private String passWord;// ����
	private ServicePackage serPackage;// ���ø���
	private double consumAmount;// �����ܶ�
	private double money;// ����
	private int realtalktime;// ͨ���ķ��������Ѿ��ù��ģ�
	private int realSMSCount;// ���ŵ�����
	private int realFlow;// ������

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public ServicePackage getSerPackage() {
		return serPackage;
	}

	public void setSerPackage(ServicePackage serPackage) {
		this.serPackage = serPackage;
	}

	public double getConsumAmount() {
		return consumAmount;
	}

	public void setConsumAmount(double consumAmount) {
		this.consumAmount = consumAmount;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getRealtalktime() {
		return realtalktime;
	}

	public void setRealtalktime(int realtalktime) {
		this.realtalktime = realtalktime;
	}

	public int getRealSMSCount() {
		return realSMSCount;
	}

	public void setRealSMSCount(int realSMSCount) {
		this.realSMSCount = realSMSCount;
	}

	public int getRealFlow() {
		return realFlow;
	}

	public void setRealFlow(int realFlow) {
		this.realFlow = realFlow;
	}

	public MobileCard(String cardNumber, String userName, String passWord,
			ServicePackage serPackage, double consumAmount, double money,
			int realtalktime, int realSMSCount, int realFlow) {
		super();
		this.cardNumber = cardNumber;
		this.userName = userName;
		this.passWord = passWord;
		this.serPackage = serPackage;
		this.consumAmount = consumAmount;
		this.money = money;
		this.realtalktime = realtalktime;
		this.realSMSCount = realSMSCount;
		this.realFlow = realFlow;
	}

	public MobileCard() {

	}

	public void shoeMeg() {
		System.out.println("ע��ɹ������ţ�" + cardNumber + "�û�����" + userName
				+ "��ǰ��" + money + "Ԫ");
	}

}
