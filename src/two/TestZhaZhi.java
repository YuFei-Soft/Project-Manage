package two;

import java.util.Scanner;

public class TestZhaZhi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入水果：");
		ZhaZhiJi s = new ZhaZhiJi();
		String shuiGuo = input.next();
		//方法调用处，参数叫做实际参数，也叫实参
		//实参的名字也可以随便取，但是也要遵循驼峰命名规则，同时也要有意义
		//形参和实参的类型必须一致，名字可以一致，也可以不一致。指的是shuiGuo！！！！
		String Zhi = s.zhaZhi(shuiGuo);
		System.out.println(Zhi);
	}
}
