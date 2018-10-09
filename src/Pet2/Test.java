package Pet2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		Pet[] a = new Pet[3];
		a[0] = new Cat("波斯猫\t", 4);
		a[1] = new Duck("唐老鸭\t", 2);
		a[2] = new Dolphin("海豚奇奇\t", 0);
		do {
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
			System.out.println("是否继续，按0继续其他数字退出");
			int num = input.nextInt();
			if (num != 0) {
				break;
			}
			String[] names = new String[3];
			int[] legnums = new int[3];
			System.out.println("请输入猫的姓名：");
			names[0] = input.next();
			System.out.println("请输入猫的腿数：");
			legnums[0] = input.nextInt();
			if(legnums[0]!=4){
				try {
					throw new Exception("猫只有4条腿");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Thread.sleep(100);					
				}
			}
			System.out.println("请输入鸭子的姓名：");
			names[1] = input.next();
			System.out.println("请输入鸭子的腿数：");
			legnums[1] = input.nextInt();
			if(legnums[1]!=2){
				try {
					throw new Exception("鸭子只有2条腿");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					Thread.sleep(100);
				}
			}
			System.out.println("请输入海豚的名字：");
			names[2] = input.next();
			System.out.println("请输入海豚的腿数：");
			legnums[2] = input.nextInt();
			a[0] = new Cat(names[0], legnums[0]);
			a[1] = new Duck(names[1], legnums[1]);
			a[2] = new Dolphin(names[2], legnums[2]);
		} while (true);

	}
}
