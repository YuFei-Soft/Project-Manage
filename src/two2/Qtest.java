


package two2;

public class Qtest {

	public static void main(String[] args){
/*
	* * * * *
	 * * * *
	  * * *
	   * *
	    * 
	��ϰ���ͼ��Ĵ����д��	
	*/
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y < x; y++) {
				System.out.print(" ");
			}
			for (int z = x; z <= 5; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
