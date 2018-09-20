package two2;

public class Poo {//练习1-100  6的倍数出现的次数

	public static void main(String[] args)
	{
		int  x=1,sum=0;
		  
		while(x<101)
		{
			if(x%6==0)
			{
				//continue;
				sum++; 
			}
			x++;
		}
		System.out.println("sum="+sum);
		
		
		
		
		

	}

}
