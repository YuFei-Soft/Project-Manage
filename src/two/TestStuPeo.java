package two;

//测试用的类 测试类
import java.util.Scanner;

public class TestStuPeo {
	public static void main(String[] args) {
		StuPeo ad = new StuPeo();
		Scanner input = new Scanner(System.in);
		// 循环插入5名学生的姓名
		for (int i = 0; i < 5; i++) {
			System.out.println("请输入姓名");
			String newName = input.next();
			ad.putName(newName);
		}
		// 显示学生的信息
		ad.shoeName();
		// 在特定的区间内查找一个特定的学员、
		System.out.println("请输入开始查找的位置：");
		int start = input.nextInt();
		System.out.println("请输入结束查找的位置：");
		int end = input.nextInt();
		System.out.println("请输入查找的学生姓名：");
		String name = input.next();
		System.out.println("***查找结果***");
		boolean flag = ad.getName(start, end, name);// 用boolean
													// 的类型返回只能false或者true
		if (flag) { // 默认的是true 所以就直接判断flag就行
			System.out.println("找到了");
		} else {
			System.out.println("没找到！！！");
		}

	}
}
