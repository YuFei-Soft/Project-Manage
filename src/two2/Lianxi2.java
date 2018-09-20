package two2;

import java.util.Arrays;

public class Lianxi2 {

	public static void main(String[] args) {
				int [] a={8,10,4,3,15,7};
				for(int i=0;i<a.length-1;i++){
					for(int c=0;c<a.length-1-i;c++){
						if(a[c+1]<a[c]){
							int temp=a[c];
							a[c]=a[c+1];
							a[c+1]=temp;
						}
					}
				}
				System.out.println(Arrays.toString(a));
	}

}
