package two;

public class Person {
	public String name;
	public int age;

	public void showPrices() {
		if (age >= 15 && age < 60) {
			System.out.println("姓名：" + name + "年龄：" + age + ",门票价格为20元");
		} else {
			System.out.println("姓名：" + name + "年龄：" + age + ",门票免费");

		}
	}
}
