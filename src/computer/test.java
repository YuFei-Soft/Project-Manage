package computer;

import org.junit.runner.Computer;

public class test extends Computer implements Conputer, Money, Name, Function {

	@Override
	public void ShowFunction() {
		System.out.println("\t��ע�Ᵽ������");
	}

	@Override
	public void ShowName() {
		System.out.println("��������Ϊ��\t lenovov");
	}

	@Override
	public void Price() {
		System.out.println("���Լ۸�Ϊ��\t 5999");
	}

	@Override
	public void ComputerWeigth() {
		System.out.println("��������Ϊ��\t 2.2");
	}

	public static void main(String[] args) {
		test a = new test();
		a.ShowName();
		a.ComputerWeigth();
		a.Price();
		a.ShowFunction();
	}
}
