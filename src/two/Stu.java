package two;

public class Stu {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Stu(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		Stu s1 = new Stu("aa", 1);
		Stu s2 = new Stu("aa", 1);
		System.out.println(s1.equals(s2));
	}

	@Override
	// 注解说明下面的方法就是方法重写
	// 方法重写有四个规则，首先看方法的名称和参数是否一致
	// 如果一直就确定是方法的重写，不一致就认为没有构成方法重写，就不需要满足
	// 方法重写的规则
	public boolean equals(Object obj) {
		Stu a = (Stu) obj;
		if (a.getName().equals(this.getName()) && a.getId() == this.getId()) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public String toString() {
		return "Stu [name=" + name + ", id=" + id + "]";
	}

}
