package three;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Abnormal {
	 static Logger logger = Logger.getLogger(Abnormal.class);
	//static Logger logger=Logger.getLogger(Abnormal.class);
	public static void main(String[] args) {
		logger.debug("main������ʼִ��");
		logger.info("main������ʼִ��");
		logger.error("main������ʼִ��");
		logger.warn("main������ʼִ��");
		logger.fatal("main������ʼִ��");
		Scanner input = new Scanner(System.in);
		System.out.println("������γ̴��ţ�1��3֮������֣�");
		try {
			int chose = input.nextInt();
			switch (chose) {
			case 1:
				System.out.println("JAVA");
				break;
			case 2:
				System.out.println("C++");
				break;
			case 3:
				System.out.println("C#���");
				break;
			}
		} catch (Exception e) {
			logger.debug("�����쳣��{}",e);
			// e.printStackTrace();
			System.out.println("�����쳣���˳�����");
		} finally {
			System.out.println("��ӭ�������");
		}
	}
}
