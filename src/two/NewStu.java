package two;

public class NewStu extends Student {

	public NewStu(String name, int age, String grade, String sex, String card) {
		super(name, age, grade, sex, card);
	}

	public static void main(String[] args) {
		Student newstu = new Student("aa", 12, "sss", "hdhd", "1223");
		newstu.setAge(13);
		System.out.println(newstu);
		NewStu stu1 = new NewStu("aa", 12, "sss", "hdhd", "1223");
		stu1.Show(stu1);
		stu1.Show("aa", 12, "sss", "hdhd", "1223");
	}

	@Override
	public void Show(Student student) {
		System.out.println("姓名1：" + student.getName() + "年龄1"
				+ student.getAge() + "班级1" + student.getGrade() + "性别1"
				+ student.getSex() + "学号1" + student.getCard());
	}

}
