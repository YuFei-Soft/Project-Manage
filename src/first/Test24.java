package first;

import java.util.Scanner;

public class Test24 {

	private static Scanner input;

	public static void main(String[] args) {
		System.out.print("请输入消费金额：");
		input = new   Scanner(System.in);
		int money=input.nextInt();
		System.out.println("是否参加优惠活动：");
		System.out.println("1: 满50元，加2元换购百事可乐饮料一瓶");
		System.out.println("2: 满100元，加3元换购500ml可乐一瓶");
		System.out.println("3: 满100元，加10元换购面粉一袋");
		System.out.println("4: 满200元，加10元换购苏泊尔炒菜锅");
		System.out.println("5: 满200元，加20元换购欧莱雅");
		System.out.println("0:不换购");
		System.out.println("请选择：");
	
		if(money>=50){
			
		int mun=input.nextInt();
		switch(mun){
		case 1:
			System.out.println("消费金额："+(money+2));
			System.out.println("成功换购：1瓶百事可乐");
			break;
		
		case 2:
			System.out.println("消费金额："+(money+3));
			System.out.println("成功换购：可乐一瓶");
			break;
		case 3:
			System.out.println("消费金额："+(money+10));
			System.out.println("成功换购：5公斤面粉一带");
			break;
		case 4:
			System.out.println("消费金额："+(money+10));
			System.out.println("成功换购：1个苏泊尔炒锅一个");
			break;
		case 5:
			System.out.println("消费金额："+(money+20));
			System.out.println("成功换购：1瓶欧莱雅");
			break;
		case 0:
			System.out.println("消费金额："+money);
			break;
		}
			
		}else{
			System.out.println("不满足优惠活动。");
			System.out.println("消费金额："+money);
		}
	
			}
		
		
		
		
		
		
		
		
	

}
