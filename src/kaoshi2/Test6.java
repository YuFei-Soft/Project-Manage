package kaoshi2;

import java.util.Random;


public class Test6 {
	public static void main(String[] args) {	
		Random rand=new Random();
		int number=rand.nextInt(100)+1;//�õ�100�������������1��ʼ
		while(true){
			if(number%2==0){
				number=number/2;				
			}else{
				number=number*3+1;
			}
			if(number==1){
				System.out.println(number);
				break;			
			}
			
		}
		
	

	}
}
