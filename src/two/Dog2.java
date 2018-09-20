package two;

public class Dog2 {
	public String name;
	public int health;
	public int love;
	public String strain;

	public void show() {
		System.out.println("名字:" + name + "健康值:" + health + "亲密值:" + love
				+ "品种:" + strain);
	}

	public Dog2(String name, int health, int love, String strain) {
		this.name = name;
		this.health = health;
		this.love = love;
		this.strain = strain;
	}

	public static void main(String[] args) {
		Dog2 dog = new Dog2("小黑", 100, 20, "狼狗");
		dog.show();
	}
}
