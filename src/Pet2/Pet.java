package Pet2;

public abstract class Pet {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pet(String name) {
		super();
		this.name = name;
	}

	public Pet() {
		super();
	}

	public abstract String getShot();

}
