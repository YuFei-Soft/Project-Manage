package zuche;

import java.util.Map;

public abstract class Moto {
	private String numberPlate;//���ƺ�
	
	
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
//�������
//����ֵ���Ϳ������ó�void ��ֱ���ڷ����д�ӡ������Ϣ���˴���ϰMap����

public abstract Map calcRent(int days);
}
