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
		stu.name="张三";
		stu.unit=Unit.U3;
		System.out.println(stu.unit);*/
		//switch也支持枚举
		Scanner input=new Scanner(System.in);
		System.out.println("请输入所属单元：");
		String strUnit=input.next();
		//把字符串转化成枚举
		Unit unit=Unit.valueOf(strUnit);
		switch(unit){
		case U1:
			System.out.println("大大");
			break;
		case U2:
			System.out.println("嘻嘻");
			break;
		case U3:
			System.out.println("悠悠");
			break;
		}
		
		
		
		
		
	}
}
