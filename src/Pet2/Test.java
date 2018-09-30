package Pet2;


public class Test {
	public static void main(String[] args) {
		Pet[] a = new Pet[3];
		a[0] = new Cat("波斯猫\t", 4);
		a[1] = new Duck("唐老鸭\t", 2);
		a[2] = new Dolphin("海豚奇奇\t", 0);
		System.out.println("动物的名字\t腿的条数\t\t动物叫");
		for (Pet pet : a) {
			
			if (pet instanceof Cat) {
				Cat cat = (Cat) pet;
				cat.getLegNum();
				System.out.println(cat.getName() + "\t\t" + cat.getLegNum()
						+ "\t" + "\t" + cat.getShot());

			} else if (pet instanceof Duck) {
				Duck duck = (Duck) pet;
				duck.getLegNum();
				System.out.println(duck.getName() + "\t\t" + duck.getLegNum()
						+ "\t" + "\t" + duck.getShot());

			} else if (pet instanceof Dolphin) {
				Dolphin dolphin = (Dolphin) pet;
				dolphin.getLegNum();
				System.out
						.println(dolphin.getName() + "\t\t"
								+ dolphin.getLegNum() + "\t" + "\t"
								+ dolphin.getShot());
			}
		}
	}
}
