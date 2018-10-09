package youxi;

import java.util.Random;

public class Game {
	Player a = new Player();// 得到当前玩家的属性

	public Game(Player a) {
		super();
		this.a = a;
	}

	public String printStr() {
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
		LevelParam pl = new LevelParam();
		// 获得这个账号信息的字符串的长度
		int num = pl.levels[a.getLevelNo() - 1].getStrLength();
		// int strLength = 0;
		// 通过循环生成要输出的字符串
		for (int i = 0; i < num; i++) {
			int rand = random.nextInt(num); // 产生随机数
			// 根据随机数拼接字符串
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
				System.out.println("你输入太慢了，已经超时，退出！");
				System.exit(1);
			} else {
				a.setCurScore(a.getCurScore()
						+ LevelParam.levels[a.getLevelNo() - 1].getPerScore());
			}
		} else {
			System.out.println("输入错误，退出！");
			System.exit(1);
		}

	}
}
