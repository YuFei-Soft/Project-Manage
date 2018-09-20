package two2;

public class Zheban 
{
	public static void main(String[] args)
	{
		int[] arr={13,15,19,28,33,45,78,106};
		int index=halfSearch(arr,78);
		System.out.println("index="+index);
		
	}
	public static int halfSearch(int [] arr,int key)
	{
		int max,min,mid;
		min =0;
		max=arr.length-1;
		mid=(max+min)/2;
		while(arr[mid]!=key)
		{
			if(key>arr[mid])
				min=mid+1;
			else if(key<arr[mid])
				max=mid-1;
			if(max<min)
				return-1;
			mid=(max+min)/2;
		}
		return mid;
	}
}
