package two;

public class Bus extends Moto {
	private int SeatCount;

	public Bus(String no, String barnd, int SeatCount) {
		super(no, barnd);
		this.SeatCount = SeatCount;
	}
	public Bus(){
		
	}

	public int getSeatCount() {
		return SeatCount;
	}

	public void setSeatCount(int seatCount) {
		SeatCount = seatCount;
	}

	@Override
	public int calcRent(int days) {
		if (SeatCount <= 16) {
			return 800 * days;
		} else {
			return 1500 * days;
		}

	}

}
