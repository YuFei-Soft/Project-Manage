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
				System.out.println("�����룺");
				String in = input.next();
				long currentTime = System.currentTimeMillis();
				game.printResult(out, in, currentTime1, currentTime);
				System.out.println("������ȷ�����Ļ���" + a.getCurScore() + ",���ļ���"
						+ a.getLevelNo() + ",����ʱ��"
						+ (a.getElapsedTime() -a.getSrartTime()) / 1000);
			}
			a.setLevelNo(a.getLevelNo() + 1);// ����
			System.out.println("��ϲ����Ϊ" + a.getLevelNo() + "����");
			a.setCurScore(0);
			if (a.getLevelNo() > 6) {
				System.out.println("��������ͨ�أ�");
				break;
			}
		}

	}

}
