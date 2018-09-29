package people;

public class Test {
	public static void main(String[] args) {
		Person[] ren = new Person[2];
		ren[0] = new Studennt("小王", "学习");
		ren[1] = new Teacher("王老师", 6535.14);
		for (Person person : ren) {
			System.out.println(person.getName() + person.getDesc());
		}
	}
}
