package two2;

public class Paix2 
{
	public static void main(String[] args) 
	{
		int [] arr={11,1,-1,13,25};
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);
	}
	public static void bubbleSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=0;y<arr.length-1-x;y++)
			{
				if(arr[y]>arr[y+1])
				{
					int temp=arr[y];
					arr[y]=arr[y+1];
					arr[y+1]=temp;
				}
			}
		}
	}
	public static void  printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0;x<arr.length;x++)
		{
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
		}
	} 
}
