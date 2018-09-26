package two;

import java.util.Scanner;

public class Student {
	private String name;// ����
	private int age;// ����
	private String grade;// �༶
	private String sex;// �Ա�
	private String card;// ѧ��

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
		System.out.println("������" + student.getName() + "����" + student.getAge()
				+ "�༶" + student.getGrade() + "�Ա�" + student.getSex() + "ѧ��"
				+ student.getCard());
	}

	public void Show(String name, int age, String grade, String sex, String card) {
		System.out.println("����nn��" + name + "����nn" + age + "�༶nn" + grade
				+ "�Ա�nn" + sex + "ѧ��nn" + card);
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
		 * Scanner input = new Scanner(System.in); System.out.println("������������");
		 * String a = input.next(); System.out.println("���������䣺"); int b =
		 * input.nextInt(); System.out.println("������༶��"); String c =
		 * input.next(); System.out.println("�������Ա�"); String d = input.next();
		 * System.out.println("������ѧ�ţ�"); String e = input.next();
		 */
		Student student = new Student("aa", 12, "sss", "hdhd", "1223");
		Student student1 = new Student("aa", 12, "sss", "hdhd", "1223");
		// student.Show(student);

		System.out.println(student1.equals(student));

	}

}
