package pet;

public class Test {
	public static void main(String[] args) {
		Pet[] a = new Pet[3];
		a[0] = new Cat("��˹è\t", 4);
		a[1] = new Duck("����Ѽ\t", 2);
		a[2] = new Dolphin("��������\t", 0);
		System.out.println("���������\t�ȵ�����\t\t�����");
		for (Pet pet : a) {
			System.out.println(pet.getName() + "\t\t" + pet.getLegNum() + "\t"
					+ "\t"+pet.getShot());
		}
	}
}
