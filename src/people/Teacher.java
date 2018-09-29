package people;

public class Teacher extends Person {

	private double salary;// 获得老师的薪水

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Teacher(String name, double salary) {
		super(name);
		this.salary = salary;
	}

	@Override
	public String getDesc() {
		return ":a teacher, 薪水为" + salary;
	}

}
