package people;

public abstract class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public abstract String getDesc();// �����Ϣ ˵��

	@Override
	public String toString() {
		return name + getDesc();
	}

}
