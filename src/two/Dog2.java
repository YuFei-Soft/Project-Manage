package two;

public class Dog2 {
	public String name;
	public int health;
	public int love;
	public String strain;

	public void show() {
		System.out.println("����:" + name + "����ֵ:" + health + "����ֵ:" + love
				+ "Ʒ��:" + strain);
	}

	public Dog2(String name, int health, int love, String strain) {
		this.name = name;
		this.health = health;
		this.love = love;
		this.strain = strain;
	}

	public static void main(String[] args) {
		Dog2 dog = new Dog2("С��", 100, 20, "�ǹ�");
		dog.show();
	}
}
