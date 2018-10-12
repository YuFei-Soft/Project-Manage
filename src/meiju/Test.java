package meiju;

public class Test {
	public static void main(String[] args) {
		WeekDemo ad=  new WeekDemo();
		ad.daPlay(Week.Tue);
		Week ac=Week.Sun;
		ad.daPlay(ac);
	}

}
