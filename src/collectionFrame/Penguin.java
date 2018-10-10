package collectionFrame;

import java.util.ArrayList;

public class Penguin {
	private String name;
	private String sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Penguin(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public Penguin() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Penguin other = (Penguin) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + "\t" + sex;
	}

	public static void main(String[] args) {
		ArrayList<Penguin> list = new ArrayList<Penguin>();
		list.add(new Penguin("欧欧", "Q仔"));
		list.add(new Penguin("亚亚", "Q妹"));
		list.add(new Penguin("菲菲", "Q妹"));
		list.add(new Penguin("美美", "Q妹"));
		System.out.println("总共有" + list.size() + "只企鹅");
		System.out.println("分别是");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.remove(list.size() - 1);
		list.remove(list.size() - 1);
		System.out.println();
		System.out.println("删除之后还有" + list.size() + "企鹅");
		System.out.println("分别是");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		 System.out.println(list.contains(new Penguin("亚亚","Q妹")));
		if (list.contains(new Penguin("美美", "Q妹"))) {
			System.out.println("集合中包含美美的信息");
		} else {
			System.out.println("集合中不包含美美的信息");
		}

	}

}
