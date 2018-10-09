package kuangjia;

import java.util.ArrayList;

public class Penguin {
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Penguin(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	public Penguin() {
		super();
	}
	@Override
	public String toString() {
		return "Penguin [name=" + name + ", sex=" + sex + "]";
	}
	public static void main(String[] args) {
		ArrayList list=new 	ArrayList();
		list.add(new Penguin("Å·Å·","Q×Ð"));
		
		
	}
	
}
