package kaoshi2;

public class Test1 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=100;i<1000;i++){
			int a=i%10;//�������λ����
			int b=i/10%10;//�����ʮλ����
			int c=i/100;//�����λ����
			if(i==a*a*a+b*b*b+c*c*c){			
				sum++;	
				System.out.println(i);	
			}
		}
		System.out.println("ˮ�ɻ��ĸ���Ϊ��"+sum);
	}

}
