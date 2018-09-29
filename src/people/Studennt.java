package people;

public class Studennt extends Person {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Studennt(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	public String getDesc() {
		return ":a student ,major ÊÇ" + major;
	}

}
