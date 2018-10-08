package youxi;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Player a = new Player(1, 2);
		Game game = new Game(a);
		long currentTime1 = System.currentTimeMillis();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 3; j++) {
				String out = game.printStr();
				System.out.print(out);
				Scanner input = new Scanner(System.in);
				System.out.println("请输入：");
				String in = input.next();
				long currentTime = System.currentTimeMillis();
				game.printResult(out, in, currentTime1, currentTime);
				System.out.println("输入正确，您的积分" + a.getCurScore() + ",您的级别"
						+ a.getLevelNo() + ",已用时间"
						+ (a.getElapsedTime() -a.getSrartTime()) / 1000);
			}
			a.setLevelNo(a.getLevelNo() + 1);// 晋级
			System.out.println("恭喜晋级为" + a.getLevelNo() + "级！");
			a.setCurScore(0);
			if (a.getLevelNo() > 6) {
				System.out.println("您已满级通关！");
				break;
			}
		}

	}

}
