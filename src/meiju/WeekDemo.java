package meiju;

public class WeekDemo {
	public void daPlay(Week days) {
		switch (days) {
		case Mon:
		case Tue:
		case Wed:
		case Thu:
		case Fri:
			System.out.println("�����գ�Ŭ��д����");
			break;
		case Sat:
			System.out.println("����������Ϣ����Ӱ");
			break;
		case Sun:
			System.out.println("�����죬��Ϣ������");
			break;
		default:
			System.out.println("����һ������ֻ��7��");
			break;

		}

	}
}
