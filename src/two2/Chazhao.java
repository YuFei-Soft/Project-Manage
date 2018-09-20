package two2;

public class Chazhao 
{

	public static void main(String[] args)
	{
		int[] arr={4,1,5,7,3,8,2};
		int index=getIndex(arr,2);
		System.out.println("index="+index);
	}
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]==key)
				return x;
		}
		return-1;
	}
}
