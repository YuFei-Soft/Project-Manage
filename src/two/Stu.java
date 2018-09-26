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
	// ע��˵������ķ������Ƿ�����д
	// ������д���ĸ��������ȿ����������ƺͲ����Ƿ�һ��
	// ���һֱ��ȷ���Ƿ�������д����һ�¾���Ϊû�й��ɷ�����д���Ͳ���Ҫ����
	// ������д�Ĺ���
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
