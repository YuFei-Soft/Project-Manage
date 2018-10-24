package kaoshi2;

public class Test1 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=100;i<1000;i++){
			int a=i%10;//计算出个位的数
			int b=i/10%10;//计算出十位的数
			int c=i/100;//计算百位的数
			if(i==a*a*a+b*b*b+c*c*c){			
				sum++;	
				System.out.println(i);	
			}
		}
		System.out.println("水仙花的个数为："+sum);
	}

}
