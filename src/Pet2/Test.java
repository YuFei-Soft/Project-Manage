package Pet2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		Pet[] a = new Pet[3];
		a[0] = new Cat("��˹è\t", 4);
		a[1] = new Duck("����Ѽ\t", 2);
		a[2] = new Dolphin("��������\t", 0);
		do {
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
					System.out.println(duck.getName() + "\t\t"
							+ duck.getLegNum() + "\t" + "\t" + duck.getShot());

				} else if (pet instanceof Dolphin) {
					Dolphin dolphin = (Dolphin) pet;
					dolphin.getLegNum();
					System.out.println(dolphin.getName() + "\t\t"
							+ dolphin.getLegNum() + "\t" + "\t"
							+ dolphin.getShot());
				}
			}
			System.out.println("�Ƿ��������0�������������˳�");
			int num = input.nextInt();
			if (num != 0) {
				break;
			}
			String[] names = new String[3];
			int[] legnums = new int[3];
			System.out.println("������è��������");
			names[0] = input.next();
			System.out.println("������è��������");
			legnums[0] = input.nextInt();
			if(legnums[0]!=4){
				try {
					throw new Exception("èֻ��4����");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Thread.sleep(100);					
				}
			}
			System.out.println("������Ѽ�ӵ�������");
			names[1] = input.next();
			System.out.println("������Ѽ�ӵ�������");
			legnums[1] = input.nextInt();
			if(legnums[1]!=2){
				try {
					throw new Exception("Ѽ��ֻ��2����");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Thread.sleep(100);
				}
			}
			System.out.println("�����뺣������֣�");
			names[2] = input.next();
			System.out.println("�����뺣���������");
			legnums[2] = input.nextInt();
			a[0] = new Cat(names[0], legnums[0]);
			a[1] = new Duck(names[1], legnums[1]);
			a[2] = new Dolphin(names[2], legnums[2]);
		} while (true);

	}
}
