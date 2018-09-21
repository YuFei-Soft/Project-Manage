package first;

import java.util.Scanner;

public class Test56 {

	public static void main(String[] args) {
		String[] names = new String[4]; // 保存订餐人名称
		String[] dishMegs = new String[4]; // 保存菜品名及份数
		int[] times = new int[4]; // 保存送餐时间
		String[] addresses = new String[4]; // 保存送餐地址
		int[] states = new int[4]; // 保存订单状态： 0：已预订 1：已完成
		double[] sumPrices = new double[4]; // 保存订单的总金额
		names[0] = "张三";
		dishMegs[0] = "红烧带鱼2份";
		times[0] = 14;
		addresses[0] = "南京安德门16号";
		states[0] = 0;
		sumPrices[0] = 76.0;
		names[1] = "张三";
		dishMegs[1] = "鱼香肉丝2份";
		times[1] = 12;
		addresses[1] = "南京安德门16号";
		states[1] = 1;
		sumPrices[1] = 45.0;
		String[] dishNames = { "红烧带鱼", "鱼香肉丝", "时令蔬菜" };
		double[] dishPrices = { 38, 20, 10 };
		int[] nums = { 2, 1, 0 };
		int re = -1;
		int index = -1;
		Scanner input = new Scanner(System.in);
		do {
			index = -1;
			System.out.println("欢迎使用“吃货联盟订餐系统”");
			System.out.println("************************************");
			System.out.println("1，我要订餐");
			System.out.println("2，查看餐袋");
			System.out.println("3，签收订单");
			System.out.println("4，删除订单");
			System.out.println("5，我要点赞");
			System.out.println("6，退出系统");
			System.out.println("************************************");
			System.out.print("请选择：");
			while (!input.hasNextInt()) {
				input.next();
				System.out.println("必须输入数字！请重新输入");
			}
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("***我要订餐***");
				for (int i = 0; i < names.length; i++) {
					if (names[i] == null) {
						index = i;
						break;
					}
				}
				if (index == -1) {
					System.out.println("餐袋已满！不能添加！");
				} else {
					System.out.println("请输入订餐人的姓名：");
					names[index] = input.next();
					System.out.println("序号\t菜名\t单价\t点赞数\t");
					for (int i = 0; i < dishNames.length; i++) {
						System.out.println(i + 1 + "\t" + dishNames[i] + "\t"
								+ dishPrices[i] + "\t\t\t" + nums[i]);
					}
					System.out.println("请选择你要点的菜品编号：");
					int tempIndex = input.nextInt();// 编号
					System.out.println("请选择购买数量：");
					int dishNum = input.nextInt();// 数量
					System.out.println("请输入送餐时间（时间在10-20之间）：");
					times[index] = input.nextInt();// 时间
					System.out.println("请输入送餐地址：");
					addresses[index] = input.next();
					System.out.println("订餐成功！");
					// 计算，加入到订单
					// 不含运费的餐费
					double dishPrice = dishPrices[tempIndex - 1] * dishNum;
					// 运费
					double otherPrice = dishPrice >= 50?0:5;
					// 总费用
					sumPrices[index] = dishPrice + otherPrice;
					// 设置餐品的名称及份数
					dishMegs[index] = dishNames[tempIndex - 1] + dishNum + "份";
					// 打印订单信息
					System.out.println("你订的是:" + dishMegs[index]);
					System.out.println("送餐时间:" + times[index] + "点");
					System.out.println("餐费:" + dishPrice + "元\t运费:"
							+ otherPrice + "总价:" + sumPrices[index] + "元");
				}
				break;
			case 2:
				System.out.println("***查看餐袋***");
				System.out.println("序号\t订餐人\t餐品信息\t送达时间\t送餐地址\t金额\t点餐信息\t");
				for (int i = 0; i < names.length; i++) {
					if (names[i] == null) {
						break;
					}
					System.out.println(i + 1 + "\t" + "\t" + names[i] + "\t"
							+ dishMegs[i] + "\t" + times[i] + "\t"
							+ addresses[i] + "\t" + sumPrices[i] + "\t" + "\t"
							+ (states[i] == 0 ? "已预定" : "已完成" + "\t"));

				}
				break;
			case 3:
				System.out.println("***签收订单***");
				System.out.println("请输入要签收的订单");
				while (!input.hasNextInt()) {
					System.out.println("请重新输入数字！");
					input.next();
				}
				index = input.nextInt();
				if (index < 1 || index > names.length) {// 判断是否超出范围
					System.out.println("数字超出范围！");
				} else if (names[index - 1] == null) {
					System.out.println("订单不存在！");// 判断订单是否存在，是否可以签收。
				} else if (states[index - 1] != 0) {// 判断订单状态。
					System.out.println("订单不是已预定状态，不能签收！");
				} else {
					states[index - 1] = 1;
					System.out.println("签收成功！");
				}

				break;
			case 4:
				System.out.println("***删除订单***");
				System.out.println("请选择序号：");
				index = input.nextInt();
				if (names[index - 1] == null) {
					System.out.println("对应的订单为空，不能删除！");
				} else if (states[index - 1] == 0) {
					System.out.println("订单未签收，不能删除！");
				} else {
					for (int i = index - 1; i < names.length - 1; i++) {
						names[i] = names[i + 1];
						dishMegs[i] = dishMegs[i + 1];
						times[i] = times[i + 1];
						addresses[i] = addresses[i + 1];
						states[i] = states[i + 1];
						sumPrices[i] = sumPrices[i + 1];
					}
					names[names.length - 1] = null;
					dishMegs[names.length - 1] = null;
					times[names.length - 1] = 0;
					addresses[names.length - 1] = null;
					states[names.length - 1] = 0;
					sumPrices[names.length - 1] = 0;
				}
				System.out.println("删除成功！");
				break;
			case 5:
				System.out.println("***我要点赞***");
				System.out.println("序号\t菜名\t单价\t点赞数\t");
				for (int i = 0; i < dishNames.length; i++) {
					System.out.println(i + 1 + "\t" + dishNames[i] + "\t"
							+ dishPrices[i] + "\t\t\t" + nums[i]);
				}
				System.out.println("请选择序号：");
				index = input.nextInt();
				nums[index - 1]++;
				System.out.println("点赞完成！");
				break;
			case 6:
				System.out.println("退出系统");
				// 退出程序(程序立即结束，退出java虚拟机)
				System.exit(0);
				break;
			default:
				System.out.println("只能输入1-6!");
				break;
			}
			System.out.println("输入0返回");
			re = input.nextInt();

		} while (re == 0);
		System.out.println("欢迎使用，欢迎下次光临！");
	}

}
