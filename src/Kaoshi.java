
import java.util.Arrays;
import java.util.Scanner;

public class Kaoshi {
	// .十个评委给歌手打分(键盘输入)，去掉最高分和最低分，求歌手的平均分
	public static void main(String[] args) {
		int  [] b=new int [10];
		Scanner input = new Scanner(System.in);
		int sum=0;
		double min=0;
		double max=0;
		double  vga=0;
		for (int i = 0; i <10; i++) {
			System.out.println("第" +( i+1) + "位评委的打分为：");
			b[i] = input.nextInt();
			sum=sum+b[i];				
		}
	    Arrays.toString(b);
	    max=b[9];
	    min=b[0];
	    vga=(sum-max-min)/8;
	    System.out.println("最高分："+max);
	    System.out.println("最低分："+min);
	    System.out.println(vga);
	}
}
