package meiju;

import java.util.Scanner;

public class Stu {
	private String name;
	private Unit unit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	public static void main(String[] args) {
		/*Stu stu=new Stu();
		stu.name="����";
		stu.unit=Unit.U3;
		System.out.println(stu.unit);*/
		//switchҲ֧��ö��
		Scanner input=new Scanner(System.in);
		System.out.println("������������Ԫ��");
		String strUnit=input.next();
		//���ַ���ת����ö��
		Unit unit=Unit.valueOf(strUnit);
		switch(unit){
		case U1:
			System.out.println("���");
			break;
		case U2:
			System.out.println("����");
			break;
		case U3:
			System.out.println("����");
			break;
		}
		
		
		
		
		
	}
}
