import java.util.Scanner;

public class Test2 {
	/*
	  3.编写DVD管理系统， DVD有名称，借出次数，借出状态（已借出，未借出）三个属性 要求实现以下功能: (1)查看所有DVD的信息
	  （2）新增dvd （3）删除dvd（借出状态为已借出的不能删除） （4）借出DVD（借出状态为已借出的不能再借，借出成功后，借出次数加1）
	  （5）退出系统 以上每个子功能执行完成后要求能够返回主菜单，让用户继续选择其他操作
	 */
	public static void main(String[] args) {
		String[] names = new String[5];
		String[] re = new String[5];
		int[] times = new int[5];
		String c = "未借出";
		String b = "已借出";
		names[0] = "哈哈";
		re[0] = c;
		times[0] = 0;
		int num = 1;
		Scanner input = new Scanner(System.in);
		do {
			int a;
			String name;
			System.out.println("******欢迎来租借DVD******");
			System.out.println("1.查看所有DVD信息");
			System.out.println("2.新增DVD");
			System.out.println("3.删除DVD");
			System.out.println("4.借出DVD");
			System.out.println("5.退出系统");
			System.out.println("请选择：");
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("******DVD信息******");
				System.out.println("名称\t" + "借出状态\t" + "借出次数");
				for (int i = 0; i < num; i++) {
					System.out.println(names[i] + "\t" + re[i] + "\t"
							+ times[i]);
				}
				System.out.println("输入0返回：");
				a = input.nextInt();
				if (a == 0) {
					break;
				}
			case 2:
				System.out.println("******增加DVD******");
				System.out.println("请输入新增DVD名称：");
				name = input.next();
				names[num] = name;
				re[num] = c;
				times[num] = 0;
				num++;
				System.out.println("增加DVD成功");
				System.out.println("输入0返回：");
				a = input.nextInt();
				if (a == 0) {
					break;
				}
			case 3:
				System.out.println("******删除DVD******");
				System.out.println("请输入要删除的DVD名称：");
				name = input.next();
				for (int i = 0; i < num; i++) {
					if (name.equals(names[i]) && c.equals(re[i])) {
						names[i] = names[i + 1];
						re[i] = re[i + 1];
						times[i] = times[i + 1];
						num--;
						System.out.println("DVD已删除！");
						break;
					}
					if (i == num - 1) {
						System.out.println("DVD不存在或已借出！");
					}
				}
				System.out.println("输入0返回：");
				a = input.nextInt();
				if (a == 0) {
					break;
				}
			case 4:
				System.out.println("******借出DVD******");
				System.out.println("请输入要借出的DVD名称：");
				name = input.next();
				for (int i = 0; i < num; i++) {
					if (name.equals(names[i]) && c.equals(re[i])) {
						System.out.println("借出成功！");
						times[i]++;
						re[i] = b;
					} else {
						System.out.println("DVD已借出！");
					}
				}
				System.out.println("输入0返回：");
				a = input.nextInt();
				if (a == 0) {
					break;
				}
			case 5:
				System.out.println("已退出系统！");
				System.exit(0);
			default:
				System.out.println("选择错误，请重新选择！");
				System.out.println("输入0返回：");
				a = input.nextInt();
				if (a == 0) {
					break;
				}
			}
		} while (true);

	}
	
}
