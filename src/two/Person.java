package two;

public class Person {
	public String name;
	public int age;

	public void showPrices() {
		if (age >= 15 && age < 60) {
			System.out.println("������" + name + "���䣺" + age + ",��Ʊ�۸�Ϊ20Ԫ");
		} else {
			System.out.println("������" + name + "���䣺" + age + ",��Ʊ���");

		}
	}
}
