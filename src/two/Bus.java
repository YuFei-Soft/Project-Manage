package two;

public class Bus extends Moto {

	private int seatCount;

	public Bus(String no, String barnd, int seatCount) {
		super(no, barnd);
		this.seatCount = seatCount;
	}
	public Bus(){
		
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	@Override
	public int calcRent(int days) {
		if (seatCount <= 16) {
			return 800 * days;
		} else {
			return 1500 * days;
		}

	}

}
