package youxi;

import java.util.Random;

public class Game {
	Player a = new Player();// �õ���ǰ��ҵ�����

	public Game(Player a) {
		super();
		this.a = a;
	}

	public String printStr() {
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
		LevelParam pl = new LevelParam();
		// �������˺���Ϣ���ַ����ĳ���
		int num = pl.levels[a.getLevelNo() - 1].getStrLength();
		// int strLength = 0;
		// ͨ��ѭ������Ҫ������ַ���
		for (int i = 0; i < num; i++) {
			int rand = random.nextInt(num); // ���������
			// ���������ƴ���ַ���
			switch (rand) {
			case 0:
				buffer.append("a");
				break;
			case 1:
				buffer.append("b");
				break;
			case 2:
				buffer.append("c");
				break;
			case 3:
				buffer.append("d");
				break;
			case 4:
				buffer.append("e");
				break;
			case 5:
				buffer.append("f");
				break;
			}
		}

		return buffer.toString();
	}

	public void printResult(String out, String in, long currentTime1,
			long currentTime) {
		if (out.equalsIgnoreCase(in)) {
			boolean flag = false;
			a.setSrartTime(currentTime1);
			a.setElapsedTime((int) currentTime);
			if ((currentTime1 - currentTime) / 1000 > LevelParam.levels[a
					.getLevelNo() - 1].getTimeLimit()) {
				System.out.println("������̫���ˣ��Ѿ���ʱ���˳���");
				System.exit(1);
			} else {
				a.setCurScore(a.getCurScore()
						+ LevelParam.levels[a.getLevelNo() - 1].getPerScore());
			}
		} else {
			System.out.println("��������˳���");
			System.exit(1);
		}

	}
}
