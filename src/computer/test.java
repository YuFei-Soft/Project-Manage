package computer;

import org.junit.runner.Computer;

public class test extends Computer implements Conputer, Money, Name, Function {

	@Override
	public void ShowFunction() {
		System.out.println("\t请注意保护电脑");
	}

	@Override
	public void ShowName() {
		System.out.println("电脑名字为：\t lenovov");
	}

	@Override
	public void Price() {
		System.out.println("电脑价格为：\t 5999");
	}

	@Override
	public void ComputerWeigth() {
		System.out.println("电脑重量为：\t 2.2");
	}

	public static void main(String[] args) {
		test a = new test();
		a.ShowName();
		a.ComputerWeigth();
		a.Price();
		a.ShowFunction();
	}
}
