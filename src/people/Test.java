package people;

public class Test {
	public static void main(String[] args) {
		Person[] ren = new Person[2];
		ren[0] = new Studennt("С��", "ѧϰ");
		ren[1] = new Teacher("����ʦ", 6535.14);
		for (Person person : ren) {
			System.out.println(person.getName() + person.getDesc());
		}
	}
}
