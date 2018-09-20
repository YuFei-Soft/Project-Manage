package two;

public class Admin {
	public String name;
	public String mun;

	public void showNan() {
		System.out.println("ĞÕÃû£º" + name + ",ÃÜÂë£º" + mun);
	}

	public static void main(String[] args) {
		Admin admin1 = new Admin();
		admin1.name = "admin1";
		admin1.mun = "111111";
		admin1.showNan();
		Admin admin2 = new Admin();
		admin2.name = "admin2";
		admin2.mun = "222222";
		admin2.showNan();
		
	}
}
