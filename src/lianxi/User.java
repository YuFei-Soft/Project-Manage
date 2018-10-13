package lianxi;

public class User implements Comparable<User> {
	private int ID;
	private String name;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User() {
		super();
	}

	public User(int iD, String name) {
		super();
		ID = iD;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", name=" + name + "]";
	}

	@Override
	public int compareTo(User arg0) {
		return this.ID - arg0.getID();
	}

}
