package lianxi;

//Province来实现坚持领导和安全生产的功能
public class Province extends StataCouncil implements Cent {

	@Override
	public void partyLeader() {
		System.out.println("坚持党的领导");
	}

	@Override
	public void safeProduction() {
		System.out.println("安全生产不放松");
	}

	public static void main(String[] args) {
		Province province = new Province();
		province.partyLeader();
		province.safeProduction();
	}
}
