package pet;

public class Test {
	public static void main(String[] args) {
		Pet[] a = new Pet[3];
		a[0] = new Cat("波斯猫\t", 4);
		a[1] = new Duck("唐老鸭\t", 2);
		a[2] = new Dolphin("海豚奇奇\t", 0);
		System.out.println("动物的名字\t腿的条数\t\t动物叫");
		for (Pet pet : a) {
			System.out.println(pet.getName() + "\t\t" + pet.getLegNum() + "\t"
					+ "\t"+pet.getShot());
		}
	}
}
