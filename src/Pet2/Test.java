package Pet2;


public class Test {
	public static void main(String[] args) {
		Pet[] a = new Pet[3];
		a[0] = new Cat("��˹è\t", 4);
		a[1] = new Duck("����Ѽ\t", 2);
		a[2] = new Dolphin("��������\t", 0);
		System.out.println("���������\t�ȵ�����\t\t�����");
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
