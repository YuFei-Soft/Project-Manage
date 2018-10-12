package meiju;

public class WeekDemo {
	public void daPlay(Week days) {
		switch (days) {
		case Mon:
		case Tue:
		case Wed:
		case Thu:
		case Fri:
			System.out.println("工作日，努力写代码");
			break;
		case Sat:
			System.out.println("星期六，休息看电影");
			break;
		case Sun:
			System.out.println("星期天，休息打篮球");
			break;
		default:
			System.out.println("地球一个星期只有7天");
			break;

		}

	}
}
