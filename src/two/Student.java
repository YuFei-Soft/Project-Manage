package two;

import java.util.Scanner;

public class Student {
	private String name;// 姓名
	private int age;// 年龄
	private String grade;// 班级
	private String sex;// 性别
	private String card;// 学号

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public Student(String name, int age, String grade, String sex, String card) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.sex = sex;
		this.card = card;
	}

	public void show(){};
	
	public void Show(Student student) {
		System.out.println("姓名：" + student.getName() + "年龄" + student.getAge()
				+ "班级" + student.getGrade() + "性别" + student.getSex() + "学号"
				+ student.getCard());
	}

	public void Show(String name, int age, String grade, String sex, String card) {
		System.out.println("姓名nn：" + name + "年龄nn" + age + "班级nn" + grade
				+ "性别nn" + sex + "学号nn" + card);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade
				+ ", sex=" + sex + ", card=" + card + "]";
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + age; result = prime * result + ((card == null)
	 * ? 0 : card.hashCode()); result = prime * result + ((grade == null) ? 0 :
	 * grade.hashCode()); result = prime * result + ((name == null) ? 0 :
	 * name.hashCode()); result = prime * result + ((sex == null) ? 0 :
	 * sex.hashCode()); return result; }
	 */

	@Override
	public boolean equals(Object obj) {
		Student s1 = (Student) obj;
		if (s1.getCard().equals(this.card)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in); System.out.println("请输入姓名：");
		 * String a = input.next(); System.out.println("请输入年龄："); int b =
		 * input.nextInt(); System.out.println("请输入班级："); String c =
		 * input.next(); System.out.println("请输入性别："); String d = input.next();
		 * System.out.println("请输入学号："); String e = input.next();
		 */
		Student student = new Student("aa", 12, "sss", "hdhd", "1223");
		Student student1 = new Student("aa", 12, "sss", "hdhd", "1223");
		// student.Show(student);

		System.out.println(student1.equals(student));

	}

}
