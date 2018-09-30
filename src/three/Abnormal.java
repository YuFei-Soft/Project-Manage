package three;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Abnormal {
	 static Logger logger = Logger.getLogger(Abnormal.class);
	//static Logger logger=Logger.getLogger(Abnormal.class);
	public static void main(String[] args) {
		logger.debug("main函数开始执行");
		logger.info("main函数开始执行");
		logger.error("main函数开始执行");
		logger.warn("main函数开始执行");
		logger.fatal("main函数开始执行");
		Scanner input = new Scanner(System.in);
		System.out.println("请输入课程代号（1—3之间的数字）");
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
				System.out.println("C#编程");
				break;
			}
		} catch (Exception e) {
			logger.debug("出现异常：{}",e);
			// e.printStackTrace();
			System.out.println("出现异常！退出程序！");
		} finally {
			System.out.println("欢迎提出建议");
		}
	}
}
